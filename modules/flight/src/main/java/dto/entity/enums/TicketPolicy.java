package flight.dto.entity.enums;

import java.util.HashMap;
import java.util.Map;

public enum TicketPolicy {
    SOTO("SOTO"),
    SITI("SITI"),
    SOTI("SOTI");

    String value;

    private TicketPolicy(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }

    public static Map<String, String> options() {
        Map<String, String> opt = new HashMap();
        TicketPolicy[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            TicketPolicy types = var1[var3];
            opt.put(types.name(), types.name());
        }

        return opt;
    }
}

