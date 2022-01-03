import java.util.Scanner;

public class invertendoPalavras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
				
		//String inv = inverter("gato preto");
		//System.out.println(inv);
		
		System.out.println("Digite a frase/palavra que você deseja inverter: ");
		String inv = sc.nextLine();
		System.out.println("");
		String inve = inverter(inv);
		System.out.println("A frase/palavra que você digitou, invertida fica assim: "+inve);
		
		
		sc.close();

	}

	public static String inverter(String s) {
		char[] frase = new char[s.length()];
		
		 int indexFrase = 0;
		 for(int i = s.length() - 1; i>= 0; i--) {
			 frase[indexFrase] = s.charAt(i);
			 indexFrase++;
		 }
		 
		 String inverter = "";
		 for (int i =0; i<s.length(); i++) {
			 inverter = inverter + frase[i];
		 }
		 
		 return inverter;
		 
	}
	
}
