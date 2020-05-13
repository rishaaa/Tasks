package task1;

import java.io.IOException;

public class num6 {
    public static void main(String[] args) throws IOException {
        System.out.println("введите символ:");
        char str = (char) System.in.read();  //вводим символ char
        System.out.println((int) str); //выводим значение ascii переданного символа
    }
}
