package week05;

public class Lecturer20 {

    String id;
    String name;
    Boolean gender;
    int age;

    public Lecturer20() {
    }

    public Lecturer20(String id, String name, Boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void print() {
        String genderText;

        if (gender) {
            genderText = "Male";
        } else {
            genderText = "Female";
        }

        System.out.println("ID: " + id + ", Name: " + name + ", Gender: " + genderText + ", Age: " + age);
    }
}
