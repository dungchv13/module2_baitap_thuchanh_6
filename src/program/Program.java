package program;

import manage.CanBoManage;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CanBoManage cm = new CanBoManage();
        Menus menu = new Menus();
        do{

            System.out.println("-----------MENU----------");
            System.out.println("1.add CanBo.");
            System.out.println("2.hien thi thong tin can bo theo ten.");
            System.out.println("0.EXIT.");
            int choice = Input.inputNumber("chose");
            switch (choice){
                case 1:
                    cm.add(menu.menu1());
                    System.out.println("*****************");
                    break;
                case 2:
                    System.out.println("*****************");
                    menu.menu2(cm);
                    System.out.println("*****************");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("chua co chuc nang nay!");
            }

        }while(true);
    }
}
