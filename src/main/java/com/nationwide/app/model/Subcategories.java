package com.nationwide.app.model;

import java.util.List;

/** Embedded within {@link SkillList} class to define the subcategories and their skills. Contains {@link Skills}.
 * @author willg
 *
 */
public class Subcategories {
	
		private String subcategory_name;
		private List<Skills> skills;
		
		//Setter and Getter methods
		public String getSubcategory_name() {
			return subcategory_name;
		}
		public void setSubcategory_name(String subcategory_name) {
			this.subcategory_name = subcategory_name;
		}
		public List<Skills> getSkills() {
			return skills;
		}
		public void setSkills(List<Skills> skills) {
			this.skills = skills;
		}
		

}
