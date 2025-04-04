package se.lexicon.Encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Exercise 7
public class Student {
    private int student_id;
    private String student_name;
    private List grades;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    private void addGrade(double grade){
        if(grade < 0) throw new IllegalArgumentException("Grade is not allowed to be below 0.");
        if(Objects.isNull(grades))
            grades = new ArrayList<>();
        grades.add(grade);
    }
}
