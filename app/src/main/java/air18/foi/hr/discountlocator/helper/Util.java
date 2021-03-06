package air18.foi.hr.discountlocator.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.support.v7.preference.PreferenceManager;

import java.util.Locale;

/**
 * Izradio Miso 5.11.2018.
 */
public class Util {
    public void setLanguage(Context context){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String lang = preferences.getString("pref_lang", "en");
        Configuration config = new Configuration(context.getResources().getConfiguration());
        config.setLocale(new Locale(lang));
        context.getResources().updateConfiguration(config, context.getResources().getDisplayMetrics());
    }
}
