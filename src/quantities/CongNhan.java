package quantities;

import java.io.Serializable;
import java.time.LocalDate;

public class CongNhan extends CanBo implements Serializable {
    private String bac;

    public CongNhan() {
        super();
    }

    public CongNhan(String name, LocalDate birthDay, boolean isMale, String address, String bac) {
        super(name, birthDay, isMale, address);
        this.bac = bac;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    public CongNhan(String name, LocalDate birthDay, boolean isMale, String address) {
        super(name, birthDay, isMale, address);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public LocalDate getBirthDay() {
        return super.getBirthDay();
    }

    @Override
    public void setBirthDay(LocalDate birthDay) {
        super.setBirthDay(birthDay);
    }

    @Override
    public boolean isMale() {
        return super.isMale();
    }

    @Override
    public void setMale(boolean male) {
        super.setMale(male);
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "name='" + this.getName() + '\'' +
                ", birthDay=" + this.getBirthDay() +
                ", isMale=" + this.isMale() +
                ", address='" + this.getAddress() + '\'' +
                ", bac='" + bac + '\'' +
                "} ";
    }
}
