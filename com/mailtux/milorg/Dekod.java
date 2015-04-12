package com.mailtux.milorg;

public class Dekod {
	
	String rot="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private int offset;

	public Dekod(int offset) {
		this.offset=offset;
		
		
		
	}
	
	public String dekod(String c){
		StringBuilder b=new StringBuilder();
		
		for (int i = 0; i < c.length(); i++) {
			String s=String.valueOf(c.charAt(i));
			int ix=this.rot.indexOf(s);
			if (ix<0){
				b.append(s);
			} else {
				ix=(ix+offset) % 26;
				b.append(rot.substring(ix, ix+1));
			}
			
			
			
		}
		
		
		
		return b.toString();
		
	}
	
	public void printTabell() {
		StringBuffer b=new StringBuffer();
		for (int i = 0; i < 26; i++) {
			int ix=(i+offset) % 26;
			b.append(rot.substring(ix, ix+1));
		}
		System.out.println(rot);
		System.out.println(b.toString());
		
	}

}
