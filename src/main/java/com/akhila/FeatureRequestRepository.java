package com.akhila;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeatureRequestRepository extends CrudRepository<FeatureRequest, Integer> {

    public FeatureRequest findByTitle(String title);

    public FeatureRequest deleteByTitle(String title);
}
