package View;

import Control.Add;
import java.util.Scanner;

public class PostoSaude {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op, op2;
        /*System.out.println("Add vacina\n");
        Add.addVacina();
        System.out.println("\nMostra vacinas\n");
        Add.mostraVacinas();
        System.out.println("\n metodo Vacinação\n");
        Add.addVacinacao();
        System.out.println("\nMetodo mostra vacinacoes");
        Add.mostraVacinacoes();*/

        do {

            System.out.println("_____ Posto de saúde _____\n");
            System.out.println("1 - Cadastrar paciente");
            System.out.println("2 - adicionar vacina à campanha");
            System.out.println("3 - Remover vacina da campanha");
            System.out.println("4 - Mostrar lista de vacinas do posto");
            System.out.println("5 - Mostar lista de vacinas tomadas");
            System.out.println("0 - Sair");
            System.out.print("Digite uma opção: ");
            op = sc.nextInt();
            System.out.println("");

            switch (op) {
                case 1: {
                    Add.addCidadao();
                    Add.addEndereco();

                    do {

                        System.out.println("\nDeseja adicionar vacina no cadastro do paciente ?");
                        System.out.println("1 - Sim");
                        System.out.println("2 - Não");
                        System.out.print("Digite uma opção: ");
                        op2 = sc.nextInt();

                        switch (op2) {
                            case 1: {
                                Add.addVacinacao();
                                break;
                                // Fazer controle pela periodicidade caso o usuário já tenha tomado a vacina
                            }        
                            default: {
                                System.out.println("Operação inválida\n");
                                break;
                            }
                        }
                    } while (op2 != 2);
                    break;
                }
                case 2: {
                    Add.addVacina();
                    break;
                }
                case 3: {
                    Add.removeVacina();
                    break;
                }
                case 4: {
                    Add.mostraVacinas();
                    break;
                }
                case 5: {
                    Add.mostrarCidadoes();
                    
                    do {

                        System.out.println("\nDeseja ver o registro de vacinas do paciente ?");
                        System.out.println("1 - Sim");
                        System.out.println("2 - Não");
                        System.out.print("Digite uma opção: ");
                        op2 = sc.nextInt();

                        switch (op2) {
                            case 1: {
                                Add.addVacinacao();
                                break;
                                // Fazer controle pela periodicidade caso o usuário já tenha tomado a vacina
                            }
                            case 2: {
                                op2 = 0;
                                break;
                            }
                            default: {
                                System.out.println("Operação inválida\n");
                                break;
                            }
                        }
                    } while (op2 != 2);
                    
                    Add.mostraVacinacoes();
                    break;
                }
                default: {
                    System.out.println("Operação inválida\n");
                    break;
                }
            }
        } while (op != 0);
    }

}
