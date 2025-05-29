import java.util.Scanner;

public class Jogo {
    
    public static String[] JogoJereca(String escolha) {
        Scanner ler = new Scanner(System.in);

        Menu.MostrarMenu("");

        do {
            System.out.print("Escolha uma opção: ");
            escolha = ler.nextLine();
            System.out.println();

            switch (escolha) {
                case "1" -> {
                    Menu.limparTerminal("");
                    //---------------Desafio 1--------------//                

                    String desafioUm = Desafios.desafioUm("");

                    System.out.println(desafioUm);

             
                    //---------------Desafio 2--------------//
            
                    String desafioDois = Desafios.desafioDois("");

                    System.out.println(desafioDois);


                    //---------------Desafio 3--------------//
    
  
                    String desafioTres = Desafios.desafioTres("");

                    System.out.println(desafioTres);


                    //---------------Desafio 4--------------//
       
                    String desafioQuatro = Desafios. desafioQuatro("");

                    System.out.println(desafioQuatro);

                    //---------------Desafio 5--------------//

                    String desafioCinco = Desafios. desafioCinco("");

                    System.out.println(desafioCinco);
                }
                case "2" -> System.out.println("Saindo do jogo...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

        } while (escolha.equals("3"));

        return null;
    }
}


/*      String[] relacionalOculto =   {"Os","operadores",  "relacionais", "comparam", "dois", "valores", "e", "retornam", "true", "ou", "false,", "como", "==",  "!=",  ">", "<", ">=", "e", "<="};
        String[] operadorRelacional = {"Os", "**********", "***********", "********", "dois", "*******", "e", "********", "true", "ou", "false,", "como",  "**",  "**",  "*", "*", "**", "e", "**"};

        String[] ifElseOculto = {"O", "if", "else", "em", "Java", "é", "uma", "estrutura", "de","controle", "que", "permite", "executar", "blocos", "de", "código", "diferentes", "com", "base", "em", "uma", "condicao", "Se", "a", "condicao", "dentro", "do", "if", "for", "verdadeira", "o", "código", "dentro", "do", "bloco", "if", "será", "executado.", "Caso", "contrário", "o", "código", "dentro", "do", "bloco", "else", "será", "executado."};
        String[] ifElse =       {"O", "**", "****", "em", "Java", "é", "uma", "*********", "de","********", "que", "permite", "********", "******", "de", "código", "diferentes", "com", "****", "em", "uma", "********", "Se", "a", "********", "dentro", "do", "**", "for", "**********", "o", "código", "dentro", "do", "*****", "**", "será", "executado.", "Caso", "contrário", "o", "código", "dentro", "do", "*****", "****", "será", "executado."};

        String[] lacoRepeticaoOculto =  {"Um", "laco", "de", "repeticao", "em", "Java", "é", "usado", "para", "executar", "um", "bloco", "de", "código", "varias", "vezes", "enquanto", "uma", "condição", "for", "verdadeira", "ela", "ajuda", "a", "automatizar", "tarefas", "repetitivas", "como:", "for", "while", "e", "do while"};
        String[] lacoRepeticao =        {"Um", "****", "de", "*********", "em", "Java", "é", "*****", "para", "executar", "um", "*****", "de", "código", "******", "*****", "********", "uma", "condição", "for", "**********", "ela", "ajuda", "a", "***********", "tarefas", "***********", "como:", "***", "*****", "e", "** *****" };

        String[] vetorOculto = {"Um", "vetor", "em", "Java", "é", "uma", "estrutura", "de", "dados", "que", "armazena", "uma", "colecao", "de", "elementos", "do", "mesmo", "tipo", "acessados", "por", "um", "indice", "Ele", "possui", "um", "tamanho", "fixo", "e", "os", "elementos", "são", "armazenados", "de", "forma", "sequencial"};
        String[] vetor =       {"Um", "*****", "em", "Java", "é", "uma", "*********", "de", "*****", "que", "********", "uma", "*******", "de", "elementos", "do", "*****", "****", "acessados", "por", "um", "******", "Ele", "possui", "um", "*******", "****", "e", "os", "elementos", "são", "***********", "de", "forma", "**********"};

        String[] funcaoOculto = {"Uma", "funcao", "em", "Java", "é", "um", "bloco", "de", "código", "que", "realiza", "uma", "tarefa", "específica", "e", "pode", "ser", "reutilizado", "várias", "vezes.", "Ela", "é", "definida", "com", "um", "nome", "um", "tipo", "de", "retorno", "(como:", "int", "void", "etc.)", "e", "pode", "receber", "parametros", "para", "trabalhar", "com", "dados", "Quando", "chamada", "a", "funcao", "executa", "sua", "logica", "e", "retorna", "um", "valor", "(se", "necessário)."};
        String[] funcao =       {"Uma", "******", "em", "Java", "é", "um", "*****", "de", "código", "que", "*******", "uma", "******", "específica", "e", "pode", "ser", "***********", "várias", "vezes.", "Ela", "é", "definida", "com", "um", "****", "um", "****", "de", "*******", "(como:", "***", "****", "etc.)", "e", "pode", "receber", "**********", "para", "trabalhar", "com", "*****", "Quando", "chamada", "a", "******", "executa", "sua", "******", "e", "retorna", "um", "*****", "(se", "necessário)."};
 
 
 
        */