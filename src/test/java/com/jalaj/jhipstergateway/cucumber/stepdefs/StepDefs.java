package com.jalaj.jhipstergateway.cucumber.stepdefs;

import com.jalaj.jhipstergateway.JhipsterGatewayApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterGatewayApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
