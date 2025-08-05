package net.withrage.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.withrage.CozyCafe;

public class ModItemsCafe {

    public static final Item APPLE_JUICE = registerItem("apple_juice", new DrinkItem(new FabricItemSettings().food(ModFoodComponentsCafe.APPLE_JUICE)));
    public static final Item APPLE_PIE = registerItem("apple_pie", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.APPLE_PIE)));
    public static final Item BERRY_CUPCAKE = registerItem("berry_cupcake", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.BERRY_CUPCAKE)));
    public static final Item CHICKEN_MUSHROOM_PIE = registerItem("chicken_mushroom_pie", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.CHICKEN_MUSHROOM_PIE)));
    public static final Item CHIPS = registerItem("chips", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.CHIPS)));
    public static final Item CHOCOLATE_CUPCAKE = registerItem("chocolate_cupcake", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.CHOCOLATE_CUPCAKE)));
    public static final Item CHOCOLATE_DONUT = registerItem("chocolate_donut", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.CHOCOLATE_DONUT)));
    public static final Item CHOCOLATE_MILK = registerItem("chocolate_milk", new DrinkItem(new FabricItemSettings().food(ModFoodComponentsCafe.CHOCOLATE_MILK)));
    public static final Item JELLY_DONUT = registerItem("jelly_donut", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.JELLY_DONUT)));
    public static final Item FRIES = registerItem("fries", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.FRIES)));
    public static final Item GILDED_MELONADE = registerItem("gilded_melonade", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.GILDED_MELONADE)));
    public static final Item GLOWBERRY_DONUT = registerItem("glowberry_donut", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.GLOWBERRY_DONUT)));
    public static final Item GLOWBERRY_ICE_CREAM = registerItem("glowberry_ice_cream", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.GLOWBERRY_ICE_CREAM)));
    public static final Item GLOWBERRY_JUICE = registerItem("glowberry_juice", new DrinkItem(new FabricItemSettings().food(ModFoodComponentsCafe.GLOWBERRY_JUICE)));
    public static final Item GLOWBERRY_PIE = registerItem("glowberry_pie", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.GLOWBERRY_PIE)));
    public static final Item MELONADE = registerItem("melonade", new DrinkItem(new FabricItemSettings().food(ModFoodComponentsCafe.MELONADE)));
    public static final Item MERINGUE = registerItem("meringue", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.MERINGUE)));
    public static final Item MILK_BREAD = registerItem("milk_bread", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.MILK_BREAD)));
    public static final Item NUHTELLA_ICE_CREAM = registerItem("nuhtella_ice_cream", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.NUHTELLA_ICE_CREAM)));
    public static final Item POT_PIE = registerItem("pot_pie", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.POT_PIE)));
    public static final Item PRETZEL = registerItem("pretzel", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.PRETZEL)));
    public static final Item SUGAR_DONUT = registerItem("sugar_donut", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.SUGAR_DONUT)));
    public static final Item SWEETBERRY_DONUT = registerItem("sweetberry_donut", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.SWEETBERRY_DONUT)));
    public static final Item SWEETBERRY_ICE_CREAM = registerItem("sweetberry_ice_cream", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.SWEETBERRY_ICE_CREAM)));
    public static final Item SWEETBERRY_JUICE = registerItem("sweetberry_juice", new DrinkItem(new FabricItemSettings().food(ModFoodComponentsCafe.SWEETBERRY_JUICE)));
    public static final Item SWEETBERRY_PIE = registerItem("sweetberry_pie", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.SWEETBERRY_PIE)));
    public static final Item VANILLA_ICE_CREAM = registerItem("vanilla_ice_cream", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.VANILLA_ICE_CREAM)));
    public static final Item BOLOGNA_AND_CREAM_CHEESE_TOAST = registerItem("bologna_and_cream_cheese_toast", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.BOLOGNA_AND_CREAM_CHEESE_TOAST)));
    public static final Item BREAKFAST_BURGER = registerItem("breakfast_burger", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.BREAKFAST_BURGER)));
    public static final Item BUTTER_COOKIE = registerItem("butter_cookie", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.BUTTER_COOKIE)));
    public static final Item EGG_TOAST = registerItem("egg_toast", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.EGG_TOAST)));
    public static final Item ENCHANTED_GOLDEN_APPLE_JUICE = registerItem("enchanted_golden_apple_juice", new EnchantedGoldenAppleJuiceItem(new FabricItemSettings().food(ModFoodComponentsCafe.ENCHANTED_GOLDEN_APPLE_JUICE)));
    public static final Item GOLDEN_APPLE_JUICE = registerItem("golden_apple_juice", new DrinkItem(new FabricItemSettings().food(ModFoodComponentsCafe.GOLDEN_APPLE_JUICE)));
    public static final Item HAM_AND_CHEESE_SANDWICH = registerItem("ham_and_cheese_sandwich", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.HAM_AND_CHEESE_SANDWICH)));
    public static final Item NUHTELLA_TOAST = registerItem("nuhtella_toast", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.NUHTELLA_TOAST)));
    public static final Item TOAST_WITH_BUTTER = registerItem("toast_with_butter", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.TOAST_WITH_BUTTER)));
    public static final Item TOAST_WITH_JAM = registerItem("toast_with_jam", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.TOAST_WITH_JAM)));
    public static final Item BROWNIE = registerItem("brownie", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.BROWNIE)));
    public static final Item WAFFLE_WITH_CHOCOLATE_SYRUP = registerItem("waffle_with_chocolate_syrup", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.WAFFLE_WITH_CHOCOLATE_SYRUP)));
    public static final Item WAFFLE_WITH_FRUIT_SYRUP = registerItem("waffle_with_fruit_syrup", new Item(new FabricItemSettings().food(ModFoodComponentsCafe.WAFFLE_WITH_FRUIT_SYRUP)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CozyCafe.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CozyCafe.LOGGER.info("Registering Mod Items for " + CozyCafe.MOD_ID);
    }
}
