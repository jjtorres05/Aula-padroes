public class Mp3 {
    private String titulo;
    private String nomeArtista;
    private String nomeAlbum;

    public Mp3(String titulo, String nomeArtista, String nomeAlbum){
        this.titulo= titulo;
        this.nomeArtista = nomeArtista;
        this.nomeAlbum = nomeAlbum;

    }

    public String getTitulo() {
        return this.titulo;
    }
    public String getNomeArtista(){
        return this.nomeArtista;
    }
    public String getNomeAlbum (){
        return this.nomeAlbum;
    }

}
