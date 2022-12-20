package com.parnapple.fd_fastfood.items;

import com.parnapple.fd_fastfood.FastFoodAddon;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
//import vectorwing.farmersdelight.FarmersDelight;
//import vectorwing.farmersdelight.common.registry.ModItems;

public class AddonItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FastFoodAddon.MOD_ID);

    public static final RegistryObject<Item> PEANUT = ITEMS.register("peanut",
            () -> new Item(new Item.Properties().food(AddonFoods.PEANUT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
