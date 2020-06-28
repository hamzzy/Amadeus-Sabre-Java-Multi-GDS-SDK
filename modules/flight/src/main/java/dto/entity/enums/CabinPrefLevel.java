package flight.dto.entity.enums;

public enum CabinPrefLevel {
    ONLY("Only"),
    UNACCEPTABLE("Unacceptable"),
    PREFERRED("Preferred");

    private final String value;

    private CabinPrefLevel(String var3) {
        this.value = var3;
    }

    public String value() {
        return this.value;
    }

    public static CabinPrefLevel fromValue(String var0) {
        CabinPrefLevel[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            CabinPrefLevel var4 = var1[var3];
            if(var4.value.equals(var0)) {
                return var4;
            }
        }

        throw new IllegalArgumentException(var0);
    }
}
