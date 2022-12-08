package city.spworlds.coolcommands.commands;

import com.google.common.collect.Lists;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;

import java.util.List;

public class RickRoll extends AbstractCommand {
    public RickRoll(PluginCommand pluginCommand) {
        super(pluginCommand);
    }

    @Override
    public void execute(CommandSender sender, String label, String[] args) {
        TextComponent message = new TextComponent("Нажми на меня");
        message.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
        sender.sendMessage(message);
    }

    @Override
    public List<String> complete(CommandSender sender, String[] args) {
        return Lists.newArrayList();
    }
}
