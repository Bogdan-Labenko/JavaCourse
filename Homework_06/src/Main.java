import java.lang.reflect.Array;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //1. Базовая работа с List
        ArrayList<String> list1 = new ArrayList<String>();

        String[] array = {"Apple", "Banana", "Orange"};
        list1.addAll(Arrays.asList(array));

        ArrayList<String> list2 = new ArrayList<>(list1);
        List<String> list3 = Arrays.asList("dog", "elephant", "fox");
        list2.addAll(list3.size() / 2, list3);
        list2.sort(Collections.reverseOrder());

        ListIterator<String> iterator = list2.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
            if (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
        }

        //2. Базовая работа с Set
        HashSet<String> set1 = new HashSet<String>();
        set1.add("string1");
        set1.add("string2");
        set1.addAll(list1);
        set1.addAll(list2);
        System.out.println(set1.toString());
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.addAll(list1);
        set2.addAll(list2);
        System.out.println(set2.toString());

        //3. Базовая работа с Map
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(0, "Январь");
        map1.put(1, "Февраль");
        map1.put(2, "Март");
        map1.put(3, "Апрель");
        map1.put(4, "Май");
        map1.put(5, "Июнь");
        map1.put(6, "Июль");
        map1.put(7, "Август");
        map1.put(8, "Сентябрь");
        map1.put(9, "Октябрь");
        map1.put(10, "Ноябрь");
        map1.put(11, "Декабрь");
        System.out.println(map1.get(0) + " " + map1.get(11));

        map1.replace(6, "ОТПУСК");
        System.out.println(map1.get(6));

        HashMap<Integer, String> map2 = new HashMap<>(map1);

        System.out.println("map1:");
        printMap(map1);
        System.out.println("map2:");
        printMap(map2);

        HashMap<String, Set<String>> map3 = new HashMap<>();

        //4. Работа с своим классом
        HashSet<User> userSet = new HashSet<>();
        User user1 = new User("Alice", 25, "123-456");
        User user2 = new User("Bob", 25, "789-101");
        User user3 = new User("Charlie", 30, "555-666");
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        for (User user : userSet) {
            System.out.println("Имя: " + user.getName() + ", Возраст: " + user.getAge() + ", Телефон: " + user.getPhone());
        }
        //Переопределить в классе User метод hashcode, Указав в нем только обработку поля name.
        for (User user : userSet) {
            System.out.println("Имя: " + user.getName() + ", Возраст: " + user.getAge() + ", Телефон: " + user.getPhone());
        }
        //Переопределить в классе User метод hashcode, Указав в нем все поля класса.
        for (User user : userSet) {
            System.out.println("Имя: " + user.getName() + ", Возраст: " + user.getAge() + ", Телефон: " + user.getPhone());
        }
    }
    public static void printMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}