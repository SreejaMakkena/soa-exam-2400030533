
package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.PhotographyPackage;

public interface PhotographyPackageService 
{

    PhotographyPackage add(PhotographyPackage p);

    List<PhotographyPackage> displayAll();

    String delete(Long id);

}
