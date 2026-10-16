
package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.PhotographyPackage;
import com.klef.soa.exam.repository.PhotographyPackageRepository;

@Service
public class PhotographyPackageServiceImpl implements PhotographyPackageService
{
    @Autowired
    private PhotographyPackageRepository repository;

    @Override
    public PhotographyPackage add(PhotographyPackage p)
    {
        PhotographyPackage savedPackage = repository.save(p);
        return savedPackage;
    }

    @Override
    public List<PhotographyPackage> displayAll()
    {
        return repository.findAll();
    }

    @Override
    public String delete(Long id)
    {
        PhotographyPackage p = repository.findById(id)
                .orElseThrow(() ->
                    new RuntimeException(
                        "Photography Package not found with id : " + id));
        repository.delete(p);
        
        return "Photography Package deleted successfully";
    }
}
