package dto.enums;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Igbalajobi Jamiu Okunade on 3/25/17.
 */
public class SystemCurrency {
    public static final String NGN = "NGN";
    public static final String USD = "USD";
    public static final String GBP = "GBP";

    public static List<String> getSystemCurrencies() {
        List<String> currency = new ArrayList<>();
        for (Field field : SystemCurrency.class.getFields()) {
            currency.add(field.getName());
        }
        return currency;
    }
}
