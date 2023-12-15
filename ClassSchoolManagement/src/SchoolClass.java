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

    // Méthode pour ajouter un étudiant à la classe
    public void ajouterEtudiant(Student student) {
        Students.add(student);
        System.out.println("--------*******------Ajout effectu�----******-------");

    }
    public void supprimerEtudiant(Student student) {
        Students.remove(student);
    }

    // M�thode pour modifier le nom de la classe
    public void modifierNomClasse(String nouveauNom) {
        this.nom = nouveauNom;
    }

    // M�thode pour afficher les d�tails de la classe avec ses �tudiants
    public void afficherDetails() {
        System.out.println("Classe: " + nom);
        System.out.println("�tudiants:");
        for (Student student : Students) {
            student.displayStudentInfo();
            System.out.println("--------------");
        }
    }}

