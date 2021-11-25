package ihm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ListSorted {
	private List<Double> ls;
	private List<Boolean> sorter;
	private int pgrandfalse = 0; 
	

	public ListSorted (Map<Integer, Grey> m, List<Integer> ban){
		double verif= 0.0;
		this.ls  = new ArrayList <>();
		this.sorter = new ArrayList<Boolean>(Arrays.asList(new Boolean[m.size()-1]));
		Collections.fill(sorter, Boolean.TRUE);
		//mettre les grey dans une liste;
		for(Integer i = 1 ;  i < m.size()+1 ; i++) {
			//System.out.println(i+"a etait placer"+m.get(i));
			if(m.get(i) != null) {
				if(m.get(i).getGrey() > 1.0 ) {
					verif = 0.0;
					verif = (m.get(i).getGrey())/255;
					this.ls.add(verif);
				}else {
					this.ls.add(m.get(i).getGrey());
				}
			}
			
			
		}
		
		Collections.sort(this.ls);
		System.out.println(this.ls);
		for(int s = 0; s < sorter.size() ; s++) {
			if(sorter.size() == 1) {
				this.pgrandfalse = 0;
			}else {
				if(this.ls.get(s+1) - this.ls.get(s) < 0.1 ) {			
					sorter.set(s , false);
					//System.out.println(sorter);
					for(Integer banned : ban) {
						if(s == banned) {
							this.pgrandfalse = s;
							System.out.println(this.pgrandfalse);
						}
					}
				}else{
					sorter.set(s , true);
					//System.out.println(sorter);
				}	
			}		
		}
	}
	public ListSorted (Map<Integer, Grey> m){
		double verif= 0.0;
		this.ls  = new ArrayList <>();
		this.sorter = new ArrayList<Boolean>(Arrays.asList(new Boolean[m.size()-1]));
		Collections.fill(sorter, Boolean.TRUE);
		//mettre les grey dans une liste;
		for(Integer i = 1 ;  i < m.size()+1 ; i++) {
			//System.out.println(i+"a etait placer"+m.get(i));
			if(m.get(i).getGrey() > 1.0) {
				verif = 0.0;
				verif = (m.get(i).getGrey())/255;
				this.ls.add(verif);
			}else {
				this.ls.add(m.get(i).getGrey());
			}
			
		}
		
		Collections.sort(this.ls);
		System.out.println(this.ls);
		for(int s = 0; s < sorter.size() ; s++) {
			if(this.ls.get(s+1) - this.ls.get(s) < 0.05 ) {			
				sorter.set(s , false);
				//System.out.println(sorter);
				
		
						this.pgrandfalse = s;
	
		
				this.pgrandfalse = s;
				System.out.println(pgrandfalse);
			}else{
				sorter.set(s , true);
				//System.out.println(sorter);
			}		
		}
	}
	
	public List<Boolean> getSorter() {
		return this.sorter;
	}
	
	public List<Double> getLs(){
		return this.ls;
	}
	
	public int getPgrandfalse() {
		return this.pgrandfalse;
	}
	
	
	


}
