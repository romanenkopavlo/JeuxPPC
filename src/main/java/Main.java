import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] elements = {"papier", "pierre", "ciseaux"};
        System.out.println("Joueur");
        System.out.print("Entrez votre choix (1 - papier, 2 - pierre, 3 - ciseaux): ");
        int choix1 = In.readInteger();
        Random rd = new Random();
        int choix2 = rd.nextInt(1, 3);
        int compteur = 0;


        for (int i = 0; i < 5; i++) {
            compteur += 20;
            System.out.println("Le calcul des resultats..." + compteur + "/100");
            Thread.sleep(300);
        }

        System.out.println("Joueur: " + elements[choix1 - 1]);
        System.out.println("Ordinateur: " + elements[choix2 - 1]);

        if (choix1 == choix2) {
            System.out.print("La partie nulle");
        } else if ((choix1 == 1 && choix2 == 2) || (choix1 == 2 && choix2 == 3) || (choix1 == 3 && choix2 == 1)) {
            System.out.print("Le joueur a gagne");
        } else {
            System.out.print("L'ordinateur a gagne");
        }
    }
}
