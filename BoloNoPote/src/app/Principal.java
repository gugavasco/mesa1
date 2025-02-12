/*
 * A licença MIT
 *
 * Copyright 2019 Viniciusalopes Tecnologia <suporte@viniciusalopes.com.br>.
 *
 * É concedida permissão, gratuitamente, a qualquer pessoa que obtenha uma cópia
 * deste software e dos arquivos de documentação associados (o "Software"), para
 * negociar o Software sem restrições, incluindo, sem limitação, os direitos de uso,
 * cópia, modificação e fusão, publicar, distribuir, sublicenciar e/ou vender cópias
 * do Software, e permitir que as pessoas a quem o Software é fornecido o façam,
 * sujeitas às seguintes condições:
 *
 * O aviso de copyright acima e este aviso de permissão devem ser incluídos em
 * todas as cópias ou partes substanciais do Software.
 *
 * O SOFTWARE É FORNECIDO "NO ESTADO EM QUE SE ENCONTRA", SEM NENHUM TIPO DE GARANTIA,
 * EXPRESSA OU IMPLÍCITA, INCLUINDO, MAS NÃO SE LIMITANDO ÀS GARANTIAS DE COMERCIALIZAÇÃO,
 * ADEQUAÇÃO A UM FIM ESPECÍFICO E NÃO VIOLAÇÃO. EM NENHUMA CIRCUNSTÂNCIA, OS AUTORES
 * OU PROPRIETÁRIOS DE DIREITOS DE AUTOR PODERÃO SER RESPONSABILIZADOS POR QUAISQUER
 * REIVINDICAÇÕES, DANOS OU OUTRAS RESPONSABILIDADES, QUER EM AÇÃO DE CONTRATO,
 * DELITO OU DE OUTRA FORMA, DECORRENTES DE, OU EM CONEXÃO COM O SOFTWARE OU O USO
 * OU OUTRAS NEGOCIAÇÕES NO PROGRAMAS.
 * ------------------------------------------------------------------------------------------
 * Projeto   : Projeto Bolo no Pote - Matemática e Estatística - ADS1/2019 - Grupo A1
 * Criado em : 07/11/2019
 * Autores   : Gustavo Gabriel O. Souza
 *             Gustavo Henrique
 *             Lucas Araujo da Silva
 *             Miguel Gonçalves dos Santos Neto
 Renan de Paula
 *             
 * Finalidade: Projeto Bolos no Pote
 
 Muitas receitas de bolos no pote não gastam mais do que R$ 30 para fazer uma receita para 15 unidades.
 E essa é uma das maiores vantagens em começar a vender bolos no pote. Inclusive, com a chegada do natal, 
 você pode até mesmo apostar em bolos para essa época do ano!
 Assim, foram reunidas três de receitas de coberturas, de bolos no pote.
 Desenvolver um software, onde:
 DESAFIO
 Desenvolver um software que ao digitar os valores dos ingredientes com suas respectivas medidas, devolva para o 
 usuário qual/quais receita(s) ele poderá fazer dentro do limite de gasto proposto na contextualização.
 1. Resolva a situação problema proposta. Com as três receitas. Os dados podem ser fictícios (valores e medidas).
 2. Calcule automaticamente o valor de custo de cada bolo no pote (incluso o valor da embalagem);
 3. Calcule quanto o usuário irá ter de lucro (em R$ e em %), dado um valor de venda.
 4. O software pode ser rodado no console.
 5. O software deverá ser apresentado para o(s) professor(es) da(s) disciplina(s) participante(s). “Rodando”.

 Para a massa do bolo:
 Ingredientes:
 • 300 g de açúcar
 • 300 g de margarina gelada
 • 4 ovos médios
 • 300 g de farinha de trigo com fermento
 Recheios e Coberturas:

 1. Leite ninho com morangos:

 • 2 latas de leite condensado (300 gramas cada)
 • 2 latas de creme de leite (300 gramas cada)
 • 6 colheres (de sopa) de leite ninho (100 gramas cada)
 • 20 morangos

 2. Dois amores:

 • 2 latas de leite condensado (300 gramas cada)
 • 2 latas de creme de leite (300 gramas cada)
 • 6 colheres de chocolate em pó (100 gramas cada)

 3. Maracujá:

 • 2 xícaras de suco de maracujá (240 ml)
 • 4 colheres de amido de milho (5 gramas cada)
 • 6 gemas
 • 1 xícara de água (250 ml)
 • 1 e 1/2 xícara de açúcar (200 gramas)

 

 * ------------------------------------------------------------------------------------------
 */
package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Fase1_Etapa1 - miguelneto -----------------------------------------------------
        Scanner entrada = new Scanner(System.in);

        int NumReceitas = 3;
        double[][] receita1 = new double[9][2];//Matrizes correspondente a cada receita @GUSTAVO G.
        double[][] receita2 = new double[8][2];//Miguel ja avia criado corretamente!
        double[][] receita3 = new double[9][2];
        double[] ingrediente_receita1 = new double[9];
        double[] ingrediente_receita2 = new double[8];
        double[] ingrediente_receita3 = new double[9];

        ingrediente_receita1[0] = 300.0;
        ingrediente_receita1[1] = 300.0;
        ingrediente_receita1[2] = 4.0;
        ingrediente_receita1[3] = 300.0;
        ingrediente_receita1[4] = 600.0;
        ingrediente_receita1[5] = 600.0;
        ingrediente_receita1[6] = 600.0;
        ingrediente_receita1[7] = 20.0;
        ingrediente_receita1[8] = 15.0;

        ingrediente_receita2[0] = 300.0;
        ingrediente_receita2[1] = 300.0;
        ingrediente_receita2[2] = 4.0;
        ingrediente_receita2[3] = 300.0;
        ingrediente_receita2[4] = 600.0;
        ingrediente_receita2[5] = 600.0;
        ingrediente_receita2[6] = 600.0;
        ingrediente_receita2[7] = 15.0;

        ingrediente_receita3[0] = 500.0;
        ingrediente_receita3[1] = 300.0;
        ingrediente_receita3[2] = 10.0;
        ingrediente_receita3[3] = 300.0;
        ingrediente_receita3[4] = 480.0;
        ingrediente_receita3[5] = 20.0;
        ingrediente_receita3[6] = 250.0;
        ingrediente_receita3[7] = 50.0;
        ingrediente_receita3[8] = 15.0;

        int a = 0; // indice manipular vetor receita1; 
        int b = 0; // indice manipular vetor receita2;
        int c = 0; // indice manipular vetor receita3;

        char tipo = 0; // manipular switch case receita1 (1) , receita2 (2) , receita3 (3);

        // ##################  CALCULO  ###################;
        double quantidade_litro; // (ml) suco maracuja , agua ;
        double quandidade_unidade; // gramas cada;
        double valor_pago; // valor em R$;
        double valor_venda; // valor em R$;
        double lucro_real; // calculo;
        double lucro_porcent; // calculo;
        double custo_embalagem; // calculo;
        double conversor_ml; // calculo;
        double conversor_gramas; // calculo;
        double controlador_real; //bolos no pote não gastam mais do que R$ 30;
        double controlador_unidades;//fazer uma receita para 15 unidades;

        // FIM Fase1_Etapa1 - miguelneto ------------------------------------------------------
        //
        // FIM Fase2_Etapa1 - renanrpads  -----------------------------------------------------
        System.out.println("Viabilidade das receitas:");
        System.out.println("Receita 1 - Leite ninho com morango\n"
                + "Receita 2 - Dois amores\n"
                + "Receita 3 - Maracujá\n\n"
                + "Escolha a opção que você deseja (1, 2 ou 3): ");
        // FIM Fase2_Etapa1 - renanrpads  -----------------------------------------------------
        //
        // Fase2_Etapa2 - gustavo henrique ----------------------------------------------------------
        int opc;

        do {

            try { // CORREÇÃO DA VALIDAÇÃO @GUSTAVO G.
                opc = entrada.nextInt();
                if (opc != 1 && opc != 2 && opc != 3) {
                    System.out.println("Você digitou uma opção inválida!");
                    System.out.println("Digite um número correspondente a uma das receitas !");
                }
            } catch (InputMismatchException e) {
                System.out.println("Você digitou uma opção inválida!");
                System.out.println("Digite um número correspondente a uma das receitas !");
                opc = 0;
            }
            entrada.nextLine();
        } while (opc == 0 || opc != 1 && opc != 2 && opc != 3);

        // FIM Fase2_Etapa2 - gustavo henrique  -----------------------------------------------------
        // 
        // Fase3_Etapa1 - gustavo  ----------------------------------------------------------
        switch (opc) {
            case 1:
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (i == 0) {
                            System.out.println("Açucar: ");
                        }
                        if (i == 1) {
                            System.out.println("Margarina:: ");
                        }
                        if (i == 2) {
                            System.out.println("Ovos:: ");
                        }
                        if (i == 3) {
                            System.out.println("Farinha de trigo:: ");
                        }
                        if (i == 4) {
                            System.out.println("Fermento: ");
                        }
                        if (i == 5) {
                            System.out.println("Leite condensado: ");
                        }
                        if (i == 6) {
                            System.out.println("Creme de leite: ");
                        }
                        if (i == 7) {
                            System.out.println("Leite ninho: ");
                        }
                        if (i == 8) {
                            System.out.println("Morangos: ");
                        }
                        if (j == 0) {
                            System.out.print("Quantidade: ");
                            // Fase3_Etapa2 - gustavo gabriel ----------------------------------------------------------

                            receita1[i][j] = 0;
                            while (receita1[i][j] <= 0) {
                                try {
                                    receita1[i][j] = entrada.nextDouble();
                                    if (receita1[i][j] <= 0) {
                                        System.out.println("Você digitou um número negativo ou igual a 0!\nDigite um número positivo");
                                        if (j == 0) {
                                            System.out.print("Quantidade: ");
                                        }
                                        if (j == 1) {
                                            System.out.print("Valor: ");
                                        }
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Você não digitou um número!");
                                    System.out.println("Digite um número!");
                                    receita1[i][j] = 0;
                                }
                                entrada.nextLine();
                            }
                            // FIM Fase3_Etapa2 - gustavo gabriel  -----------------------------------------------------
                            // FIM Fase4_Etapa1 - gustavo henrique  -----------------------------------------------------

                        } else if (j == 1) {
                            System.out.print("Valor: ");
                            // Fase3_Etapa2 - gustavo gabriel ----------------------------------------------------------
                            // Fase4_Etapa1 - gustavo henrique ----------------------------------------------------------

                            receita1[i][j] = 0;
                            while (receita1[i][j] <= 0) {
                                try {
                                    receita1[i][j] = entrada.nextDouble();
                                    if (receita1[i][j] <= 0) {
                                        System.out.println("Você digitou um número negativo ou igual a 0!\nDigite um número positivo");
                                        if (j == 0) {
                                            System.out.print("Quantidade: ");
                                        }
                                        if (j == 1) {
                                            System.out.print("Valor: ");
                                        }
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Você não digitou um número!");
                                    System.out.println("Digite um número!");
                                    receita1[i][j] = 0;
                                }
                                entrada.nextLine();
                            }
                            // FIM Fase3_Etapa2 - gustavo gabriel  -----------------------------------------------------
                            // FIM Fase4_Etapa1 - gustavo henrique  -----------------------------------------------------

                        }
                    }
                }
                break;
            case 2:
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (i == 0) {
                            System.out.println("Açucar: ");
                        }
                        if (i == 1) {
                            System.out.println("Margarina:: ");
                        }
                        if (i == 2) {
                            System.out.println("Ovos:: ");
                        }
                        if (i == 3) {
                            System.out.println("Farinha de trigo:: ");
                        }
                        if (i == 4) {
                            System.out.println("Fermento: ");
                        }
                        if (i == 5) {
                            System.out.println("Leite condensado: ");
                        }
                        if (i == 6) {
                            System.out.println("Creme de leite: ");
                        }
                        if (i == 7) {
                            System.out.println("Chocolate em pó: ");
                        }

                        if (j == 0) {
                            System.out.print("Quantidade: ");
                            // Fase3_Etapa2 - gustavo gabriel ----------------------------------------------------------
                            // Fase4_Etapa1 - gustavo henrique ----------------------------------------------------------
                            receita1[i][j] = 0;
                            while (receita1[i][j] <= 0) {
                                try {
                                    receita1[i][j] = entrada.nextDouble();
                                    if (receita1[i][j] <= 0) {
                                        System.out.println("Você digitou um número negativo ou igual a 0!\nDigite um número positivo");
                                        if (j == 0) {
                                            System.out.print("Quantidade: ");
                                        }
                                        if (j == 1) {
                                            System.out.print("Valor: ");
                                        }
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Você não digitou um número!");
                                    System.out.println("Digite um número!");
                                    receita1[i][j] = 0;
                                }
                                entrada.nextLine();
                            }
                            // FIM Fase3_Etapa2 - gustavo gabriel  -----------------------------------------------------

                        } else if (j == 1) {
                            System.out.print("Valor: ");
                            // Fase3_Etapa2 - gustavo gabriel ----------------------------------------------------------
                            // Fase4_Etapa1 - gustavo henrique ----------------------------------------------------------

                            receita1[i][j] = 0;
                            while (receita1[i][j] <= 0) {
                                try {
                                    receita1[i][j] = entrada.nextDouble();
                                    if (receita1[i][j] <= 0) {
                                        System.out.println("Você digitou um número negativo ou igual a 0!\nDigite um número positivo");
                                        if (j == 0) {
                                            System.out.print("Quantidade: ");
                                        }
                                        if (j == 1) {
                                            System.out.print("Valor: ");
                                        }
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Você não digitou um número!");
                                    System.out.println("Digite um número!");
                                    receita1[i][j] = 0;
                                }
                                entrada.nextLine();
                            }
                            // FIM Fase3_Etapa2 - gustavo gabriel  -----------------------------------------------------
                            // FIM Fase4_Etapa1 - gustavo henrique  -----------------------------------------------------
                        }
                    }
                }

                break;
            case 3:
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (i == 0) {
                            System.out.println("Açucar: ");
                        }
                        if (i == 1) {
                            System.out.println("Margarina:: ");
                        }
                        if (i == 2) {
                            System.out.println("Ovos:: ");
                        }
                        if (i == 3) {
                            System.out.println("Farinha de trigo:: ");
                        }
                        if (i == 4) {
                            System.out.println("Fermento: ");
                        }
                        if (i == 5) {
                            System.out.println("Suco de maracujá: ");
                        }
                        if (i == 6) {
                            System.out.println("Amido de milho: ");
                        }
                        if (j == 0) {
                            System.out.print("Quantidade: ");
                            // Fase3_Etapa2 - gustavo gabriel ----------------------------------------------------------
                            // Fase4_Etapa1 - gustavo henrique ----------------------------------------------------------

                            receita1[i][j] = 0;
                            while (receita1[i][j] <= 0) {
                                try {
                                    receita1[i][j] = entrada.nextDouble();
                                    if (receita1[i][j] <= 0) {
                                        System.out.println("Você digitou um número negativo ou igual a 0!\nDigite um número positivo");
                                        if (j == 0) {
                                            System.out.print("Quantidade: ");
                                        }
                                        if (j == 1) {
                                            System.out.print("Valor: ");
                                        }
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Você não digitou um número!");
                                    System.out.println("Digite um número!");
                                    receita1[i][j] = 0;
                                }
                                entrada.nextLine();
                            }
                            // FIM Fase3_Etapa2 - gustavo gabriel  -----------------------------------------------------
                            // FIM Fase4_Etapa1 - gustavo henrique  -----------------------------------------------------

                        } else if (j == 1) {
                            System.out.print("Valor: ");
                            // Fase3_Etapa2 - gustavo gabriel ----------------------------------------------------------
                            // Fase4_Etapa1 - gustavo henrique ----------------------------------------------------------

                            receita1[i][j] = 0;
                            while (receita1[i][j] <= 0) {
                                try {
                                    receita1[i][j] = entrada.nextDouble();
                                    if (receita1[i][j] <= 0) {
                                        System.out.println("Você digitou um número negativo ou igual a 0!\nDigite um número positivo");
                                        if (j == 0) {
                                            System.out.print("Quantidade: ");
                                        }
                                        if (j == 1) {
                                            System.out.print("Valor: ");
                                        }
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Você não digitou um número!");
                                    System.out.println("Digite um número!");
                                    receita1[i][j] = 0;
                                }
                                entrada.nextLine();
                            }
                            // FIM Fase3_Etapa2 - gustavo gabriel  -----------------------------------------------------
                            // FIM Fase4_Etapa1 - gustavo henrique  -----------------------------------------------------

                        }
                    }
                }

                break;
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(receita1[i][j] + " ");
            }
            System.out.println("");
        }
        // FIM Fase3_Etapa1 - gustavo  -----------------------------------------------------

        /*
         * Fase4_Etapa2 -------------------------------------------------------------------
        
         Verificar se os ingredientes inseridos são suficientes para pelo menos uma receita
         Se SIM:
         Executar o código da Fase4_Etapa3
         Se NÃO:
         Exibe uma mensagem de erro.
         Solicita todos os ingredientes novamente.
            
         FIM Fase4_Etapa2 -------------------------------------------------------------------

         */
        //
        //
        //
        /* Fase4_Etapa3 -------------------------------------------------------------------

         Calcular o custo da receita
         Calcular o custo de um bolo
         Verificar se a receita é viável ou não, porque e % de lucro*/
        double qtd;
        double vlr;
        double rec;
        double custo_ingrediente = 0.0;
        double custo_receita = 0.0;
        double custo_unitario = 0.0;

        if (opc == 1) {
            for (int i = 0; i < receita1.length; i++) {
                qtd = receita1[i][0];
                vlr = receita1[i][1];
                rec = ingrediente_receita1[i];

                // conta custo unitario
                custo_ingrediente = (rec * vlr) / qtd;

                // adiciona o valor da conta na soma
                custo_receita = custo_receita + custo_ingrediente;
            }
        }
        if (opc == 2) {
            for (int i = 0; i < receita2.length; i++) {
                qtd = receita2[i][0];
                vlr = receita2[i][1];
                rec = ingrediente_receita2[i];

                // conta custo unitario
                custo_ingrediente = (rec * vlr) / qtd;

                // adiciona o valor da conta na soma
                custo_receita = custo_receita + custo_ingrediente;
            }

        }

        if (opc == 3) {
            for (int i = 0; i < receita3.length; i++) {
                qtd = receita3[i][0];
                vlr = receita3[i][1];
                rec = ingrediente_receita3[i];

                // conta custo unitario
                custo_ingrediente = (rec * vlr) / qtd;

                // adiciona o valor da conta na soma
                custo_receita = custo_receita + custo_ingrediente;
            }

        }

        custo_unitario = custo_receita / 15;
        System.out.printf("Qual o valor de venda do pote ? ");

        valor_venda = entrada.nextDouble();
        lucro_real = valor_venda - custo_unitario;
        lucro_porcent = (lucro_real / custo_unitario) * 100;

        if (custo_receita <= 30.0) {

            System.out.printf("A receita é viável !!");
            System.out.printf("O custo de cada bolo é : R$ %.2f", custo_unitario);
            System.out.printf("Lucro em dinheiro por unidade é : R$ %.2f\n", lucro_real);
            System.out.printf("Lucro em porcentagem é : %.2f %%\n", lucro_porcent);
        } else {

            System.out.println("A receita não é viável !!");
        }


        /*FIM Fase4_Etapa3 -------------------------------------------------------------------
         */
        //
        //
        //
        /* Fase5_Etapa1 (FINAL) -------------------------------------------------------------------
        
         Colocar todo o programa dentro de um laco e perguntar no final se deseja
         analisar outra receita.
         Se SIM:
         Volta para o início do programa
         Se Não:
         Encerra o programa.
        
         FIM Fase5_Etapa1 (FINAL) -------------------------------------------------------------------
         */
    }
}
