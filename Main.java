public class Main {
	public static void main (String [] Args) {
		Account Account1 = new Account(117884332,-1,"Mert Sondas");
		Account1.showInf();
		Account1.withdraw(350);
		Account1.showInf();
		Account1.deposit(2250);
		Account1.showInf();
	}
}