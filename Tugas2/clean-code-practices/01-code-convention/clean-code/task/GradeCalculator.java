public class GradeCalculator{
    private final double TASK_WEIGHT = 0.30;
    private final double UTS_WEIGHT = 0.30;
    private final double UAS_WEIGHT = 0.40;

    public double calculateFinalGrade(Student student) {
        return (student.getTask() * TASK_WEIGHT) +
               (student.getUts() * UTS_WEIGHT) +
               (student.getUas() * UAS_WEIGHT);
    }
}
