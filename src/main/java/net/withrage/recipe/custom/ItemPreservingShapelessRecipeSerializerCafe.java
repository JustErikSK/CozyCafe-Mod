package net.withrage.recipe.custom;

import com.google.gson.JsonObject;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.Identifier;

public class ItemPreservingShapelessRecipeSerializerCafe implements RecipeSerializer<ItemPreservingShapelessRecipeCafe> {

    @Override
    public ItemPreservingShapelessRecipeCafe read(Identifier id, JsonObject json) {
        ShapelessRecipe base = RecipeSerializer.SHAPELESS.read(id, json);
        return new ItemPreservingShapelessRecipeCafe(
                base.getId(),
                base.getGroup(),
                base.getCategory(),
                base.getOutput(null),
                base.getIngredients()
        );
    }

    @Override
    public ItemPreservingShapelessRecipeCafe read(Identifier id, PacketByteBuf buf) {
        ShapelessRecipe base = RecipeSerializer.SHAPELESS.read(id, buf);
        return new ItemPreservingShapelessRecipeCafe(
                base.getId(),
                base.getGroup(),
                base.getCategory(),
                base.getOutput(null),
                base.getIngredients()
        );
    }

    @Override
    public void write(PacketByteBuf buf, ItemPreservingShapelessRecipeCafe recipe) {
        RecipeSerializer.SHAPELESS.write(buf, recipe);
    }
}
