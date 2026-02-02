package net.withrage.recipe.custom;

import net.minecraft.inventory.RecipeInputInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;

public class ItemPreservingShapedRecipeCafe extends ShapedRecipe {

    private static final TagKey<Item> NON_CONSUMED_ITEMS =
            TagKey.of(Registries.ITEM.getKey(), new Identifier("cozycafe", "non_consumable_items"));

    public ItemPreservingShapedRecipeCafe(ShapedRecipe base) {
        super(
                base.getId(),
                base.getGroup(),
                base.getCategory(),
                base.getWidth(),
                base.getHeight(),
                base.getIngredients(),
                base.getOutput(null)
        );
    }

    @Override
    public DefaultedList<ItemStack> getRemainder(RecipeInputInventory inventory) {
        DefaultedList<ItemStack> remainders = DefaultedList.ofSize(inventory.size(), ItemStack.EMPTY);
        for (int i = 0; i < inventory.size(); i++) {
            ItemStack stack = inventory.getStack(i);
            if (stack.isEmpty()) continue;
            Item remainderItem = stack.getItem().getRecipeRemainder();
            if (remainderItem != null) {
                remainders.set(i, new ItemStack(remainderItem));
                continue;
            }
            if (stack.isIn(NON_CONSUMED_ITEMS)) {
                ItemStack copy = stack.copy();
                copy.setCount(1);
                remainders.set(i, copy);
            }
        }
        return remainders;
    }
}
