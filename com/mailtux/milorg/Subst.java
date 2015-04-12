package com.mailtux.milorg;

public class Subst {
	
	String rot="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static void main(String[] args) {
		new Subst().doit();
	}
	

	private void doit() {
//		String tekst="Sberfgvyy qrt ng btfå søytraqr zryqvat tvxx hg sen qra yvyyr Zvybet-tehccra v Bfyb sbe 70 åe fvqra:".toUpperCase();
//		String tekst="Oxa qrwc tjw md bnwmn nw nyxbc cru vruxap79 taxnuu juoj pvjru lxv".toUpperCase();
		String tekst="Bkn dejp gwj zq oajza aj alkop peh iehknc79 gnkahh whbw ciweh yki".toUpperCase();
//		String tekst="xsarttaagsorxskteid7ksoxxanxsexbxrxinexixnwxxcdeyployhegl9lvnex".toUpperCase();
		
		
		for (int i = 0; i < 26; i++) {
			Dekod d=new Dekod(i);
//			System.out.println(i);
			String s=d.dekod(tekst);
			System.out.println(s+" "+i);
//			for (int j = 0; j < 26; j++) {
//				Dekod dd=new Dekod(this.rot,j);
////				System.out.println(i);
//				String ss=dd.dekod(s);
//				System.out.println(ss+" "+i+" "+j);
//				
//			}
		}
		
		Dekod d=new Dekod(4);
		d.printTabell();
		
		
	}

}
