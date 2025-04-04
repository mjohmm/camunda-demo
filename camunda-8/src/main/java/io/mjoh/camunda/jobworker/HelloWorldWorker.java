package io.mjoh.camunda.jobworker;


import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldWorker {

    @JobWorker(type = "hello-world", autoComplete = true)
    public void getHelloWorld() {
        System.out.println("Hello World!");
    }

}
