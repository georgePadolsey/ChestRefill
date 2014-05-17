package uk.co.georgep.chestrefill;

import uk.co.georgep.chestrefill.utils.Utils;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * A Chest Refill plugin
 * <p/>
 * Latest Change: Created It
 * <p/>
 *
 * @author George
 * @since 17/05/2014
 */
public class ChestRefillPlugin extends JavaPlugin {

	// The Chest Manager
	@Getter
	public static GChestManager gChestManager;

	@Override
	public void onEnable() {

		new Utils(new GUtilValues());

		gChestManager = new GChestManager();

	}
}
