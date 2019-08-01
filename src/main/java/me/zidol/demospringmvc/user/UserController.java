package me.zidol.demospringmvc.user;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

//    @PostMapping("/user")//@RestController가 있으면 @RespoonseBody 생략 가능 @Controller를 사용하면 선언 해줘야 함 없으면 view를 찾을거임
//    public @ResponseBody User create(@RequestBody User user) {
//        return null;
//    }

    @PostMapping("/users/create")
    public User create(@RequestBody User user){
        return user;
    }
}
