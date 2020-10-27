package program;

import quantities.CanBo;
import quantities.CongNhan;
import quantities.KySu;
import quantities.NhanVien;

import java.time.LocalDate;
import java.util.Scanner;

public class Input {
    static Scanner input = new Scanner(System.in);

    public static int inputNumber(String str){
        System.out.print("Enter "+str+": ");
        int number;
        try{
            number = Integer.parseInt(input.nextLine());
        }catch (Exception e){
            System.out.println("must enter a number!");
            number = inputNumber(str);
        }
        return number;
    }

    public static String inputString(String str){
        System.out.print("Enter "+str+":");
        String result;
        try{
            result = input.nextLine();
            if(result == null){
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("input != null");
            result = inputString(str);
        }
        return result;
    }

    public static LocalDate inputDate(String str){
        System.out.println("Enter "+str+":");
        LocalDate date;
        try{
            int year = inputNumber("year");
            int month = inputNumber("month");
            int day = inputNumber("day");

            date = LocalDate.of(year,month,day);
        }catch (Exception e){
            System.out.println("ngay ban nhap khong ton tai!");
            date = inputDate(str);
        }
        return date;
    }
    public static boolean inputBoolean(String str){
        System.out.print("is "+str +" (true/false):");

            String check = input.nextLine();
            if(check.equals("true")){
                return true;
            }else if(check.equals("false")){
                return false;
            }else{
                System.out.println("input must be 'true' or 'false'.");
                return inputBoolean(str);
            }

    }

    public static CanBo inputCanBo(){
        int choice = Input.inputNumber("chose");
        //String name, LocalDate birthDay, boolean isMale, String address
        String name = inputString("name");
        LocalDate birthDay = inputDate("birthDay");
        boolean isMale = inputBoolean("Male");
        String address = inputString("address");

        switch (choice){
            case 1:
                //cong nhan
                String bac = inputString("bac");
                CanBo congNhan = new CongNhan(name,birthDay,isMale,address,bac);
                return congNhan;

            case 2:
                String nganhDaoTao = inputString("nganh dao tao");
                KySu kySu = new KySu(name,birthDay,isMale,address,nganhDaoTao);
                //ky su
                return kySu;
            case 3:
                String congViec = inputString("cong viec");
                NhanVien nhanVien = new NhanVien(name,birthDay,isMale,address,congViec);
                // nhan vien
                return nhanVien;
            default:
                System.out.println("pls chose 1 or 2 or 3");
                inputCanBo();
        }
        return null;
    }
}
