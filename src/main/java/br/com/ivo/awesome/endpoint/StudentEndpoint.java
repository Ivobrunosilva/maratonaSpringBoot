package br.com.ivo.awesome.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ivo.awesome.model.Student;
import br.com.ivo.awesome.util.DateUtil;

import static java.util.Arrays.asList;

import java.time.LocalDateTime;

@RestController
@RequestMapping("student")
public class StudentEndpoint {
	@Autowired
	private DateUtil dateUtil;
	@RequestMapping(method = RequestMethod.GET,path = "/list")
	public List<Student> listAll() {
//		System.out.println("---------------"+dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
		return asList(new Student("Naruto"), new Student("Goku"));
	}
}
