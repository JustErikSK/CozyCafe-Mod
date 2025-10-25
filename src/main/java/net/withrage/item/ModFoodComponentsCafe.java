package net.withrage.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponentsCafe {
    public static final FoodComponent APPLE_JUICE = new FoodComponent.Builder()
            .hunger(6)
            .saturationModifier(0.3f)
            .alwaysEdible()
            .snack()
            .build();

    public static final FoodComponent APPLE_PIE = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.6f)
            .build();

    public static final FoodComponent BERRY_CUPCAKE = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.55f)
            .build();

    public static final FoodComponent CHICKEN_MUSHROOM_PIE = new FoodComponent.Builder()
            .hunger(10)
            .saturationModifier(0.85f)
            .build();

    public static final FoodComponent CHIPS = new FoodComponent.Builder()
            .hunger(6)
            .saturationModifier(0.4f)
            .snack()
            .build();

    public static final FoodComponent CHOCOLATE_CUPCAKE = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.45f)
            .build();

    public static final FoodComponent CHOCOLATE_DONUT = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.5f)
            .build();

    public static final FoodComponent CHOCOLATE_MILK = new FoodComponent.Builder()
            .hunger(6)
            .saturationModifier(0.35f)
            .alwaysEdible()
            .snack()
            .build();

    public static final FoodComponent FRIES = new FoodComponent.Builder()
            .hunger(8)
            .saturationModifier(0.5f)
            .snack()
            .build();

    public static final FoodComponent GLISTERING_MELONADE = new FoodComponent.Builder()
            .hunger(6)
            .saturationModifier(0.3f)
            .alwaysEdible()
            .snack()
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1, -1), 100)
            .build();

    public static final FoodComponent GLOWBERRY_DONUT = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 100, 1), 50)
            .build();

    public static final FoodComponent GLOWBERRY_ICE_CREAM = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.55f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 100, 1), 50)
            .build();

    public static final FoodComponent GLOWBERRY_JUICE = new FoodComponent.Builder()
            .hunger(6)
            .saturationModifier(0.3f)
            .alwaysEdible()
            .snack()
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 100, 1), 50)
            .build();

    public static final FoodComponent GLOWBERRY_PIE = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 100, 1), 50)
            .build();

    public static final FoodComponent JELLY_DONUT = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.8f)
            .build();

    public static final FoodComponent MELONADE = new FoodComponent.Builder()
            .hunger(6)
            .saturationModifier(0.3f)
            .alwaysEdible()
            .snack()
            .build();

    public static final FoodComponent MERINGUE = new FoodComponent.Builder()
            .hunger(5)
            .saturationModifier(0.5f)
            .snack()
            .build();

    public static final FoodComponent MILK_BREAD = new FoodComponent.Builder()
            .hunger(8)
            .saturationModifier(0.4f)
            .build();

    public static final FoodComponent NUHTELLA_ICE_CREAM = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 800, 1), 60)
            .build();

    public static final FoodComponent POT_PIE = new FoodComponent.Builder()
            .hunger(10)
            .saturationModifier(0.85f)
            .build();

    public static final FoodComponent PRETZEL = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.4f)
            .snack()
            .build();

    public static final FoodComponent GLAZED_DONUT = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.5f)
            .build();

    public static final FoodComponent SWEETBERRY_DONUT = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.5f)
            .build();

    public static final FoodComponent SWEETBERRY_ICE_CREAM = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.4f)
            .build();

    public static final FoodComponent SWEETBERRY_JUICE = new FoodComponent.Builder()
            .hunger(6)
            .saturationModifier(0.2f)
            .alwaysEdible()
            .snack()
            .build();

    public static final FoodComponent SWEETBERRY_PIE = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.5f)
            .build();

    public static final FoodComponent VANILLA_ICE_CREAM = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.4f)
            .build();

    public static final FoodComponent BOLOGNA_AND_CREAM_CHEESE_TOAST = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.3f)
            .build();

    public static final FoodComponent BREAKFAST_BURGER = new FoodComponent.Builder()
            .hunger(8)
            .saturationModifier(0.4f)
            .build();

    public static final FoodComponent BUTTER_COOKIE = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.2f)
            .snack()
            .build();

    public static final FoodComponent EGG_TOAST = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.3f)
            .build();

    public static final FoodComponent ENCHANTED_GOLDEN_APPLE_JUICE = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.4f)
            .alwaysEdible()
            .build();

    public static final FoodComponent GOLDEN_APPLE_JUICE = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.4f)
            .alwaysEdible()
            .build();

    public static final FoodComponent HAM_AND_CHEESE_SANDWICH = new FoodComponent.Builder()
            .hunger(9)
            .saturationModifier(0.5f)
            .build();

    public static final FoodComponent NUHTELLA_TOAST = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.3f)
            .build();

    public static final FoodComponent TOAST_WITH_BUTTER = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.3f)
            .build();

    public static final FoodComponent TOAST_WITH_JAM = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.3f)
            .build();

    public static final FoodComponent BROWNIE = new FoodComponent.Builder()
            .hunger(5)
            .saturationModifier(0.2f)
            .snack()
            .build();

    public static final FoodComponent WAFFLE_WITH_CHOCOLATE_SYRUP = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.4f)
            .build();

    public static final FoodComponent WAFFLE_WITH_FRUIT_SYRUP = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.4f)
            .build();

    public static final FoodComponent BLUE_JELLY = new FoodComponent.Builder()
            .hunger(3)
            .saturationModifier(0.1f)
            .snack()
            .build();

    public static final FoodComponent GREEN_JELLY = new FoodComponent.Builder()
            .hunger(3)
            .saturationModifier(0.1f)
            .snack()
            .build();

    public static final FoodComponent ORANGE_JELLY = new FoodComponent.Builder()
            .hunger(3)
            .saturationModifier(0.1f)
            .snack()
            .build();

    public static final FoodComponent PINK_JELLY = new FoodComponent.Builder()
            .hunger(3)
            .saturationModifier(0.1f)
            .snack()
            .build();

    public static final FoodComponent PURPLE_JELLY = new FoodComponent.Builder()
            .hunger(3)
            .saturationModifier(0.1f)
            .snack()
            .build();

    public static final FoodComponent YELLOW_JELLY = new FoodComponent.Builder()
            .hunger(3)
            .saturationModifier(0.1f)
            .snack()
            .build();
}