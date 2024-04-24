import java.util.Scanner;
import java.util.Stack;

public class ListaReproducao {
    Scanner scan = new Scanner(System.in);
    Musica mu = new Musica();

    private Stack<Musica> itens = new Stack <>();



    public void adicionar(Musica musica){
       itens.push(musica);

    }

    public void tocarProxima(){
        itens.pop();

    }

    public void exibirLista(){
        for(Musica show : itens){
            System.out.printf("\n Nome: %s \n Artista: %s \n URL: %s\n", show.nome, show.artista, show.codYoutube);
        }

    }
}
