
public class Menu {
    
    public static String MostrarMenu(String msg ) {

        System.out.println("---                []       [][][][][]        [][][][]        [][][][][][]    [][][][][]        [][][][][]         ---");
        System.out.println("---                []     []          []    []        []      []             []         []    []          []       ---");
        System.out.println("---                []     []          []    []          []    []             []               []          []       ---");
        System.out.println("---                []     [] [][][][] []    []        []      [][][][][]     []               [] [][][][] []       ---"); 
        System.out.println("---      []        []     []          []    [] [] [] []       []             []               []          []       ---"); 
        System.out.println("---       []       []     []          []    []        []      []             []         []    []          []       ---");
        System.out.println("---         [] [] []      []          []    []          []    [][][][][][]    [][][][][]      []          []       ---");

        
        System.out.println("O objetivo do jogo é conseguir completar a frase e passar de nivel\n No total são 5 desafios\n Após o desafio 3 será mostrado uma mensagem caso queira pular o desafio ou sair do jogo. ");
        System.out.println(" \nA cada 5 tentativas erradas, aparecera a primeira letra da primeira palavra oculta.\n");

        System.out.println("1 - Jogar");
        System.out.println("2 - Sair");

        return msg;

    }

     public static String limparTerminal(String limpar ) {

         for ( int i = 0; i < 50; i++ ){
              System.out.println("");
         }

         return limpar;

     }

}
