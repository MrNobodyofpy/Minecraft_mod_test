package net.mcreator.freshandtechnologymod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.freshandtechnologymod.init.FreshAndTechnologyModModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WhenbreakthegrassProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if (Math.random() >= 0.5 && ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CRIMSON_ROOTS || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WEEPING_VINES
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CRIMSON_NYLIUM)) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FreshAndTechnologyModModItems.FRESH_SEED.get()));
				entityToSpawn.setPickUpDelay(5);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
