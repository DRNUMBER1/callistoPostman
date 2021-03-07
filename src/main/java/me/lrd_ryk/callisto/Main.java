package me.lrd_ryk.callisto;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import me.lrd_ryk.callisto.util.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION) 
public class Main {
	
	@Instance
	public Main instance;
	
	@EventHandler
	public void PreInit (FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init (FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(instance);
	}
		
	
	@EventHandler
	public void PostInit (FMLPreInitializationEvent event) {
	
 }
}
