package fr.cnes.doi.persistence.model;

import java.util.List;

public class DOIProject {
   
	private int suffix;
   
    private String projectname;
	
	
	public int getSuffix() {
		return suffix;
	}

	public void setSuffix(int suffix) {
		this.suffix = suffix;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

}
