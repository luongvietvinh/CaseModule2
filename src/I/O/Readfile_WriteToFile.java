package I.O;

import java.io.*;
import java.util.List;

public class Readfile_WriteToFile {
    public static void writeToFile() {
        try {
            FileOutputStream fos = new FileOutputStream("person.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject();
            fos.close();
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static   void fileReader(){
//        try {
//            FileInputStream fis = new FileInputStream("person.txt");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//             = (List<Person>) ois.readObject();
//            fis.close();
//            ois.close();
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }

    }
}
