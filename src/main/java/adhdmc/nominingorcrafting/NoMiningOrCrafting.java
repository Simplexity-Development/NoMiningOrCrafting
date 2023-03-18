package adhdmc.nominingorcrafting;

import org.bukkit.plugin.java.JavaPlugin;

public final class NoMiningOrCrafting extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new MiningAndCraftingListeners(), this);

    }
}
