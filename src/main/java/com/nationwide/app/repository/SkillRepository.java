package com.nationwide.app.repository;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.nationwide.app.model.SkillList;

@Repository
public interface SkillRepository extends MongoRepository<SkillList, String> {
	public List<SkillList> findAll();
	
}

