package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Family;
import com.example.demo.repository.Familyrepo;

@Service
public class FamilyService {
	

 @Autowired
  private Familyrepo  repo;
  public Family createFamilyMember(Family familyMember) {
	  if(familyMember.getDocuments()!=null) {
		  familyMember.adddoc(familyMember.getDocuments());
	  }
     return repo.save(familyMember);
 }
// public Family addProduct(Family family)
// {
//	 return repo.save(family);
// }
 public List<Family>display(){
	 return repo.findAll();
 }
 public void removedel(Long id) {
	 repo.deleteById(id);
 }
// public Optional<Family> getbyidd(long id){
//	 return repo.findById(id);
// }
// public Wallet getwalletbyname(String name){
//	 return repo.findwalletbyname(name);
// }
}
