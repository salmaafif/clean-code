public class Student{
    private String studentName;
    private double task;
    private double uts;
    private double uas;

    public Student(String studentName, double task, double uts, double uas){
        this.studentName = studentName;
        this.task = task;
        this.uts = uts;
        this.uas = uas;
    }

    public String getStudentName(){
        return studentName;
    }

    public double getTask() {
        return task;
    }

    public double getUts() {
        return uts;
    }

    public double getUas() {
        return uas;
    }
}