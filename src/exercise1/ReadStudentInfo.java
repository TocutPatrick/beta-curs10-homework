package exercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class ReadStudentInfo {
    private String filePath;

    public ReadStudentInfo(String filePath) {
        this.filePath = filePath;
    }

    public List<StundentGrade> readGrades() throws FileNotFoundException {
        List<StundentGrade> students = new ArrayList<>();
        Scanner scan = new Scanner(new File(filePath));
        while(scan.hasNext()){
            String line = scan.nextLine();
            String[] split = line.split(Pattern.quote("|"));
            students.add(new StundentGrade(split[0],split[1],Integer.parseInt(split[2])));
        }

        return students;
    }
    }








