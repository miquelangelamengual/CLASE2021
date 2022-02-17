package es.hulk.entorns.refactors.replacetempwithquery_07;

public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student("Juan", false);
        System.out.println(student.calculateAverage(5, 4));

    }

}
