
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.freshandtechnologymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.freshandtechnologymod.item.FreshseedItem;
import net.mcreator.freshandtechnologymod.FreshAndTechnologyModMod;

public class FreshAndTechnologyModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FreshAndTechnologyModMod.MODID);
	public static final RegistryObject<Item> FRESH_SEED = REGISTRY.register("fresh_seed", () -> new FreshseedItem());
}
