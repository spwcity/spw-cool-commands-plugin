package city.spworlds.coolcommands;

import city.spworlds.coolcommands.commands.RickRoll;
import org.bukkit.plugin.java.JavaPlugin;

public final class CoolCommands extends JavaPlugin {

    @Override
    public void onEnable() {
        new RickRoll(this.getCommand("donate"));
        new RickRoll(this.getCommand("porn"));
        new RickRoll(this.getCommand("sex"));
        new RickRoll(this.getCommand("pvp"));
        new RickRoll(this.getCommand("home"));
        new RickRoll(this.getCommand("sp"));
        new RickRoll(this.getCommand("tlauncher"));

    }
}
