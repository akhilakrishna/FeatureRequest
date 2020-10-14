package com.akhila;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = AkhilaApplication.class)
class FeatureRequestControllerTest {


    @Autowired
    private FeatureRequestController controller;

    @Test
    void getFeatureRequestByTitle() {
        FeatureRequest featureRequest = new FeatureRequest();
        featureRequest.title = "F1";
        featureRequest.client = "Client1";
        featureRequest.clientPriority = "1";
        featureRequest.description = "F1 Desc";
        featureRequest.productArea = "Policies";
        featureRequest.targetDate = new Date().toString();
        FeatureRequest fr = controller.saveFeature(featureRequest);
        assertNotNull(fr.id);

        controller.deleteFeatureRequestById(fr.id);
    }

    @Test
    void getFeatures() {
        FeatureRequest featureRequest = new FeatureRequest();
        featureRequest.title = "F1";
        featureRequest.client = "Client1";
        featureRequest.clientPriority = "1";
        featureRequest.description = "F1 Desc";
        featureRequest.productArea = "Policies";
        featureRequest.targetDate = new Date().toString();
        FeatureRequest fr = controller.saveFeature(featureRequest);

        FeatureRequest featureRequest2 = new FeatureRequest();
        featureRequest2.title = "F1";
        featureRequest2.client = "Client1";
        featureRequest2.clientPriority = "1";
        featureRequest2.description = "F1 Desc";
        featureRequest2.productArea = "Policies";
        featureRequest2.targetDate = new Date().toString();
        FeatureRequest fr2 = controller.saveFeature(featureRequest);

        List<FeatureRequest> list = controller.getFeatures();
        assertEquals(2, list.size());
    }

    @Test
    void saveFeature() {
        FeatureRequest featureRequest = new FeatureRequest();
        featureRequest.title = "F1";
        featureRequest.client = "Client1";
        featureRequest.clientPriority = "1";
        featureRequest.description = "F1 Desc";
        featureRequest.productArea = "Policies";
        featureRequest.targetDate = new Date().toString();
        FeatureRequest fr = controller.saveFeature(featureRequest);

        assertEquals(fr.title, featureRequest.title);
        assertEquals(fr.client, featureRequest.client);
    }
}