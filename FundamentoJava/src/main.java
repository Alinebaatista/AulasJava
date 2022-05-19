import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		//int x = 100;
		//double y = 200.3;
//		//short z = (short) 10000;
//		
//		int a = 0;
//		double b = 0;
//		
//		a= (int) y; //Casting ExplÃ­cito, VocÃª dizer para o eclipseque assume a responsabilidade por perder informaÃ§Ã£o.
//		b= x; //Casting(escalaÃ§Ã£o) implÃ­cito, consegur passar o conteudo de uma variÃ¡vel para outra sem perder nenhum dado.
//		//Aqui vocÃª nÃ£o perderÃ¡ informaÃ§Ã£o,
//		
//		System.out.println(z);
//		System.out.println(b);
//		System.out.println(a);
		
//		int idadepessoa = 60;
//		
//		if (idadepessoa < 18) {
//			
//		System.out.println("VocÃª nÃ£o pode beber");
//		}
//			
//		
//		else if(idadepessoa < 60) { //Pode fazer quantas condiÃ§Ãµes quiser
//			System.out.println("Bora tomar uma!");
//		}
//		else {
//			System.out.println("Quanto Ã© a aposentadoria?");
//		}
//		
//		System.out.println("VocÃª tem " + idadepessoa + " anos");
//		
		
//		int num = 8;
//		
//		switch (num) {
//			
//		case 1:
//			System.out.println("Domingo"); //O break Ã© aquele que vai barrar 
//			break;
//		case 2:
//			System.out.println("Segunda-feira");
//			break;
//		case 3:
//			System.out.println("TerÃ§a-feira");
//			break;
//		case 4:
//			System.out.println("Quarta-feira");
//			break;
//		case 5:
//			System.out.println("Quinta-feira");	
//			break;
//		default:		 //Funciona como um else, caso nenhum dos casos for encontrados
//			System.out.println("Esse nÃºmero nÃ£o representa um dia da semana.");
//		}
		
		
//		char caractere = 'a';		//String Ã© um conjunto de caractere //Caso vocÃª coloque outro valor alÃ©m do declarado para variÃ¡vel, vai dar erro.
//		
//		switch (caractere) {
//			case 'a':
//				System.out.println("Seu caractere Ã© a ");
//				break;
//			case 'b':
//				System.out.println("Seu caractere Ã© b ");
//				break;
//			default:
//			System.out.println("Valor invÃ¡lido");
//		
//		
//		}
		
//		String farol = "verde";
//		
//		 switch (farol) { //switch Ã© o ESCOLHA CASO
//		 
//		 case "verde":
//			 System.out.println("ACELERA");
//			 break;
//		 case "amarelo":
//			 System.out.println("Calma e atenÃ§Ã£o");
//			 break;
//		 case "vermelho":
//			 System.out.println("Pare!");	 
//			 break;
//		default:
//			System.out.println("Valor invÃ¡lido!");
//		 
//		 }
		
		
//		int x=0;
//		while(x<10) { //Tudo que retornar verdadeiro ou falso Ã© possÃ­vel ser colocado / //While Ã© o ENQUANTO
//			 System.out.println(x); //Testa primeiro e depois faz
//			 x = x+1; //x ++; 	
//		}
//				
//		
//		x=0;
//		 do { //Faz primeiro e depois se for verdadeiro, repete
//			 System.out.println(x);
//			 x=x+1; 
//		 }while (x<10);
//		
// System.out.println(x);
//		Scanner entrada = new Scanner(System.in);
//		 
//		 
//		for(int x=0; x<10; x++) { // se você criar a variÃ¡vel aqui dentro, ela sÃ³ existe aqui dentro
//			System.out.println(x); //""Conte de 0 a 10""
//		}
		// x++ Significa: "Pega o valor que estÃ¡ aqui dentro, adiciona 1" | "se quiser adicionar mais Ã© x+=2" funciona tambÃ©m com * (multiplicar)
		// | 1= valor da variÃ¡vel | 2= valor condicional | 3= incremento|
		
//		Scanner a = new Scanner(System.in);
//		
//		System.out.println("Digte o numero da tabuada que você deseja:");
//		 int x = a.nextInt();
//		
//		
//		for (int y=x; y==x*10; y+=x) {
//
//			System.out.println(y);
//		}
//		
//		
//	}	
//	
//		// ARRAY Matrix = tabela
//	//
//		int x1 = 3;
//		int z1 = 6;
//		int y1 = 10;
//		int m1 = 15;
//
//		System.out.println(x1);
//		System.out.println(y1);
//		System.out.println(z1);
//		System.out.println(m1);
//
//		double x[] = { 3, 6, 10, 15 };
//
//		for(
//		int aux = 0;aux<x.length;aux++)
//		{
//			System.out.println("Valor do Indice " + aux + " = " + x[aux]);
//		}
//
//		String nome[] = { "Aline", "Mariana", "Willian" };
//
//		for(
//		int aux = 0;aux<nome.length;aux++)
//		{
//			System.out.println(nome[aux]);
//			if (nome[aux] == "Willian")
//				;
//			System.out.println("O indice do willian " + aux);
//		}

//		int[] arrayInt = new int[5];
//		String[] arrayString = new String[4];
//		double[] arraydouble = new double[3];
//
//		arrayInt[3]=4;
//
//		int[] numero = new int[6];
//		Scanner teclado = new Scanner(System.in);
//
//		for(
//		int aux1 = 0;aux1<numero.length;aux1++)
//		{
//			System.out.println("Digite um nÃºmero qualquer ");
//			numero[aux1] = teclado.nextInt();
//
//		}for(
//		int aux2 = 0;aux2<numero.length;aux2++)
//		{
//			System.out.println("Indice" + aux2 + "=" + numero[aux2]);
//		}
//
//		}}

		int[] arrayQualquer = new int[3];
		Object[] arrayObject = new Object[6];

		arrayObject[0] = 12;
		arrayObject[1] = "Rafael";
		arrayObject[2] = 13.40;
		arrayObject[3] = true;
		arrayObject[5] = arrayQualquer;

		for (int aux2 = 0; aux2 < arrayQualquer.length; aux2++) {
			System.out.print("Indice " + aux2 + " = " + arrayObject[aux2]);

		}
		int[][] arrayBidirecional = new int[4][3];

		arrayBidirecional[0][0] = 8;
		arrayBidirecional[2][1] = 1;

		for (int linha = 0; linha < arrayBidirecional.length; linha++) {
			for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) {
				System.out.print(" Indice [" +linha+ "] [" +coluna+ "] = " + arrayBidirecional[linha][coluna] + " ");
						

			}
			System.out.println();
		}

	}
	

		
	}




