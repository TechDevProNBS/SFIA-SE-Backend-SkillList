package com.nationwide.app.model;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

/**Mirrors data structure for the skill list page from skill_list collection on MongoDB Atlas.
 * Contains {@link Subcategories} and {@link Skills}.
 * @author willg
 *
 */
@Document(collection = "skill_list")

public class SkillList {
	
	private String category_name;
	private List<Subcategories> subcategories;
	
	//Setter and Getter methods
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public List<Subcategories> getSubcategories() {
		return subcategories;
	}
	public void setSubcategories(List<Subcategories> subcategories) {
		this.subcategories = subcategories;
	}
	

}



