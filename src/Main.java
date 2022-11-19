import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        /*Phone phone=new Phone("Phone","14 Pro Max","Black");
        phone.getName("Iphone");
        phone.getModel("14 Pro Max");
        System.out.println(phone.getName()+" "+phone.getModel()+" "+phone.getColor());

        Phone phone1=new Phone("Samsung","A4","White");
        System.out.println(phone1.getName()+" "+phone1.getModel()+" "+phone1.getColor());

        Phone phone2=new Phone(input.nextLine(),input.nextLine(),input.nextLine());
        System.out.println(phone2.getName()+" "+phone2.getModel()+" "+phone2.getColor());

        Phone phone3=new Phone();*/
        /*Cat cat=new Cat("Murka","Cat",2);
        System.out.println(cat.getName()+" "+cat.getParoda()+" "+cat.getAge());

        //System.out.println("Print your cat information");
        Cat cat1=new Cat(input.nextLine(),input.nextLine(),input.nextInt());
        System.out.println(cat1.getName()+" "+cat1.getParoda()+" "+cat1.getAge());

        Dog dog=new Dog("Hatiko","Dog",5);
        System.out.println(dog.getName()+" "+dog.getParoda()+" "+dog.getAge());

        //System.out.println("Print Dog information");
        Dog dog1=new Dog(input.nextLine(),input.nextLine(),input.nextInt());
        System.out.println(dog1.getName()+" "+dog1.getParoda()+" "+dog1.getAge());*/

        Student student=new Student("Aimaral Ellan Kyzy",19,136);
        System.out.println(student.getName()+" "+student.getAge()+" "+student.getTyping());

        Student student1=new Student(input.nextLine(),input.nextInt(),input.nextInt());
        System.out.println(student1.getName()+" "+student1.getAge()+" "+student1.getTyping());

        Course course=new Course("JAva","Chyngyz",student);
        System.out.println(course.getCoursName()+"\n"+course.getInstructorName()+"\n"+course.student().getName()+" "+course.student().getAge()+" "+course.student().getTyping());
    }
}