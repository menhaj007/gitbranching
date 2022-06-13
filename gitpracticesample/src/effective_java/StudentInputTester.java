package effective_java;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentInputTester {
    public static void main(String[] args) {
        String fileName = "/Users/menhaj/Documents/coding_projects/gitbranching/gitpracticesample/src/files/names.txt";
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);

            Student studentObject = (Student) objectInputStream.readObject();

            System.out.println(studentObject.getFullName());
            System.out.println(studentObject.getSsn());
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }

    }
}
