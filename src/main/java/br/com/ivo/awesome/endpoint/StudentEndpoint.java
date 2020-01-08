package br.com.ivo.awesome.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ivo.awesome.model.Student;
import br.com.ivo.awesome.repository.StudentRepository;

@RestController
@RequestMapping("student")
public class StudentEndpoint {
	private final StudentRepository studentDAO;
	@Autowired
	public StudentEndpoint(StudentRepository studentDAO) {
		this.studentDAO = studentDAO;
	}

	@GetMapping
	public ResponseEntity<?> listAll() {
		return new ResponseEntity<>(studentDAO.findAll(),HttpStatus.OK);
	}

	@GetMapping
//	public ResponseEntity<?> getStudentById(@PathVariable("id") Long id) {
//		Student student = studentDAO.findById(id);
//		if(student == null) {
//			return new ResponseEntity<>(new CustomErrorType("Estudante não encontrado"), HttpStatus.NOT_FOUND);			
//		}
//		return new ResponseEntity<>(HttpStatus.OK);
//	}
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Student student) {
		return new ResponseEntity<>(studentDAO.save(student), HttpStatus.OK);
	}
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		studentDAO.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@PutMapping(path = "/{id}")
	public ResponseEntity<?> update(@RequestBody Student student) {
		studentDAO.save(student);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
