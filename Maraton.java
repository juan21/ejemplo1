package unidad1;

public class Maraton {
		static String nombres [] = {
			"Luis contreras","john Lewis", "pedro picapiedra","pablo marmol", "Armando hoyos",
			"Flash Gordon","Tony Montana","luis miguel","Marco antonio solis","Dora",
			"hanna monthana","Maria Mercedes","Hilary Duff","Maria Elena","Carlos Mendoza","Poul McCarney",
			"LuzElena","Brenda Herrera","Luis Aguilar","Pedro Infante"
		};
		static double []tiempos ={
			
	2.35,2.22,220,2.40,2.05,2.01,2.25,1.05,0.18,4.06,2.56,0.13,2.30,2.45,2.76,2.09,2.06,0.04,2.07,0.16
		};
		public static void main(String[] args) {
			int posp= 0, poss= 1, post= 2, postc= 3;
			for (int i=1;i<nombres.length;i++){
				if (tiempos[i]<tiempos[posp]){
					poss=posp;
					posp=i;
				}
			}
			System.out.println("Primer lugar: " + nombres[posp]+
					"con un tiempo de "+tiempos[posp]);
			System.out.println("Segundo lugar: " + nombres[poss]+
					"con un tiempo de "+tiempos[poss]);
		    System.out.println("Tercer lugar: " + nombres[post]+
			"con un tiempo de "+tiempos[post]);
			System.out.println("Cuarto lugar: " + nombres[postc]+
					"con un tiempo de " + tiempos[postc]);
		}

	}
