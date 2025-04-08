package entities;

public class Rectangle {
	
	
	public double width;
	public double height;
	
	
	
	public double area() {	
		
		return width*height;
	}
	
	public double perimeter(){
		
		
		return (width*2)+(height*2);
	}
	
	public double diagonal() {
		
		return Math.sqrt(Math.pow(width,2)+ Math.pow(height,2 ));
	}
	
	
	public String ToString(){
		
		
		return "AREA:"+String.format("%.2f", area())+" PERIMETER:"+String.format("%.2f",perimeter())+" Diagonal:"+String.format("%.2f",diagonal());
	}
	
	

}
