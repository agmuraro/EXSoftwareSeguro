import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa:");
        String nomePessoa = scanner.nextLine();
        System.out.println("Digite a idade da pessoa:");
        int idadePessoa = scanner.nextInt();
        scanner.nextLine();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nomePessoa);
        pessoa.setIdade(idadePessoa);


        System.out.println("Digite o título da música:");
        String tituloMusica = scanner.nextLine();
        System.out.println("Digite a duração da música em segundos:");
        int duracaoMusica = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o compositor da música:");
        String compositorMusica = scanner.nextLine();
        Musica musica = new Musica();
        musica.setTitulo(tituloMusica);
        musica.setDuracao(duracaoMusica);
        musica.setCompositor(compositorMusica);


        System.out.println("Digite o gênero do álbum:");
        String generoAlbum = scanner.nextLine();
        System.out.println("Digite o ano do álbum:");
        int anoAlbum = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome do álbum:");
        String nomeAlbum = scanner.nextLine();
        System.out.println("Digite o nome do artista:");
        String artistaAlbum = scanner.nextLine();
        System.out.println("Quantas músicas o álbum possui?");
        int musicaAlbum = scanner.nextInt();
        scanner.nextLine();
        Album album = new Album();
        album.setGenero(generoAlbum);
        album.setAno(anoAlbum);
        album.setNome(nomeAlbum);
        album.setArtista(artistaAlbum);
        album.setMusicas(musicaAlbum);



        System.out.println("Dados do álbum:");
        album.mostrarTodosOsDados();
        System.out.println("Dados da música");
        musica.musicaInfo();


        }

    }