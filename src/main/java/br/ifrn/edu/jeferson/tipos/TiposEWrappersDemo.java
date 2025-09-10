package br.ifrn.edu.jeferson.tipos;

/**
 * Demonstração completa de Tipos Primitivos vs Wrappers
 *
 * Este programa mostra:
 * - Os 8 tipos primitivos do Java
 * - Suas classes Wrapper correspondentes
 * - Autoboxing e Unboxing
 * - Quando usar cada um
 * - Cuidados com null
 * - Cache de valores
 *
 * @author Jeferson Queiroga
 */
public class TiposEWrappersDemo {

    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("   TIPOS PRIMITIVOS VS WRAPPERS    ");
        System.out.println("====================================\n");

        mostrarTiposPrimitivos();
        mostrarWrappers();
        demonstrarAutoboxingUnboxing();
        demonstrarCacheInteger();
        demonstrarProblemasNull();
        demonstrarUsoPratico();
        compararPerformance();
    }

    /**
     * Mostra os 8 tipos primitivos e seus valores padrão
     */
    private static void mostrarTiposPrimitivos() {
        System.out.println(">>> 1. OS 8 TIPOS PRIMITIVOS DO JAVA\n");

        // Tipos inteiros
        byte meuByte = 127;                    // 8 bits
        short meuShort = 32767;                // 16 bits
        int meuInt = 2147483647;               // 32 bits
        long meuLong = 9223372036854775807L;   // 64 bits (note o L no final)

        // Tipos decimais
        float meuFloat = 3.14f;                // 32 bits (note o f no final)
        double meuDouble = 3.14159265359;      // 64 bits

        // Outros tipos
        char meuChar = 'J';                    // 16 bits (Unicode)
        boolean meuBoolean = true;             // true ou false

        System.out.println("INTEIROS:");
        System.out.println("  byte:    " + meuByte + " (range: -128 a 127)");
        System.out.println("  short:   " + meuShort + " (range: -32,768 a 32,767)");
        System.out.println("  int:     " + meuInt + " (range: ±2 bilhões)");
        System.out.println("  long:    " + meuLong + " (range: ±9 quintilhões)");

        System.out.println("\nDECIMAIS:");
        System.out.println("  float:   " + meuFloat + " (precisão: ~7 dígitos)");
        System.out.println("  double:  " + meuDouble + " (precisão: ~15 dígitos)");

        System.out.println("\nOUTROS:");
        System.out.println("  char:    '" + meuChar + "' (pode armazenar Unicode)");
        System.out.println("  boolean: " + meuBoolean + " (apenas true ou false)");

        // Valores padrão (em atributos de classe)
        System.out.println("\nVALORES PADRÃO (quando são atributos de classe):");
        System.out.println("  Números: 0 ou 0.0");
        System.out.println("  char: '\\u0000' (caractere nulo)");
        System.out.println("  boolean: false");
        System.out.println();
    }

    /**
     * Mostra as classes Wrapper e seus métodos úteis
     */
    private static void mostrarWrappers() {
        System.out.println(">>> 2. CLASSES WRAPPER\n");

        // Criando Wrappers
        Byte byteObj = 100;
        Short shortObj = 1000;
        Integer intObj = 100000;
        Long longObj = 1000000L;
        Float floatObj = 3.14f;
        Double doubleObj = 3.14159;
        Character charObj = 'A';
        Boolean boolObj = true;

        System.out.println("WRAPPER CLASSES:");
        System.out.println("  byte    → Byte");
        System.out.println("  short   → Short");
        System.out.println("  int     → Integer");
        System.out.println("  long    → Long");
        System.out.println("  float   → Float");
        System.out.println("  double  → Double");
        System.out.println("  char    → Character");
        System.out.println("  boolean → Boolean");

        System.out.println("\nMÉTODOS ÚTEIS DAS WRAPPERS:");

        // Constantes úteis
        System.out.println("  Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("  Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("  Integer.SIZE: " + Integer.SIZE + " bits");

        // Conversões
        String numeroStr = "12345";
        int numero = Integer.parseInt(numeroStr);
        System.out.println("\n  Integer.parseInt(\"12345\"): " + numero);

        // Conversões entre bases
        System.out.println("  Integer.toBinaryString(10): " + Integer.toBinaryString(10));
        System.out.println("  Integer.toHexString(255): " + Integer.toHexString(255));
        System.out.println("  Integer.toOctalString(8): " + Integer.toOctalString(8));

        // Comparações
        Integer num1 = 100;
        Integer num2 = 200;
        System.out.println("\n  num1.compareTo(num2): " + num1.compareTo(num2));
        System.out.println("  Integer.compare(100, 200): " + Integer.compare(100, 200));
        System.out.println();
    }

    /**
     * Demonstra Autoboxing e Unboxing
     */
    private static void demonstrarAutoboxingUnboxing() {
        System.out.println(">>> 3. AUTOBOXING E UNBOXING\n");

        // AUTOBOXING: primitivo → Wrapper (automático)
        Integer numero = 42;  // int → Integer automaticamente
        System.out.println("AUTOBOXING:");
        System.out.println("  Integer numero = 42;  // int vira Integer");

        // UNBOXING: Wrapper → primitivo (automático)
        int valor = numero;   // Integer → int automaticamente
        System.out.println("\nUNBOXING:");
        System.out.println("  int valor = numero;   // Integer vira int");

        // Em coleções (Lists, Maps, etc) só aceitam Wrappers
        System.out.println("\nUSO EM COLEÇÕES:");
        System.out.println("  List<Integer> lista = new ArrayList<>();");
        System.out.println("  lista.add(10);  // autoboxing de int para Integer");
        System.out.println("  int x = lista.get(0);  // unboxing de Integer para int");

        // Operações matemáticas causam unboxing
        Integer a = 100;
        Integer b = 200;
        Integer soma = a + b;  // unboxing, soma, depois autoboxing
        System.out.println("\nOPERAÇÕES MATEMÁTICAS:");
        System.out.println("  Integer a = 100, b = 200;");
        System.out.println("  Integer soma = a + b;  // " + soma);
        System.out.println("  (faz unboxing, soma, depois autoboxing)");
        System.out.println();
    }

    /**
     * Demonstra o cache de Integer (-128 a 127)
     */
    private static void demonstrarCacheInteger() {
        System.out.println(">>> 4. CACHE DE INTEGER\n");

        System.out.println("Java mantém cache de Integer de -128 a 127:");

        // Dentro do cache
        Integer x1 = 100;
        Integer x2 = 100;
        System.out.println("\nDENTRO DO CACHE (100):");
        System.out.println("  Integer x1 = 100;");
        System.out.println("  Integer x2 = 100;");
        System.out.println("  x1 == x2? " + (x1 == x2) + " (mesma referência!)");
        System.out.println("  x1.equals(x2)? " + x1.equals(x2));

        // Fora do cache
        Integer y1 = 200;
        Integer y2 = 200;
        System.out.println("\nFORA DO CACHE (200):");
        System.out.println("  Integer y1 = 200;");
        System.out.println("  Integer y2 = 200;");
        System.out.println("  y1 == y2? " + (y1 == y2) + " (referências diferentes!)");
        System.out.println("  y1.equals(y2)? " + y1.equals(y2));

        System.out.println("\n⚠️ REGRA DE OURO:");
        System.out.println("  Use sempre .equals() para comparar Wrappers!");
        System.out.println();
    }

    /**
     * Demonstra problemas com null
     */
    private static void demonstrarProblemasNull() {
        System.out.println(">>> 5. CUIDADOS COM NULL\n");

        // Wrappers podem ser null
        Integer idade = null;
        System.out.println("Wrappers PODEM ser null:");
        System.out.println("  Integer idade = null;  // OK");

        // Primitivos NÃO podem ser null
        System.out.println("\nPrimitivos NÃO PODEM ser null:");
        System.out.println("  int x = null;  // ERRO DE COMPILAÇÃO!");

        // NullPointerException no unboxing
        System.out.println("\n⚠️ PERIGO - NullPointerException:");
        System.out.println("  Integer numero = null;");
        System.out.println("  int x = numero;  // NullPointerException!");

        // Como evitar
        System.out.println("\nCOMO EVITAR:");
        Integer valor = null;
        if (valor != null) {
            int seguro = valor;
            System.out.println("  Sempre verifique se não é null antes do unboxing");
        }

        // Ou use valor padrão
        int valorPadrao = (valor != null) ? valor : 0;
        System.out.println("  Ou use operador ternário: " + valorPadrao);
        System.out.println();
    }

    /**
     * Demonstra quando usar cada tipo
     */
    private static void demonstrarUsoPratico() {
        System.out.println(">>> 6. QUANDO USAR CADA UM?\n");

        System.out.println("USE PRIMITIVOS quando:");
        System.out.println("  ✓ Performance é crítica");
        System.out.println("  ✓ Fazendo muitos cálculos matemáticos");
        System.out.println("  ✓ Valor nunca será null");
        System.out.println("  ✓ Arrays grandes de números");

        System.out.println("\nUSE WRAPPERS quando:");
        System.out.println("  ✓ Trabalhando com Collections (List, Map, Set)");
        System.out.println("  ✓ Valor pode ser null (opcional)");
        System.out.println("  ✓ Precisa dos métodos da classe Wrapper");
        System.out.println("  ✓ Usando Generics");
        System.out.println("  ✓ APIs que exigem objetos");
        System.out.println();
    }

    /**
     * Compara performance entre primitivos e Wrappers
     */
    private static void compararPerformance() {
        System.out.println(">>> 7. COMPARAÇÃO DE PERFORMANCE\n");

        int iteracoes = 100_000_000;  // 100 milhões

        // Teste com primitivos
        long inicio = System.currentTimeMillis();
        int somaPrimitivo = 0;
        for (int i = 0; i < iteracoes; i++) {
            somaPrimitivo += i;
        }
        long tempoPrimitivo = System.currentTimeMillis() - inicio;

        // Teste com Wrappers
        inicio = System.currentTimeMillis();
        Integer somaWrapper = 0;
        for (Integer i = 0; i < iteracoes; i++) {
            somaWrapper += i;  // autoboxing/unboxing a cada operação!
        }
        long tempoWrapper = System.currentTimeMillis() - inicio;

        System.out.println("Somando " + iteracoes + " números:");
        System.out.println("  Tempo com int:     " + tempoPrimitivo + " ms");
        System.out.println("  Tempo com Integer: " + tempoWrapper + " ms");

        if (tempoPrimitivo > 0) {
            long diferenca = tempoWrapper / tempoPrimitivo;
            System.out.println("\n  Integer é ~" + diferenca + "x mais lento!");
        }

        System.out.println("\n💡 CONCLUSÃO:");
        System.out.println("  Para operações intensivas, use primitivos!");
        System.out.println("  Para flexibilidade e APIs, use Wrappers!");
    }
}
