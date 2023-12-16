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

        System.out.println("--------------*** Ajoutée avec succés ***-------µµ--------");

        System.out.println("--------***************Ajout effectuï¿½***********-------");

    }
    public void supprimerEtudiant(Student student) {
        Students.remove(student);
    }

    // Mï¿½thode pour modifier le nom de la classe
    public void modifierNomClasse(String nouveauNom) {
        this.nom = nouveauNom;
    }

    // Mï¿½thode pour afficher les dï¿½tails de la classe avec ses ï¿½tudiants
    public void afficherDetails() {
        System.out.println("Classe: " + nom);
        System.out.println("ï¿½tudiants:");
        for (Student student : Students) {
            student.displayStudentInfo();
            System.out.println("--------------");
        }
    }}

