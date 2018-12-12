package spring.core.mvc.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.core.mvc.dao.ISubjectRepo;
import spring.core.mvc.model.Subject;

@Service
@Transactional
public class SubjectServiceImpl implements ISubjectService {

	@Autowired
	private ISubjectRepo subjectRepo;

	public SubjectServiceImpl() {}

	@Autowired
	public SubjectServiceImpl(ISubjectRepo subjectRepo) {
		super();
		this.subjectRepo = subjectRepo;
	}

	@Override
	public Long saveSubject(Subject subject) {
		Subject savedSubject = subjectRepo.save(subject);
		return savedSubject == null ? -1 : savedSubject.getSubjectid();
	}

	@Override
	public boolean deleteSubject(long subjectid) {
		boolean isDeleted = false;
		if (subjectRepo.existsById(subjectid)) {
			subjectRepo.deleteById(subjectid);
			isDeleted = true;
		}
		return isDeleted;
	}

	@Override
	public Subject getSubject(long subjectid) {
		Optional<Subject> subjectData = subjectRepo.findById(subjectid);
		return subjectData.isPresent() ? subjectData.get() : null;

	}

	@Override
	public List<Subject> getAllsubjects() {
		return subjectRepo.findAll();

	}

	@Override
	public Subject getSubjectwithduration(int duration) {
		return subjectRepo.findByDuration(duration);
	}
}
