package exercise1;

public class StundentGrade {
    private final String name;
    private final String discipline;
    private final Integer grade;

    public StundentGrade(String name, String discipline, Integer grade) {
        this.name = name;
        this.discipline = discipline;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public Integer getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", discipline='" + discipline + '\'' +
                ", grade=" + grade +
                '}';
    }
}
