package spring.core.mvc.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.core.mvc.model.Subject;

@Repository
public interface ISubjectRepo extends JpaRepository<Subject, Long> {
	public Subject findByDuration(int duration);

}
