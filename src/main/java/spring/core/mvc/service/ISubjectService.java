package spring.core.mvc.service;

import java.util.List;

import spring.core.mvc.model.Subject;


public interface ISubjectService {
	
	public Long saveSubject(Subject subject);
	public boolean deleteSubject(long subjectid);
	public Subject getSubject(long subjectid);
	public List<Subject> getAllsubjects();
	public Subject getSubjectwithduration(int duration);

}
