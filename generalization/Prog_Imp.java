package generalization;

public class Prog_Imp {

	public static void main(String[] args) {
		Prog_Airtel i = new Prog_Airtel();
		i.audioCall();
		i.massege();
		i.vedioCall();
		System.out.println("----------------------------------------------");
		Prog_Jio j = new Prog_Jio();
		j.audioCall();
		j.vedioCall();
		j.massege();
		System.out.println("----------------------------------------------");
		Prog_VI k = new Prog_VI();
		k.audioCall();
		k.vedioCall();
		k.vedioCall();
	}

}
