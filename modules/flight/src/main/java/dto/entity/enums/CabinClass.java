package flight.dto.entity.enums;

import java.util.HashMap;
import java.util.Map;

public enum CabinClass {
    ECONOMY("Economy"),
    SABRE_ECONOMY("Y"),
    PREMIUM("Premium"),
    PREMIUM_ECONOMY("Premium_Economy"),
    BUSINESS("Business"),
    FIRST("First");

    private final String value;

    private CabinClass(String v) {
        this.value = v;
    }

    public String value() {
        return this.value;
    }

    public static CabinClass fromValue(String v) {
        CabinClass[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            CabinClass c = var1[var3];
            if (c.value.equals(v)) {
                return c;
            }
        }

        throw new IllegalArgumentException(v);
    }

    public static Map<String, String> options() {
        Map<String, String> opt = new HashMap();
        opt.put(ECONOMY.name(), ECONOMY.name());
        opt.put(PREMIUM.name(), PREMIUM.name());
        opt.put(BUSINESS.name(), BUSINESS.name());
        opt.put(FIRST.name(), FIRST.name());
        return opt;
    }

    public static Map<String, String> options(String option) {
        Map<String, String> opt = new HashMap();
        String[] classes = new String[]{ECONOMY.name(), PREMIUM.name(), BUSINESS.name(), FIRST.name()};
        String[] var3 = classes;
        int var4 = classes.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String aClass = var3[var5];
            if (aClass.equalsIgnoreCase(option)) {
                opt.put(option, option);
            } else {
                opt.put(aClass, aClass);
            }
        }

        return opt;
    }
}
