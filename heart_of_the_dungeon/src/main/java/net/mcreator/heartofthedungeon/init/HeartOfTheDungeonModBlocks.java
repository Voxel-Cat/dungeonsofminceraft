
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.heartofthedungeon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.heartofthedungeon.block.ForcefieldblockBlock;
import net.mcreator.heartofthedungeon.HeartOfTheDungeonMod;

public class HeartOfTheDungeonModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HeartOfTheDungeonMod.MODID);
	public static final RegistryObject<Block> FORCEFIELDBLOCK = REGISTRY.register("forcefieldblock", () -> new ForcefieldblockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
