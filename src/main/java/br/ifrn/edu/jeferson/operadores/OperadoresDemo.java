package br.ifrn.edu.jeferson.operadores;

/**
 * Demonstração completa dos Operadores em Java
 *
 * Este programa mostra:
 * - Operadores Aritméticos (+, -, *, /, %)
 * - Operadores Relacionais (>, <, >=, <=, ==, !=)
 * - Operadores Lógicos (&&, ||, !)
 * - Operadores de Atribuição (=, +=, -=, *=, /=, %=)
 * - Operadores Unários (++, --, +, -, !)
 * - Operador Ternário (? :)
 * - Operadores Bit a Bit (&, |, ^, ~, <<, >>, >>>)
 *
 * @author Jeferson Queiroga
 */
public class OperadoresDemo {

    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("      OPERADORES EM JAVA           ");
        System.out.println("====================================\n");

        demonstrarAritmeticos();
        demonstrarRelacionais();
        demonstrarLogicos();
        demonstrarAtribuicao();
        demonstrarUnarios();
        demonstrarTernario();
        demonstrarBitwise();
        exemploPratico();
    }

    /**
     * Operadores Aritméticos: +, -, *, /, %
     */
    private static void demonstrarAritmeticos() {
        System.out.println(">>> 1. OPERADORES ARITMÉTICOS\n");

        int a = 10;
        int b = 3;

        System.out.println("Valores: a = " + a + ", b = " + b);
        System.out.println("--------------------------------");

        // Operações básicas
        System.out.println("ADIÇÃO       (a + b):  " + (a + b));    // 13
        System.out.println("SUBTRAÇÃO    (a - b):  " + (a - b));    // 7
        System.out.println("MULTIPLICAÇÃO(a * b):  " + (a * b));    // 30
        System.out.println("DIVISÃO      (a / b):  " + (a / b));    // 3 (divisão inteira!)
        System.out.println("RESTO/MÓDULO (a % b):  " + (a % b));    // 1

        // Divisão decimal
        double x = 10.0;
        double y = 3.0;
        System.out.println("\nDivisão decimal: " + x + " / " + y + " = " + (x / y));

        // Cuidado com divisão inteira!
        System.out.println("\n⚠️ CUIDADO com divisão inteira:");
        System.out.println("  5 / 2 = " + (5 / 2));                 // 2 (não 2.5!)
        System.out.println("  5.0 / 2 = " + (5.0 / 2));             // 2.5
        System.out.println("  (double)5 / 2 = " + ((double)5 / 2)); // 2.5

        // Uso do módulo (%)
        System.out.println("\nUSOS DO MÓDULO (%):");
        System.out.println("  10 % 2 = " + (10 % 2) + " → 10 é PAR");
        System.out.println("  11 % 2 = " + (11 % 2) + " → 11 é ÍMPAR");
        System.out.println("  15 % 4 = " + (15 % 4) + " → resto da divisão");

        System.out.println();
    }

    /**
     * Operadores Relacionais: >, <, >=, <=, ==, !=
     */
    private static void demonstrarRelacionais() {
        System.out.println(">>> 2. OPERADORES RELACIONAIS (retornam boolean)\n");

        int x = 5;
        int y = 10;

        System.out.println("Valores: x = " + x + ", y = " + y);
        System.out.println("--------------------------------");

        System.out.println("MAIOR QUE        (x > y):  " + (x > y));     // false
        System.out.println("MENOR QUE        (x < y):  " + (x < y));     // true
        System.out.println("MAIOR OU IGUAL   (x >= 5): " + (x >= 5));    // true
        System.out.println("MENOR OU IGUAL   (x <= 5): " + (x <= 5));    // true
        System.out.println("IGUAL A          (x == 5): " + (x == 5));    // true
        System.out.println("DIFERENTE DE     (x != y): " + (x != y));    // true

        // Comparação com Strings
        System.out.println("\n⚠️ CUIDADO ao comparar Strings:");
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = "Java";
        String s4 = "Java";

        System.out.println("  s1 == s2: " + (s1 == s2));         // false (objetos diferentes)
        System.out.println("  s1.equals(s2): " + s1.equals(s2)); // true (conteúdo igual)
        System.out.println("  s3 == s4: " + (s3 == s4));         // true (string pool)

        System.out.println();
    }

    /**
     * Operadores Lógicos: &&, ||, !
     */
    private static void demonstrarLogicos() {
        System.out.println(">>> 3. OPERADORES LÓGICOS\n");

        boolean a = true;
        boolean b = false;

        System.out.println("Valores: a = " + a + ", b = " + b);
        System.out.println("--------------------------------");

        // AND (&&) - ambos devem ser true
        System.out.println("AND (a && b):     " + (a && b));        // false
        System.out.println("AND (a && true):  " + (a && true));     // true

        // OR (||) - pelo menos um deve ser true
        System.out.println("\nOR  (a || b):     " + (a || b));      // true
        System.out.println("OR  (false || b): " + (false || b));    // false

        // NOT (!) - inverte o valor
        System.out.println("\nNOT (!a):         " + (!a));          // false
        System.out.println("NOT (!b):         " + (!b));            // true

        // Exemplo prático
        System.out.println("\nEXEMPLO PRÁTICO:");
        int idade = 25;
        boolean temCNH = true;
        boolean podeDirigir = (idade >= 18) && temCNH;
        System.out.println("  Idade: " + idade);
        System.out.println("  Tem CNH: " + temCNH);
        System.out.println("  Pode dirigir: " + podeDirigir);

        // Short-circuit (curto-circuito)
        System.out.println("\n💡 SHORT-CIRCUIT:");
        System.out.println("  && para na primeira condição false");
        System.out.println("  || para na primeira condição true");

        int x = 5;
        // Se x > 10 é false, nem verifica a segunda condição
        boolean resultado = (x > 10) && (x++ < 20);
        System.out.println("  x ainda é " + x + " (não incrementou!)");

        System.out.println();
    }

    /**
     * Operadores de Atribuição: =, +=, -=, *=, /=, %=
     */
    private static void demonstrarAtribuicao() {
        System.out.println(">>> 4. OPERADORES DE ATRIBUIÇÃO\n");

        int num = 10;
        System.out.println("Valor inicial: num = " + num);
        System.out.println("--------------------------------");

        // Atribuição simples
        num = 20;
        System.out.println("num = 20         → num = " + num);

        // Atribuições compostas
        num += 5;  // num = num + 5
        System.out.println("num += 5         → num = " + num);

        num -= 3;  // num = num - 3
        System.out.println("num -= 3         → num = " + num);

        num *= 2;  // num = num * 2
        System.out.println("num *= 2         → num = " + num);

        num /= 4;  // num = num / 4
        System.out.println("num /= 4         → num = " + num);

        num %= 7;  // num = num % 7
        System.out.println("num %= 7         → num = " + num);

        // Com Strings
        System.out.println("\nCom Strings:");
        String texto = "Java";
        texto += " Programming";  // concatenação
        System.out.println("texto += \" Programming\" → " + texto);

        System.out.println();
    }

    /**
     * Operadores Unários: ++, --, +, -, !
     */
    private static void demonstrarUnarios() {
        System.out.println(">>> 5. OPERADORES UNÁRIOS\n");

        int x = 5;
        System.out.println("Valor inicial: x = " + x);
        System.out.println("--------------------------------");

        // Pré-incremento vs Pós-incremento
        System.out.println("PÓS-INCREMENTO (x++):");
        System.out.println("  Valor de x++: " + (x++));  // mostra 5, depois incrementa
        System.out.println("  Valor de x agora: " + x);   // 6

        System.out.println("\nPRÉ-INCREMENTO (++x):");
        System.out.println("  Valor de ++x: " + (++x));   // incrementa primeiro, mostra 7
        System.out.println("  Valor de x agora: " + x);   // 7

        // Pré-decremento vs Pós-decremento
        System.out.println("\nPÓS-DECREMENTO (x--):");
        System.out.println("  Valor de x--: " + (x--));   // mostra 7, depois decrementa
        System.out.println("  Valor de x agora: " + x);   // 6

        System.out.println("\nPRÉ-DECREMENTO (--x):");
        System.out.println("  Valor de --x: " + (--x));   // decrementa primeiro, mostra 5
        System.out.println("  Valor de x agora: " + x);   // 5

        // Positivo e Negativo
        int num = 10;
        System.out.println("\nPOSITIVO/NEGATIVO:");
        System.out.println("  +num: " + (+num));          // 10
        System.out.println("  -num: " + (-num));          // -10

        // Negação lógica
        boolean ativo = true;
        System.out.println("\nNEGAÇÃO LÓGICA:");
        System.out.println("  ativo: " + ativo);          // true
        System.out.println("  !ativo: " + (!ativo));      // false

        System.out.println();
    }

    /**
     * Operador Ternário: ? :
     */
    private static void demonstrarTernario() {
        System.out.println(">>> 6. OPERADOR TERNÁRIO (? :)\n");

        System.out.println("Sintaxe: condição ? valorSeTrue : valorSeFalse");
        System.out.println("--------------------------------");

        // Exemplo básico
        int idade = 20;
        String status = (idade >= 18) ? "Adulto" : "Menor";
        System.out.println("Idade: " + idade + " → Status: " + status);

        // Com números
        int a = 10, b = 20;
        int maior = (a > b) ? a : b;
        System.out.println("\nMaior entre " + a + " e " + b + ": " + maior);

        // Aninhado (evite muito aninhamento!)
        int nota = 75;
        String conceito = (nota >= 90) ? "A" :
                (nota >= 80) ? "B" :
                        (nota >= 70) ? "C" :
                                (nota >= 60) ? "D" : "F";
        System.out.println("\nNota: " + nota + " → Conceito: " + conceito);

        // Equivalente com if-else
        System.out.println("\n💡 Ternário é um 'if-else compacto':");
        System.out.println("  String msg = (x > 0) ? \"Positivo\" : \"Negativo\";");
        System.out.println("  É o mesmo que:");
        System.out.println("  if (x > 0) msg = \"Positivo\";");
        System.out.println("  else msg = \"Negativo\";");

        System.out.println();
    }

    /**
     * Operadores Bit a Bit (Bitwise)
     */
    private static void demonstrarBitwise() {
        System.out.println(">>> 7. OPERADORES BIT A BIT (BITWISE)\n");

        int a = 5;  // 0101 em binário
        int b = 3;  // 0011 em binário

        System.out.println("a = " + a + " (" + Integer.toBinaryString(a) + " em binário)");
        System.out.println("b = " + b + " (" + Integer.toBinaryString(b) + " em binário)");
        System.out.println("--------------------------------");

        System.out.println("AND bit a bit  (a & b):  " + (a & b));   // 0001 = 1
        System.out.println("OR bit a bit   (a | b):  " + (a | b));   // 0111 = 7
        System.out.println("XOR bit a bit  (a ^ b):  " + (a ^ b));   // 0110 = 6
        System.out.println("NOT bit a bit  (~a):     " + (~a));      // inverte todos os bits

        // Shift operators
        System.out.println("\nSHIFT OPERATORS:");
        System.out.println("Left shift  (a << 1): " + (a << 1));     // 1010 = 10 (multiplica por 2)
        System.out.println("Right shift (a >> 1): " + (a >> 1));     // 0010 = 2 (divide por 2)

        System.out.println();
    }

    /**
     * Exemplo prático usando vários operadores
     */
    private static void exemploPratico() {
        System.out.println(">>> 8. EXEMPLO PRÁTICO - CALCULADORA DE DESCONTO\n");

        double preco = 100.00;
        int quantidade = 3;
        boolean clienteVIP = true;
        int diaSemana = 3; // 1=Dom, 2=Seg, 3=Ter...

        System.out.println("DADOS DA COMPRA:");
        System.out.println("  Preço unitário: R$ " + preco);
        System.out.println("  Quantidade: " + quantidade);
        System.out.println("  Cliente VIP: " + clienteVIP);
        System.out.println("  Dia da semana: " + diaSemana);
        System.out.println("--------------------------------");

        // Cálculo do subtotal
        double subtotal = preco * quantidade;
        System.out.println("Subtotal: R$ " + subtotal);

        // Desconto por quantidade (>= 2 itens = 5% desconto)
        double descontoQtd = (quantidade >= 2) ? 0.05 : 0.0;

        // Desconto VIP (10% se for VIP)
        double descontoVIP = clienteVIP ? 0.10 : 0.0;

        // Desconto de terça-feira (15% nas terças)
        double descontoTerca = (diaSemana == 3) ? 0.15 : 0.0;

        // Desconto total (máximo 25%)
        double descontoTotal = descontoQtd + descontoVIP + descontoTerca;
        descontoTotal = (descontoTotal > 0.25) ? 0.25 : descontoTotal;

        // Aplicar desconto
        double valorDesconto = subtotal * descontoTotal;
        double total = subtotal - valorDesconto;

        System.out.println("\nDESCONTOS APLICADOS:");
        if (descontoQtd > 0) System.out.println("  Quantidade: " + (descontoQtd * 100) + "%");
        if (descontoVIP > 0) System.out.println("  Cliente VIP: " + (descontoVIP * 100) + "%");
        if (descontoTerca > 0) System.out.println("  Terça-feira: " + (descontoTerca * 100) + "%");

        System.out.println("\nRESUMO:");
        System.out.println("  Desconto total: " + (descontoTotal * 100) + "%");
        System.out.println("  Valor do desconto: R$ " + String.format("%.2f", valorDesconto));
        System.out.println("  TOTAL A PAGAR: R$ " + String.format("%.2f", total));
    }
}