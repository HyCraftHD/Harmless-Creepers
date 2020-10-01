package info.u_team.harmless_creepers.init;

import org.apache.commons.lang3.tuple.Pair;

import info.u_team.harmless_creepers.HarmlessCreepersMod;
import info.u_team.harmless_creepers.config.ServerConfig;
import info.u_team.harmless_creepers.event.HarmlessCreepersExplosionHandler;
import info.u_team.u_team_core.api.construct.*;
import info.u_team.u_team_core.util.registry.BusRegister;
import net.minecraftforge.fml.*;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.network.FMLNetworkConstants;

@Construct(modid = HarmlessCreepersMod.MODID)
public class HarmlessCreepersCommonConstruct implements IModConstruct {
	
	@Override
	public void construct() {
		ModLoadingContext.get().registerExtensionPoint(ExtensionPoint.DISPLAYTEST, () -> Pair.of(() -> FMLNetworkConstants.IGNORESERVERONLY, (a, b) -> true));
		ModLoadingContext.get().registerConfig(Type.SERVER, ServerConfig.CONFIG);
		
		BusRegister.registerForge(HarmlessCreepersCommands::registerForge);
		BusRegister.registerForge(HarmlessCreepersExplosionHandler::registerForge);
	}
}