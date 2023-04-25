import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\user\\Desktop\\info.txt");
        int[] array = new int[0];
        try {
            array = MyClass.readFile(file);
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
        for (int j : array) {
            System.out.println(j);
        }
        System.out.println(MyClass.arrayElementsSum(array));
    }
}
