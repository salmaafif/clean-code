import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String studentName = scanner.nextLine();

        System.out.print("Masukkan nilai Tugas: ");
        double tugas = scanner.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double uts = scanner.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double uas = scanner.nextDouble();

        Student student = new Student(studentName, tugas, uts, uas);
        GradeCalculator calculator = new GradeCalculator();
        double finalGrade = calculator.calculateFinalGrade(student);

        System.out.println("\n--- Hasil Penghitungan Nilai ---");
        System.out.println("Nama Mahasiswa : " + student.getStudentName());
        System.out.println("Nilai Tugas    : " + student.getTask());
        System.out.println("Nilai UTS      : " + student.getUts());
        System.out.println("Nilai UAS      : " + student.getUas());
        System.out.println("Nilai Akhir    : " + finalGrade);

        scanner.close();
    }
}
