package marumasa.command_stap;

import org.bukkit.plugin.java.JavaPlugin;

public final class CommandSTAP extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("stap").setExecutor(new stap());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
