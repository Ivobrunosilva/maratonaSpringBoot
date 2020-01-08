package br.com.ivo.awesome.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import br.com.ivo.awesome.model.Student;

public interface StudentRepository extends CrudRepository<Student , Long> {
	List<Student> findByName(String name);

}
