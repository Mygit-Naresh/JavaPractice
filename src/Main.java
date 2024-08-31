public class Main {
    public static void main(String[] args) {

        System.out.println("Program starts here...");
        Student s1 = new Student();
        s1.marks = 88.5;
        s1.rollNo = 1;
        s1.name = "naresh";
        System.out.println("Name is "+ s1.name+ " and marks are "+s1.marks);
        Student s2 = new Student();
        s2.marks = 90.5;
        s2.rollNo = 2;
        s2.name = "suresh";
        System.out.println("Name is "+ s2.name+ " and marks are "+s2.marks);

    }
}