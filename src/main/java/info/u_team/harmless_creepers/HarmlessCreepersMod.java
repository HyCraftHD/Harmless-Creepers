package info.u_team.harmless_creepers;

import info.u_team.u_team_core.util.annotation.AnnotationManager;
import info.u_team.u_team_core.util.verify.JarSignVerifier;
import net.minecraftforge.fml.common.Mod;

@Mod(HarmlessCreepersMod.MODID)
public class HarmlessCreepersMod {
	
	public static final String MODID = "harmlesscreepers";
	
	public HarmlessCreepersMod() {
		JarSignVerifier.checkSigned(MODID);
		
		AnnotationManager.callAnnotations(MODID);
	}
}
