package com.nationwide.app.repository;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.nationwide.app.model.SkillList;

/**Communicates with {@link SkillListController} with the {@link findAll} function.
 * @author willg
 *
 */
@Repository
public interface SkillListRepository extends MongoRepository<SkillList, String> {
	/**Returns a list of type {@link SkillList}- all entries within skill_list database.
	 *
	 */
	public List<SkillList> findAll();
	
}

