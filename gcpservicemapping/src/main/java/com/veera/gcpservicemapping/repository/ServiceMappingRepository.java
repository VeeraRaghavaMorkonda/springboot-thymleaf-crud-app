package com.veera.gcpservicemapping.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.veera.gcpservicemapping.entity.ServiceMappingEntity;

public interface ServiceMappingRepository extends CrudRepository<ServiceMappingEntity, Long>{
	
	   List<ServiceMappingEntity> findByappId(long appId);
}