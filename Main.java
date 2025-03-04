    // Main.java
/*
Name: Ugwuaneke lucy ifeoma
PRN: 23070126169
Batch: 2023 - 2027
*/

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            StudentManager manager = new StudentManager();
            int choice;

            do {
                System.out.println("\n--- Student Management System ---");
                System.out.println("1. Add Student");
                System.out.println("2. Display All Students");
                System.out.println("3. Search Student by PRN");
                System.out.println("4. Search Student by Name");
                System.out.println("5. Search Student by Position");
                System.out.println("6. Update Student");
                System.out.println("7. Delete Student");
                System.out.println("8. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter PRN: ");
                        String prn = scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Date of Birth (DoB): ");
                        String DoB = scanner.nextLine();
                        System.out.print("Enter Marks: ");
                        double marks = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        manager.addStudent(new Student(prn, name, DoB, marks));
                        break;

                    case 2:
                        manager.displayStudents();
                        break;

                    case 3:
                        System.out.print("Enter PRN to search: ");
                        String searchPrn = scanner.nextLine();
                        manager.searchByPrn(searchPrn);
                        break;

                    case 4:
                        System.out.print("Enter Name to search: ");
                        String searchName = scanner.nextLine();
                        manager.searchByName(searchName);
                        break;

                    case 5:
                        System.out.print("Enter Position to search: ");
                        int position = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        manager.searchByPosition(position);
                        break;

                    case 6:
                        System.out.print("Enter PRN to update: ");
                        String updatePrn = scanner.nextLine();
                        System.out.print("Enter new Name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter new DoB: ");
                        String newDoB = scanner.nextLine();
                        System.out.print("Enter new Marks: ");
                        double newMarks = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        manager.updateStudent(updatePrn, newName, newDoB, newMarks);
                        break;

                    case 7:
                        System.out.print("Enter PRN to delete: ");
                        String deletePrn = scanner.nextLine();
                        manager.deleteStudent(deletePrn);
                        break;

                    case 8:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } while (choice != 8);

            scanner.close();
        }
    }

