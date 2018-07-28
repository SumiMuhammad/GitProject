public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! The creator is the one who created this world.");
        System.out.println("Hello World!. You are welcome to this new world.");
        System.out.println("Hello World! The creator is the one who created this world.");
        System.out.println("Hello World!. You are welcome to this new world.");
        String name = "Sumaira Muhammad Tariq";

        new Main().myMethod1("Sumaira Muhammad Tariq");
    }

    public void myMethod1(String name) {

        System.out.println("Your very good name is : "+ name +". I like your name.");

    }

    private StudentPojo createStudentObject(){
        StudentPojo stu = new StudentPojo();
        System.out.println( "Student object created ..." );
        return stu;
    }
}
