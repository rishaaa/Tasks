package task5;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class num8 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку:");
        String str = scanner.nextLine();
        System.out.println(getSha256Hash(str));
    }
    static String getSha256Hash(String str) throws NoSuchAlgorithmException {
        byte[] hash = MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8));//конвертируем строку в байты и затем хешируем байты
        StringBuilder a = new StringBuilder();
        for (byte b : hash)
            a.append(String.format("%02x", b));
        return a.toString();
    }
}
