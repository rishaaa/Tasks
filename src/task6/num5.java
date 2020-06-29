package task6;

import java.util.ArrayList;
import java.util.Scanner;

public class num5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку:");
        String str = scanner.nextLine();
        System.out.println(getHashTags(str));
    }

    public static String getHashTags(String str) {
        ArrayList<String> word = new ArrayList<>();
        StringBuilder res = new StringBuilder();
        for (String s : str.split(" ")) word.add(s.replaceAll("\\W",""));
        word.sort((o1, o2) -> o2.length() - o1.length());
        for (int i = 0; i<word.size() & i<3;i++) res.append("#").append(word.get(i)).append(" ");
        return res.toString();
    }
}

