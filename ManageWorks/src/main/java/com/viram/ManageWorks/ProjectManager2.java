package com.viram.ManageWorks;

public class ProjectManager2 {
	Developer dp;
	Designer dn;
	Qa qa;
	
	 
	public ProjectManager2(Developer dp, Designer dn, Qa qa) {
		super();
		this.dp = dp;
		this.dn = dn;
		this.qa = qa;
	}


	public void manageWork()
	{
		dn.workDone();
		dp.workDone();
		qa.workDone();

	}
	

}
