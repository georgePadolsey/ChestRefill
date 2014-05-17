package uk.co.georgep.chestrefill;

import lombok.NonNull;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;

import java.util.HashMap;

import static uk.co.georgep.chestrefill.utils.Properties.getProperty;

/**
 * A Central chest Manager
 * <p/>
 * Latest Change: Created it
 * <p/>
 *
 * @author George
 * @since 17/05/2014
 */
public class GChestManager {

	/**
	 * Refills a chest with certain itemstacks
	 * @param location the location of a chest
	 * @param clear whether to clear the inventory of the chest before refilling
	 * @param itemStacks what itemstacks to refill it with
	 * @return The items that couldn't be added to the inventory of the chest
	 * @throws ChestException if the location doesn't have a chest at it
	 * @see GChestManager#refillChest(org.bukkit.block.Chest, org.bukkit.inventory.ItemStack...)
	 */
	public HashMap<Integer, ItemStack> refillChest(@NonNull Location location, @NonNull Boolean clear, @Nullable ItemStack... itemStacks) throws ChestException {

		// Get the block at the location
		Block block = location.getBlock();

		// Throw exception if there isn't a chest at the location
		if(!(block.getState() instanceof Chest)) throw new ChestException(getProperty("not-chest"));

		// Refill the chests
		return refillChest((Chest) block, clear, itemStacks);
	}

	/**
	 * Refills a chest with certain itemstacks
	 * @param chest the chest to refill
	 * @param clear whether to clear the inventory of the chest before refilling
	 * @param itemStacks what itemstacks to refill it with
	 * @return The items that couldn't be added to the inventory of the chest
	 */
	public HashMap<Integer, ItemStack> refillChest(@NonNull Chest chest, @NonNull Boolean clear, @Nullable ItemStack... itemStacks) {

		// If clear value is true, clear the inventory
		if(clear) chest.getBlockInventory().clear();

		// Add the items to the inventory
		return chest.getBlockInventory().addItem(itemStacks);

	}

	/**
	 * Refills a chest at a location with certain itemstacks
	 * @param location the location of a chest
	 * @param itemStacks what itemstacks to refill it with
	 * @return The items that couldn't be added to the inventory of the chest
	 * @throws ChestException if the location doesn't have a chest at it
	 * @see GChestManager#refillChest(org.bukkit.Location, Boolean, org.bukkit.inventory.ItemStack...)
	 */
	public HashMap<Integer, ItemStack> refillChest(@NonNull Location location, @Nullable ItemStack... itemStacks) throws ChestException {
		return refillChest(location, false, itemStacks);
	}

	/**
	 * Refills a chest with certain itemstacks
	 * @param chest the chest to refill
	 * @param itemStacks what itemstacks to refill it with
	 * @return The items that couldn't be added to the inventory of the chest
	 * @see GChestManager#refillChest(org.bukkit.block.Chest, Boolean, org.bukkit.inventory.ItemStack...)
	 */
	public HashMap<Integer, ItemStack> refillChest(@NonNull Chest chest, @Nullable ItemStack... itemStacks) {
		return refillChest(chest, false, itemStacks);
	}

}
