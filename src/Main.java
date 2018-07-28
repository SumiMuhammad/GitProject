public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public void myMethod1(String name) {

        System.out.println("Your name is : "+ name);

    }

    private StudentPojo createStudentObject(){
        StudentPojo stu = new StudentPojo();
        return stu;
    }
}
