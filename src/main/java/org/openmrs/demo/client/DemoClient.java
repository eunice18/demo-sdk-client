package org.openmrs.demo.client;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.DefaultApi;
import io.swagger.client.model.Patient;

public class DemoClient {
    public static void main(String[] args) {
        DefaultApi apiInstance = new DefaultApi();
        String id = "892b89a2-6823-403b-899c-d7045c0d9b5e"; // String | The ID of the resource
        try {
            ApiClient apiClient = apiInstance.getApiClient();
            apiClient.setUsername("admin");
            apiClient.setPassword("Admin123");
            apiClient.addDefaultHeader("Authorization", "Basic YWRtaW46QWRtaW4xMjM=");
            apiClient.addDefaultHeader("Accept-Encoding", "*/*");
            apiClient.setBasePath("http://localhost:8080/openmrs/ws/fhir");
            Patient result = apiInstance.patientIdGet(id);
            System.out.println(result.toString());
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#allergyIntoleranceGet");
            e.printStackTrace();
        }
    }
}
