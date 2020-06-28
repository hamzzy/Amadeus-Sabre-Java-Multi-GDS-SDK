package dto.entity.enums;

public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    M("M"),
    F("F"),
    UNKNOWN("Unknown");

    private final String value;

    private Gender(String var3) {
        this.value = var3;
    }

    public String value() {
        return this.value;
    }

    public static Gender fromValue(String var0) {
        Gender[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Gender var4 = var1[var3];
            if(var4.value.equals(var0)) {
                return var4;
            }
        }

        throw new IllegalArgumentException(var0);
    }
}