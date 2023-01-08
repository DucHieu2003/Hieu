package Exercises1_2;

public class TestPerson {
    public static void main(String[] args)
    {
        Person person = new Person("Anil", "Ha Noi");
        Student student = new Student("Jimmy", "Ha Noi", "Information Technology", 2001, 30000);
        Staff staff = new Staff("Mike", "Ha Noi", "HUS", 20000);
        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);
    }
}
