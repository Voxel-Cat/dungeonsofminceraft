
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.heartofthedungeon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.heartofthedungeon.item.Spellshield01Item;
import net.mcreator.heartofthedungeon.HeartOfTheDungeonMod;

public class HeartOfTheDungeonModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HeartOfTheDungeonMod.MODID);
	public static final RegistryObject<Item> FORCEFIELDBLOCK = block(HeartOfTheDungeonModBlocks.FORCEFIELDBLOCK);
	public static final RegistryObject<Item> SPELLSHIELD_01 = REGISTRY.register("spellshield_01", () -> new Spellshield01Item());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
