



public class Account {
	private int id;//璐﹀彿
	private double balance;//浣欓
	private double annualInterestRate;//骞村埄鐜�
	
	public Account (int id, double balance, double annualInterestRate ){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	//鍦ㄦ彁娆炬柟娉晈ithdraw涓紝闇�瑕佸垽鏂敤鎴蜂綑棰濇槸鍚﹁兘澶熸弧瓒虫彁娆炬暟棰濈殑瑕佹眰锛屽鏋滀笉鑳斤紝搴旂粰鍑烘彁绀恒��
	public void withdraw (double amount){//鍙栭挶
		if(balance < amount){
			System.out.println("浣欓涓嶈冻锛屽彇娆惧け璐�");
			return;
		}
		balance -= amount;
		System.out.println("鎴愬姛鍙栧嚭锛�" + amount);
	}
	
	public void deposit (double amount){//瀛橀挶
		if(amount > 0){
			balance += amount;
			System.out.println("鎴愬姛瀛樺叆锛�" + amount);
		}
	}

}


