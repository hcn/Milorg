package com.mailtux.milorg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.event.ListSelectionEvent;

public class Frekvens {
	
	Map<String,Integer> frek=new HashMap<>();
	
	public static void main(String[] args) {
		new Frekvens().doit();
	}

	private void doit() {
			String tekst="xsarttaagsorxskteid7ksoxxanxsexbxrxinexixnwxxcdeyployhegl9lvnex";
			for (int i = 0; i < tekst.length(); i++) {
				String c=String.valueOf(tekst.charAt(i));
			
			int ant=0;
			if (frek.containsKey(c)){
				ant=frek.get(c);
			}
			ant++;
			
			frek.put(c, ant);
		}
		
			List<Entry<String, Integer>> alle=	 new LinkedList<>(this.frek.entrySet());
			Collections.sort( alle, new Comparator<Map.Entry<String, Integer>>()
				    {
		        @Override
		        public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
		        {
		            return (o1.getValue()).compareTo( o2.getValue() );
		        }
		    } );
//			Collections.sort(alle);
//			for (int i = 0; i < alle.length; i++) {
//				Entry<String, Integer> e=(Entry<String, Integer>) alle[i];
//				float pros=(float) ((e.getValue()*100.0)/frek.size());
//				System.out.println(e+" "+pros);
//			}
			
			System.out.println("Antall tegn:"+tekst.length());
			System.out.println("Antall forskjellige tegn:"+frek.size());
		for (Entry<String, Integer> e : alle) {
			float pros=(float) ((e.getValue()*100.0)/frek.size());
			System.out.println(e+" "+pros);
		}
		
		
		
	}

}
