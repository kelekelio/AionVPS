package pl.aionpb.aion.db.object;

import java.util.regex.Pattern;

/**
 * @author Grzegorz Nowakowski
 */
public class General {



    public static boolean isNumeric(String strNum) {
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }



}
