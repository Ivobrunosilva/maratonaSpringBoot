package br.com.ivo.awesome.endpoint;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ivo.awesome.error.CustomErrorType;
import br.com.ivo.awesome.model.Student;
import br.com.ivo.awesome.util.DateUtil;

@RestController
@RequestMapping("student")
public class StudentEndpoint {
	private DateUtil dateUtil;
	
	@Autowired
	public StudentEndpoint(DateUtil dateUtil) {
		super();
		this.dateUtil = dateUtil;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> listAll() {
		return new ResponseEntity<>(Student.studentList,HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/{id}")
	public ResponseEntity<?> getStudentById(@PathVariable("id") int id) {
		Student student = new Student();
		student.setId(id);
		int index = Student.studentList.indexOf(student);
		if(index == -1)
			return new ResponseEntity<>(new CustomErrorType("Estudante não encontrado"), HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(Student.studentList.get(index),HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> save(@RequestBody Student student) {
		Student.studentList.add(student);
		return new ResponseEntity<>(student,HttpStatus.OK);
	}
}
