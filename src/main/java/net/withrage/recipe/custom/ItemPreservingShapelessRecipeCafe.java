package net.withrage.recipe.custom;

import net.minecraft.inventory.RecipeInputInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.CraftingRecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;

public class ItemPreservingShapelessRecipeCafe extends ShapelessRecipe {
    private static final TagKey<Item> NON_CONSUMED_ITEMS =
            TagKey.of(Registries.ITEM.getKey(), new Identifier("cozycafe", "non_consumable_items"));

    public ItemPreservingShapelessRecipeCafe(Identifier id,
                                             String group,
                                             CraftingRecipeCategory category,
                                             ItemStack result,
                                             DefaultedList<Ingredient> ingredients) {
        super(id, group, category, result, ingredients);
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
