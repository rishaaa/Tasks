package task5;

import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите фигуру:");
        String figure = scanner.next();
        System.out.println("введите начало:");
        String start = scanner.next();
        System.out.println("введите конец:");
        String end = scanner.next();
        System.out.println(canMove(figure, start, end));
    }

    public static boolean canMove(String figure, String start, String end) {
        int x1 = start.charAt(0); //буква старта
        int y1 = start.charAt(1); //цифра старта
        int x2 = end.charAt(0); //буква конца
        int y2 = end.charAt(1); //цифра конца
        switch (figure){
            case "Pawn":
                return (x1 == x2) & (y2 - y1 == 2 | y2 - y1 == 1); //пешка ходит только вперед на 1 или 2 клетки
            case "Knight":
                return  (Math.abs(x2-x1) == 1 & Math.abs(y2-y1) == 2) | (Math.abs(x2-x1) == 2 & Math.abs(y2-y1) == 1); //конь ходит букыой Г
            case "Bishop":
                return (Math.abs(y2-y1) == Math.abs(x2-x1)); //слон ходит по диагонвли на любое расстояние
            case "Rook":
                return (x1==x2) | (y1==y2); //ладья ходит вверх, вниз, вправо, влево (на любое расстояние)
            case "Queen":
                return (Math.abs(y2-y1) == Math.abs(x2-x1)) | (x1==x2) | (y1==y2); //ферзь ходит в любом направлении на любое расстояние
            case "King":
                return (Math.abs(y2-y1) <= 1 & Math.abs(x2-x1) <= 1); //король ходит в любом направлении на 1 клетку
        }
        return false;
    }
}
