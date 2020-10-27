package quantities;

import java.io.Serializable;
import java.time.LocalDate;

public class KySu extends CanBo implements Serializable {
    private String ngangDaoTao;

    public KySu() {
        super();
    }

    public KySu(String name, LocalDate birthDay, boolean isMale, String address, String ngangDaoTao) {
        super(name, birthDay, isMale, address);
        this.ngangDaoTao = ngangDaoTao;
    }

    public String getNgangDaoTao() {
        return ngangDaoTao;
    }

    public void setNgangDaoTao(String ngangDaoTao) {
        this.ngangDaoTao = ngangDaoTao;
    }

    public KySu(String name, LocalDate birthDay, boolean isMale, String address) {
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
        return "KySu{" +
                "name='" + this.getName() + '\'' +
                ", birthDay=" + this.getBirthDay() +
                ", isMale=" + this.isMale() +
                ", address='" + this.getAddress() + '\'' +
                ", ngangDaoTao='" + ngangDaoTao + '\'' +
                "} ";
    }
}
