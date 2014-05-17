package uk.co.georgep.chestrefill;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.bukkit.Location;
import org.bukkit.block.Chest;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;
import java.util.HashMap;

/**
 * The Refill chest API
 * <p/>
 * Latest Change: Created it
 * <p/>
 *
 * @author George
 * @since 17/05/2014
 */
@AllArgsConstructor
public class ChestRefillAPI {
	/**
	 * Refills a chest with certain itemstacks
	 * @param location the location of a chest
	 * @param clear whether to clear the inventory of the chest before refilling
	 * @param itemStacks what itemstacks to refill it with
	 * @return The items that couldn't be added to the inventory of the chest
	 * @throws ChestException if the location doesn't have a chest at it
	 * @see GChestManager#refillChest(org.bukkit.block.Chest, org.bukkit.inventory.ItemStack...)
	 */
	public static HashMap<Integer, ItemStack> refillChest(@NonNull Location location, @NonNull Boolean clear, @Nullable ItemStack... itemStacks) throws ChestException {
		return ChestRefillPlugin.getGChestManager().refillChest(location, clear, itemStacks);
	}

	/**
	 * Refills a chest with certain itemstacks
	 * @param chest the chest to refill
	 * @param clear whether to clear the inventory of the chest before refilling
	 * @param itemStacks what itemstacks to refill it with
	 * @return The items that couldn't be added to the inventory of the chest
	 */
	public static HashMap<Integer, ItemStack> refillChest(@NonNull Chest chest, @NonNull Boolean clear, @Nullable ItemStack... itemStacks) {
		return ChestRefillPlugin.getGChestManager().refillChest(chest, clear, itemStacks);
	}

	/**
	 * Refills a chest at a location with certain itemstacks
	 * @param location the location of a chest
	 * @param itemStacks what itemstacks to refill it with
	 * @return The items that couldn't be added to the inventory of the chest
	 * @throws ChestException if the location doesn't have a chest at it
	 * @see GChestManager#refillChest(org.bukkit.Location, Boolean, org.bukkit.inventory.ItemStack...)
	 */
	public static HashMap<Integer, ItemStack> refillChest(@NonNull Location location, @Nullable ItemStack... itemStacks) throws ChestException {
		return ChestRefillPlugin.getGChestManager().refillChest(location, itemStacks);
	}

	/**
	 * Refills a chest with certain itemstacks
	 * @param chest the chest to refill
	 * @param itemStacks what itemstacks to refill it with
	 * @return The items that couldn't be added to the inventory of the chest
	 * @see GChestManager#refillChest(org.bukkit.block.Chest, Boolean, org.bukkit.inventory.ItemStack...)
	 */
	public static HashMap<Integer, ItemStack> refillChest(@NonNull Chest chest, @Nullable ItemStack... itemStacks) {
		return ChestRefillPlugin.getGChestManager().refillChest(chest, itemStacks);
	}
}
