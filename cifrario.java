import java.util.Scanner;

public class CesareCriptatore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il testo da criptare: ");
        String testo = scanner.nextLine();
        System.out.print("Inserisci lo shift (numero intero): ");
        int shift = scanner.nextInt();
        String testoCriptato = "";
        for (int i = 0; i < testo.length(); i++) {
            char c = testo.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                testoCriptato += (char) ('A' + (c - 'A' + shift) % 26);
            } else if (c >= 'a' && c <= 'z') {
                testoCriptato += (char) ('a' + (c - 'a' + shift) % 26);
            } else {
                testoCriptato += c;
            }
        }
        System.out.println("Testo criptato: " + testoCriptato);
        scanner.close();
    }
}
