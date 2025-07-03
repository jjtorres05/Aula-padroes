import java.util.ArrayList;

public abstract class OrdenadorMp3 {
    public void ordenar(ArrayList<Mp3> musicas) {
        int n = musicas.size();
        boolean trocou;

        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - 1 - i; j++) {
                Mp3 m1 = musicas.get(j);
                Mp3 m2 = musicas.get(j + 1);

                if (comparar(m1, m2) > 0) {
                    // Intercambiar
                    musicas.set(j, m2);
                    musicas.set(j + 1, m1);
                    trocou = true;
                }
            }

            if (!trocou) break;
        }
    }

    // Método abstracto que define el criterio de ordenación
    public abstract int comparar(Mp3 m1, Mp3 m2);
}
