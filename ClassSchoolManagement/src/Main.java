public class Main {
    public static void main(String[] args) {

        SchoolClass classe1 = new SchoolClass("Classe A");


        Student etudiant1 = new Student("S001", "John", "Doe", 20);
        Student etudiant2 = new Student("S002", "Alice", "Smith", 22);


        classe1.ajouterEtudiant(etudiant1);
        classe1.ajouterEtudiant(etudiant2);


        System.out.println("Détails initiaux de la classe:");
        classe1.afficherDetails();


        classe1.modifierNomClasse("Classe B");


        Student etudiant3 = new Student("S003", "Bob", "Johnson", 21);


        classe1.ajouterEtudiant(etudiant3);


        classe1.supprimerEtudiant(etudiant1);


        System.out.println("\nDétails mis à jour de la classe:");
        classe1.afficherDetails();
    }
}
