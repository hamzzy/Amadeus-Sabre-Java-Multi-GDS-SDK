
package wsimport.lib.epower;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelProviderTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HotelProviderTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="GoGlobal"/>
 *     &lt;enumeration value="HotelsPro"/>
 *     &lt;enumeration value="AmadeusProvider"/>
 *     &lt;enumeration value="ContentInn"/>
 *     &lt;enumeration value="SunHotels"/>
 *     &lt;enumeration value="ContentStore"/>
 *     &lt;enumeration value="Albatravel"/>
 *     &lt;enumeration value="Bedsonline"/>
 *     &lt;enumeration value="Transhotel"/>
 *     &lt;enumeration value="GTA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HotelProviderTypeEnum")
@XmlEnum
public enum HotelProviderTypeEnum {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("GoGlobal")
    GO_GLOBAL("GoGlobal"),
    @XmlEnumValue("HotelsPro")
    HOTELS_PRO("HotelsPro"),
    @XmlEnumValue("AmadeusProvider")
    AMADEUS_PROVIDER("AmadeusProvider"),
    @XmlEnumValue("ContentInn")
    CONTENT_INN("ContentInn"),
    @XmlEnumValue("SunHotels")
    SUN_HOTELS("SunHotels"),
    @XmlEnumValue("ContentStore")
    CONTENT_STORE("ContentStore"),
    @XmlEnumValue("Albatravel")
    ALBATRAVEL("Albatravel"),
    @XmlEnumValue("Bedsonline")
    BEDSONLINE("Bedsonline"),
    @XmlEnumValue("Transhotel")
    TRANSHOTEL("Transhotel"),
    GTA("GTA");
    private final String value;

    HotelProviderTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HotelProviderTypeEnum fromValue(String v) {
        for (HotelProviderTypeEnum c: HotelProviderTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
