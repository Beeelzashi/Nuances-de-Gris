package ihm;



import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
/**
 * 
 * @author Julien
 *
 */
public class Grey {
	private final double REDL = 5.0;
	private final double BLUEL = 15.0;
	private final double GREENL = 5.0;

	private double red ; 
	private double green; 
	private double blue;
	private double grey;


	//constrcteur
	public Grey (double r , double g , double b) {
		this.red = r;
		this.green = g;
		this.blue = b;
		//couleur de gris allant de 0 a 255 
		this.grey = 0.3 * this.red + 0.59 * this.green + 0.11 * this.blue; 
	}
	public Grey (ColorPicker cp) {
		Color c = cp.getValue();
		this.red = c.getRed();
		this.green = c.getGreen();
		this.blue = c.getBlue();
		//couleur de gris allant de 0 a 255 
		this.grey = 0.3 * this.red + 0.59 * this.green + 0.11 * this.blue; 
	}



	public double getRed() {
		return red;
	}

	public void setRed(double red) {
		this.red = red;
	}

	public double getGreen() {
		return green;
	}

	public void setGreen(double green) {
		this.green = green;
	}

	public double getBlue() {
		return blue;
	}

	public void setBlue(double blue) {
		this.blue = blue;
	}

	// pour voir la couleur la moin présente dans et renvoiyer la nouvelle couleur

	public Grey  colorLess () {

		if(this.red <= 1.0) {
			this.red = this.red*255;
		}
		if(this.blue <= 1.0) {
			this.blue = this.blue*255;
		}
		if(this.green<= 1.0) {
			this.green = this.green*255;
		}

		double [] sorting = new double[] {this.red, this.blue, this.green};

		double newR = 0.0; 
		double newG = 0.0; 
		double newB = 0.0;
		double tmp ;

		if(sorting[1] <= sorting[0]) {
			tmp =  sorting[1];
			sorting[1]= sorting[0];
			sorting[0]= tmp;	
		}
		if(sorting[2] <= sorting[1]) {
			tmp =  sorting[2];
			sorting[2]= sorting[1];
			sorting[1]= tmp;
		}
		if(sorting[1] <= sorting[0]) {
			tmp =  sorting[1];
			sorting[1]= sorting[0];
			sorting[0]= tmp;
		}

		//si il y en a un au moin a 0 
		if(this.red == 0.0 || this.blue==0.0 || this.green==0.0) {
			if(sorting[0] == 0.0 && sorting[0]== this.red) {
				if(sorting[1] == 0.0 && sorting[1] ==this.green ) {
					//modifier le bleu
					if(this.blue < BLUEL) {
						newB = 0.0;
					}else {
						newB = this.blue - BLUEL;
					}
					newR = this.red; 
					newG = this.green;

				}else if(sorting[1] ==this.green ) {
					//modifier le vert
					if(this.green < GREENL) {
						newG = 0.0;
					}else {
						newG = this.green - GREENL;
					}
					newB = this.blue;
					newR = this.red; 
				}else if(sorting[1] == 0.0 && sorting[1] ==this.blue ) {
					//modifier le vert
					if(this.green < GREENL) {
						newG = 0.0;
					}else {
						newG = this.green - GREENL;
					}
					newB = this.blue;
					newR = this.red; 
				}else if(sorting[1] ==this.blue ) {
					//modifier le bleu
					if(this.blue < BLUEL) {
						newB = 0.0;
					}else {
						newB = this.blue - BLUEL;
					}
					newR = this.red; 
					newG = this.green;
				}
			}else if(sorting[0] == 0.0 && sorting[0]== this.blue) {
				if(sorting[1] == 0.0 && sorting[1] ==this.green ) {
					//modifie le rouge
					if(this.red < REDL) {
						newR = 0.0; 
					}else {
						newR = this.red - REDL; 
					}
					newB = this.blue;
					newG = this.green;

				}else if(sorting[1] ==this.green ) {
					//modifier le vert
					if(this.green < GREENL) {
						newG = 0.0;
					}else {
						newG = this.green - GREENL;
					}
					newB = this.blue;
					newR = this.red; 
				}else if(sorting[1] == 0.0 && sorting[1] ==this.blue ) {
					//modifier le vert
					if(this.green < GREENL) {
						newG = 0.0;
					}else {
						newG = this.green - GREENL;
					}
					newB = this.blue;
					newR = this.red; 
				}else if(sorting[1] ==this.blue ) {
					//modifie le rouge
					if(this.red < REDL) {
						newR = 0.0; 
					}else {
						newR = this.red - REDL; 
					}
					newB = this.blue;
					newG = this.green;
				}
			}else if(sorting[0] == 0.0 && sorting[0]== this.green) {
				if(sorting[1] == 0.0 && sorting[1] ==this.red ) {
					//modifier le bleu
					if(this.blue < BLUEL) {
						newB = 0.0;
					}else {
						newB = this.blue - BLUEL;
					}
					newR = this.red; 
					newG = this.green;

				}else if(sorting[1] ==this.red ) {
					//modifie le rouge
					if(this.red < REDL) {
						newR = 0.0; 
					}else {
						newR = this.red - REDL; 
					}
					newB = this.blue;
					newG = this.green;
				}else if(sorting[1] == 0.0 && sorting[1] ==this.blue ) {
					//modifie le rouge
					if(this.red < REDL) {
						newR = 0.0; 
					}else {
						newR = this.red - REDL; 
					}
					newB = this.blue;
					newG = this.green;
				}else if(sorting[1] ==this.blue ) {
					//modifier le bleu
					if(this.blue < BLUEL) {
						newB = 0.0;
					}else {
						newB = this.blue - BLUEL;
					}
					newR = this.red; 
					newG = this.green;
				}
			}
		}else {
			if(sorting[0]== this.red) {
				//modifie le rouge
				if(this.red < REDL) {
					newR = 0.0; 
				}else {
					newR = this.red - REDL; 
				}
				newB = this.blue;
				newG = this.green;
			}else if(sorting[0]== this.blue) {
				//modifier le bleu
				if(this.blue < BLUEL) {
					newB = 0.0;
				}else {
					newB = this.blue - BLUEL;
				}
				newR = this.red; 
				newG = this.green;
			}else if(sorting[0]== this.green) {
				//modifier le vert
				if(this.green < GREENL) {
					newG = 0.0;
				}else {
					newG = this.green - GREENL;
				}
				newB = this.blue;
				newR = this.red; 
			}
		}

		Grey g1 = new Grey(newR, newG, newB);

		return g1;

	}
	
	public Grey  colorMore () {

		if(this.red <= 1.0) {
			this.red = this.red*255;
		}
		if(this.blue <= 1.0) {
			this.blue = this.blue*255;
		}
		if(this.green<= 1.0) {
			this.green = this.green*255;
		}

		double [] sorting = new double[] {this.red, this.blue, this.green};

		double newR = 0.0; 
		double newG = 0.0; 
		double newB = 0.0;
		double tmp ;

		if(sorting[1] <= sorting[0]) {
			tmp =  sorting[1];
			sorting[1]= sorting[0];
			sorting[0]= tmp;	
		}
		if(sorting[2] <= sorting[1]) {
			tmp =  sorting[2];
			sorting[2]= sorting[1];
			sorting[1]= tmp;
		}
		if(sorting[1] <= sorting[0]) {
			tmp =  sorting[1];
			sorting[1]= sorting[0];
			sorting[0]= tmp;
		}

		//si il y en a un au moin a 0 
		if(this.red == 255.0 || this.blue==255.0 || this.green==255.0) {
			if(sorting[2] == 255.0 && sorting[2]== this.red) {
				if(sorting[1] == 255.0 && sorting[1] ==this.green ) {
					//modifier le bleu
					if(this.blue > 255 - BLUEL) {
						newB = 255.0;
					}else {
						newB = this.blue + BLUEL;
					}
					newR = this.red; 
					newG = this.green;

				}else if(sorting[1] ==this.green ) {
					//modifier le vert
					if(this.green > 255 - GREENL) {
						newG = 255;
					}else {
						newG = this.green + GREENL;
					}
					newB = this.blue;
					newR = this.red; 
				}else if(sorting[1] == 255.0 && sorting[1] ==this.blue ) {
					//modifier le vert
					if(this.green > 255 - GREENL) {
						newG = 255.0;
					}else {
						newG = this.green + GREENL;
					}
					newB = this.blue;
					newR = this.red; 
				}else if(sorting[1] == this.blue ) {
					//modifier le bleu
					if(this.blue > 255 - BLUEL) {
						newB = 255.0;
					}else {
						newB = this.blue + BLUEL;
					}
					newR = this.red; 
					newG = this.green;
				}
			}else if(sorting[2] == 255.0 && sorting[2]== this.blue) {
				if(sorting[1] == 255.0 && sorting[1] ==this.green ) {
					//modifie le rouge
					if(this.red > 255 - REDL) {
						newR = 255.0; 
					}else {
						newR = this.red + REDL; 
					}
					newB = this.blue;
					newG = this.green;

				}else if(sorting[1] ==this.green ) {
					//modifier le vert
					if(this.green > 255 - GREENL) {
						newG = 255.0;
					}else {
						newG = this.green + GREENL;
					}
					newB = this.blue;
					newR = this.red; 
				}else if(sorting[1] == 255.0 && sorting[1] ==this.blue ) {
					//modifier le vert
					if(this.green > 255 - GREENL) {
						newG = 255.0;
					}else {
						newG = this.green + GREENL;
					}
					newB = this.blue;
					newR = this.red; 
				}else if(sorting[1] ==this.blue ) {
					//modifie le rouge
					if(this.red > 255 - REDL) {
						newR = 255.0; 
					}else {
						newR = this.red + REDL; 
					}
					newB = this.blue;
					newG = this.green;
				}
			}else if(sorting[2] == 255.0 && sorting[2]== this.green) {
				if(sorting[1] == 255.0 && sorting[1] ==this.red ) {
					//modifier le bleu 
					if(this.blue > 255 - BLUEL) {
						newB = 255.0;
					}else {
						newB = this.blue + BLUEL;
					}
					newR = this.red; 
					newG = this.green;

				}else if(sorting[1] ==this.red ) {
					//modifie le rouge
					if(this.red > 255 - REDL) {
						newR = 255.0; 
					}else {
						newR = this.red + REDL; 
					}
					newB = this.blue;
					newG = this.green;
				}else if(sorting[1] == 255.0 && sorting[1] ==this.blue ) {
					//modifie le rouge
					if(this.red > 255 - REDL) {
						newR = 255.0; 
					}else {
						newR = this.red - REDL; 
					}
					newB = this.blue;
					newG = this.green;
				}else if(sorting[1] ==this.blue ) {
					//modifier le bleu
					if(this.blue > BLUEL) {
						newB = 255.0;
					}else {
						newB = this.blue + BLUEL;
					}
					newR = this.red; 
					newG = this.green;
				}
			}
		}else {
			if(sorting[2]== this.red) {
				//modifie le rouge
				if(this.red > 255 - REDL) {
					newR = 255.0; 
				}else {
					newR = this.red + REDL; 
				}
				newB = this.blue;
				newG = this.green;
			}else if(sorting[2]== this.blue) {
				//modifier le bleu
				if(this.blue > 255 - BLUEL) {
					newB = 255.0;
				}else {
					newB = this.blue + BLUEL;
				}
				newR = this.red; 
				newG = this.green;
			}else if(sorting[2]== this.green) {
				//modifier le vert
				if(this.green > 255 - GREENL) {
					newG = 255.0;
				}else {
					newG = this.green + GREENL;
				}
				newB = this.blue;
				newR = this.red; 
			}
		}

		Grey g1 = new Grey(newR, newG, newB);

		return g1;

	}

	//recherche une couleur de type Grey a partir d'une valeur de grey
	public static Grey colorSearcher(double grey) {
		int Ngrey = 0;
		Ngrey = (int)(grey*255);
		for(int i = 255 ; i > 0; i-- ) {
			for(int j = 255 ; j >0 ; j-- ) {
				for(int k = 255 ; k > 0; k-- ) {
					if (Ngrey == calculGrey(i, j, k)){
						System.out.println("Solution r :"+ i+" g :"+j+ " b :"+k);
						return new Grey(i, j, k);

					}else {

					}
				}
			}
		}
		return null;
	}


	//renvois les poposition de couleur
	public Grey[] ListGreyLess() {
		Grey[] gL = new Grey[5];
		gL[0] = this.colorLess();
		for(int i = 1 ; i < 5 ; i++) {
			if(gL[i-1].grey < 100.0) {
				gL[i] = gL[i-1].colorMore();
			}else{
				gL[i] = gL[i-1].colorLess();
			}
			
		}
		for(int i =0;i<5;i++) {
			gL[i].red=gL[i].red/255;
			gL[i].green=gL[i].green/255;
			gL[i].blue=gL[i].blue/255;
		}
		return gL;
	}

	//Faire une Map avec un nb couleur et la nuance de gris associ� apres on fait un sort et on regarde la diff�rence entre i et i-1 
	//et tant que il y a un ecart pas sup�rieur a 10 imaginons on continue a choisir des couleur



	public static Map<Integer, Grey>PutInListSorted (ColorPicker cp1, ColorPicker cp2, ColorPicker cp3, ColorPicker cp4 ,ColorPicker cp5, ColorPicker cp6 , ColorPicker cp7, ColorPicker cp8, ColorPicker cp9, ColorPicker cp10){
		Grey g1 = new Grey(cp1);
		Grey g2 = new Grey(cp2);
		Grey g3 = new Grey(cp3);
		Grey g4 = new Grey(cp4);
		Grey g5 = new Grey(cp5);
		Grey g6 = new Grey(cp6);
		Grey g7 = new Grey(cp7);
		Grey g8 = new Grey(cp8);
		Grey g9 = new Grey(cp9);
		Grey g10 = new Grey(cp10);

		Map<Integer, Grey> m1 = new HashMap<>();
		if(cp1.getValue() != Color.WHITE) {
			m1.put(1,g1);
		}
		if(cp2.getValue() != Color.WHITE) {
			m1.put(2,g2);
		}
		if(cp3.getValue() != Color.WHITE) {
			m1.put(3,g3);
		}
		if(cp4.getValue() != Color.WHITE) {
			m1.put(4,g4);
		}
		if(cp5.getValue() != Color.WHITE) {
			m1.put(5,g5);
		}
		if(cp6.getValue() != Color.WHITE) {
			m1.put(6,g6);
		}
		if(cp7.getValue() != Color.WHITE) {
			m1.put(7, g7);
		}
		if(cp8.getValue() != Color.WHITE) {
			m1.put(8,g8);
		}
		if(cp9.getValue() != Color.WHITE) {
			m1.put(9,g9);
		}
		if(cp10.getValue() != Color.WHITE) {
			m1.put(10,g10);
		}

		return m1;
	}

	//renvois les couleur nb avec une erreur  et l'endroit dans la map ou il y a l'ereur
	public static List<Integer> errorlist (Map<Integer, Grey> m1){
		List<Integer> res = new ArrayList<Integer>(); 

		ListSorted l1 = new ListSorted(m1);
		System.out.println(l1.getLs());
		System.out.println(l1.getSorter());

		System.out.println("\n\n Proposition\n");


		List<Boolean> sort = l1.getSorter();
		for(int i = 0 ; i < m1.size()-1; i++) {
			if(sort.get(i) == false) {
				for (Entry<Integer, Grey> entry : m1.entrySet()) {
					if (entry.getValue().getGrey().equals(l1.getLs().get(i))) {
						res.add(entry.getKey());
					}
				}
			}
		}
		return res;
	}

	//tjr mettre pgrandfalse en parametre et son grey associé
	//ne pas oubliler de mettre le dans la list l'element modifier

	public static void changeMap(int i, Map<Integer, Grey>m) {
		Grey g = m.get(i);
		g = colorSearcher(g.grey-0.05);
		m.replace(i, g);
	}



	public static void verifGreatColor(Map<Integer, Grey> m) {
		List <Integer> ban = errorlist(m);
		ListSorted l = new ListSorted(m);

		if(ban != null) {
			for(Integer res = ban.size()*-1; res > 0; res--) {
				l = new ListSorted(m, ban);


				changeMap(ban.get(res), m);
				ban.remove(res);
				ban = errorlist(m);
			}
		}

	}






	@Override
	public String toString() {
		return "Grey [red=" + this.red + ", green=" + this.green + ", blue=" + this.blue + ", grey=" + grey + "]";
	}

	public static double calculGrey(int r, int g, int b) {
		return 0.3 * r + 0.59 * g + 0.11 * b; 
	}
	public Double getGrey() {
		return grey;
	}


}
