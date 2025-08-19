package com.telecom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BillingController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String sayHello() {
    	try {
            String response = restTemplate.getForObject("http://PLAN_MICROSERVICE/hello", String.class);
            return "Hi, I am Billing Service!\nPlan Service says: " + response;
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to call Plan Service. Error: " + e.getMessage();
        }
    }
}