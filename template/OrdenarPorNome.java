public class OrdenarPorNome extends OrdenadorMp3 {
    @Override
    public int comparar(Mp3 m1, Mp3 m2) {
        return m1.getTitulo().compareToIgnoreCase(m2.getTitulo());
    }
}
