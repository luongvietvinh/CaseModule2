package view;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    HumanView humanView = new HumanView();
    HoltelView holtelView = new HoltelView();
    public Main(){
      while (true){
          humanView.menu();
          System.out.println("nhap lua chon");
          int choice = Integer.parseInt(scanner.nextLine());

          switch (choice){
              case 0:
              humanView.getMail();

              break;
              case 1:

                  break;
              case 2:
                  humanView.addHumanForm();
                  break;
              case 3:
                  humanView.editHumanById();
                  break;
              case 4:
                  humanView.deleteById();
                  break;
              case 5:
              case 6:
              case 7:
          }
      }
    }

    public static void main(String[] args) {
        new Main();
    }
}
