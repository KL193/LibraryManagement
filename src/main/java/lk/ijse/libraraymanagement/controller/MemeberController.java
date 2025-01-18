package lk.ijse.libraraymanagement.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/members")
public class MemeberController {

    @GetMapping
    public String healthTest(){
        return "OK";
    }
}
