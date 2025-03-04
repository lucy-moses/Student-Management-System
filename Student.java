 // Student.java
    public class Student {
        private String prn;
        private String name;
        private String DoB;
        private double marks;

        // Constructor
        public Student(String prn, String name, String DoB, double marks) {
            this.prn = prn;
            this.name = name;
            this.DoB = DoB;
            this.marks = marks;
        }

        // Getters and Setters
        public String getPrn() {
            return prn;
        }

        public void setPrn(String prn) {
            this.prn = prn;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDoB() {
            return DoB;
        }

        public void setDoB(String DoB) {
            this.DoB = DoB;
        }

        public double getMarks() {
            return marks;
        }

        public void setMarks(double marks) {
            this.marks = marks;
        }

        // Override toString() method to display student details
        @Override
        public String toString() {
            return "PRN: " + prn + ", Name: " + name + ", DoB: " + DoB + ", Marks: " + marks;
        }
    }

