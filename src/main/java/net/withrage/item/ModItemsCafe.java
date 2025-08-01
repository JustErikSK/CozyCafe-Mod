package net.withrage.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.withrage.CozyCafe;

public class ModItemsCafe {

    public static final Item APPLE_JUICE = registerItem("apple_juice", new DrinkItem(new FabricItemSettings().food(ModFoodComponents.APPLE_JUICE)));
    public static final Item APPLE_PIE = registerItem("apple_pie", new Item(new FabricItemSettings().food(ModFoodComponents.APPLE_PIE)));
    public static final Item BERRY_CUPCAKE = registerItem("berry_cupcake", new Item(new FabricItemSettings().food(ModFoodComponents.BERRY_CUPCAKE)));
    public static final Item CHICKEN_MUSHROOM_PIE = registerItem("chicken_mushroom_pie", new Item(new FabricItemSettings().food(ModFoodComponents.CHICKEN_MUSHROOM_PIE)));
    public static final Item CHIPS = registerItem("chips", new Item(new FabricItemSettings().food(ModFoodComponents.CHIPS)));
    public static final Item CHOCOLATE_CUPCAKE = registerItem("chocolate_cupcake", new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_CUPCAKE)));
    public static final Item CHOCOLATE_DONUT = registerItem("chocolate_donut", new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_DONUT)));
    public static final Item CHOCOLATE_MILK = registerItem("chocolate_milk", new DrinkItem(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_MILK)));
    public static final Item JELLY_DONUT = registerItem("jelly_donut", new Item(new FabricItemSettings().food(ModFoodComponents.JELLY_DONUT)));
    public static final Item FRIES = registerItem("fries", new Item(new FabricItemSettings().food(ModFoodComponents.FRIES)));
    public static final Item GILDED_MELONADE = registerItem("gilded_melonade", new Item(new FabricItemSettings().food(ModFoodComponents.GILDED_MELONADE)));
    public static final Item GLOWBERRY_DONUT = registerItem("glowberry_donut", new Item(new FabricItemSettings().food(ModFoodComponents.GLOWBERRY_DONUT)));
    public static final Item GLOWBERRY_ICE_CREAM = registerItem("glowberry_ice_cream", new Item(new FabricItemSettings().food(ModFoodComponents.GLOWBERRY_ICE_CREAM)));
    public static final Item GLOWBERRY_JUICE = registerItem("glowberry_juice", new DrinkItem(new FabricItemSettings().food(ModFoodComponents.GLOWBERRY_JUICE)));
    public static final Item GLOWBERRY_PIE = registerItem("glowberry_pie", new Item(new FabricItemSettings().food(ModFoodComponents.GLOWBERRY_PIE)));
    public static final Item MELONADE = registerItem("melonade", new DrinkItem(new FabricItemSettings().food(ModFoodComponents.MELONADE)));
    public static final Item MERINGUE = registerItem("meringue", new Item(new FabricItemSettings().food(ModFoodComponents.MERINGUE)));
    public static final Item MILK_BREAD = registerItem("milk_bread", new Item(new FabricItemSettings().food(ModFoodComponents.MILK_BREAD)));
    public static final Item NUHTELLA_ICE_CREAM = registerItem("nuhtella_ice_cream", new Item(new FabricItemSettings().food(ModFoodComponents.NUHTELLA_ICE_CREAM)));
    public static final Item POT_PIE = registerItem("pot_pie", new Item(new FabricItemSettings().food(ModFoodComponents.POT_PIE)));
    public static final Item PRETZEL = registerItem("pretzel", new Item(new FabricItemSettings().food(ModFoodComponents.PRETZEL)));
    public static final Item SUGAR_DONUT = registerItem("sugar_donut", new Item(new FabricItemSettings().food(ModFoodComponents.SUGAR_DONUT)));
    public static final Item SWEETBERRY_DONUT = registerItem("sweetberry_donut", new Item(new FabricItemSettings().food(ModFoodComponents.SWEETBERRY_DONUT)));
    public static final Item SWEETBERRY_ICE_CREAM = registerItem("sweetberry_ice_cream", new Item(new FabricItemSettings().food(ModFoodComponents.SWEETBERRY_ICE_CREAM)));
    public static final Item SWEETBERRY_JUICE = registerItem("sweetberry_juice", new DrinkItem(new FabricItemSettings().food(ModFoodComponents.SWEETBERRY_JUICE)));
    public static final Item SWEETBERRY_PIE = registerItem("sweetberry_pie", new Item(new FabricItemSettings().food(ModFoodComponents.SWEETBERRY_PIE)));
    public static final Item VANILLA_ICE_CREAM = registerItem("vanilla_ice_cream", new Item(new FabricItemSettings().food(ModFoodComponents.VANILLA_ICE_CREAM)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CozyCafe.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CozyCafe.LOGGER.info("Registering Mod Items for " + CozyCafe.MOD_ID);
    }
}
