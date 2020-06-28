package flight.dto.entity.enums;

import java.util.HashMap;
import java.util.Map;

public enum TicketLocale {
    International,
    Regional,
    Local;

    private TicketLocale() {
    }

    public static Map<String, String> options() {
        Map<String, String> opt = new HashMap();
        TicketLocale[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            TicketLocale types = var1[var3];
            opt.put(types.name(), types.name());
        }

        return opt;
    }
}
