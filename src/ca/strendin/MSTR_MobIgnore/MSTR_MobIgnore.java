package ca.strendin.MSTR_MobIgnore;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MSTR_MobIgnore extends JavaPlugin {
	@Override
    public void onDisable() {
		MSTR_Comms.logThis("Plugin DISABLED");        
    }

    @Override
    public void onEnable() {
        //Commands
        /* getCommand("setspawn").setExecutor(new SASetSpawnCommand(this)); */
    	
    	// Register events
        PluginManager pm = getServer().getPluginManager();        
        pm.registerEvents(new MSTR_PlayerListener(this), this);
    	
    	MSTR_Comms.logThis("Plugin ENABLED");        
    }
}
