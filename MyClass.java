import java.io.*;

public class MyClass {
    private MyClass() {

    }
    static int[] readFile(File file) throws InvalidNumberException {
        int[] array = new int[10];
        int index = 0;
        String st;
        try{
            BufferedReader br
                    = new BufferedReader(new FileReader(file));
            while ((st = br.readLine()) != null && index<10) {
                int number = Integer.parseInt(st);
                try {
                    if (number < 0) {
                        throw new InvalidNumberException("Number is Negative");
                    }
                }catch (InvalidNumberException e){
                    System.out.println(e.getMessage());
                }
                array[index] = number;
                index++;

            }
            br.close();
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        } catch (IOException m) {
            throw new RuntimeException(m);
        }
        return array;
    }

    static int arrayElementsSum(int[] array){
        int sum =0;
        for(int i=0;i<array.length;i++){
            try {
                sum += array[i];
            }catch (ArithmeticException arithmeticException){
                System.out.println(arithmeticException.getMessage());
            }
        }
        return sum;
    }
}

