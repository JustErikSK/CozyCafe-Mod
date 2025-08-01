package net.withrage.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent APPLE_JAM = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.3f)
            .alwaysEdible()
            .snack()
            .build();
}