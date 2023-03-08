package generalization;

public class Prog_Airtel implements Prog_TRAi {
	 @Override
	 public void vedioCall() {
		 System.out.println("Airtel provide 1.5GB for vedio call.");
	 }
	 @Override
	 public void audioCall() {
		 System.out.println("Airtel provide 1.5GB for audio call.");
	 }
	 @Override
	 public void massege() {
		 System.out.println("Airtel provide 150sms/day for massege call.");
		 
	 }

}
