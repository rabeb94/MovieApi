package org.me.dao;

import org.me.entities.Skill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SkillRepository extends JpaRepository<Skill, Long> {
	
	@Query("select name from Skill s where s.user.userId=:x" )
	public Page<Skill> listeSkills(@Param("x") Long userId, Pageable pageable);
	

}
