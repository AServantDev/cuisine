import java.util.Scanner;
public class Cuisine {
	String tasse;
	String nom;
	String prénom;
	
	String machineCafé() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Est ce qu'il y a du café?");
		boolean input = sc.nextBoolean();
		boolean café = input;
		System.out.println("Est ce qu'il y a de l'eau?");
		boolean input1 = sc.nextBoolean();
		boolean eau = input1;
		System.out.println("Tu a appuyé sur le bouton?");
		boolean input2 = sc.nextBoolean();
		boolean bouton=input2;
		
		if(café && eau && bouton) {
			System.out.println("Le café se prépare.");
			 Thread.sleep(2000);
			 System.out.println("Ton café est prêt " + prénom + ".");
			 Thread.sleep(2000);
			 System.out.println("Je remplis ta tasse " + tasse + ".");
			 Thread.sleep(2000);
			 System.out.println("Le café est prêt?");
		}else {
			if(!café && !eau && !bouton) {
				System.out.println("T'as rien foutu en fait...");
			}else if (!café && !eau){
				System.out.println("Plus d'eau ni de café.");
			}else if(café == false) {
				System.out.println("Pas de café.");
			}else if(eau == false) {
				System.out.println("Pas d'eau.");
			}else if (bouton == false){
				System.out.println("Appuie sur le bouton!!!!!");
			}
		}
		return "café";
	}

}
