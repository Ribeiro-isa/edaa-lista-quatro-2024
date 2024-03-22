public class Main {
    public static void main(String[] args) {
        int[] listaNumeros = { 40, 63, 40, 36, 10, 89, 74, 
            32, 59, 13, 29, 12, 40, 8, 11, 63, 1, 52, 
            25, 92, 42, 76, 33, 2, 72, 15, 92, 65, 3, 19, 
            33, 21, 57, 19, 55, 93, 31, 54, 31, 50, 
            66, 44, 54, 55, 29, 75, 43, 88, 61, 65, 
            49, 87, 10, 25, 33, 70, 84, 125, 345, 400, 
            77, 32, 41, 66, 33, 70, 84, 125, 600, 
            38, 43, 51, 34, 76, 25, 48, 14, 50, 71, 
            1, 98, 86, 38, 91, 65, 96, 60, 43, 75, 
            86, 59, 17, 86, 12, 10, 16, 10, 33, 15, 
            77, 22, 56, 4, 9, 63, 49, 80, 39, 53, 
            97, 36, 34, 16, 1, 98, 78, 92, 100, 35 }; 
        
        int indice = buscaSequencial(listaNumeros, 77);
        
        if (indice != -1) {
            System.out.println("O número 77 foi encontrado no índice: " + indice);
        } else {
            System.out.println("O número 77 não foi encontrado na lista.");
        }
    }
    
    public static int buscaSequencial(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i; // Retorna o índice se encontrar o valor
            }
        }
        return -1; // Retorna -1 se o valor não for encontrado
    }
}





public class Main {
    public static void main(String[] args) {
        int[] listaNumeros = { 40, 63, 40, 36, 10, 89, 74, 
            32, 59, 13, 29, 12, 40, 8, 11, 63, 1, 52, 
            25, 92, 42, 76, 33, 2, 72, 15, 92, 65, 3, 19, 
            33, 21, 57, 19, 55, 93, 31, 54, 31, 50, 
            66, 44, 54, 55, 29, 75, 43, 88, 61, 65, 
            49, 87, 10, 25, 33, 70, 84, 125, 345, 400, 
            77, 32, 41, 66, 33, 70, 84, 125, 600, 
            38, 43, 51, 34, 76, 25, 48, 14, 50, 71, 
            1, 98, 86, 38, 91, 65, 96, 60, 43, 75, 
            86, 59, 17, 86, 12, 10, 16, 10, 33, 15, 
            77, 22, 56, 4, 9, 63, 49, 80, 39, 53, 
            97, 36, 34, 16, 1, 98, 78, 92, 100, 35 }; 
        
        int indice600 = buscaSequencial(listaNumeros, 600);
        int indice56 = buscaSequencial(listaNumeros, 56);
        int indice65 = buscaSequencial(listaNumeros, 65);
        
        if (indice600 != -1) {
            System.out.println("O número 600 foi encontrado no índice: " + indice600);
        } else {
            System.out.println("O número 600 não foi encontrado na lista.");
        }
        
        if (indice56 != -1) {
            System.out.println("O número 56 foi encontrado no índice: " + indice56);
        } else {
            System.out.println("O número 56 não foi encontrado na lista.");
        }
        
        if (indice65 != -1) {
            System.out.println("O número 65 foi encontrado no índice: " + indice65);
        } else {
            System.out.println("O número 65 não foi encontrado na lista.");
        }
        
        System.out.println("Todos os índices onde o número 65 se encontra:");
        int index = 0;
        while (index < listaNumeros.length) {
            index = buscaSequencial(listaNumeros, 65, index);
            if (index != -1) {
                System.out.println("Índice: " + index);
                index++;
            } else {
                break;
            }
        }
    }
    
    public static int buscaSequencial(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i; // Retorna o índice se encontrar o valor
            }
        }
        return -1; // Retorna -1 se o valor não for encontrado
    }
    
    public static int buscaSequencial(int[] array, int valor, int startIndex) {
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] == valor) {
                return i; // Retorna o índice se encontrar o valor
            }
        }
        return -1; // Retorna -1 se o valor não for encontrado
    }
}




public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static void main(String[] args) {
        Pessoa vinicius = new Pessoa("Vinícius", 41);
        Pessoa daniela = new Pessoa("Daniela", 44);
        Pessoa ana = new Pessoa("Ana", 18);
        Pessoa carla = new Pessoa("Carla", 20);
        Pessoa daniel = new Pessoa("Daniel Paiva", 31);
        Pessoa felipe = new Pessoa("Felipe", 24);
        Pessoa patricia = new Pessoa("Patricia", 23);
        Pessoa rafael = new Pessoa("Rafael", 20);
        Pessoa pedro = new Pessoa("Pedro", 22);
        Pessoa marcela = new Pessoa("Marcela", 24);
        Pessoa amanda = new Pessoa("Amanda", 100);

        Pessoa[] listaPessoas = { vinicius, daniela, ana, carla, daniel, felipe, pedro, patricia, rafael, marcela, amanda };

        System.out.println("Pessoas com idade superior a 30 anos:");

        for (Pessoa pessoa : listaPessoas) {
            if (pessoa.idade > 30) {
                System.out.println(pessoa.nome);
            }
        }
    }
}




public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static void main(String[] args) {
        Pessoa vinicius = new Pessoa("Vinícius", 41);
        Pessoa daniela = new Pessoa("Daniela", 44);
        Pessoa ana = new Pessoa("Ana", 18);
        Pessoa carla = new Pessoa("Carla", 20);
        Pessoa daniel = new Pessoa("Daniel Paiva", 31);
        Pessoa felipe = new Pessoa("Felipe", 24);
        Pessoa patricia = new Pessoa("Patricia", 23);
        Pessoa rafael = new Pessoa("Rafael", 20);
        Pessoa pedro = new Pessoa("Pedro", 22);
        Pessoa marcela = new Pessoa("Marcela", 24);
        Pessoa amanda = new Pessoa("Amanda", 100);

        Pessoa[] listaPessoas = { vinicius, daniela, ana, carla, daniel, felipe, pedro, patricia, rafael, marcela, amanda };

        // Alterando a idade de todas as pessoas para 18 anos
        for (Pessoa pessoa : listaPessoas) {
            pessoa.idade = 18;
        }

        // Imprimindo o nome das pessoas e suas idades
        System.out.println("Nome das pessoas e suas idades (idade alterada para 18 anos):");
        for (Pessoa pessoa : listaPessoas) {
            System.out.println("Nome: " + pessoa.nome + ", Idade: " + pessoa.idade);
        }
    }
}




public class Main {
    public static void main(String[] args) {
        int[] listaNumeros = { 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64,
                               65, 66, 67, 68, 69, 70, 71, 72, 73, 74,
                               75, 76, 77, 78, 79, 80, 81,
                               82, 83, 84, 85, 86, 87, 88, 89,
                               90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };

        int indice99 = buscaBinaria(listaNumeros, 99);
        int indice81 = buscaBinaria(listaNumeros, 81);

        System.out.println("O índice do número 99 é: " + indice99);
        System.out.println("O índice do número 81 é: " + indice81);
    }

    public static int buscaBinaria(int[] array, int valor) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;






























































































































            if (array[meio] == valor) {
                return meio; // Retorna o índice se encontrar o valor
            } else if (array[meio] < valor) {
                inicio = meio + 1; // Se o valor estiver na metade direita, atualiza o índice de início
            } else {
                fim = meio - 1; // Se o valor estiver na metade esquerda, atualiza o índice de fim
            }
        }
        return -1; // Retorna -1 se o valor não for encontrado
    }
}
