package com.example.myhealthblock.api.healthdata;

import java.util.HashMap;

import com.example.myhealthblock.api.healthdata.specific.*;

public class ApiAdapter implements ApiOutport{
//    private final Api api = new RealApi();
    private final Api api = new TestApi();

    @Override
    public String requestMedicalHistory(HashMap<String, Object> data) {
        return api.requestProductMedicalHistory(data);
    }

    @Override
    public String requestTreatmentImformation(HashMap<String, Object> data) { return api.requestProductTreatmentImformation(data); }

    @Override
    public String requestHealthCheckupResult(HashMap<String, Object> data) { return api.requestHealthCheckupResult(data); }

    @Override
    public String requestMedicalHistorySecond(HashMap<String, Object> data) { return api.requestCertificationMedicalHistory(data); }

    @Override
    public String requestTreatmentImformationSecond(HashMap<String, Object> data) { return api.requestCertificationTreatmentImformation(data); }

    @Override
    public String requestHealthCheckupResultSecond(HashMap<String, Object> data) { return api.requestCertificationHealthCheckupResult(data); }
}