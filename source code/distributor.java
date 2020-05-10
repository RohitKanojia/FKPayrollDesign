class distributor{
	// it use to give money on pay day for all salary
	public Employee payroll(Employee emp, int day){
		if(emp.emptype() == "hourly"  && (day == 8 || day == 15 || day == 22 || day == 30) ){
				double val = emp.getamount() - emp.getmembershipcharge() - emp.getothercharges();
				System.out.println("Employee ID " + emp.id +" Amount paid " + val + "Payment option used " + emp.getbankdetail());
				emp.setamount(0);
				emp.setmembershipcharge(0);
				emp.setothercharges(0);
		}
		else if(emp.emptype() == "salary"  && (day == 1) ){
				Transaction T = new Transaction();
				emp = T.setsalaryformonth(emp, emp.id);
				double val = emp.getamount() - emp.getmembershipcharge() - emp.getothercharges();
				System.out.println("Employee ID " + emp.id + " Amount paid " + val + "Payment option used " + emp.getbankdetail());
				emp.setamount(0);
				emp.setmembershipcharge(0);
				emp.setothercharges(0);
		}
		return emp;
	}
}
