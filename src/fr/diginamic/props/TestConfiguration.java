/**
 * 
 */
package fr.diginamic.props;

import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * @author Antoine
 *
 */
public class TestConfiguration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ResourceBundle monFichierConf = ResourceBundle.getBundle("test");
		String prenom = monFichierConf.getString("prenom");
		System.out.println(prenom);
		
		Enumeration<String> keys = monFichierConf.getKeys();
		while(keys.hasMoreElements()) {
			String key = keys.nextElement();
			System.out.println(key);
			System.out.println(monFichierConf.getString(key));
		}
	}

}
