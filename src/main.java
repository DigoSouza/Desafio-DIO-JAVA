
public class main {
	public static void main(String[] args) {
		Client paulo = new Client();
		paulo.setName("Paulo Vitor Marques Lemos");
		
		
		Account ca = new CheckingAccount(paulo);
		Account savings = new CheckingAccount(paulo);
		
		ca.deposit(200);
		ca.transfer(150, savings);
		
		ca.printExtract();
		savings.printExtract();
	}
	
}
