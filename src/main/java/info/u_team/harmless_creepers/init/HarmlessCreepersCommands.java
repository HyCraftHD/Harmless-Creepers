package info.u_team.harmless_creepers.init;

import info.u_team.harmless_creepers.command.HarmlessCreepersCommand;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.IEventBus;

public class HarmlessCreepersCommands {
	
	private static void onRegisterCommands(RegisterCommandsEvent event) {
		HarmlessCreepersCommand.register(event.getDispatcher());
	}
	
	public static void registerForge(IEventBus bus) {
		bus.addListener(HarmlessCreepersCommands::onRegisterCommands);
	}
	
}
