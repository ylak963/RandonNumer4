package es.studium.Aleatorios4;

import java.util.Random;

public class Aleatorios4 {
	public static void main(String[] args)
	{
		{
			Random rnd = new Random();
			int i,x;

			for(i=1; i<10;i++)
			{
				//Saca numeros entre 2 y 6
				x=rnd.nextInt(5)+2;
				System.out.println(x);
			}
		}

	}

}
