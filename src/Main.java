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

    private void rebaseMethod(){
        System.out.println(" I am on Rebase Branch. This method is for 1st commit. ");
        System.out.println(" I am on Rebase Branch. This method is for 2nd commit. ");
        System.out.println(" Making some change again to Rebase-Branch and then committing. ");
        System.out.println(" 2.0 Making some change again to Rebase-Branch and then committing. ");

    }

    private void ConflictWithRebase(){
        System.out.println(" This will cause conflict ith Rebase-Branch... Lets see");
    }

    private void gerritAddedToMyGitRepo(){
        System.out.println("Gerrit has been integrated with Git repo");
    }
}
