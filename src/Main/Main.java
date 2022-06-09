package Main;

import Student.Student;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1

        Student student1 = new Student("Sofia", 50);
        Student student2 = new Student("Laura", 60);
        Student student3 = new Student("Ana", 52);
        Student student4 = new Student("Blanca", 47);

        Map< String, Student> nameStudents = new HashMap<>();

        nameStudents.put("Sofia", student1);
        nameStudents.put("Laura", student2);
        nameStudents.put("Ana", student3);
        nameStudents.put("Blanca", student4);


    }

    //Ejercicio 2

    public static Map<String,Student> increases(Map<String, Student> nameStudents ){
        Map<String, Student> mapIncreases = new HashMap<>();
        for (String studentName: mapIncreases.keySet()) {
            double gradeNew = mapIncreases.get(studentName).increasesTen();
            Student studentNew = new Student(studentName, gradeNew);
            mapIncreases.put(studentName, studentNew);

        }
        return mapIncreases;
    }

}
