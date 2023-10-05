import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //1.
        List<Car> cars = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            String name = "Car" + i;
            String color = (i % 2 == 0) ? "Red" : "Blue";
            int maxSpeed = random.nextInt(200) + 100;
            cars.add(new Car(name, color, maxSpeed));
        }

        Optional<Car> fastestCar = cars.stream()
                .filter(car -> car.getColor().equals("Red"))
                .max(Comparator.comparingInt(Car::getMaxSpeed));
        fastestCar.ifPresent(car -> System.out.println("The fastest car is " + car.getName()));
        //2.
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            String fullName = "Student " + "Surname " + i;
            int age = random.nextInt(20) + 10;
            String group = "Group" + (i % 5);
            students.add(new Student(fullName, age, group));
        }

        List<String> surnameUnder16 = students.stream()
                .filter(student -> student.getAge() < 16)
                .map(student -> student.getFullName().split(" ")[0])
                .toList();
        System.out.println(surnameUnder16);
        //3.
        for (Student student : students) {
            student.setPoints(random.nextInt(101));
        }

        double averagePoints = students.stream()
                .mapToDouble(Student::getPoints)
                .average()
                .orElse(0.0);
        System.out.println("Average point of all students: " + averagePoints);
        //4.
        List<Employee> employees = students.stream()
                .map(student -> new Employee(student.getFullName().split(" ")[0], student.getFullName().split(" ")[1], student.getFullName().split(" ")[2], student.getAge()))
                .toList();
        System.out.println(employees);
    }
}