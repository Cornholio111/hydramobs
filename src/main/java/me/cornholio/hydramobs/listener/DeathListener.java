package me.cornholio.hydramobs.listener;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.Objects;

public class DeathListener implements Listener {

    @EventHandler
    public void onEntityDeath(final EntityDeathEvent event) {

        final LivingEntity entity = event.getEntity();

        if(event.getEntity().getLastDamageCause() instanceof EntityDamageByEntityEvent) {
            final EntityDamageByEntityEvent dmgEvent = (EntityDamageByEntityEvent) event.getEntity().getLastDamageCause();

            if(entity.isDead() && dmgEvent.getDamager() instanceof Player) {

                entity.getWorld().spawnEntity(entity.getLocation(), event.getEntityType());
                entity.getWorld().spawnEntity(entity.getLocation(), event.getEntityType());

            }

        }

    }

}
