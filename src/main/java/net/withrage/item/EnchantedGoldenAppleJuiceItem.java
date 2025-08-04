package net.withrage.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;

public class EnchantedGoldenAppleJuiceItem extends Item {
    public EnchantedGoldenAppleJuiceItem(Settings settings) {
        super(settings);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}