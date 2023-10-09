package net.pliant.additional_shards.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pliant.additional_shards.AdditionalShards;
import net.pliant.additional_shards.item.custom.*;

public class modItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalShards.MOD_ID);

    public static final RegistryObject<Item> HASTE_ITEM = ITEMS.register("haste_shard",()
            -> new hasteEffectItem(new Item.Properties().tab(modCreativeModeTab.ADD_SHARDS)
            .stacksTo(16).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> STRENGTH_ITEM = ITEMS.register("strength_shard",()
            -> new strengthEffectItem(new Item.Properties().tab(modCreativeModeTab.ADD_SHARDS)
            .stacksTo(16).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> FIRE_RES_ITEM = ITEMS.register("fire_res_shard",()
            -> new fireResEffectItem(new Item.Properties().tab(modCreativeModeTab.ADD_SHARDS)
            .stacksTo(16).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> INST_HEALTH_ITEM = ITEMS.register("inst_health_shard",()
            -> new instantHealthEffectItem(new Item.Properties().tab(modCreativeModeTab.ADD_SHARDS)
            .stacksTo(16).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> SPEED_ITEM = ITEMS.register("speed_shard",()
            -> new SpeedEffectItem(new Item.Properties().tab(modCreativeModeTab.ADD_SHARDS)
            .stacksTo(16).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> REGEN_ITEM = ITEMS.register("regen_shard",()
            -> new regenEffectItem(new Item.Properties().tab(modCreativeModeTab.ADD_SHARDS)
            .stacksTo(16).rarity(Rarity.RARE)));

    public static void register(IEventBus eventBus)
    {

        ITEMS.register(eventBus);

    }

}
