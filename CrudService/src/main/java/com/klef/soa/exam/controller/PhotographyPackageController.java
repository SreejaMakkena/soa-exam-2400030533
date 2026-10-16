
package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.exam.entity.PhotographyPackage;
import com.klef.soa.exam.service.PhotographyPackageService;

@RestController
@RequestMapping("/photographypackage")
public class PhotographyPackageController 
{

    @Autowired
    private PhotographyPackageService service;

    @GetMapping("/")
    public String home() 
    {
        return "Photography Package CRUD Service Running";
    }

    @PostMapping("/Add")
    public ResponseEntity<PhotographyPackage> add(@RequestBody PhotographyPackage p)
    {
        return new ResponseEntity<>(service.add(p), HttpStatus.CREATED);
    }

    @GetMapping("/DisplayAll")
    public ResponseEntity<List<PhotographyPackage>> displayAll() 
    {
        return ResponseEntity.ok(service.displayAll());
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id)
    {
        return ResponseEntity.ok(service.delete(id));
    }
}
