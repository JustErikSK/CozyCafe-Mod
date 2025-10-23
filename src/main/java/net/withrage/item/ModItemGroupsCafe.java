package net.withrage.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.withrage.CozyCafe;

public class ModItemGroupsCafe {
    public static final ItemGroup COZY_CAFE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CozyCafe.MOD_ID, "apple_juice"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cozycafe"))
                    .icon(() -> new ItemStack(ModItemsCafe.APPLE_JUICE)).entries((displayContext, entries) -> {
                        entries.add(ModItemsCafe.APPLE_JUICE);
                        entries.add(ModItemsCafe.SWEETBERRY_JUICE);
                        entries.add(ModItemsCafe.GLOWBERRY_JUICE);
                        entries.add(ModItemsCafe.GOLDEN_APPLE_JUICE);
                        entries.add(ModItemsCafe.ENCHANTED_GOLDEN_APPLE_JUICE);
                        entries.add(ModItemsCafe.MELONADE);
                        entries.add(ModItemsCafe.GLISTERING_MELONADE);
                        entries.add(ModItemsCafe.JELLY_DONUT);
                        entries.add(ModItemsCafe.SUGAR_DONUT);
                        entries.add(ModItemsCafe.GLOWBERRY_DONUT);
                        entries.add(ModItemsCafe.SWEETBERRY_DONUT);
                        entries.add(ModItemsCafe.CHOCOLATE_DONUT);
                        entries.add(ModItemsCafe.BUTTER_COOKIE);
                        entries.add(ModItemsCafe.BROWNIE);
                        entries.add(ModItemsCafe.APPLE_PIE);
                        entries.add(ModItemsCafe.GLOWBERRY_PIE);
                        entries.add(ModItemsCafe.SWEETBERRY_PIE);
                        entries.add(ModItemsCafe.WAFFLE_WITH_FRUIT_SYRUP);
                        entries.add(ModItemsCafe.WAFFLE_WITH_CHOCOLATE_SYRUP);
                        entries.add(ModItemsCafe.GLOWBERRY_ICE_CREAM);
                        entries.add(ModItemsCafe.SWEETBERRY_ICE_CREAM);
                        entries.add(ModItemsCafe.VANILLA_ICE_CREAM);
                        entries.add(ModItemsCafe.NUHTELLA_ICE_CREAM);
                        entries.add(ModItemsCafe.BERRY_CUPCAKE);
                        entries.add(ModItemsCafe.CHOCOLATE_CUPCAKE);
                        entries.add(ModItemsCafe.CHOCOLATE_MILK);
                        entries.add(ModItemsCafe.MILK_BREAD);
                        entries.add(ModItemsCafe.POT_PIE);
                        entries.add(ModItemsCafe.CHICKEN_MUSHROOM_PIE);
                        entries.add(ModItemsCafe.BREAKFAST_BURGER);
                        entries.add(ModItemsCafe.TOAST_WITH_BUTTER);
                        entries.add(ModItemsCafe.TOAST_WITH_JAM);
                        entries.add(ModItemsCafe.BOLOGNA_AND_CREAM_CHEESE_TOAST);
                        entries.add(ModItemsCafe.EGG_TOAST);
                        entries.add(ModItemsCafe.NUHTELLA_TOAST);
                        entries.add(ModItemsCafe.HAM_AND_CHEESE_SANDWICH);
                        entries.add(ModItemsCafe.CHIPS);
                        entries.add(ModItemsCafe.FRIES);
                        entries.add(ModItemsCafe.PRETZEL);
                        entries.add(ModItemsCafe.MERINGUE);
                        entries.add(ModItemsCafe.BLUE_JELLY);
                        entries.add(ModItemsCafe.GREEN_JELLY);
                        entries.add(ModItemsCafe.ORANGE_JELLY);
                        entries.add(ModItemsCafe.PINK_JELLY);
                        entries.add(ModItemsCafe.PURPLE_JELLY);
                        entries.add(ModItemsCafe.YELLOW_JELLY);
                    }).build());

    public static void registerItemGroups() {
        CozyCafe.LOGGER.info("Registering Item Groups for " + CozyCafe.MOD_ID);
    }
}
