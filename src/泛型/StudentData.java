package 泛型;

import ClassDemo.Student;

import java.util.ArrayList;

public class StudentData implements Data<Student>{

    @Override
    public void add(Student student) {

    }

    @Override
    public ArrayList<Student> getByName(String name) {
        return null;
    }
}
