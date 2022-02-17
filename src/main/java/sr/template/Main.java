package sr.template;

import co.aikar.commands.PaperCommandManager;
import org.bukkit.plugin.java.JavaPlugin;
import sr.template.commands.MainCMD;

public final class Main extends JavaPlugin {

    PaperCommandManager commandManager;

    @Override
    public void onEnable() {
        // Plugin startup logic here
        commandManager = new PaperCommandManager(this);
        commandManager.registerCommand(new MainCMD(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
