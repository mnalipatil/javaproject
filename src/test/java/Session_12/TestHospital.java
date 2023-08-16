package Session_12;

public class TestHospital {
	public static void main(String[] args)
	{
		//_1_USMedical usHp = new _1_USMedical();
		_4_ApolloHospital ap = new _4_ApolloHospital();
		ap.ambulanceServices();
		ap.emergencyServices();
		ap.pathologyService();
		ap.getPatientHistory();
		ap.radiologyServices();
		System.out.println(_1_USMedical.min_fees);
		_1_USMedical.services_911();
		ap.internship();
		
		
		System.out.println("----------------------");
		// Top Casting
		
		_1_USMedical us = new _4_ApolloHospital();
	//	us.ambulanceServices();
		us.oncologyServices();
		us.physioServices();
		us.orthopedicServices();
		us.radiologyServices();
		us.internship();
		_1_USMedical.services_911();
		System.out.println(_1_USMedical.min_fees);
		
		//Down casting
		// its not allowed
		// _4_ApolloHospital ap1 = new _1_USMedical
		
		
		
		
	}

}
