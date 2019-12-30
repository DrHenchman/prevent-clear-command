package preventclearcommand;

import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused") // referenced in plugin.yml
public class PreventClearCommandPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        registerListeners();
    }

    private void registerListeners() {
        getServer().getPluginManager().registerEvents(new CommandListener(this), this);
    }

}
