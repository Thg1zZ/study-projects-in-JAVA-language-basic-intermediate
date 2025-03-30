package Mypackage;

public class SmartTv {

	boolean ligada=false;
	int canal =1;
	int volume =25;
	
	
	public void mudarCanal (int novoCanal) {
		
		canal=novoCanal;
	}
	
	public void aumentarVolume(){
		volume++; 
		//aumentando o volume em 1 
	 	
	} 
	
	public void diminuirVolume(){
		
		volume--;
   //diminuindo o volume -1.		
	}

		
		
	}


