package flight.dto.entity.enums;

public enum PhoneUseType {
    HOME("Home"),
    OFFICE("Office"),
    H("H"),
    O("O");

    private final String value;

    private PhoneUseType(String var3) {
        this.value = var3;
    }

    public String value() {
        return this.value;
    }

    public static PhoneUseType fromValue(String var0) {
        PhoneUseType[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            PhoneUseType var4 = var1[var3];
            if(var4.value.equals(var0)) {
                return var4;
            }
        }

        throw new IllegalArgumentException(var0);
    }
}
