package me.bman.tickets;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

/*
 * 
 * Bukkit Ticket
 * By Sir_Mr_Bman
 * 
 * DO NOT REDISTRIBUTE!
 * 
 */

public class Header extends JavaPlugin {
	
	public final Logger logger = Logger.getLogger("Minecraft");
	
	
	public void info(String msg) {	this.logger.info("[BukkitTicket] " + msg);	}

}
