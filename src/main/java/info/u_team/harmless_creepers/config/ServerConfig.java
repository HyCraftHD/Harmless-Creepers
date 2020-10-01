package info.u_team.harmless_creepers.config;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.*;

public class ServerConfig {
	
	public static final ForgeConfigSpec CONFIG;
	private static final ServerConfig INSTANCE;
	
	static {
		Pair<ServerConfig, ForgeConfigSpec> pair = new Builder().configure(ServerConfig::new);
		CONFIG = pair.getRight();
		INSTANCE = pair.getLeft();
	}
	
	public static ServerConfig getInstance() {
		return INSTANCE;
	}
	
	public final BooleanValue blockBreaking;
	
	private ServerConfig(Builder builder) {
		builder.comment("Server configuration settings").push("server");
		blockBreaking = builder.comment("Allow breaking blocks from creeper explosions").define("blockBreaking", true);
		builder.pop();
	}
	
}
