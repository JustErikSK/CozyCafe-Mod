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
                        entries.add(ModItemsCafe.APPLE_PIE);
                        entries.add(ModItemsCafe.BERRY_CUPCAKE);
                        entries.add(ModItemsCafe.CHICKEN_MUSHROOM_PIE);
                        entries.add(ModItemsCafe.CHIPS);
                        entries.add(ModItemsCafe.CHOCOLATE_CUPCAKE);
                        entries.add(ModItemsCafe.CHOCOLATE_DONUT);
                        entries.add(ModItemsCafe.CHOCOLATE_MILK);
                        entries.add(ModItemsCafe.CROISSANT);
                        entries.add(ModItemsCafe.JELLY_DONUT);
                        entries.add(ModItemsCafe.FRIES);
                        entries.add(ModItemsCafe.GILDED_MELONADE);
                        entries.add(ModItemsCafe.GLOWBERRY_DONUT);
                        entries.add(ModItemsCafe.GLOWBERRY_ICE_CREAM);
                        entries.add(ModItemsCafe.GLOWBERRY_JUICE);
                        entries.add(ModItemsCafe.GLOWBERRY_PIE);
                        entries.add(ModItemsCafe.MELONADE);
                        entries.add(ModItemsCafe.MERINGUE);
                        entries.add(ModItemsCafe.MILK_BREAD);
                        entries.add(ModItemsCafe.NUHTELLA_ICE_CREAM);
                        entries.add(ModItemsCafe.POT_PIE);
                        entries.add(ModItemsCafe.PRETZEL);
                        entries.add(ModItemsCafe.SUGAR_DONUT);
                        entries.add(ModItemsCafe.SWEETBERRY_DONUT);
                        entries.add(ModItemsCafe.SWEETBERRY_ICE_CREAM);
                        entries.add(ModItemsCafe.SWEETBERRY_JUICE);
                        entries.add(ModItemsCafe.SWEETBERRY_PIE);
                        entries.add(ModItemsCafe.VANILLA_ICE_CREAM);
                    }).build());

    public static void registerItemGroups() {
        CozyCafe.LOGGER.info("Registering Item Groups for " + CozyCafe.MOD_ID);
    }
}
