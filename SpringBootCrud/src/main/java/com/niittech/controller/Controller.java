package com.niittech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niittech.model.Model;
import com.niittech.repository.Repository;


@RestController
@RequestMapping("/student")
public class Controller {

	/*
	 * @Autowired Services services;
	 */
	
	@Autowired
	Repository repository;
	/*
	 * @PostMapping(value="/add") public ResponseEntity<String> add(@RequestBody
	 * Studentmodel studentmodel)
	 * 
	 * { services.add(studentmodel); return new
	 * ResponseEntity<>("harshleen",HttpStatus.CREATED); }
	 * 
	 * @GetMapping(value="/get/{id}") public ResponseEntity<Studentmodel>
	 * get(@PathVariable("id") Long myid) { Studentmodel studentmodel=null;
	 * studentmodel=services.get(myid);
	 * 
	 * return new ResponseEntity<>(studentmodel, HttpStatus.CREATED); }
	 * 
	 * 
	 * @PutMapping(value="/update")
	 *  public ResponseEntity<String>
	 * update(@RequestBody Studentmodel studentmodel) {
	 * services.update(studentmodel); return new
	 * ResponseEntity<>("harshleen",HttpStatus.CREATED); }
	 * 
	 * @PutMapping(value="/delete") public ResponseEntity<String>
	 * delete(@RequestBody Studentmodel studentmodel) {
	 * services.delete(studentmodel); return new
	 * ResponseEntity<>("harshleen",HttpStatus.CREATED); }
	 */
	
	@PostMapping("/create")
	public Model create(@RequestBody Model model) {
		return repository.save(model);
		
	}
	
	@GetMapping("/alluser")
	public List<Model> findAll() {
		return repository.findAll();
		
	}
	
	@GetMapping("/{id}")
	public Model findOne(@PathVariable ("id") Long id ){
		return repository.findById(id).get();
		
	}
	
	  @PutMapping("/update")
	  
	  public Model update(Model model) {
		
		
		  Model m=new Model(); model.setId(13L); long id=model.getId();
		  m=repository.findById(id).get(); m.setName(model.getName());
		 
	  return repository.save(model);
	  
	  }
	 
	
	public void delete(Model model)
	{
		Model m=new Model();
		long id=model.getId();
		model=repository.findById(id).get();
		repository.delete(m);
	}
}
