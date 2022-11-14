package me.cornholio.hydramobs;

import me.cornholio.hydramobs.listener.DeathListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class HydraMobs extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new DeathListener(), this);
    }

}
