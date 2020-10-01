package info.u_team.harmless_creepers.event;

import info.u_team.harmless_creepers.config.ServerConfig;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.world.Explosion;
import net.minecraftforge.event.world.ExplosionEvent;
import net.minecraftforge.eventbus.api.*;

public class HarmlessCreepersExplosionHandler {
	
	private static void onExplosionDetonate(ExplosionEvent.Detonate event) {
		final Explosion explosion = event.getExplosion();
		if (!(explosion.getExplosivePlacedBy() instanceof CreeperEntity)) {
			return;
		}
		if (ServerConfig.getInstance().blockBreaking.get()) {
			return;
		}
		event.getExplosion().clearAffectedBlockPositions();
	}
	
	public static void registerForge(IEventBus bus) {
		bus.addListener(EventPriority.HIGHEST, HarmlessCreepersExplosionHandler::onExplosionDetonate);
	}
	
}
