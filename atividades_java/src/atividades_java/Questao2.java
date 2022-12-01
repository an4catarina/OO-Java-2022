package atividades_java;
import java.util.Scanner; //leitura de dados

public class Questao2 {
    public static void main(String[] args) {
        int dia;
        int mes;
        int ano;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o dia:\n");    
        dia = ler.nextInt();
        System.out.print("Digite o mes:\n");
        mes = ler.nextInt();
        System.out.print("Digite o ano:\n");
        ano = ler.nextInt();
        ler.close();
        if(mes >= 1 && mes <= 12) {
        // Data Válida
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10|| mes == 12) {
                if(dia >= 1 && dia <= 31) {
                    System.out.println("Data Válida. A data digitada foi: " + dia + "/" + mes+ "/" + ano);
                } else {
                    // Dia inválido
                    System.out.println("Data Inválida");
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if(dia >= 1 && dia <= 30) {
                	System.out.println("Data Válida. A data digitada foi: " + dia + "/" + mes+ "/" + ano);
                } else {
                    // Dia inválido
                    System.out.println("Data Inválida");
                }
            } else if (mes == 2) {
            	if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {
            		if (dia >= 1 && dia <= 29) {
            			System.out.println("Data Válida. A data digitada foi: " + dia + "/" + mes+ "/" + ano);
            		} else if (dia >= 30){
            			System.out.println("Data Inválida");
                	}
            } else {
            	if (dia >= 1 && dia <= 28) {
        			System.out.println("Data Válida. A data digitada foi: " + dia + "/" + mes+ "/" + ano);
        		} else {
        			
        		}
            }
            }
        } else {
            // Mes invalido
            System.out.println("Data Inválida");
        }
    }
}


//Altere o programa apresentado a seguir para que o usuário entre com o ano e o programa calcule se a data de fevereiro entrada é correta ou não. Para tanto, verifique se um ano é bissexto ou não. Lembrando que em anos bissextos, fevereiro possui 29 dias ao invés de 28.
//
//Para ser bissexto, o ano deve ser:
//
//O resto da divisão do ano por 4 é zero e o resto da divisão por 100 é diferente de zero OU
//O resto da divisão por 400 é igual a zero
//Caso a data seja válida a saída esperada é:
//
//Digite o dia:
//Digite o mes:
//Digite o ano:
//Data Válida. A data digitada foi: DIA/MES/ANO
//
//Caso a data seja inválida, a saída esperada é:
//
//Digite o dia:
//Digite o mes:
//Digite o ano:
//Data Inválida
//
//A seguir o código do programa a ser alterado:
//
//import java.util.Scanner; //leitura de dados
//
//public class ValidaData {
//    public static void main(String[] args) {
//        int dia;
//        int mes;
//        Scanner ler = new Scanner(System.in);
//        System.out.print("Digite o dia:\n");    
//        dia = ler.nextInt();
//        System.out.print("Digite o mes:\n");
//        mes = ler.nextInt();
//        if(mes >= 1 && mes <= 12) {
//        // Data Válida
//            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10|| mes == 12) {
//                if(dia >= 1 && dia <= 31) {
//                    System.out.println("Data Válida. A data digitada foi: " + dia + "/" + mes);
//                } else {
//                    // Dia inválido
//                    System.out.println("Data Inválida");
//                }
//            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
//                if(dia >= 1 && dia <= 30) {
//                System.out.println("Data Válida. A data digitada foi: " + dia + "/" + mes);
//                } else {
//                    // Dia inválido
//                    System.out.println("Data Inválida");
//                }
//            } else if (mes == 2) {
//                // Se o mês é fevereiro, é necessário saber se o ano é bissexto ou não, ou seja, se fevereiro tem 28 ou 29 dias.
//                System.out.println("Não é possível verificar a validade da data");
//            }
//        } else {
//            // Mes invalido
//            System.out.println("Data Inválida");
//        }
//    }
//}