package org.example.performancetest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @GetMapping
    public ResponseEntity<String> test() {
        log.info("test");
        System.out.println("SAdf");
        System.out.println("df");
        return ResponseEntity.ok("good");
    }
}
