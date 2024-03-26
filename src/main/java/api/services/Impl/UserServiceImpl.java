package api.services.Impl;


import api.mapper.UsersMapper;
import api.poto.Users;
import api.services.UserService;
import api.vo.CodeMsg;
import api.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UsersMapper usersMapper;

    @Override
    public ResultVo queryAll() {
        List<Users> allUsers = usersMapper.queryAll();
        if (allUsers.size() == 0) {
            return ResultVo.error(CodeMsg.SELECT_ERROR);
        } else {
            return ResultVo.success(allUsers);
        }
    }
}
