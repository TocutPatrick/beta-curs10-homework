package exercise1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        ReadStudentInfo rsi = new ReadStudentInfo("grades.txt");
        List<StundentGrade> list = rsi.readGrades();
        Classroom classroom = new Classroom(list);

        // print list of students
        getStudentList(list);
        System.out.println("---------------------------------------------------------");


        // grades for specified discipline
        System.out.print("Enter discipline: ");
        System.out.println(classroom.getGradesForDiscipline(getResponse()));

        // grades for specified name
        System.out.print("Enter name: ");
        System.out.println(classroom.getGradesForStudent(getResponse()));

        // return maximum grade for specified discipline
        System.out.print("Enter discipline: ");
        System.out.println(classroom.getMaxGrade(getResponse()));

        // get student for max grade
        System.out.print("Student with max grade is ");
        System.out.println(classroom.getMaxGrade());

        //average grade for specified discipline
        System.out.print("Enter discipline for average grade: ");
        System.out.println(classroom.getAverageGrade(getResponse()));

        // get student with worst grade for specified discipline
        System.out.print("Enter discipline for worst grade: ");
        System.out.println(classroom.getWorstGrade(getResponse()));

        //generate raport for specified discipline
        System.out.print("enter the discipline for which you want to generate the report: ");
        ReportGenerator report = new ReportGenerator(list);
        report.generateReport(getResponse());

    }

    private static String getResponse() {
        Scanner scan = new Scanner(System.in);
        String response = scan.nextLine();
        return response;
    }

    private static void getStudentList(List<StundentGrade> list) {
        for (StundentGrade i : list) {
            System.out.println(i);
        }
    }
}
