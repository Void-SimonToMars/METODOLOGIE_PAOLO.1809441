package eredit;

public class BarraDiEnergiaConPercentuale extends BarraDiEnergia{
	
	public BarraDiEnergiaConPercentuale(int barra, int incremento) {
		super( barra,  incremento); //adesso la sottoclasse ha ereditato il costruttore
	}
	
	
	
	/* quello che vogliamo fare è andare e overridare il metodo toString lasciando tutto 
	 * uguale a prima per gli altri metodi
	 * 
	 */
	
	
	//overriding
	public String toString() {
		StringBuilder barToString=setbar();
		if(incremento>=barToString.length()) return "MASSIMA POTENZA AL 100%!";
		for(int i=0;i<incremento;i++) {
			barToString.setCharAt(i,'O');
		}
		
		return barToString.toString()+" "+(incremento*100)/barra+"%";
			
		
				
		
		
	}
	
public static void main(String[] args) {
	BarraDiEnergiaConPercentuale a=new BarraDiEnergiaConPercentuale(5,0);
	System.out.println(a.toString());
	
	
	
	a.incrementa();
	System.out.println(a.toString());
	a.incrementa();
	System.out.println(a.toString());
	a.incrementa();
	System.out.println(a.toString());
	a.incrementa();
	System.out.println(a.toString());
	a.incrementa();
	System.out.println(a.toString());

}
}
