package flight.dto.entity.enums;

public enum TicketType {
    E_TICKET("eTicket"),
    PAPER("Paper");

    private final String value;

    private TicketType(String var3) {
        this.value = var3;
    }

    public String value() {
        return this.value;
    }

    public static TicketType fromValue(String var0) {
        TicketType[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            TicketType var4 = var1[var3];
            if(var4.value.equals(var0)) {
                return var4;
            }
        }

        throw new IllegalArgumentException(var0);
    }
}
