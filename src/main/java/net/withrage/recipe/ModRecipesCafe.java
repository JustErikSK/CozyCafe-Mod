package net.withrage.recipe;

import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.withrage.CozyCafe;
import net.withrage.recipe.custom.ItemPreservingShapedRecipeSerializerCafe;
import net.withrage.recipe.custom.ItemPreservingShapelessRecipeSerializerCafe;

public class ModRecipesCafe {
    public static final RecipeSerializer<?> ITEM_PRESERVING_SHAPELESS_SERIALIZER =
            Registry.register(Registries.RECIPE_SERIALIZER,
                    new Identifier(CozyCafe.MOD_ID, "item_preserving_shapeless"),
                    new ItemPreservingShapelessRecipeSerializerCafe()
            );

    public static final RecipeSerializer<?> ITEM_PRESERVING_SHAPED = Registry.register(
            Registries.RECIPE_SERIALIZER,
            new Identifier(CozyCafe.MOD_ID, "item_preserving_shaped"),
            new ItemPreservingShapedRecipeSerializerCafe()
    );

    public static void registerModRecipes() {
        CozyCafe.LOGGER.info("Registering Cozy Café recipes/serializers");
    }
}
