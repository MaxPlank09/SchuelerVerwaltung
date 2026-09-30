import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Schueler[] schueler = new Schueler[10];
        int anzahl = 0;

        while (true) {

            System.out.println("\n1 - Schüler anlegen");
            System.out.println("2 - Schüler anzeigen");
            System.out.println("3 - Beenden");
            System.out.print("Auswahl: ");

            int auswahl = scanner.nextInt();
            scanner.nextLine();

            if (auswahl == 1) {

                if (anzahl >= 10) {
                    System.out.println("Es können maximal 10 Schüler gespeichert werden.");
                    continue;
                }

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Geburtsjahr: ");
                int geburtsjahr = scanner.nextInt();

                System.out.print("Schulnote: ");
                double schulnote = scanner.nextDouble();
                scanner.nextLine();

                schueler[anzahl] =
                        new Schueler(name, geburtsjahr, schulnote);

                anzahl++;

                System.out.println("Schüler wurde angelegt.");

            } else if (auswahl == 2) {

                if (anzahl == 0) {
                    System.out.println("Keine Schüler vorhanden.");
                } else {
                    System.out.println("\n--- Schülerliste ---");

                    for (int i = 0; i < anzahl; i++) {
                        System.out.println(schueler[i]);
                    }
                }

            } else if (auswahl == 3) {

                System.out.println("Programm beendet.");
                break;

            } else {
                System.out.println("Ungültige Auswahl.");
            }
        }

        scanner.close();
    }
}