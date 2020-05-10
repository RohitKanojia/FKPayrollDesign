// this class contain all data about employee 
class Employee{
	public int id;
  	private String name;
  	private String address;
  	private boolean ishourly;
 	private Double hourlyRate;
  	private boolean hasSalary;
  	private Double salary;
  	private Bankdetail B;
  	private double membershipcharge = 0;
  	private double othercharge = 0;
  	private double Amount; 
  	//constructor
	public Employee(int id, String name, String address, String pay_type, double Rate, String s){
		this.id = id;
		this.name = name;
		this.address = address;
		if(pay_type.equals("hourly")){
			this.ishourly = true;
			this.hourlyRate = Rate;
		}
		else if(pay_type.equals("salary")){
			this.hasSalary = true;
			this.salary = Rate;
		}
		B = new Bankdetail(id, s);
		this.Amount = 0;
	}
	//methods
	public int getEmpId(){
     		return id;
  	}
  	
  	public String getName(){
     		return name;
  	}
  	
  	public String getaddress(){
     		return address;
  	}
  	
  	public void changeaddress(String address){
		this.address = address;
	}
	
  	public double getSalary(){
     		if(ishourly) return hourlyRate;
     		else return salary;	
  	}
  	
  	public void raiseSalary(double increase){
		if(increase > 0 && hasSalary){
			this.salary += increase;		
		 }
	}
	
	public void ChangeEmpType(double value){
		if(ishourly){
			this.ishourly = false;
			this.hasSalary = true;
			this.salary = value; 
		}
		else{
			this.hasSalary = false;
			this.ishourly = true;
			this.hourlyRate = value;
		}
	}
	
	public void raiseHourlyrate(double increase){
		if(increase > 0 && ishourly){
			this.hourlyRate += increase;		
		 }
	}
	
	public String emptype(){
		if(ishourly) return "hourly";
		else return "salary";
	}
	
	public void setbankdetail(String s){
		B.setpaytype(s);
	}
	public String getbankdetail(){
		return B.checkpaytype();
	}
	
	public void setothercharges(double val){
		this.othercharge = val;
	}
	
	public double getothercharges(){
		return othercharge;
	}
	
	public void setmembershipcharge(double val){
		this.membershipcharge = val;
	}
	
	public double getmembershipcharge(){
		return membershipcharge;
	} 
	
	public void setamount(double val){
		this.Amount = val;
	}
	
	public double getamount(){
		return Amount;
	}
	
}
