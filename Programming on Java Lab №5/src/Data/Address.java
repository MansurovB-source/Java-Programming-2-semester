package Data;

/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public class Address {
    private String street; //Поле может быть null
    private String zipCode; //Поле не может быть null

    public Address(String street, String zipCode) {
        this.street = street;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return " Address { " +
                "street = " + street +
                ", zipCode = " + zipCode +
                " }";
    }
}
