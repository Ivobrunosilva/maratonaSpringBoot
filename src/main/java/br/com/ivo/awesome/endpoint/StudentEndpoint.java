package br.com.ivo.awesome.endpoint;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ivo.awesome.model.Student;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("student")
public class StudentEndpoint {
	@RequestMapping(method = RequestMethod.GET,path = "/list")
	public List<Student> listAll() {

		return asList(new Student("Naruto"), new Student("Goku"));
	}
}
