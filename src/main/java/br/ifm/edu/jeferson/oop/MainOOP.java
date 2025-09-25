package br.ifm.edu.jeferson.oop;

/**
 * Demonstra Interface, Abstract e Classes Concretas
 *
 * Para Python developers:
 * - Interface = contrato puro (como ABC com todos abstratos)
 * - Abstract = implementação parcial (como ABC mista)
 * - Concrete = implementação completa
 */
public class MainOOP {

    public static void main(String[] args) {
        System.out.println("=== DEMONSTRACAO OOP ===\n");

        // 1. Polimorfismo - tipo abstrato, objetos concretos
        Pagamento[] pagamentos = {
                new PagamentoCartao(100.00, 3),
                new PagamentoPix(50.00, "email@teste.com"),
                new PagamentoBoleto(200.00, 10),
                new PagamentoCartao(300.00, 15)  // vai dar erro
        };

        System.out.println("1. POLIMORFISMO");
        for (Pagamento p : pagamentos) {
            p.processar();
            p.exibir();
            System.out.println("  Taxa: R$ " + p.calcularTaxa());
        }

        // 2. Usando interfaces
        System.out.println("\n2. INTERFACES");
        Processavel proc = new PagamentoPix(75.00, "chave");
        proc.processar();
        System.out.println("Status: " + proc.getStatus());

        Taxavel tax = new PagamentoCartao(500.00, 1);
        System.out.println("Taxa: R$ " + tax.calcularTaxa());

        // 3. instanceof
        System.out.println("\n3. VERIFICACAO DE TIPOS");
        Pagamento pag = new PagamentoPix(30.00, "123");
        System.out.println("pag e Pagamento? " + (pag instanceof Pagamento));
        System.out.println("pag e PagamentoPix? " + (pag instanceof PagamentoPix));
        System.out.println("pag e PagamentoCartao? " + (pag instanceof PagamentoCartao));

        // 4. Diferenças conceituais
        System.out.println("\n4. RESUMO DOS CONCEITOS:");
        System.out.println("- Interface: define O QUE fazer");
        System.out.println("- Abstract: define PARTE de como fazer");
        System.out.println("- Concrete: define TUDO");
        System.out.println("- extends: herda de classe (uma só)");
        System.out.println("- implements: implementa interface (várias)");
    }
}