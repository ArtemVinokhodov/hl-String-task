package task3;

import java.util.Scanner;

public class StringTask3 {
    public static void main(String[] args) {
        System.out.println(provideNames(searchName()));
    }

    public static String searchName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя поиска:");
        String nameInput = scanner.nextLine();
        return nameInput;
    }

    public static String provideNames(String gotName) {
        int count = 0;
        String countNames = null;
        String[] dataBaseNames = {"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};

        for (String name : dataBaseNames) {
            if (gotName.equals(name)) {
                count++;
                countNames = count + " " +  name + " name matches";
            }
            else if(!gotName.equals(name)) {//TODO //Не нашел куда вынести этот if
                System.out.println("Not found name matches");
            }
        }
        return  countNames;
    }
}

