package view;

import controler.HumanController;
import controler.LoveHoltelController;
import model.LoveHoltel;

import java.util.Scanner;

public class HoltelView {
    Scanner scanner = new Scanner(System.in);
    HumanController humanController = new HumanController();
    LoveHoltelController holtelController = new LoveHoltelController();
    HumanView humanView = new HumanView();

    public void deleteHumanById(){
        humanView.deleteById();
    }

    public void addLoveHoltel(){
        System.out.println("nhap id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap ten nhan vien cho thue");
        String name =scanner.nextLine();
        System.out.println("nhap so ngay tro");
        int numberDay = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap loai phong");
        String loai = scanner.nextLine();
        System.out.println("nhap gia");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap mo ta");
        String description = scanner.nextLine();
        LoveHoltel loveHoltel = new LoveHoltel(id,name,numberDay,loai,price,description);

    }

    public void editLoveHotelById(){
        System.out.println("nhap id muon sua");
        int id = Integer.parseInt(scanner.nextLine());


        System.out.println("nhap ten nhan vien cho thue");
        String name =scanner.nextLine();
        System.out.println("nhap so ngay tro");
        int numberDay = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap loai phong");
        String loai = scanner.nextLine();
        System.out.println("nhap gia");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap mo ta");
        String description = scanner.nextLine();
        LoveHoltel loveHoltel = new LoveHoltel(id,name,numberDay,loai,price,description);


    }

    public void deleteById(){
        System.out.println("nhap id can xoa");
        int id = Integer.parseInt(scanner.nextLine());

    }
}
