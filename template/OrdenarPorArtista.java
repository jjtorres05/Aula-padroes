public class OrdenarPorArtista extends OrdenadorMp3 {
    @Override
    public int comparar(Mp3 m1, Mp3 m2) {
        return m1.getNomeArtista().compareToIgnoreCase(m2.getNomeArtista());
    }
}