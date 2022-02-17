package sr.template.commands;


import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Subcommand;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.bukkit.entity.Player;
import sr.template.Main;

@CommandPermission("operator")
@CommandAlias("Main")
@RequiredArgsConstructor
public class MainCMD extends BaseCommand {

    private @NonNull Main instance;

    @CommandPermission("operator")
    @Subcommand("test")
    public void game(Player p) {
        p.sendMessage("Hi!");
    }
}
