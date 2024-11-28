package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Documents;
import com.example.demo.service.DocumentService;
@RestController
@RequestMapping("/Docs")
public class DocumentController {
	 @Autowired
	    private DocumentService documentService;

	    @PostMapping
	    public ResponseEntity<Documents> createDocument(@RequestBody Documents document) {
	        Documents createdDocument = documentService.createDocument(document);
	        return ResponseEntity.ok(createdDocument);
	    }
	    @GetMapping("/displaydoc")
	    public ResponseEntity<List<Documents>> displayall(){
	    	return ResponseEntity.ok(documentService.display());
	    }
	    @DeleteMapping("/del/{id}")
	    public void remove(@PathVariable long id) {
	    	documentService.del(id);
	    }

}
