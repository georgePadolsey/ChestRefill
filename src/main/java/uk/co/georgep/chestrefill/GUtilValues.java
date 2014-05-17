package uk.co.georgep.chestrefill;

import uk.co.georgep.chestrefill.utils.UtilValues;

/**
 * <p/>
 * Latest Change:
 * <p/>
 *
 * @author George
 * @since 17/05/2014
 */
public class GUtilValues extends UtilValues {

	@Override
	public String getPluginName() {
		return "GChestManager";
	}

	@Override
	public String[] getAvailableLanguages() {
		return new String[] {
			"en"
		};
	}

	@Override
	public String getDefaultLanguage() {
		return "en";
	}

}
