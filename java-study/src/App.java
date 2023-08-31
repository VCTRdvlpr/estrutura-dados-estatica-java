
public class App {
    public static void main(String[] args) {      // Definindo início padrão para a aplicação            
     
        String[] nomes = new String[25];         // Criando um array “nomes” que alocará 25 espaços na memória e aceitará valores do tipo String  

        nomes[0] = "Victor";                    // Declarando os valores  
        nomes[1] = "Barbara";       
        nomes[2] = "Caio";
        nomes[3] = "Adriano";
        nomes[4] = "Mauricio";
        nomes[5] = "Zarate";
        nomes[6] = "Tadashi";
        nomes[7] = "Juliane";  
        nomes[8] = "Viviane";
        nomes[9] = "José";
        nomes[10] = "João";
        nomes[11] = "Junior";
        nomes[12] = "Alessandra";
        nomes[13] = "Juliana";
        nomes[14] = "Gabriela";
        nomes[15] = "Luiza";
        nomes[16] = "Rodolfo";
        nomes[17] = "Renato";
        nomes[18] = "Laura";
        nomes[19] = "Mariana";
        nomes[20] = "Sandra";
        nomes[21] = "Roberta";
        nomes[22] = "Igor";
        nomes[23] = "Leandro";
        nomes[24] = "Miguel";

        String[] novosNomes = new String[nomes.length + 5];     // Criando um novo array “novosNomes” que aceitará nomes.length (tamanho do array “nomes”) + 5 valores do tipo String

        System.arraycopy(nomes, 0 , novosNomes, 0, nomes.length);  // Copiando os dados do array “nomes” a partir do índice “0” para o array “novosNomes”, que iniciará no índice "0"

        novosNomes[nomes.length] = "Novo nome 1";              // Declarando novos valores
        novosNomes[nomes.length + 1] = "Novo nome 2";
        novosNomes[nomes.length + 2] = "Novo nome 3";
        novosNomes[nomes.length + 3] = "Novo nome 4";
        novosNomes[nomes.length + 4] = "Novo nome 5";        
        

        for (String nome: novosNomes) {          // Percorre cada elemento na lista “novosNomes” e atribui temporariamente o valor do elemento à variável “nome”
            if (nome != null ){                // Se o elemento na variável nome for diferente de “null” executar a ação 
                System.out.println(nome);      // Mostrando saída dos valores no terminal
            }
        }
    }
    
}

