class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private float  Moyenne ;

    // Constructeur
    public Student(String studentId, String firstName, String lastName, int age) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

<<<<<<< HEAD
    public float getMoyenne() {
        return Moyenne;
    }

    public void setMoyenne(float moyenne) {
        Moyenne = moyenne;
    }
// Getters et Setters

=======
    // Getters et Setters
>>>>>>> Classes
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Méthode pour afficher les détails de l'étudiant
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Moyenne "+Moyenne);
    }
    public String calculateGrade() {
        if (Moyenne >= 16.0) {
            return "A";
        } else if (Moyenne >= 14.0) {
            return "B";
        } else if (Moyenne >= 12.0) {
            return "C";
        } else if (Moyenne >= 10.0) {
            return "D";
        } else {
            return "F";
        }
    }
}
