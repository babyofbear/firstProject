package exercise20;

public class Account {
		private String ano; //계좌번호
		private String owner; //계좌주
		private int balance; //예금액
		private String showInfo;
		
		public Account(String ano,String owner, int balance) {
			this.ano = ano;
			this.owner = owner;
			this.balance = balance;
		}
		
		public String getAno() { return ano; }
		public void setAno(String ano) { this.ano = ano; }
		public String getOwner() { return owner; }
		public int getBalance() { return balance; }
		public void setBalance(int balance) { this.balance = balance; }
		
		public String showInfo() {
		//	System.out.println("============");
		//	System.out.println("");
		//	System.out.println("============");
		//	System.out.println("계좌번호(6자리): ");
		//	System.out.println("계좌주: ");
		//	System.out.println("초기입금액:");
		//	System.out.println("결과: 계좌가 생성되었습니다.");
			
			String Info() = (this.ano + "\n" +this.owner+ "\n" +this.balance) ;
			return showInfo();
		}
		

}
