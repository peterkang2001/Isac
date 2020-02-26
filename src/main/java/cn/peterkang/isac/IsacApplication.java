package cn.peterkang.isac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class IsacApplication {
    @RequestMapping("hello")
    String Hello(){
        return "Hello peter kang";
    }

    public static void main(String[] args) {
        SpringApplication.run(IsacApplication.class, args);
    }

}
