package PostoSaude;

import Model.Add;
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
            System.out.println("REMOVER VACINA");
            System.out.println("3 - Mostrar lista de vacinas do posto");
            System.out.println("4 - Mostar lista de vacinas tomadas");
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
                    } while (op2 != 0);
                    break;
                }
                case 2: {
                    Add.addVacina();
                    break;
                }
                case 3: {
                    Add.mostraVacinas();
                    break;
                }
                case 4: {
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
