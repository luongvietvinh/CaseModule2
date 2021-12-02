package view;

import controler.HumanController;
import model.Human;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HumanView {
    HumanController humanController = new HumanController();
   Scanner scanner = new Scanner(System.in);


    public  void getMail(){
        String mail = "";
        while (true){

            System.out.println("nhap mail");
            mail = scanner.nextLine();
            Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z]{2,5}(\\.[a-zA-Z]+){1,3}$");
            if (p.matcher(mail).find()){
                System.out.println("mail la:" + mail);
                getPass();
                break;
            }else {
                System.err.println("sai roi nhap lai di ban oi");
            }
        }
    }
    public void getPass(){
        String past = "";

        while (true){
            System.out.println("nhap pass de ban oi");
            past = scanner.nextLine();
            Pattern p = Pattern.compile("^[a-zA-Z0-9]{3,9}$");
            if (p.matcher(past).find()){
                System.out.println("chao mung master");
                new Main();
            }else {
                System.err.println("pass sai moi nhap lai");
            }
        }
    }

    public void menu(){
        System.out.println("----MENU chuong trinh");
        System.out.println("1.. show list human");
        System.out.println("2..add list human");
        System.out.println("3..sua list human ById");
        System.out.println("4..xoa list human ById");

    }


    public void addHumanForm(){
        System.out.println("nhap name");
        String name = scanner.nextLine();
        System.out.println("nhap age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap so CMT");
        int cmt = Integer.parseInt(scanner.nextLine());
        Human human = new Human(name,age,cmt);

    }

    public void editHumanById(){
        System.out.println("nhap id muon sua");
        int id = Integer.parseInt(scanner.nextLine());


        System.out.println("nhap name");
        String name = scanner.nextLine();
        System.out.println("nhap age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap so CMT");
        int cmt = Integer.parseInt(scanner.nextLine());

        Human human = new Human(name,age,cmt);

    }

    public void deleteById(){
        System.out.println("nhap id can xoa");
        int id = Integer.parseInt(scanner.nextLine());

    }

    public void searchById(){
        System.out.println("nhap id can tim");
        int id = Integer.parseInt(scanner.nextLine());

    }
}
