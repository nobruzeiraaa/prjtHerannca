package prjtHeran�a;
import java.util.Scanner;
public class Poupanca extends Conta {
	
	public double rendimento;
	public int diaAniversario;

		public static void main(String[] args) {
			Scanner in = new Scanner (System.in);
			Conta cont = new Conta ();
			
			int operacao;
			int resp = 0;
			
			System.out.print("Informe seu nome: ");
			cont.setNome(in.next());
			System.out.print("Digite seu saldo: R$");
			cont.setSaldo(in.nextDouble());
			System.out.print("Seu limite �: R$" + cont.getLimite()+"\n");
			
			
			
			do {
			System.out.println("Bem vindo "+cont.getNome()+"!! \nComo podemos ajudar? \n1 - Dep�sito \n2 - Saque \n3 - Saldo");
			operacao = in.nextInt();
			
			
				switch (operacao) {
				case 1:
					System.out.print("Informe o valor para dep�sito: ");
					cont.setDepositarValor(in.nextDouble());
					
					System.out.print("Deseja continuar? \n1 - SIM \n2 - N�O");
					resp = in.nextInt();
					break;
					
				case 2:
					System.out.print("Informe o valor para saque: ");
					cont.setRetirarValor(in.nextDouble());
					
					System.out.print("Deseja continuar? \n1 - SIM \n2 - N�O");
					resp = in.nextInt();
					break;
					
				case 3:
					System.out.print("Seu saldo �: R$"+cont.exibirSaldo()+ "\nSeu limite �: R$" +cont.getLimite()+"\n");
					System.out.print("Deseja continuar? \n1 - SIM \n2 - N�O");
					resp = in.nextInt();
					break;
				}
				
			}while (resp == 1); 
		}

	}



