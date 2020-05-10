class Transaction{
	// it use to calculate wage for hourly worker.
	public Employee calculateforday(Employee emp, Timecard T){
		if(T.id == emp.id  && (emp.emptype() == "hourly")){
			double x = emp.getamount();
			double t = T.hours; 
			double val = (t * emp.getSalary()) +  ((Math.max(t - 8, 0) * emp.getSalary()) / 2);
			System.out.println("Money added through hr work: "+val);
			val = val + x;
			emp.setamount(val);
		}
		return emp;
	}
	
	// it use to calculate salary for flat worker
	public Employee setsalaryformonth(Employee emp , int id){
		if(emp.emptype() == "salary" && id == emp.id){
			double x = emp.getamount();
			double val = emp.getSalary();
			val = val + x;
			emp.setamount(val);
		}
		return emp;
	}
	// this is use to calculate sales commission
	public Employee salescalculateforday(Employee emp, Salesreceipt S){
		if(S.id == emp.id){
			double x = emp.getamount();
			double Amount = S.amount;
			double percent = S.percent;
			double val = Amount * percent / 100.0;
			System.out.println("comission added: " + val);
			val = val + x;
			emp.setamount(val);
		}
		return emp;
	}	
}
