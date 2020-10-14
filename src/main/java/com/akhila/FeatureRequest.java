package com.akhila;

import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FeatureRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String title;
    public String description;
    public String client;
    public String clientPriority;
    public String targetDate;
    public String productArea;
}
