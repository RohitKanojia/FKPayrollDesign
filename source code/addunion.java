
//union charges for employee
class addunion{
	public Employee unioncharge(int id, Employee emp, double val){
		if(id == emp.id){
			emp.setmembershipcharge(val);
		}
		return emp;
	}	

}

