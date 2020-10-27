package quantities;

import java.io.Serializable;
import java.time.LocalDate;

public class CanBo implements Serializable {
    private String name;
    private LocalDate birthDay;
    private boolean isMale;
    private String address;

    public CanBo() {
    }

    public CanBo(String name, LocalDate birthDay, boolean isMale, String address) {
        this.name = name;
        this.birthDay = birthDay;
        this.isMale = isMale;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", isMale=" + isMale +
                ", address='" + address + '\'' +
                '}';
    }
}
