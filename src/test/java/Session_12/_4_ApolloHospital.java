package Session_12;

public class _4_ApolloHospital extends GlobalPatientHistory implements _1_USMedical, _2_UKMedical, _3_IndianMedical {

	@Override
	public void polioServices() {
		System.out.println("ApolloHospital -- polioServices");
		
	}

	@Override
	public void emergencyServices() {
		System.out.println("ApolloHospital -- emergencyServices");
	}

	@Override
	public void neuroServices() {
		System.out.println("ApolloHospital -- neuroServices");
		
	}

	@Override
	public void peditricServices() {
		System.out.println("ApolloHospital -- peditricServices");
		
	}

	@Override
	public void ENTServices() {
		System.out.println("ApolloHospital -- ENTServices");
		
	}

	@Override
	public void ambulanceServices() {
		System.out.println("ApolloHospital -- ambulanceServices");
		
	}

	@Override
	public void physioServices() {
		System.out.println("ApolloHospital -- physioServices");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("ApolloHospital -- ncologyServices");
		
	}

	@Override
	public void orthopedicServices() {
		System.out.println("ApolloHospital -- orthopedicServices");
		
	}

	@Override
	public void radiologyServices() {
		System.out.println("ApolloHospital -- radiologyServices");
		
	}
	
	// non overridden method - special methods from the class
	public void OPService()
	{
		System.out.println("ApolloHospital -- OPServices");
	}	
	
	public void medicalService()
	{
		System.out.println("ApolloHospital -- medicalService");
	}
	
	public void pathologyService()
	{
		System.out.println("ApolloHospital -- pathologyService");
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
