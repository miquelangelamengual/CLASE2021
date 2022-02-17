package es.hulk.entorns.refactors.replacetempwithquery_07;


public class Student {
    private String name;
    private boolean hasGoodAttitude;

    public Student(String name, boolean hasGoodAttitude) {
        this.name = name;
        this.hasGoodAttitude = hasGoodAttitude;
    }

    public float calculateAverage(float homework, float exam) {

        /*if (hasGoodAttitude) {
            return calculateMark(homework, exam) + 1;
        }
        return calculateMark(homework, exam);*/
        return hasGoodAttitude ? calculateMark(homework, exam) + 1 : calculateMark(homework, exam);
    }

    private float calculateMark(float homework, float exam) {
        return (homework + exam) / 2;
    }


}
