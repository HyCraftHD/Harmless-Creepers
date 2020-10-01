package info.u_team.harmless_creepers.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;

import info.u_team.harmless_creepers.config.ServerConfig;
import net.minecraft.command.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;

public class HarmlessCreepersCommand {
	
	public static void register(CommandDispatcher<CommandSource> dispatcher) {
		dispatcher.register(Commands.literal("creepers") //
				.then(Commands.literal("block-breaking") //
						.requires(source -> source.hasPermissionLevel(2)) //
						.executes(context -> {
							return bedrockBreakingGet(context.getSource());
						}) //
						.then(Commands.argument("value", BoolArgumentType.bool()) //
								.executes(context -> {
									return bedrockBreakingSet(context.getSource(), BoolArgumentType.getBool(context, "value"));
								}))));
	}
	
	private static int bedrockBreakingGet(CommandSource source) {
		System.out.println("GET");
		final BooleanValue bedrockBreaking = ServerConfig.getInstance().blockBreaking;
		source.sendFeedback(ITextComponent.func_244388_a("Value block-breaking is currently set to: " + bedrockBreaking.get()), false);
		return 0;
	}
	
	private static int bedrockBreakingSet(CommandSource source, boolean value) {
		final BooleanValue bedrockBreaking = ServerConfig.getInstance().blockBreaking;
		bedrockBreaking.set(value);
		bedrockBreaking.save();
		source.sendFeedback(ITextComponent.func_244388_a("Value block-breaking is now set to: " + bedrockBreaking.get()), true);
		return 0;
	}
	
}
