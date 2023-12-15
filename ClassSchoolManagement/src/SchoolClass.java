import java.util.ArrayList;

public class SchoolClass {
      private String nom;
     private ArrayList<Student> Students;

    public SchoolClass(String nom) {
        this.nom = nom;
        this.Students = new ArrayList<>();
    }

    // Getters et Setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Student> getStudents() {
        return Students;
    }

    // MÃ©thode pour ajouter un Ã©tudiant Ã  la classe
    public void ajouterEtudiant(Student student) {
        Students.add(student);
        System.out.println("--------------Ajout affectué avec succés ----------------");

    }
    public void supprimerEtudiant(Student student) {
        Students.remove(student);
    }

    // Méthode pour modifier le nom de la classe
    public void modifierNomClasse(String nouveauNom) {
        this.nom = nouveauNom;
    }

    // Méthode pour afficher les détails de la classe avec ses étudiants
    public void afficherDetails() {
        System.out.println("Classe: " + nom);
        System.out.println("Étudiants:");
        for (Student student : Students) {
            student.displayStudentInfo();
            System.out.println("--------------");
        }
    }}

