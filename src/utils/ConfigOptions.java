package utils;

import java.util.prefs.Preferences;

public class ConfigOptions {
	
	//Internal Settings
	private static String FS = System.getProperty("file.separator");
	private static String USER_HOME = System.getProperty("user.home");
	
	//FileSystem Settings
	public static String FILETREE_ROOT_PATH = getPref("FILETREE_ROOT_PATH", USER_HOME + FS + "Desktop" + FS);
	//Deutsch: public static String FILETREE_ROOT_PATH = getPref("FILETREE_ROOT_PATH", USER_HOME + FS + "Arbeitsfläche" + FS);
	public static String BASEPATH = getPref("BASEPATH", USER_HOME + FS + ".aluDrive" + FS);
	public static String TMP_FOLDER = getPref("TMP_FOLDER", System.getProperty("java.io.tmpdir") + FS);
		
	//Crypto Settings
	public static String CRYPTPATH = getPref("CRYPTPATH", BASEPATH + "crypt" + FS);
	public static String KEYPATH = getPref("KEYPATH", CRYPTPATH + "keys" + FS);
	public static String AES_KEY_SIZE = getPref("AES_KEY_SIZE", "256");
	public static String PBE_MODE = getPref("PBE_MODE", "PBEWithSHA1AndDESede");
	public static String AES_KEY_PATH = getPref("AES_KEY_PATH", CRYPTPATH + ".keyfile");
	public static String PRIVATE_KEY_PATH = getPref("PRIVATE_KEY_PATH", KEYPATH + "aluDrive_priv.der");
	public static String PUBLIC_KEY_PATH = getPref("PUBLIC_KEY_PATH", KEYPATH + "aluDrive_pub.der");
	
	//Google Settings
	public static String CRED_STORE_PATH = getPref("CRED_STORE_PATH", BASEPATH + "credstore");
	public static String FILE_HEADER_PATH = getPref("FILE_SYNC_PATH", BASEPATH + "drive_sync" + FS);
	public static String FILE_DOWNLOAD_ROOT  = getPref("FILE_DOWNLOAD_ROOT", USER_HOME + FS + "Google Drive" + FS);
	//Jython Settings
	public static String PYTHON_FILE_PATH = getPref("PYTHON_FILE_PATH", BASEPATH + "pyTools" + FS);
	
	public static String getPref(String key, String def) {
		Preferences prefs = Preferences.userNodeForPackage(ConfigOptions.class);
		return prefs.get(key, def);
	}
	
	public static void setPref(String KEY, String value) {
		Preferences prefs = Preferences.userNodeForPackage(ConfigOptions.class);
		prefs.put(KEY, value);
	}
}
