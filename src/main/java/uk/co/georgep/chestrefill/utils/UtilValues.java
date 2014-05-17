package uk.co.georgep.chestrefill.utils;

/**
 * Utility values
 * <p/>
 * Latest Change: Created it
 * <p/>
 *
 * @author George
 * @since 17/05/2014
 */
public abstract class UtilValues {
	/**
	 * Get's the plugin name
	 * @return the plugin name
	 */
	public abstract String getPluginName();

	/**
	 * Get's the available languages
	 * @return the available languages
	 */
	public abstract String[] getAvailableLanguages();

	/**
	 * Get's the default language
	 * @return the default language
	 * <p>
	 * Warning: Default language must be in available languages
	 * @see UtilValues#getAvailableLanguages()
	 */
	public abstract String getDefaultLanguage();
}
