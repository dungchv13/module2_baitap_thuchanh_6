package manage;

import quantities.CanBo;

import java.io.*;
import java.util.ArrayList;

public class FileManage {
    private static final String PATH =  "E:\\module2\\baitap_module2\\thuchanh_6\\directory\\fileBinary";

    public static void writeFile(ArrayList<CanBo> canBoList) throws IOException {
        FileOutputStream fos = new FileOutputStream(PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(canBoList);

        oos.close();
        fos.close();
    }

    public static ArrayList<CanBo> readFile() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<CanBo> canBoList = (ArrayList<CanBo>) ois.readObject();
        ois.close();
        fis.close();

        return canBoList;


    }
}
