package LAB_4;
// Task 4
public class StudentDriver {
    public static void main(String[] args){
        StudentC student1 = new StudentC(12345678);
        System.out.println("1-----------------");
        student1.addCourse("CSE110");
        System.out.println("2-----------------");
        student1.storeCG(2.5);
        student1.addCourse("CSE110");
        student1.addCourse("ENG101");
        student1.showAdvisee();
        System.out.println("3-----------------");
        student1.removeAllCourse();
        student1.showAdvisee();
        System.out.println("4-----------------");
        student1.storeID(54652365);
        String[] courses = {"SOC101","CSE111","ENG102"};
        student1.addCourse(courses);
        student1.showAdvisee();
        System.out.println("5-----------------");
        student1.addCourse("CSE230");
        student1.showAdvisee();
        System.out.println("6-----------------");
        StudentC student2 = new StudentC(975738383,3.7);
        System.out.println("7-----------------");
        String[] courses2 = {"CSE220","PHY112","MAT120","BUS101","CHN101"};
        student2.addCourse(courses2);
        student2.showAdvisee();
    }

}
