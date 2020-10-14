package com.akhila;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class FeatureRequestController {

    @Autowired
    FeatureRequestRepository featureRequestRepository;

    @GetMapping("/getFeature/{title}")
    public FeatureRequest getFeatureRequestByTitle(@PathVariable(value = "title") String title) {
        FeatureRequest featureRequest = featureRequestRepository.findByTitle(title);
        return featureRequest;
    }

    @GetMapping("/features")
    public List<FeatureRequest> getFeatures() {
        Iterable<FeatureRequest> features = featureRequestRepository.findAll();
        List<FeatureRequest> flist = new ArrayList<>();
        features.forEach(flist::add);
        return new ArrayList<>(flist);
    }


    @PostMapping("/feature/save")
    public FeatureRequest saveFeature(@RequestBody FeatureRequest featureRequest) {
        FeatureRequest save = featureRequestRepository.save(featureRequest);
        return save;
    }

    @PostMapping("/deleteFeature/{id}")
    public void deleteFeatureRequestById(@PathVariable(value = "id") int id) {
        featureRequestRepository.deleteById(id);
    }


}
