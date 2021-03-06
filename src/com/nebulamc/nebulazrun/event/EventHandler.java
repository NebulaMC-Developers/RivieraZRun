package com.nebulamc.nebulazrun.event;

import com.nebulamc.nebulazrun.NebulaZRun;

public class EventHandler {
	public PlayerChatListener chat;
	public PlayerInteractListener interact;
	
	public EventHandler(NebulaZRun plugin) {
		chat = new PlayerChatListener(plugin);
		interact = new PlayerInteractListener(plugin);
	}
	
	public void registerEvents(NebulaZRun p) {
		p.getServer().getPluginManager().registerEvents(chat, p);
		p.getServer().getPluginManager().registerEvents(interact, p);
	}
}
