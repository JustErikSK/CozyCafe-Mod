package net.withrage.recipe.custom;

import com.google.gson.JsonObject;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.util.Identifier;

public class ItemPreservingShapedRecipeSerializerCafe implements RecipeSerializer<ItemPreservingShapedRecipeCafe> {

    @Override
    public ItemPreservingShapedRecipeCafe read(Identifier id, JsonObject json) {
        ShapedRecipe base = RecipeSerializer.SHAPED.read(id, json);
        return new ItemPreservingShapedRecipeCafe(base);
    }

    @Override
    public ItemPreservingShapedRecipeCafe read(Identifier id, PacketByteBuf buf) {
        ShapedRecipe base = RecipeSerializer.SHAPED.read(id, buf);
        return new ItemPreservingShapedRecipeCafe(base);
    }

    @Override
    public void write(PacketByteBuf buf, ItemPreservingShapedRecipeCafe recipe) {
        RecipeSerializer.SHAPED.write(buf, recipe);
    }
}
