import AbstractClasses.Figures;
import AbstractClasses.Polygon;
import Interfaces.Perimeter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class CollectionFigures{
    static ArrayList<Figures> allFigure = new ArrayList<>();
    static {
        allFigure.add(new Circle("Малый круг", 8.0));
        allFigure.add(new Triangle("Треугольник", 4.0, 4.1, 8.3));
    }
    public static void getAllParameters() {
        Double result = (double) 0;
        int index = 0;
        for (Figures figures : allFigure) {
            index++;
            result += figures.getArea();
        }
        System.out.printf("\nПлощадь всех возможных " + index + " Фигур = " + result + ";\n");
        index = 0;
        for (Figures figure : allFigure) {
            if (figure instanceof Perimeter) {
                index++;
                result += (((Polygon) figure).getPerimeter());
            }
        }
        System.out.printf("Периметр всех возможных " + index + " Фигур = " + result + ";\n");
        index = 0;
        for (Figures figure : allFigure) {
            if (figure instanceof Circle) {
                index++;
                result += (((Circle) figure).getCircleCircle());
            }
        }
        System.out.printf("Длина окружности всех возможных " + index + " Фигур = " + result + ";\n");
    }
    public static void showAll() {
        Collections.sort(allFigure);
        int index = 0;
        for (Figures figure : allFigure) {
            System.out.printf("%d) ", index);
            System.out.println(figure);
            System.out.println("*************");
            index++;
        }
    }
    public static void deleteFigure(Scanner input, ArrayList<Figures> allFigure) {
        showAll();
        System.out.print("\nКакую фигуру удалить?: ");
        int choice = input.nextInt();
        if (choice < allFigure.size()) {
            allFigure.remove(choice);
            System.out.println("Вы успешно удалили животное!");
            Program.programMenu(input, allFigure);
        } else
            Program.programMenu(input, allFigure);
    }
    public static void editFigure(){
        System.out.println("\nПрограмма написана на Java.");
    }
}