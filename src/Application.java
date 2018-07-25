import java.util.Scanner;
public class Application {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Cuisine cuisineSimplon = new Cuisine();
		Cuisine cuisinePierre = new Cuisine();
		
		cuisinePierre.nom = "Brogard";
		cuisinePierre.prénom = "Pierre";
		cuisinePierre.tasse = "Peter Pan";

		cuisineSimplon.nom = "Servant";
		cuisineSimplon.prénom = "Arnaud";
		cuisineSimplon.tasse = "Superman";
		String retourCafé;
		System.out.println("rentre 3 boolean pour le café l'eau et le bouton");
		boolean café = true;
		while(café == true) {
		retourCafé = cuisinePierre.machineCafé();
		System.out.println("Un autre?");
		System.out.println("Y pour oui, N pour non");
		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);
		if((input != 'Y') && (input != 'y')) {
			café = false;
		}else {
			System.out.println("rentre 3 boolean pour le café l'eau et le bouton");
		}
				
		}
	}
}
