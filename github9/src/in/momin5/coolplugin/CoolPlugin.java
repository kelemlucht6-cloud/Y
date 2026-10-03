package in.momin5.coolplugin;

import in.momin5.coolplugin.events.MessageEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class CoolPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new MessageEvent(), this);
    }
}
