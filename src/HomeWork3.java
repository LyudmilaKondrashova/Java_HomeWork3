import java.util.*;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        ArrayList<String> myList1 = new ArrayList<String>();
        ArrayList<Integer> myList2 = new ArrayList<Integer>();
        ArrayList<Integer> myList3 = new ArrayList<Integer>();

        System.out.println("1. Создать новый список, добавить несколько строк и " +
                "вывести коллекцию на экран");
        myList1 = newList();
        System.out.println("*********************************************");

        System.out.println("2. Итерация всех элементов списка цветов и добавление" +
                " к каждому символа '!'");
        ArrayList<String> colorList = new ArrayList<String>();
        colorList.add("BLACK");
        colorList.add("RED");
        colorList.add("GREEN");
        colorList.add("YELLOW");
        colorList.add("BLUE");
        colorList.add("PURPLE");
        colorList.add("WHITE");
        colorList.add("GRAY");
        colorList.add("ORANGE");
        colorList.add("PINK");
        colors(colorList);
        System.out.println("*********************************************");

        System.out.println("Создадим список целых чисел для последующих восьми заданий!");
        myList2 = createList();

        System.out.println("3. Вставить элемент в список в первой позиции");
        System.out.println("Введите новый элемент: ");
        Integer newElem = scan1.nextInt();
        addElem(myList2, 0, newElem);
        System.out.println("*********************************************");

        System.out.println("4. Извлечь элемент (по указанному индексу) из заданного списка");
        System.out.println("Введите индекс элемента, который хотите извлечь: ");
        Integer index = scan1.nextInt();
        getElem(myList2, index);
        System.out.println("*********************************************");

        System.out.println("5. Обновить определенный элемент списка по заданному индексу");
        System.out.println("Введите индекс элемента, который хотите обновить: ");
        index = scan1.nextInt();
        System.out.println("Введите новый элемент: ");
        newElem = scan1.nextInt();
        updateElem(myList2, index, newElem);
        System.out.println("*********************************************");

        System.out.println("6. Удалить третий элемент из списка");
        deleteElem(myList2, 2);
        System.out.println("*********************************************");

        System.out.println("7. Поиск элемента в списке по строке");
        System.out.println("Введите строку (число) поиска: ");
        String findElem = scan2.nextLine();
        findElem(myList2, findElem);
        System.out.println("*********************************************");


        System.out.println("8. Создать новый список и добавить в него несколько " +
                "элементов первого списка");
        myList3 = createListTwo(myList2);
        System.out.print("Первый список: ");
        myList2.forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.print("Второй список: ");
        myList3.forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.println("*********************************************");

        System.out.println("9. Удалить из первого списка все элементы," +
                " отсутствующие во втором списке");
        deleteOneTwo(myList2, myList3);
        System.out.println("*********************************************");

        System.out.println("10. Сортировка списка");
        sortList(myList2);
        System.out.println("*********************************************");

        System.out.println("11. Сравнить время работы тысячи повторений пункта 3 " +
                "для ArrayList и LinkedList.");
        System.out.println("Ожидайте.......");
        compareMethods();
    }

    //Создание списка
    public static ArrayList<Integer> createList() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> strList = new ArrayList<Integer>();
        System.out.print("Введите количество элементов списка (желательно не менее 10 элементов): ");
        int sizeList = scan.nextInt();
        if (sizeList <= 0) {
            System.out.println("Размер списка должен быть положительным!");
        } else {
            System.out.println("Введите элементы списка, разделяя их клавишей Enter: ");
            for (int i = 0; i < sizeList; i++) {
                strList.add(scan.nextInt());
            }
        }
        return strList;
    }

    //1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.
    public static ArrayList<String> newList() {
        ArrayList<String> arrayL =new ArrayList<String>();
        arrayL.add("Hello, human!");
        arrayL.add("I'm glad to meet with you!");
        arrayL.add("What is your name?");
        arrayL.add("How old are you?");
        arrayL.add("Where are you from?");
        arrayL.add("How are you?");
        arrayL.add("Nice day!");
        arrayL.add("Bye-Bye!");
        arrayL.forEach(i -> System.out.println(i));
        return arrayL;
    }

    //2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
    public static void colors(ArrayList<String> colorL) {
        System.out.print("Исходный список цветов: ");
        colorL.forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.print("Новый список цветов: ");
        for (int i = 0; i < colorL.size(); i++) {
            colorL.set(i, colorL.get(i) + "!");
            System.out.print(colorL.get(i) + " ");
        }
        System.out.println();
    }

    //3. Вставить элемент в список в первой позиции
    public static void addElem(ArrayList<Integer> intList, int ind, Integer newEl) {
        System.out.print("Исходный список: ");
        intList.forEach(i -> System.out.print(i + " "));
        System.out.println();
        if (ind < intList.size()) {
            intList.add(ind, newEl);
            System.out.print("Новый список: ");
            intList.forEach(i -> System.out.print(i + " "));
            System.out.println();
        } else {
            System.out.println("Вы пытаетесь вставить элемент на несуществующую позицию!");
        }
    }

    //4. Извлечь элемент (по указанному индексу) из заданного списка.
    public static void getElem(ArrayList<Integer> strList, int ind) {
        System.out.print("Исходный список: ");
        strList.forEach(i -> System.out.print(i + " "));
        System.out.println();
        if (ind < strList.size()) {
            strList.get(ind);
            System.out.print("Искомый элемент: " + strList.get(ind));
            System.out.println();
        } else {
            System.out.println("Вы пытаетесь получить элемент из несуществующей позиции!");
        }
    }

    //5. Обновить определенный элемент списка по заданному индексу
    public static void updateElem(ArrayList<Integer> strList, int ind, Integer newEl) {
        System.out.print("Исходный список: ");
        strList.forEach(i -> System.out.print(i + " "));
        System.out.println();
        if (ind < strList.size()) {
            strList.set(ind, newEl);
            System.out.print("Новый список: ");
            strList.forEach(i -> System.out.print(i + " "));
            System.out.println();
        } else {
            System.out.println("Вы пытаетесь обновить элемент на несуществующей позиции!");
        }
    }

    //6. Удалить третий элемент из списка
    public static void deleteElem(ArrayList<Integer> delList, int ind) {
        System.out.print("Исходный список: ");
        delList.forEach(i -> System.out.print(i + " "));
        System.out.println();
        if (ind < delList.size()) {
            delList.remove(ind);
            System.out.print("Новый список: ");
            delList.forEach(i -> System.out.print(i + " "));
            System.out.println();
        } else {
            System.out.println("Вы пытаетесь удалить элемент по несуществующей позиции!");
        }
    }

    //7. Поиска элемента в списке по строке
    public static void findElem(ArrayList<Integer> strList, String findEl) {
        System.out.print("Исходный список: ");
        strList.forEach(i -> System.out.print(i + " "));
        System.out.println();
        boolean flag = false;
        for (int i = 0; i < strList.size(); i++) {
            if (String.valueOf(strList.get(i)).contains(findEl)) {
                System.out.println("Искомый элемент: " + strList.get(i));
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Искомый элемент не найден!");
        }
    }

    //8. Создать новый список и добавить в него несколько элементов первого списка
    public static ArrayList<Integer> createListTwo(ArrayList<Integer> firstList) {
        ArrayList<Integer> secondList = new ArrayList<Integer>();
        for (int i = 0; i < firstList.size(); i++) {
            if (firstList.size() >= 2) {
                if (i % 2 == 0) {
                    secondList.add(firstList.get(i));
                }
            } else {
                secondList.add(firstList.get(0));
            }
        }
        return secondList;
    }

    //9. Удалить из первого списка все элементы отсутствующие во втором списке
    public static void deleteOneTwo(ArrayList<Integer> firstList, ArrayList<Integer> secondList) {
        firstList.retainAll(secondList);
        System.out.print("Первый список после удаления элементов: ");
        firstList.forEach(i -> System.out.print(i + " "));
        System.out.println();
    }

    //10. Сортировка списка
    public static void sortList(ArrayList<Integer> sortL) {
        System.out.print("Список до сортировки по возрастанию: ");
        sortL.forEach(i -> System.out.print(i + " "));
        System.out.println();
        Comparator<Integer> compar = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        sortL.sort(compar);
        System.out.print("Список после сортировки по возрастанию: ");
        sortL.forEach(i -> System.out.print(i + " "));
        System.out.println();
    }

    //11. Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList
    public static void compareMethods() {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            intList.add(0, new Random().nextInt(51));
        }
        System.out.println("Время выполнения для ArrayList равно:");
        System.out.println(System.currentTimeMillis() - start + " миллисекунд");

        LinkedList<Integer> intLinkList = new LinkedList<Integer>();
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            intLinkList.add(0, new Random().nextInt(51));
        }
        System.out.println("Время выполнения для LinkedList равно:");
        System.out.println(System.currentTimeMillis() - start + " миллисекунд");
    }
}

