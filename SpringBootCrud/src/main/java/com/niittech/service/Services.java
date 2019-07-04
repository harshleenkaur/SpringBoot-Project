/*
 * package com.niittech.service;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.niittech.model.Model; import
 * com.niittech.model.innermodel.Studentmodel; import
 * com.niittech.repository.Repository;
 * 
 * @Service public class Services implements ServiceInter {
 * 
 * @Autowired Repository repository;
 * 
 * @Override public Studentmodel get(Long myid) { // TODO Auto-generated method
 * stub Model model=new Model(); model=repository.findById(myid); Studentmodel
 * studentmodel=new Studentmodel(); studentmodel.setId(model.getId());
 * studentmodel.setName(model.getName());
 * 
 * 
 * return studentmodel; }
 * 
 * @Override public void update(Studentmodel studentmodel) { // TODO
 * Auto-generated method stub
 * 
 * Model model=new Model(); Long myid=studentmodel.getId();
 * model=repository.findById(myid); model.setName(studentmodel.getName());
 * repository.save(model);
 * 
 * 
 * }
 * 
 * @Override public void delete(Studentmodel studentmodel) { // TODO
 * Auto-generated method stub Model model=new Model(); Long
 * myid=studentmodel.getId(); model=repository.findById(myid);
 * repository.delete(model); }
 * 
 * @Override public void add(Studentmodel studentmodel) { Model model=new
 * Model(); model.setName(studentmodel.getName());
 * 
 * // TODO Auto-generated method stub
 * 
 * }
 * 
 * 
 * }
 */