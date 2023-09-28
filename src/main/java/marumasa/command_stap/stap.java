package marumasa.command_stap;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class stap implements CommandExecutor {

    private static final String TEXT = "STAPコマンドは、あります！";

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Bukkit.broadcastMessage(TEXT);
        return true;
    }
}
