import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy,kilo,vKe;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        vKe = kilo / (boy * boy);

        System.out.println("Vücut kitle endeksiniz: " + vKe);
        }
    }
