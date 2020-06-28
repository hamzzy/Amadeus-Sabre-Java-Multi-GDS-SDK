package flight.dto.entity.enums;

import java.util.HashMap;
import java.util.Map;

public enum TripType {
    RETURN("Return"),
    ONE_WAY("OneWay"),
    MULTI_CITY("Circle"),
    OPEN_JAW("OpenJaw"),
    OTHER("Other");

    private final String value;

    private TripType(String v) {
        this.value = v;
    }

    public String value() {
        return this.value;
    }

    public static TripType fromValue(String v) {
        TripType[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            TripType trip = var1[var3];
            if (trip.value.equals(v)) {
                return trip;
            }
        }

        throw new IllegalArgumentException(v);
    }

    public static Map<String, String> options() {
        Map<String, String> opt = new HashMap();
        TripType[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            TripType types = var1[var3];
            opt.put(types.name(), types.name());
        }

        return opt;
    }

    public static Map<String, String> options(String option) {
        Map<String, String> opt = new HashMap();
        TripType[] var2 = values();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            TripType types = var2[var4];
            if (types.name().equals(option)) {
                opt.put(types.name(), types.name());
            } else {
                opt.put(types.name(), types.name());
            }
        }

        return opt;
    }
}
