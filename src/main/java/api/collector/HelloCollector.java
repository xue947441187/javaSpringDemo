package api.collector;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCollector {
    @GetMapping("/hello")
    public String hello(){
        return  "你好";
    }
}
