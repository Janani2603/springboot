package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Documents;
import com.example.demo.repository.Documentrepo;
@Service
public class DocumentService {
	 @Autowired
	    private Documentrepo documentRepository;

	    public Documents createDocument(Documents document) {
	        return documentRepository.save(document);
	    }
	    public List<Documents> display(){
	    	return documentRepository.findAll();
	    }
	    public void del(Long id) {
	    	documentRepository.deleteById(id);
	    	
	    }

}
