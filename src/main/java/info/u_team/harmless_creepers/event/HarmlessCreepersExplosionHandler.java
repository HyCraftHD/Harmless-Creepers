package info.u_team.harmless_creepers.event;

import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.*;

public class HarmlessCreepersExplosionHandler {
	
	private static void onEntityJoinWorld(EntityJoinWorldEvent event) {
	}
	
	public static void registerForge(IEventBus bus) {
		bus.addListener(EventPriority.HIGHEST, HarmlessCreepersExplosionHandler::onEntityJoinWorld);
	}
	
}
