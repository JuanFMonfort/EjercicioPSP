import java.util.*;
public class DNI {
	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		int num;
		String letra;
		
		
		System.out.println("Cual es el numero del DNI.");
		num=lector.nextInt();
		lector.nextLine();
		System.out.println("Cual es la letra.");
		letra=lector.nextLine();
		
		if (comprovacion(num, letra)) {
			System.out.println("El DNI es valido.");
		} else {
			System.out.println("El DNI no es valido.");
		}
		
	}

	public static boolean comprovacion(int num, String letra) {
		int resto;
		resto=num%23;
		switch (resto) {
		case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: case 22:
			if (letra.equals("T")&&(resto==0)||letra.equals("R")&&(resto==1)||letra.equals("W")&&(resto==2)||letra.equals("A")&&(resto==3)||letra.equals("G")&&(resto==4)||letra.equals("M")&&(resto==5)||letra.equals("Y")&&(resto==6)||letra.equals("F")&&(resto==7)||letra.equals("P")&&(resto==8)||letra.equals("D")&&(resto==9)||letra.equals("X")&&(resto==10)||letra.equals("B")&&(resto==11)||letra.equals("N")&&(resto==12)||letra.equals("J")&&(resto==13)||letra.equals("Z")&&(resto==14)||letra.equals("S")&&(resto==15)||letra.equals("Q")&&(resto==16)||letra.equals("V")&&(resto==17)||letra.equals("H")&&(resto==18)||letra.equals("L")&&(resto==19)||letra.equals("C")&&(resto==20)||letra.equals("K")&&(resto==21)||letra.equals("E")&&(resto==22)) {
				return true;
			}else 
				return false;
			
			
		default:
			return false;
			
		}
		
	}
	
}

