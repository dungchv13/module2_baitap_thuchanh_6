package manage;

import quantities.CanBo;
import quantities.CongNhan;
import quantities.KySu;
import quantities.NhanVien;

import java.io.IOException;
import java.util.ArrayList;

public class CanBoManage  {

    ArrayList<CanBo> canBoList = new ArrayList<>();

    public void add(CanBo canBo){
        try {
            canBoList = FileManage.readFile();
        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }

        canBoList.add(canBo);

        try {
            FileManage.writeFile(canBoList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileManage.writeFile(canBoList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void findByName(String name){
        try {
            canBoList = FileManage.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (CanBo c:canBoList) {
            if(c instanceof CongNhan){
                CongNhan congNhan = (CongNhan) c;
                if(c.getName().equals(name)) {
                    System.out.println(congNhan.toString());
                }
            }else if(c instanceof KySu){
                KySu kySu = (KySu) c;
                if(c.getName().equals(name)) {
                    System.out.println(kySu.toString());
                }
            }else if(c instanceof NhanVien){
                NhanVien nhanVien = (NhanVien) c;
                if(c.getName().equals(name)) {
                    System.out.println(nhanVien.toString());
                }
            }
        }
    }
}
