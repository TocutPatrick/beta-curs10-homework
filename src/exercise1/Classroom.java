package exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Classroom {
    private List<StundentGrade> grades;

    public Classroom(List<StundentGrade> grades) {
        this.grades = grades;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> gradesForDiscipline = new ArrayList<>();
        for (StundentGrade sg : grades) {
            if (sg.getDiscipline().equalsIgnoreCase(discipline)) {
                gradesForDiscipline.add(sg.getGrade());
            }
        }
        return gradesForDiscipline;
    }

    public List<Integer> getGradesForStudent(String student) {
        List<Integer> gradesForStudent = new ArrayList<>();
        for (StundentGrade sg : grades) {
            if (sg.getName().equalsIgnoreCase(student)) {
                gradesForStudent.add(sg.getGrade());
            }
        }
        return gradesForStudent;
    }

    public StundentGrade getMaxGrade(String discipline) {
        StundentGrade maxGrade = null;

        for (StundentGrade sg : grades) {
            if (sg.getDiscipline().equalsIgnoreCase(discipline)) {
                if (maxGrade == null || sg.getGrade() > maxGrade.getGrade()) {
                    maxGrade = sg;
                }
            }
        }
        return maxGrade;
    }

    public StundentGrade getMaxGrade() {
        StundentGrade maxGrade = null;
        for (StundentGrade sg : grades) {
            if (maxGrade == null || sg.getGrade() > maxGrade.getGrade()) {
                maxGrade = sg;
            }
        }
        return maxGrade;
    }

    public Integer getAverageGrade(String discipline) {
        Integer gradesSum = 0;
        Integer gradesCounter = 0;
        for (StundentGrade sg : grades) {
            if (sg.getDiscipline().equalsIgnoreCase(discipline)) {
                gradesSum += sg.getGrade();
                gradesCounter++;
            }
        }
        return gradesSum / gradesCounter;
    }

    public StundentGrade getWorstGrade(String discipline) {
        StundentGrade worstGrade = null;
        for (StundentGrade sg : grades) {
            if (sg.getDiscipline().equalsIgnoreCase(discipline)) {
                if (worstGrade == null || sg.getGrade() < worstGrade.getGrade()) {
                    worstGrade = sg;
                }
            }
        }
        return worstGrade;
    }


}