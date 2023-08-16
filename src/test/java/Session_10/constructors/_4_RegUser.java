package Session_10.constructors;

public class _4_RegUser {
	
	public static void main(String[] args)
	{
		_3_Reg user_1 = new _3_Reg("Tom", "Jobs", "gdr468$%^");
		_3_Reg user_2 = new _3_Reg("John", "Hoops", "46576387bdeghfxe", 23456778, "test@test.com", "101 north street", "01082000");
		_3_Reg user_3 = new _3_Reg("Tom 1", "Jobs 1", "tdr468$%^");
		_3_Reg user_4 = new _3_Reg("Tom 2", "Jobs 2", "rdr468$%^");
		_3_Reg user_5 = new _3_Reg("Tom 3", "Jobs 3", "vdr468$%^");
		
		//System.out.println(user_1.firstName + " " + user_1.lastName)
		
		user_1.nonDetailedReg();
		user_2.DetailedReg();
		user_3.nonDetailedReg();
		user_4.nonDetailedReg();
		user_5.nonDetailedReg();
;	}

}
