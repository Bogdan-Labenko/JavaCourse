import java.util.Objects;

public class User {
    String name;
    int age;
    String phone;

    public User(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age, phone);
//    }

}
