package com.terraformersmc.terrestria.mixin;

import com.terraformersmc.terrestria.init.TerrestriaBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ai.goal.EatGrassGoal;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EatGrassGoal.class)
public class MixinEatGrassGoal {
	@Shadow
	@Final
	private MobEntity mob;

	@Shadow
	@Final
	private World world;

	@Shadow
	private int timer;

	@Inject(method = "canStart", at = @At(value = "FIELD", target = "Lnet/minecraft/block/Blocks;GRASS_BLOCK:Lnet/minecraft/block/Block;"), cancellable = true)
	private void canStart(CallbackInfoReturnable<Boolean> callbackInfo) {
		BlockPos pos = this.mob.getPositionTarget();

		if(this.world.getBlockState(pos.down()).getBlock() == TerrestriaBlocks.ANDISOL_GRASS_BLOCK) {
			callbackInfo.setReturnValue(true);
		}
	}

	@Inject(method = "tick", at = @At("HEAD"))
	private void tick(CallbackInfo info) {
		if (this.timer - 1 == 4) {
			BlockPos pos = this.mob.getPositionTarget();
			BlockPos downPos = pos.down();

			if (this.world.getBlockState(downPos).getBlock() == TerrestriaBlocks.ANDISOL_GRASS_BLOCK) {
				if (this.world.getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING)) {
					this.world.syncGlobalEvent(2001, downPos, Block.getRawIdFromState(Blocks.GRASS_BLOCK.getDefaultState()));
					this.world.setBlockState(downPos, TerrestriaBlocks.ANDISOL.getDefaultState(), 2);
				}

				this.mob.onEatingGrass();
			}
		}
	}
}
