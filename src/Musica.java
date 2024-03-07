public class Musica {
    private String titulo;
    private float duracao;
    private String compositor;

    public Musica() {
        this.titulo = titulo;
        this.duracao = duracao;
        this.compositor = compositor;
    }

    public void tocarMusica(){
        System.out.println("musica: " + titulo);
    }
    public void musicaInfo(){
        System.out.println("titulo: " + titulo);
        System.out.println("duração: " + duracao);
        System.out.println("compositor: " + compositor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }
}
