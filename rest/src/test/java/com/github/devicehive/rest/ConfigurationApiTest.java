package com.github.devicehive.rest;

import com.github.devicehive.rest.api.ConfigurationApi;
import com.github.devicehive.rest.model.Configuration;
import com.github.devicehive.rest.model.ValueProperty;
import org.junit.Assert;
import org.junit.Test;
import retrofit2.Response;

import java.io.IOException;

public class ConfigurationApiTest extends Helper{
    private static final String CONFIGURATION_NAME = "TEZT C0NF1G";
    private static final String CONFIGURATION_VALUE = "TEST VALUE";

    @Test
    public void setConfigurationProperty() throws IOException {
        boolean authenticated = authenticate();
        Assert.assertTrue(authenticated);

        ConfigurationApi configurationApi = client.createService(ConfigurationApi.class);
        ValueProperty valueProperty = new ValueProperty();
        valueProperty.setValue(CONFIGURATION_VALUE);

        Response<Configuration> putResponse = configurationApi.setProperty(CONFIGURATION_NAME, valueProperty).execute();
        Assert.assertTrue(putResponse.isSuccessful());

        Assert.assertTrue(deleteConfigurations(CONFIGURATION_NAME));
    }



}
