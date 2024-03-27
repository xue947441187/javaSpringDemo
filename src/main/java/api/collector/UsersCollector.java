package api.collector;

import api.services.UserService;
import api.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@EnableAutoConfiguration
public class UsersCollector {
    @Autowired
    private UserService userService;

    @GetMapping("/getAll")
    public ResultVo getAllUsers(){
        return userService.queryAll();
    }
    @GetMapping("/getUser")
    public ResultVo getOneUser(@RequestParam Long id){
        return userService.queryOne(id);
    }
}
