package io.umehara.consumer;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MessageController {
    private RestTemplate restTemplate;

    public MessageController(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @RequestMapping("/message/{personId}")
    String getMessage(@PathVariable Long personId) {
        Person person = this.restTemplate.getForObject("http://localhost:8000/person/{personId}", Person.class, personId);
        return "Hello 1" + person.getName();
    }
}
