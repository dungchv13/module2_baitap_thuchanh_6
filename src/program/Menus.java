package program;

import manage.CanBoManage;
import quantities.CanBo;

import java.util.Scanner;

public class Menus {

    public CanBo menu1(){
        System.out.println("********************");
        System.out.println("Can bo nay la:");
        System.out.println("1.Cong nhan.");
        System.out.println("2.Ky su.");
        System.out.println("3.Nhan vien.");

        return Input.inputCanBo();
    }
    public void menu2(CanBoManage cm){
        String name = Input.inputString("name");
        cm.findByName(name);
    }
}
