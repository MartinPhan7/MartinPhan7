import java.util.LinkedList;

public class Main {


	public static void afficherChaine(Maillon m){
		Maillon tmp;
		if(m==null){
			System.out.println("Maillon null");
		} else{
			tmp=m;
			while (tmp !=null ){
				System.out.println(tmp.getInfo()+" "); // Pour afficher l'element
				tmp=tmp.getSuiv();
			}
			System.out.println();
		}
	}

	public static int sommer(Maillon<Integer> m){
		Maillon <Integer> tmp;
		int somme =0;
		tmp =m;
		while(tmp!=null){
			somme+= tmp.getInfo();
			tmp= tmp.getSuiv();
		}
		return somme;
	}


    public static void main(String[] args) {


    	// 1er maillon est egal 0. Adresse du 23 est null
		LinkedList<Integer> m9 = new LinkedList<Integer>();
		Maillon m0 = new Maillon(10);
		Maillon <Integer> m1 = new Maillon<>(10);
		Maillon <String> m2 = new Maillon<>("patate");
		Maillon <String> m3 = new Maillon<>("tomate",m2);
		Maillon <String> m4 = new Maillon<>("celeri",m3);
		//System.out.println(m3.getInfo());

		Maillon<String> maillon = m3.getSuiv();

		System.out.println(m3.getSuiv().getInfo()); //affiche element m2
		System.out.println(m4.getSuiv().getInfo()); //affiche element m3

		m3.setInfo("pomme");
		System.out.println(m3.getInfo());

		m3.setSuiv(new Maillon<>("lait"));

		m3.getSuiv().setSuiv(new Maillon<>("pain"));

		System.out.println(m1.getSuiv());

		afficherChaine(m4);

		//-------------------------------------------------------------------------

		Maillon <Integer> m5 = new Maillon<>(10);
		Maillon <Integer> m6 = new Maillon<>(11,m5);
		Maillon <Integer> m7 = new Maillon<>(12,m6);

		m6.setInfo(13);
		m6.setSuiv(new Maillon<>(13));
		m6.getSuiv().setSuiv(new Maillon<>(13));

		System.out.println(sommer(m7));

		//-------------------------------------------------------------------------


    }


}
