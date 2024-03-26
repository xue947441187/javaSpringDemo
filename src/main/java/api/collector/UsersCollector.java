package api.collector;

import api.services.UserService;
import api.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@EnableAutoConfiguration
public class UsersCollector {
    @Autowired
    private UserService userService;

    @RequestMapping("getAll")
    public ResultVo getAllUsers(){
        return userService.queryAll();
    }
}
