import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mp3> lista = new ArrayList<>();
        lista.add(new Mp3("Imagine", "John Lennon", "Imagine"));
        lista.add(new Mp3("Bohemian Rhapsody", "Queen", "A Night at the Opera"));
        lista.add(new Mp3("Hey Jude", "The Beatles", "Hey Jude"));
        lista.add(new Mp3("Billie Jean", "Michael Jackson", "Thriller"));

        OrdenadorMp3 ordenador = new OrdenarPorNome(); // Puedes cambiar a OrdenarPorArtista

        System.out.println("Antes de ordenar:");
        for (Mp3 m : lista) {
            System.out.println(m);
        }

        ordenador.ordenar(lista);

        System.out.println("\nDespués de ordenar:");
        for (Mp3 m : lista) {
            System.out.println(m);
        }
    }
}