package ca.strendin.MSTR_MobIgnore;

import org.bukkit.entity.Player;

public class MSTR_Permissions {
    public static boolean ignoredByAll(Player player) {
        return player.hasPermission("MSTR_MobIgnore.all");
    }
    public static boolean ignoredByCreeper(Player player) {
    	if (ignoredByAll(player))
    	{
    		return true;
    	} else {
    		return player.hasPermission("MSTR_MobIgnore.creeper");
    	}        
    }    
    public static boolean ignoredByEndermen(Player player) {
    	if (ignoredByAll(player))
    	{
    		return true;
    	} else {
    		return player.hasPermission("MSTR_MobIgnore.enderman");
    	}
    }
    public static boolean ignoredByBlaze(Player player) {
    	if (ignoredByAll(player))
    	{
    		return true;
    	} else {
    		return player.hasPermission("MSTR_MobIgnore.blaze");
    	}
    }
    public static boolean ignoredByGhast(Player player) {
    	if (ignoredByAll(player))
    	{
    		return true;
    	} else {
    		return player.hasPermission("MSTR_MobIgnore.ghast");
    	}
    }
    public static boolean ignoredByCaveSpider(Player player) {
    	if (ignoredByAll(player))
    	{
    		return true;
    	} else {
    		return player.hasPermission("MSTR_MobIgnore.cavespider");
    	}
    }
    public static boolean ignoredByMagmaCube(Player player) {
    	if (ignoredByAll(player))
    	{
    		return true;
    	} else {
    		return player.hasPermission("MSTR_MobIgnore.magmacube");
    	}
    }
    public static boolean ignoredBySilverfish(Player player) {
    	if (ignoredByAll(player))
    	{
    		return true;
    	} else {
    		return player.hasPermission("MSTR_MobIgnore.silverfish");
    	}
    }
    public static boolean ignoredBySkeleton(Player player) {
    	if (ignoredByAll(player))
    	{
    		return true;
    	} else {
    		return player.hasPermission("MSTR_MobIgnore.skeleton");
    	}
    }
    public static boolean ignoredBySlime(Player player) {
    	if (ignoredByAll(player))
    	{
    		return true;
    	} else {
    		return player.hasPermission("MSTR_MobIgnore.slime");
    	}
    }
    public static boolean ignoredBySpider(Player player) {
    	if (ignoredByAll(player))
    	{
    		return true;
    	} else {
    		return player.hasPermission("MSTR_MobIgnore.spider");
    	}
    }
    public static boolean ignoredByZombie(Player player) {
    	if (ignoredByAll(player))
    	{
    		return true;
    	} else {
    		return player.hasPermission("MSTR_MobIgnore.zombie");
    	}
    }

}
