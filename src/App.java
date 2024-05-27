import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ListaReproducao lista = new ListaReproducao();
        Musica mus = new Musica();
        Scanner scan = new Scanner (System.in);
        String codYoutube = null;
        

        


        int opcao = 0;
        do {
             System.out.printf("Menu\n ----------------------------\n 1. Adicionar Música\n  2. Tocar próxima\n  3. Listar Músicas\n   0. Sair\n");
                    opcao = scan.nextInt();
            switch (opcao) {


                case 1:
                    System.out.println("\n Qual o nome da musica que você pretende adicionar?\n");
                        scan.nextLine();
                        String nome = scan.nextLine();
                  

                    System.out.println("\n Qual o nome do artista?\n");
                        String artista = scan.nextLine();
                      

                    System.out.println("\n Qual o URL da música:\n");
                         codYoutube = scan.nextLine();
                      
                    Musica m = new Musica(nome, artista,codYoutube);

                    lista.adicionar(m);

                    break;

                case 2:
                    System.out.println("\n Próxima \n");
                        lista.tocarProxima();
                        
                        
                         String code = mus.codYoutube;

                         String url = "https://www.youtube.com/watch?v=" +codYoutube;

                       
                         Runtime.getRuntime().exec("cmd.exe /C start microsoft-edge:" + url);
                    break;

                case 3:
                    System.out.println("\nAs próximas musicas na lista são: \n");
                    lista.exibirLista();
                    break;
            
                default:


                    break;
            }

        } while (opcao !=0);
       
    }
}
//entendendo melhor a programação em lista