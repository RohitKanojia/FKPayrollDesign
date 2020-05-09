class Employee{
	public int id;
  	public String name;
  	public String address;
  	public boolean ishourly;
 	public Double hourlyRate;
  	public boolean hasSalary;
  	public Double salary;
  	public boolean hasCommission;
  	public Double baseRate;
	public Employee(int id, String name, String address, String pay_type, double Rate){
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
		else{
			this.hasCommission = true;
			this.baseRate = Rate;
		}
	}
	
	public int getEmpId(){
     		return id;
  	}
  	
  	public String getName(){
     		return name;
  	}
  	
  	public String getaddress(){
     		return address;
  	}
  	
  	public double getSalary(){
     		if(ishourly) return hourlyRate;
     		else if(hasSalary) return salary;
     		else return baseRate;
     		
  	}
  	
  	public void raiseSalary(double increase){
		if(increase > 0 && hasSalary){
			salary += increase;		
		 }
	}
}
