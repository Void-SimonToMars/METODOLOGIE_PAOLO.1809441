package eredit;
import java.lang.StringBuilder;



public class BarraDiEnergia {
	public int barra;
	public StringBuilder barToString=new StringBuilder();
	
	public int incremento;
	
	
	
	public BarraDiEnergia(int barra, int incremento) {
		this.barra=barra;
		this.incremento=incremento;
		
	}	
	
	public StringBuilder getBarToString() {
		return barToString;
	}
	
	
	
	public StringBuilder setbar() {
		barToString.setLength(0);
		for(int i=0;i<barra;i++) {
			barToString.append("=");
		}
		return barToString;
		
		}
	
	
	
	
	public void incrementa() {
		incremento++;
		
		}
	
	public String toString() {
		StringBuilder barToString=setbar();
		if(incremento>barToString.length()) return "MASSIMA POTENZA!";
		for(int i=0;i<incremento;i++) {
			barToString.setCharAt(i,'O');
		}
		
		return barToString.toString();
			
		
				
		
		
	}
		
public static void main(String[] args) {
	BarraDiEnergia a=new BarraDiEnergia(5,0);
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
	a.incrementa();
	System.out.println(a.toString());
}
	
}




