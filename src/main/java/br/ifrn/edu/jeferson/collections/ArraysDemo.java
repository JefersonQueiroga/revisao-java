package br.ifrn.edu.jeferson.collections;

import java.util.Arrays;
import java.util.Random;

/**
 * Demonstração completa de Arrays em Java
 *
 * Este programa mostra:
 * - Declaração e inicialização
 * - Arrays unidimensionais
 * - Arrays multidimensionais (matrizes)
 * - Classe Arrays e seus métodos
 * - Iteração e manipulação
 * - Cópias e clonagem
 * - Arrays irregulares (jagged)
 *
 * @author Jeferson Queiroga
 */
public class ArraysDemo {

    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("         ARRAYS EM JAVA            ");
        System.out.println("====================================\n");

        demonstrarDeclaracao();
        demonstrarIteracao();
        demonstrarClasseArrays();
        demonstrarMatrizes();
        demonstrarCopias();
        demonstrarBuscaOrdenacao();
        exemploPratico();
    }

    /**
     * Demonstra formas de declarar e inicializar arrays
     */
    private static void demonstrarDeclaracao() {
        System.out.println(">>> 1. DECLARAÇÃO E INICIALIZAÇÃO\n");

        // Formas de declarar
        int[] array1;                    // Preferida
        int array2[];                    // Estilo C (evitar)

        // Inicialização com tamanho
        int[] numeros = new int[5];      // Array de 5 posições (valores padrão: 0)
        System.out.println("Array de int com 5 posições:");
        System.out.println("  Valores padrão: " + Arrays.toString(numeros));

        // Inicialização com valores
        int[] valores = {10, 20, 30, 40, 50};
        System.out.println("\nArray inicializado com valores:");
        System.out.println("  " + Arrays.toString(valores));

        // Diferentes tipos
        double[] precos = {19.99, 35.50, 42.00};
        String[] nomes = {"João", "Maria", "Pedro"};
        boolean[] respostas = {true, false, true};
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};

        System.out.println("\nArrays de diferentes tipos:");
        System.out.println("  double[]: " + Arrays.toString(precos));
        System.out.println("  String[]: " + Arrays.toString(nomes));
        System.out.println("  boolean[]: " + Arrays.toString(respostas));
        System.out.println("  char[]: " + Arrays.toString(vogais));

        // Acessando elementos
        System.out.println("\nACESSANDO ELEMENTOS:");
        System.out.println("  Primeiro elemento (índice 0): " + valores[0]);
        System.out.println("  Último elemento (length-1): " + valores[valores.length - 1]);
        System.out.println("  Tamanho do array: " + valores.length);

        // Modificando elementos
        valores[2] = 999;
        System.out.println("  Após valores[2] = 999: " + Arrays.toString(valores));

        // CUIDADO: ArrayIndexOutOfBoundsException
        System.out.println("\n⚠️ CUIDADO com índices:");
        System.out.println("  valores[5] causaria ArrayIndexOutOfBoundsException!");
        System.out.println("  Sempre verifique: índice >= 0 && índice < array.length");

        System.out.println();
    }

    /**
     * Demonstra formas de iterar arrays
     */
    private static void demonstrarIteracao() {
        System.out.println(">>> 2. ITERAÇÃO DE ARRAYS\n");

        int[] numeros = {10, 20, 30, 40, 50};

        // For tradicional
        System.out.println("FOR TRADICIONAL:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("  índice " + i + " = " + numeros[i]);
        }

        // For-each (enhanced for)
        System.out.println("\nFOR-EACH (não tem acesso ao índice):");
        for (int num : numeros) {
            System.out.println("  valor: " + num);
        }

        // While
        System.out.println("\nWHILE:");
        int i = 0;
        while (i < numeros.length) {
            System.out.print(numeros[i] + " ");
            i++;
        }

        // Iteração reversa
        System.out.println("\n\nITERAÇÃO REVERSA:");
        for (int j = numeros.length - 1; j >= 0; j--) {
            System.out.print(numeros[j] + " ");
        }

        // Pulando elementos
        System.out.println("\n\nAPENAS ÍNDICES PARES:");
        for (int k = 0; k < numeros.length; k += 2) {
            System.out.println("  índice " + k + " = " + numeros[k]);
        }

        System.out.println();
    }

    /**
     * Demonstra métodos da classe Arrays
     */
    private static void demonstrarClasseArrays() {
        System.out.println(">>> 3. CLASSE ARRAYS (java.util.Arrays)\n");

        int[] nums = {5, 2, 8, 1, 9, 3, 7};

        // toString - exibir array
        System.out.println("TOSTRING:");
        System.out.println("  Original: " + Arrays.toString(nums));

        // sort - ordenar
        int[] copia = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copia);
        System.out.println("\nSORT:");
        System.out.println("  Ordenado: " + Arrays.toString(copia));

        // sort parcial
        int[] parcial = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        Arrays.sort(parcial, 2, 7);  // ordena índices 2 a 6
        System.out.println("  Sort parcial (2-6): " + Arrays.toString(parcial));

        // binarySearch (array DEVE estar ordenado)
        int indice = Arrays.binarySearch(copia, 5);
        System.out.println("\nBINARYSEARCH:");
        System.out.println("  Índice do valor 5: " + indice);

        // fill - preencher
        int[] preenchido = new int[5];
        Arrays.fill(preenchido, 42);
        System.out.println("\nFILL:");
        System.out.println("  Preenchido com 42: " + Arrays.toString(preenchido));

        // fill parcial
        Arrays.fill(preenchido, 1, 4, 99);  // índices 1 a 3
        System.out.println("  Fill parcial (1-3): " + Arrays.toString(preenchido));

        // equals - comparar arrays
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {3, 2, 1};
        System.out.println("\nEQUALS:");
        System.out.println("  arr1 == arr2: " + (arr1 == arr2));           // false (referências)
        System.out.println("  Arrays.equals(arr1, arr2): " + Arrays.equals(arr1, arr2)); // true
        System.out.println("  Arrays.equals(arr1, arr3): " + Arrays.equals(arr1, arr3)); // false

        System.out.println();
    }

    /**
     * Demonstra arrays multidimensionais (matrizes)
     */
    private static void demonstrarMatrizes() {
        System.out.println(">>> 4. ARRAYS MULTIDIMENSIONAIS (MATRIZES)\n");

        // Matriz 2D
        int[][] matriz = new int[3][3];

        // Preenchendo
        int valor = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valor++;
            }
        }

        // Exibindo
        System.out.println("MATRIZ 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Inicialização direta
        int[][] notas = {
                {8, 9, 7},     // Aluno 0
                {6, 7, 8},     // Aluno 1
                {9, 10, 9}     // Aluno 2
        };

        System.out.println("\nNOTAS DOS ALUNOS:");
        for (int aluno = 0; aluno < notas.length; aluno++) {
            System.out.print("Aluno " + aluno + ": ");
            for (int prova = 0; prova < notas[aluno].length; prova++) {
                System.out.print(notas[aluno][prova] + " ");
            }
            System.out.println();
        }

        // Array irregular (jagged array)
        int[][] irregular = new int[3][];
        irregular[0] = new int[2];  // linha 0: 2 elementos
        irregular[1] = new int[4];  // linha 1: 4 elementos
        irregular[2] = new int[3];  // linha 2: 3 elementos

        System.out.println("\nARRAY IRREGULAR (JAGGED):");
        for (int i = 0; i < irregular.length; i++) {
            System.out.println("  Linha " + i + " tem " + irregular[i].length + " elementos");
        }

        // Array 3D
        int[][][] cubo = new int[2][2][2];
        System.out.println("\nARRAY 3D:");
        System.out.println("  Dimensões: 2x2x2 (como um cubo)");

        System.out.println();
    }

    /**
     * Demonstra cópias de arrays
     */
    private static void demonstrarCopias() {
        System.out.println(">>> 5. CÓPIAS DE ARRAYS\n");

        int[] original = {1, 2, 3, 4, 5};

        // Cópia RASA (referência)
        int[] referencia = original;  // Aponta para o MESMO array
        referencia[0] = 999;
        System.out.println("CÓPIA DE REFERÊNCIA:");
        System.out.println("  Original: " + Arrays.toString(original));
        System.out.println("  Mudou o original também!");

        // Resetar
        original[0] = 1;

        // Cópia PROFUNDA - Método 1: Arrays.copyOf
        int[] copia1 = Arrays.copyOf(original, original.length);
        copia1[0] = 888;
        System.out.println("\nARRAYS.COPYOF:");
        System.out.println("  Original: " + Arrays.toString(original));
        System.out.println("  Cópia: " + Arrays.toString(copia1));

        // Cópia com tamanho diferente
        int[] copiaMaior = Arrays.copyOf(original, 8);  // Adiciona zeros
        System.out.println("  Cópia maior: " + Arrays.toString(copiaMaior));

        // Cópia PROFUNDA - Método 2: Arrays.copyOfRange
        int[] copia2 = Arrays.copyOfRange(original, 1, 4);  // índices 1-3
        System.out.println("\nARRAYS.COPYOFRANGE (1-3):");
        System.out.println("  " + Arrays.toString(copia2));

        // Cópia PROFUNDA - Método 3: clone()
        int[] copia3 = original.clone();
        System.out.println("\nCLONE():");
        System.out.println("  " + Arrays.toString(copia3));

        // Cópia PROFUNDA - Método 4: System.arraycopy
        int[] copia4 = new int[original.length];
        System.arraycopy(original, 0, copia4, 0, original.length);
        System.out.println("\nSYSTEM.ARRAYCOPY:");
        System.out.println("  " + Arrays.toString(copia4));

        System.out.println();
    }

    /**
     * Demonstra busca e ordenação
     */
    private static void demonstrarBuscaOrdenacao() {
        System.out.println(">>> 6. BUSCA E ORDENAÇÃO\n");

        // Array aleatório
        Random random = new Random();
        int[] dados = new int[10];
        for (int i = 0; i < dados.length; i++) {
            dados[i] = random.nextInt(50);  // 0 a 49
        }

        System.out.println("Array original: " + Arrays.toString(dados));

        // Busca linear (array desordenado)
        int procurado = dados[5];  // pegar um valor que existe
        System.out.println("\nBUSCA LINEAR por " + procurado + ":");
        for (int i = 0; i < dados.length; i++) {
            if (dados[i] == procurado) {
                System.out.println("  Encontrado no índice " + i);
                break;
            }
        }

        // Ordenar
        Arrays.sort(dados);
        System.out.println("\nArray ordenado: " + Arrays.toString(dados));

        // Busca binária (REQUER array ordenado)
        int indice = Arrays.binarySearch(dados, procurado);
        System.out.println("\nBUSCA BINÁRIA por " + procurado + ":");
        if (indice >= 0) {
            System.out.println("  Encontrado no índice " + indice);
        } else {
            System.out.println("  Não encontrado (retornou " + indice + ")");
        }

        // Encontrar min e max
        System.out.println("\nESTATÍSTICAS:");
        System.out.println("  Mínimo: " + dados[0]);                    // primeiro (ordenado)
        System.out.println("  Máximo: " + dados[dados.length - 1]);     // último (ordenado)

        // Calcular média
        int soma = 0;
        for (int num : dados) {
            soma += num;
        }
        double media = (double) soma / dados.length;
        System.out.println("  Média: " + String.format("%.1f", media));

        System.out.println();
    }

    /**
     * Exemplo prático: Sistema de vendas
     */
    private static void exemploPratico() {
        System.out.println(">>> 7. EXEMPLO PRÁTICO - ANÁLISE DE VENDAS\n");

        // Vendas de 5 vendedores em 4 trimestres
        double[][] vendas = {
                {10000, 12000, 11000, 13000},  // João
                {9000,  10000, 10500, 11000},  // Maria
                {15000, 14000, 16000, 17000},  // Pedro
                {8000,  8500,  9000,  9500},   // Ana
                {11000, 11500, 12000, 14000}   // Carlos
        };

        String[] vendedores = {"João", "Maria", "Pedro", "Ana", "Carlos"};
        String[] trimestres = {"Q1", "Q2", "Q3", "Q4"};

        System.out.println("TABELA DE VENDAS (R$):");
        System.out.print("         ");
        for (String trim : trimestres) {
            System.out.printf("%8s ", trim);
        }
        System.out.println("    TOTAL    MÉDIA");
        System.out.println("-".repeat(60));

        double[] totaisVendedor = new double[vendedores.length];
        double[] totaisTrimestre = new double[4];

        // Processar dados
        for (int v = 0; v < vendas.length; v++) {
            System.out.printf("%-8s ", vendedores[v]);

            double totalVendedor = 0;
            for (int t = 0; t < vendas[v].length; t++) {
                System.out.printf("%8.0f ", vendas[v][t]);
                totalVendedor += vendas[v][t];
                totaisTrimestre[t] += vendas[v][t];
            }

            totaisVendedor[v] = totalVendedor;
            double media = totalVendedor / 4;

            System.out.printf("%9.0f %8.0f\n", totalVendedor, media);
        }

        // Linha de totais
        System.out.println("-".repeat(60));
        System.out.print("TOTAL    ");
        for (double total : totaisTrimestre) {
            System.out.printf("%8.0f ", total);
        }

        // Encontrar melhor vendedor
        int melhorIndice = 0;
        for (int i = 1; i < totaisVendedor.length; i++) {
            if (totaisVendedor[i] > totaisVendedor[melhorIndice]) {
                melhorIndice = i;
            }
        }

        System.out.println("\n\n🏆 MELHOR VENDEDOR: " + vendedores[melhorIndice] +
                " (R$ " + String.format("%.0f", totaisVendedor[melhorIndice]) + ")");
    }
}