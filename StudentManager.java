// StudentManager.java
import java.util.ArrayList;
import java.util.Scanner;

    public class StudentManager {
        private ArrayList<Student> students;

        // Constructor
        public StudentManager() {
            students = new ArrayList<>();
        }

        // Add a new student
        public void addStudent(Student student) {
            students.add(student);
            System.out.println("Student added successfully!");
        }

        // Display all students
        public void displayStudents() {
            if (students.isEmpty()) {
                System.out.println("No students found!");
                return;
            }
            for (Student student : students) {
                System.out.println(student);
            }
        }

        // Search student by PRN
        public void searchByPrn(String prn) {
            for (Student student : students) {
                if (student.getPrn().equals(prn)) {
                    System.out.println("Student found: " + student);
                    return;
                }
            }
            System.out.println("Student with PRN " + prn + " not found!");
        }

        // Search student by name
        public void searchByName(String name) {
            boolean found = false;
            for (Student student : students) {
                if (student.getName().equalsIgnoreCase(name)) {
                    System.out.println("Student found: " + student);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Student with name " + name + " not found!");
            }
        }

        // Search student by position (index)
        public void searchByPosition(int index) {
            if (index >= 0 && index < students.size()) {
                System.out.println("Student at position " + index + ": " + students.get(index));
            } else {
                System.out.println("Invalid position!");
            }
        }

        // Update student details
        public void updateStudent(String prn, String name, String DoB, double marks) {
            for (Student student : students) {
                if (student.getPrn().equals(prn)) {
                    student.setName(name);
                    student.setDoB(DoB);
                    student.setMarks(marks);
                    System.out.println("Student updated successfully!");
                    return;
                }
            }
            System.out.println("Student with PRN " + prn + " not found!");
        }

        // Delete student by PRN
        public void deleteStudent(String prn) {
            for (Student student : students) {
                if (student.getPrn().equals(prn)) {
                    students.remove(student);
                    System.out.println("Student deleted successfully!");
                    return;
                }
            }
            System.out.println("Student with PRN " + prn + " not found!");
        }
    }

