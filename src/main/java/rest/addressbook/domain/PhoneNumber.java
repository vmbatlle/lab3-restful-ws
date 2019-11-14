package rest.addressbook.domain;

import java.util.Objects;

/**
 * A phone number
 */
public class PhoneNumber {

  private String number;
  private PhoneType type = PhoneType.HOME;

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public PhoneType getType() {
    return type;
  }

  public void setType(PhoneType type) {
    this.type = type;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PhoneNumber)) {
            return false;
        }
        PhoneNumber phoneNumber = (PhoneNumber) o;
        return Objects.equals(number, phoneNumber.number) && Objects.equals(type, phoneNumber.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, type);
  }

}
