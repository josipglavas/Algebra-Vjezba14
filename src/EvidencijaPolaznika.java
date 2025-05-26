import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class EvidencijaPolaznika {
    public static void main(String[] args) {
        HashSet<Polaznik> polaznici = new HashSet<>();

        Polaznik p1 = new Polaznik("Josip", "Glavaš", "josip.glavas@gmail.com");
        Polaznik p2 = new Polaznik("Pero", "Perić", "pero.peric@outlook.com");
        Polaznik p3 = new Polaznik("Ana", "Anić", "ana.anic21@hotmail.com");
        Polaznik p4 = new Polaznik("Ana", "Anić", "ana.anic21@hotmail.com");

        if (polaznici.add(p1))
            System.out.println("Polaznik dodan: " + p1);
        else
            System.out.println("Polaznik već postoji: " + p1);

        if (polaznici.add(p2))
            System.out.println("Polaznik dodan: " + p2);
        else
            System.out.println("Polaznik već postoji: " + p2);

        if (polaznici.add(p3))
            System.out.println("Polaznik dodan: " + p3);
        else
            System.out.println("Polaznik već postoji: " + p3);

        if (polaznici.add(p4))
            System.out.println("Polaznik dodan: " + p4);
        else
            System.out.println("Polaznik već postoji: " + p4);

        System.out.println("\nSvi polaznici (sortirani po prezimenu):");
        List<Polaznik> sortirani = new ArrayList<>(polaznici);
        Collections.sort(sortirani);
        for (Polaznik p : sortirani) {
            System.out.println(p);
        }
    }
}
