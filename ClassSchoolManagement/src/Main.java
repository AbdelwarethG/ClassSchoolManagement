public class Main {
    public static void main(String[] args) {

        // Create a school class
        SchoolClass schoolClass = new SchoolClass("Class A");

        // Create students
        Student student1 = new Student("S001", "John", "Doe", 18);
        Student student2 = new Student("S002", "Jane", "Smith", 17);

        // Add students to the class
        schoolClass.ajouterEtudiant(student1);
        schoolClass.ajouterEtudiant(student2);

        // Display class details
        schoolClass.afficherDetails();

        // Modify class name
        schoolClass.modifierNomClasse("Class B");

        // Display updated class details
        schoolClass.afficherDetails();

        // Remove a student
        schoolClass.supprimerEtudiant(student1);

        // Display updated class details
        schoolClass.afficherDetails();

        // Set student grades
        student1.setMoyenne(15.5f);
        student2.setMoyenne(18.0f);

        // Display individual student details and grades
        student1.displayStudentInfo();
        System.out.println("Grade: " + student1.calculateGrade());

        student2.displayStudentInfo();
        System.out.println("Grade: " + student2.calculateGrade());
    }
}
