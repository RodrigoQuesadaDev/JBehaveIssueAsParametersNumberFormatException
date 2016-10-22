package com.rodrigodev.example;

import org.jbehave.core.annotations.Given;

import java.util.List;

public class ExampleStorySteps {

    @Given("the value $value and the table: $dataRows")
    public void givenTheValueAndTheTable(int value, List<ExampleData> dataRows) {
        dataRows.toString();
    }
}