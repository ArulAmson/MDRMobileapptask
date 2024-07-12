package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Testing\\MyDigiRecordsProjects\\src\\test\\resources\\FeatureFiles\\MyDigiRecord.feature",glue="org.step")
public class MyDigiRecordStoreRunner {

}
