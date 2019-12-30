package preventclearcommand;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.Plugin;

import java.util.Locale;

/**
 * Listen for command preprocess events
 */
public class CommandListener implements Listener {

    private final Plugin plugin;

    CommandListener(Plugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent event) {
        if ("/clear".equals(event.getMessage().trim().toLowerCase(Locale.ROOT))) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(new String[] {
                    "The command \"/clear\" has been disabled to prevent mistakes",
                    "To clear your entire inventory, use \"/clear @s\" instead"
            });
        }
    }

}
