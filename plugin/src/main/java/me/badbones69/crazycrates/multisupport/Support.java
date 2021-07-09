package me.badbones69.crazycrates.multisupport;

import org.bukkit.Bukkit;

public enum Support {
    
    PLACEHOLDERAPI("PlaceholderAPI"),
    CRATESPLUS("CratesPlus"),
    HOLOGRAPHIC_DISPLAYS("HolographicDisplays"),
    HOLOGRAMS("Holograms");
    
    private String name;
    
    private Support(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean isPluginLoaded() {
        return Bukkit.getServer().getPluginManager().getPlugin(name) != null;
    }
    
}