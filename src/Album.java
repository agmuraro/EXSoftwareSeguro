public class Album {
    private String genero;
    private int ano;
    private String nome;
    private String artista;
    private int musicas;

    public Album() {
        this.genero = genero;
        this.ano = ano;
        this.nome = nome;
        this.artista = artista;
        this.musicas = musicas;
    }

    public void mostrarTodosOsDados(){
        System.out.println("genero: " + genero);
        System.out.println("ano: " + ano);
        System.out.println("nome: " + nome);
        System.out.println("artista: " + artista);
        System.out.println("musicas: " + musicas);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getMusicas() {
        return musicas;
    }

    public void setMusicas(int musicas) {
        this.musicas = musicas;
    }
}
