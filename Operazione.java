package eredit;
import  java.io.InputStream;
public class Operazione extends ContoBancario {

	public String operazione;
	public  int option;
	
	public Operazione(float saldo, String iban, int option) {
		super(saldo, iban); //masterclass costruttore
		this.option=option;
		
		
		
	}
	
	
	public void PrelevaDenaro(float qnt) {
		saldo-=qnt;
	}
		
	public void SvuotaConto() {
			saldo=0;
			
			
		}
		
		public void VersaDenaro(float versa) {
			saldo+=versa;
			
			
		}
		
		public float SituazioneConto() {
			return this.saldo;
			
			
		}
		
		public String Bonifico(ContoBancario x, float trasferimento) {
			
			saldo+=trasferimento;
			
			x.saldo-=trasferimento;
			
			return "TRASFERIMENTO AVVENUTO CON SUCCESSO";
			
		}
			
				
		
		
	
	
		
	public void esegui(int option) {
		switch (option) {
			case 1:
				System.out.print("quanto vuoi prelevare?");
				java.util.Scanner input=new java.util.Scanner(System.in);
				
				float qnt=input.nextFloat();
				PrelevaDenaro( qnt);
				break;
			case 2:
				SvuotaConto();
				break;
			case 3:
				System.out.print("quanta grana?");
				java.util.Scanner inputVersa=new java.util.Scanner(System.in);
				
				float versa=inputVersa.nextFloat();
				VersaDenaro( versa);
				break;
			case 4:
				float situa=SituazioneConto();
				System.out.println("SALDO ATTUALE: "+situa);
				break;
			case 5:
				System.out.println("quanto vuoi farti inviare?");
				java.util.Scanner inputTrans=new java.util.Scanner(System.in);
				float tras=inputTrans.nextFloat();
				
				
				System.out.println("quando saldo ha  il mittente?");
				java.util.Scanner inputConto=new java.util.Scanner(System.in);
				float conto=inputConto.nextFloat();
				
				System.out.println("inserisci il suo iban quindi:");
				java.util.Scanner inputContoIban=new java.util.Scanner(System.in);
				String ibanc=inputContoIban.nextLine();
				ContoBancario a =new ContoBancario(conto, ibanc);
				
				Bonifico( a, tras);
				break;
			default:
				System.out.println("PER FAVORE RE INSERIRE L'OPZIONE");
				break;
		}
		

	
		

}
 public static void main(String[] args) {
	 Operazione x=new Operazione(0,"IT342432253433235", 3);
	 System.out.print("BENVENUTO NEL TUO CONTO SAPIENZA! SCEGLI UN OPZIONE TRA :\n1)preleva \n2)svuota tutto il conto"
	 		+ "\n3)versa la grana\n4)controlla il tuo saldo\n5) effettua un bonifico\n");
	 int conto;
	 String risposta;
	 String ancora="si";
	 java.util.Scanner opzconto=new java.util.Scanner(System.in);
	 while (ancora.equals("si")) {
		 System.out.print("Inserisci un opzione:");
		 conto=opzconto.nextInt();
		 x.esegui(conto);
		 System.out.print("vuoi effettaure un'altra operazione?");
		 java.util.Scanner again=new java.util.Scanner(System.in);
		 ancora=again.next().toString();
		 
    
	 
 }
	System.out.println("SALVE  E BUONA GIORNATA!");
}
}
