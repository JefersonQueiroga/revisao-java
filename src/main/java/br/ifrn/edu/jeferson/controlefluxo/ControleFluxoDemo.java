package br.ifrn.edu.jeferson.controlefluxo;

import java.util.Scanner;

/**
 * Demonstração de Controle de Fluxo em Java
 *
 * Este programa mostra:
 * - if, else, else if
 * - switch tradicional e melhorado
 * - for (tradicional e enhanced)
 * - while
 * - do-while
 * - break e continue
 *
 * @author Jeferson Queiroga
 */
public class ControleFluxoDemo {

    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("     CONTROLE DE FLUXO EM JAVA     ");
        System.out.println("====================================\n");

        demonstrarIf();
        demonstrarSwitch();
        demonstrarFor();
        demonstrarWhile();
        demonstrarDoWhile();
        demonstrarBreakContinue();
        exemploPratico();
    }

    /**
     * Demonstra if, else, else if
     */
    private static void demonstrarIf() {
        System.out.println(">>> 1. ESTRUTURA IF / ELSE / ELSE IF\n");

        // IF simples
        int idade = 18;
        System.out.println("Idade: " + idade);

        if (idade >= 18) {
            System.out.println("✓ É maior de idade");
        }

        // IF-ELSE
        double saldo = 150.00;
        double saque = 200.00;
        System.out.println("\nSaldo: R$ " + saldo);
        System.out.println("Tentando sacar: R$ " + saque);

        if (saldo >= saque) {
            saldo -= saque;
            System.out.println("✓ Saque realizado! Novo saldo: R$ " + saldo);
        } else {
            System.out.println("✗ Saldo insuficiente!");
        }

        // IF-ELSE IF-ELSE (múltiplas condições)
        double nota = 7.5;
        System.out.println("\nNota do aluno: " + nota);
        System.out.print("Situação: ");

        if (nota >= 9.0) {
            System.out.println("A - Excelente! 🌟");
        } else if (nota >= 7.0) {
            System.out.println("B - Bom! ✓");
        } else if (nota >= 5.0) {
            System.out.println("C - Regular");
        } else if (nota >= 3.0) {
            System.out.println("D - Insuficiente");
        } else {
            System.out.println("F - Reprovado");
        }

        // IFs aninhados
        boolean temCNH = true;
        boolean carroDisponivel = true;

        System.out.println("\nVerificação para dirigir:");
        if (idade >= 18) {
            if (temCNH) {
                if (carroDisponivel) {
                    System.out.println("✓ Pode dirigir!");
                } else {
                    System.out.println("✗ Carro não disponível");
                }
            } else {
                System.out.println("✗ Não tem CNH");
            }
        } else {
            System.out.println("✗ Menor de idade");
        }

        // Mesma lógica com && (mais limpo)
        if (idade >= 18 && temCNH && carroDisponivel) {
            System.out.println("✓ Todas condições OK - Pode dirigir!");
        }

        System.out.println();
    }

    /**
     * Demonstra switch tradicional
     */
    private static void demonstrarSwitch() {
        System.out.println(">>> 2. ESTRUTURA SWITCH\n");

        // Switch com int
        int diaSemana = 3;
        System.out.print("Dia " + diaSemana + " = ");

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo - Dia de descanso");
                break;
            case 2:
                System.out.println("Segunda - Início da semana");
                break;
            case 3:
                System.out.println("Terça - Dia produtivo");
                break;
            case 4:
                System.out.println("Quarta - Meio da semana");
                break;
            case 5:
                System.out.println("Quinta - Quase sexta!");
                break;
            case 6:
                System.out.println("Sexta - SEXTOU!");
                break;
            case 7:
                System.out.println("Sábado - Festa!");
                break;
            default:
                System.out.println("Dia inválido");
        }

        // Switch com múltiplos cases (fall-through)
        char conceito = 'B';
        System.out.print("\nConceito " + conceito + ": ");

        switch (conceito) {
            case 'A':
            case 'B':
                System.out.println("Aprovado com louvor!");
                break;
            case 'C':
                System.out.println("Aprovado");
                break;
            case 'D':
                System.out.println("Recuperação");
                break;
            case 'F':
                System.out.println("Reprovado");
                break;
            default:
                System.out.println("Conceito inválido");
        }

        // Switch com String
        String mes = "Janeiro";
        int diasNoMes;

        switch (mes.toLowerCase()) {
            case "janeiro": case "março": case "maio":
            case "julho": case "agosto": case "outubro": case "dezembro":
                diasNoMes = 31;
                break;
            case "abril": case "junho": case "setembro": case "novembro":
                diasNoMes = 30;
                break;
            case "fevereiro":
                diasNoMes = 28; // ou 29 em ano bissexto
                break;
            default:
                diasNoMes = 0;
        }

        System.out.println("\n" + mes + " tem " + diasNoMes + " dias");

        System.out.println();
    }

    /**
     * Demonstra loop FOR
     */
    private static void demonstrarFor() {
        System.out.println(">>> 3. LOOP FOR\n");

        // FOR tradicional
        System.out.println("For crescente (0 a 4):");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }

        // FOR decrescente
        System.out.println("\n\nFor decrescente (5 a 1):");
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }

        // FOR com incremento diferente
        System.out.println("\n\nNúmeros pares (0 a 10):");
        for (int i = 0; i <= 10; i += 2) {
            System.out.print(i + " ");
        }

        // FOR com múltiplas variáveis
        System.out.println("\n\nDuas variáveis no for:");
        for (int i = 0, j = 10; i < 5; i++, j--) {
            System.out.println("  i=" + i + ", j=" + j);
        }

        // FOR-EACH (enhanced for)
        System.out.println("\nFor-each com array:");
        String[] frutas = {"Maçã", "Banana", "Laranja", "Uva"};
        for (String fruta : frutas) {
            System.out.println("  - " + fruta);
        }

        // FOR aninhado (tabuada)
        System.out.println("\nTabuada do 5 (for aninhado):");
        int num = 5;
        for (int i = 1; i <= 5; i++) {
            System.out.println("  " + num + " x " + i + " = " + (num * i));
        }

        System.out.println();
    }

    /**
     * Demonstra loop WHILE
     */
    private static void demonstrarWhile() {
        System.out.println(">>> 4. LOOP WHILE\n");

        // WHILE simples
        System.out.println("Contando até 5:");
        int contador = 1;
        while (contador <= 5) {
            System.out.print(contador + " ");
            contador++;
        }

        // WHILE com condição complexa
        System.out.println("\n\nParando quando soma > 20:");
        int soma = 0;
        int numero = 1;
        while (soma <= 20) {
            soma += numero;
            System.out.println("  Número: " + numero + ", Soma: " + soma);
            numero++;
        }

        // WHILE para validação
        System.out.println("\nSimulando validação de entrada:");
        int tentativas = 0;
        boolean senhaCorreta = false;

        while (!senhaCorreta && tentativas < 3) {
            tentativas++;
            System.out.println("  Tentativa " + tentativas + " de 3");

            // Simulando senha (na prática viria do Scanner)
            if (tentativas == 3) {
                senhaCorreta = true;
                System.out.println("  ✓ Senha correta!");
            } else {
                System.out.println("  ✗ Senha incorreta");
            }
        }

        if (!senhaCorreta) {
            System.out.println("  Acesso bloqueado!");
        }

        System.out.println();
    }

    /**
     * Demonstra loop DO-WHILE
     */
    private static void demonstrarDoWhile() {
        System.out.println(">>> 5. LOOP DO-WHILE\n");

        // DO-WHILE sempre executa pelo menos uma vez
        System.out.println("Do-While (executa PELO MENOS uma vez):");
        int x = 10;
        do {
            System.out.println("  x = " + x + " (executou mesmo x sendo > 5)");
            x++;
        } while (x < 5); // condição false, mas executou 1 vez

        // Comparação com WHILE
        System.out.println("\nComparação WHILE vs DO-WHILE:");

        // WHILE pode não executar
        int y = 10;
        System.out.println("  WHILE com y=10 e condição (y<5):");
        while (y < 5) {
            System.out.println("    Não executa!");
            y++;
        }
        System.out.println("    Não entrou no loop");

        // DO-WHILE sempre executa
        int z = 10;
        System.out.println("  DO-WHILE com z=10 e condição (z<5):");
        do {
            System.out.println("    Executou com z=" + z);
            z++;
        } while (z < 5);

        // Uso prático: Menu
        System.out.println("\nSimulação de MENU:");
        int opcao = 0;
        int vezesMenu = 0;

        do {
            vezesMenu++;
            System.out.println("  [Menu exibido - vez " + vezesMenu + "]");
            opcao = vezesMenu; // simula escolha do usuário

            if (opcao != 3) {
                System.out.println("  Opção escolhida: " + opcao);
            }
        } while (opcao != 3);
        System.out.println("  Saindo do menu...");

        System.out.println();
    }

    /**
     * Demonstra BREAK e CONTINUE
     */
    private static void demonstrarBreakContinue() {
        System.out.println(">>> 6. BREAK E CONTINUE\n");

        // BREAK - sai do loop
        System.out.println("BREAK (sai quando encontra 5):");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println(" [BREAK!]");
                break;
            }
            System.out.print(i + " ");
        }

        // CONTINUE - pula para próxima iteração
        System.out.println("\n\nCONTINUE (pula números pares):");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // pula os pares
            }
            System.out.print(i + " ");
        }

        // BREAK em loops aninhados
        System.out.println("\n\nBREAK em loops aninhados:");
        externo:  // label (rótulo)
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("(" + i + "," + j + ") ");
                if (i == 2 && j == 2) {
                    System.out.println("[BREAK do loop externo!]");
                    break externo; // sai dos DOIS loops
                }
            }
            System.out.println();
        }

        System.out.println();
    }

    /**
     * Exemplo prático: Sistema de notas
     */
    private static void exemploPratico() {
        System.out.println(">>> 7. EXEMPLO PRÁTICO - SISTEMA DE NOTAS\n");

        // Simulando notas de alunos
        String[] alunos = {"Ana", "Bruno", "Carlos", "Diana", "Eduardo"};
        double[] notas = {8.5, 6.0, 9.2, 4.5, 7.8};

        double somaNotas = 0;
        int aprovados = 0;
        int reprovados = 0;
        int recuperacao = 0;

        System.out.println("PROCESSANDO NOTAS DOS ALUNOS:");
        System.out.println("--------------------------------");

        for (int i = 0; i < alunos.length; i++) {
            String aluno = alunos[i];
            double nota = notas[i];
            somaNotas += nota;

            System.out.print(aluno + " (nota " + nota + "): ");

            // Determinar situação
            if (nota >= 7.0) {
                System.out.println("APROVADO ✓");
                aprovados++;
            } else if (nota >= 5.0) {
                System.out.println("RECUPERAÇÃO ⚠");
                recuperacao++;
            } else {
                System.out.println("REPROVADO ✗");
                reprovados++;
            }
        }

        double media = somaNotas / alunos.length;

        System.out.println("\nESTATÍSTICAS:");
        System.out.println("  Total de alunos: " + alunos.length);
        System.out.println("  Aprovados: " + aprovados);
        System.out.println("  Recuperação: " + recuperacao);
        System.out.println("  Reprovados: " + reprovados);
        System.out.println("  Média da turma: " + String.format("%.1f", media));

        // Classificar turma
        System.out.print("\nClassificação da turma: ");
        if (media >= 8.0) {
            System.out.println("EXCELENTE! 🌟");
        } else if (media >= 7.0) {
            System.out.println("BOA!");
        } else if (media >= 5.0) {
            System.out.println("REGULAR");
        } else {
            System.out.println("PRECISA MELHORAR");
        }
    }
}