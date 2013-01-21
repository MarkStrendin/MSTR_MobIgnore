package ca.strendin.MSTR_MobIgnore;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.entity.EntityTargetEvent.TargetReason;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;

public class MSTR_PlayerListener implements Listener {
    public static MSTR_MobIgnore plugin;

    public MSTR_PlayerListener(MSTR_MobIgnore thisplugin) {
        plugin = thisplugin;
    }
    
    @EventHandler
    public void onEntityTarget(EntityTargetEvent event) {
    	if (event.getTarget() instanceof Player) {
    		/*
    		 * This makes it so that if you attack them, they notice you
    		 */
    		if (event.getReason() == TargetReason.TARGET_ATTACKED_ENTITY) {
    			return;
    		} 

    		Player player = (Player)event.getTarget();
    		EntityType mobType = event.getEntityType(); if (mobType == EntityType.BLAZE)
    			if (MSTR_Permissions.ignoredByBlaze(player))
    				event.setCancelled(true);

    		if (mobType == EntityType.CREEPER)
    			if (MSTR_Permissions.ignoredByCreeper(player))
    				event.setCancelled(true);

    		if (mobType == EntityType.ENDERMAN)
    			if (MSTR_Permissions.ignoredByEndermen(player))
    				event.setCancelled(true);

    		if (mobType == EntityType.CAVE_SPIDER)
    			if (MSTR_Permissions.ignoredByCaveSpider(player))
    				event.setCancelled(true);

    		if (mobType == EntityType.MAGMA_CUBE)
    			if (MSTR_Permissions.ignoredByMagmaCube(player))
    				event.setCancelled(true);

    		if (mobType == EntityType.SILVERFISH)
    			if (MSTR_Permissions.ignoredBySilverfish(player))
    				event.setCancelled(true);

    		if (mobType == EntityType.SKELETON)
    			if (MSTR_Permissions.ignoredBySkeleton(player))
    				event.setCancelled(true);

    		if (mobType == EntityType.SLIME)
    			if (MSTR_Permissions.ignoredBySlime(player))
    				event.setCancelled(true);

    		if (mobType == EntityType.ZOMBIE)
    			if (MSTR_Permissions.ignoredByZombie(player))
    				event.setCancelled(true);

    		if (mobType == EntityType.SPIDER)
    			if (MSTR_Permissions.ignoredBySpider(player))
    				event.setCancelled(true);
    		
    		if (mobType == EntityType.GHAST)
    			if (MSTR_Permissions.ignoredByGhast(player))
    				event.setCancelled(true);
    	
    	}    	
    }
    
    @EventHandler
    public void onEntityTargetLivingEntity(EntityTargetLivingEntityEvent event) {
    	if (event.getTarget() instanceof Player) {
    		Player player = (Player)event.getTarget();
    		
    		
    		/*
    		 * This makes it so that if you attack them, they notice you
    		 */
    		if (event.getReason() == TargetReason.TARGET_ATTACKED_ENTITY) {
    			return;
    		}    		
    		
    		
    		if (MSTR_Permissions.ignoredByAll(player)) {
    			event.setCancelled(true);
    			return;
    		}    		
    		
    		EntityType mobType = event.getEntityType();    		
    		if (mobType == EntityType.BLAZE)
    			if (MSTR_Permissions.ignoredByBlaze(player))
    				event.setCancelled(true);

    		if (mobType == EntityType.CREEPER)
    			if (MSTR_Permissions.ignoredByCreeper(player))
    				event.setCancelled(true);

    		if (mobType == EntityType.ENDERMAN)
    			if (MSTR_Permissions.ignoredByEndermen(player))
    				event.setCancelled(true);

    		if (mobType == EntityType.CAVE_SPIDER)
    			if (MSTR_Permissions.ignoredByCaveSpider(player))
    				event.setCancelled(true);

    		if (mobType == EntityType.MAGMA_CUBE)
    			if (MSTR_Permissions.ignoredByMagmaCube(player))
    				event.setCancelled(true);

    		if (mobType == EntityType.SILVERFISH)
    			if (MSTR_Permissions.ignoredBySilverfish(player))
    				event.setCancelled(true);

    		if (mobType == EntityType.SKELETON)
    			if (MSTR_Permissions.ignoredBySkeleton(player))
    				event.setCancelled(true);

    		if (mobType == EntityType.SLIME)
    			if (MSTR_Permissions.ignoredBySlime(player))
    				event.setCancelled(true);

    		if (mobType == EntityType.ZOMBIE)
    			if (MSTR_Permissions.ignoredByZombie(player))
    				event.setCancelled(true);

    		if (mobType == EntityType.SPIDER)
    			if (MSTR_Permissions.ignoredBySpider(player))
    				event.setCancelled(true);
    		
    		if (mobType == EntityType.GHAST)
    			if (MSTR_Permissions.ignoredByGhast(player))
    				event.setCancelled(true);
    		
    		
    	}
    }
    

}
