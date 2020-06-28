package dto.entity.enums;

public enum PassengerCode {
    ADULT("ADT"),
    CHILD("CHD"),
    SABRE_CHILD("CNN"),
    INFANT("INF");

    private String value;

    private PassengerCode(String var3) {
        this.value = var3;
    }

    public String value() {
        return this.value;
    }

    public static PassengerCode fromValue(String var0) {
        PassengerCode[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            PassengerCode var4 = var1[var3];
            if(var4.value.equals(var0)) {
                return var4;
            }
        }

        throw new IllegalArgumentException(var0);
    }
}
