/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author LENOVO
 */
public class I18nUtil {
    public static Locale currentLocale = new Locale("id");
    private static ResourceBundle messages = ResourceBundle.getBundle("i18n.Messages", currentLocale);
    
    public static void setLocale(String languageCode) {
        currentLocale = new Locale(languageCode);
        messages = ResourceBundle.getBundle("i18n.Messages", currentLocale);
    }
    
    public static String get(String key) {
        return messages.getString(key);
    }
}
