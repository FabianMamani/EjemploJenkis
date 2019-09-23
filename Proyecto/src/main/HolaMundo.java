package main;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double area;
		double per=1;
		System.out.println("Ingrese el area del cuadrado: ");
		area = entrada.nextDouble();
		per = Math.sqrt(area);
		per= per*4;
		System.out.println(per);
	}

}
