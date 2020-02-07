package com.viram.ManageWorks;

public class ProjectManager {
		//Designer designer;
		Developer dev;
		//Qa qa;
	
		public ProjectManager(Developer dev) {
			//this.designer = designer;
			this.dev = dev;
			//this.qa=qa;
		}
		public void manageWork()
		{	
			//designer.workDone();
			dev.workDone();
			//qa.workDone();
		}
}
