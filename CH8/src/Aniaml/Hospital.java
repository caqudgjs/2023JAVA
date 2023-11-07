package Aniaml;

public class Hospital {
	Patient p;
	
	void SetPatient(Patient p)
	{
		this.p = p;
	}
	
	void CheckSound() {
		p.Sound();
	}
}
