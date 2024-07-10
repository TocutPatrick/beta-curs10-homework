package exercise1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static java.lang.System.lineSeparator;

public class ReportGenerator {
    private List<StundentGrade> grades;

    public ReportGenerator(List<StundentGrade> grades) {
        this.grades = grades;
    }

    public void generateReport(String discipline) throws IOException {
        Classroom classroom = new Classroom(grades);
        BufferedWriter writer = new BufferedWriter(new FileWriter("grade-reports.txt", true));
        System.out.println("Generating report for " + discipline);
        writer.write("Report for " + discipline + lineSeparator());
        writer.write("Best Grade --> Student: " + classroom.getMaxGrade(discipline).getName() + " Grade: " + classroom.getMaxGrade(discipline).getGrade() + lineSeparator());
        writer.write("Average Grade --> " + classroom.getAverageGrade(discipline) + lineSeparator());
        writer.write("Best Grade --> Student: " + classroom.getWorstGrade(discipline).getName() + " Grade: " + classroom.getWorstGrade(discipline).getGrade() + lineSeparator());
        writer.newLine();
        writer.close();
    }


}
