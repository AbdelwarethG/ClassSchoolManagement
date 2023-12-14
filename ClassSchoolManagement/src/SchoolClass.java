import java.util.ArrayList;

public class SchoolClass {
    private String nom;
    private ArrayList<Student> students;

    public SchoolClass(String nom) {
        this.nom = nom;
        this.students = new ArrayList<>();
    }

    // Getters et Setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    // Méthode pour ajouter un étudiant à la classe
    public void ajouterEtudiant(Student student) {
        students.add(student);

    }

    }

