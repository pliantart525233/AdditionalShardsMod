package net.pliant.additional_shards.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.pliant.additional_shards.item.modItems;

public class modCreativeModeTab {
    // Create mod Tab
    public static final CreativeModeTab ADD_SHARDS = new CreativeModeTab("AdditionalShardsMod") {
        @Override
        // Get Icon for tab
        public ItemStack makeIcon() {
            return new ItemStack(modItems.HASTE_ITEM.get());
        }
    };
}
