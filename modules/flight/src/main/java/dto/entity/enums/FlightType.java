package flight.dto.entity.enums;

public enum FlightType {
    NONSTOP("Nonstop"),
    DIRECT("Direct"),
    CONNECTION("Connection");

    private final String value;

    private FlightType(String var3) {
        this.value = var3;
    }

    public String value() {
        return this.value;
    }

    public static FlightType fromValue(String var0) {
        FlightType[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            FlightType var4 = var1[var3];
            if(var4.value.equals(var0)) {
                return var4;
            }
        }

        throw new IllegalArgumentException(var0);
    }
}
