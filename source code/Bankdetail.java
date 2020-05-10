// Bank detail of employee
class Bankdetail{
	private int id;
	private boolean paycheck;
	private boolean accounttransfer;
	private boolean cashpayment;
	
	
	public Bankdetail(int id, String s){
		this.id = id;
		if(s.equals("paycheck")) {
			this.paycheck = true;
			this.accounttransfer = false;
			this.cashpayment = false;
		}
		else if(s.equals("account")){
			this.accounttransfer = true;
			this.paycheck = false;
			this.cashpayment = false;
		}
		else{
			this.cashpayment = true;
			this.accounttransfer = false;
			this.paycheck = false;
		}
	}
	
	public void setpaytype(String s){
		if(s.equals("paycheck")) {
			this.paycheck = true;
			this.accounttransfer = false;
			this.cashpayment = false;
		}
		else if(s.equals("account")){
			this.accounttransfer = true;
			this.paycheck = false;
			this.cashpayment = false;
		}
		else{
			this.cashpayment = true;
			this.accounttransfer = false;
			this.paycheck = false;
		}
	}
	public String checkpaytype(){
		if(paycheck){return "paycheck";}
		else if(accounttransfer){return "account";}
		else{return "cash";}
	}
	
	
}
