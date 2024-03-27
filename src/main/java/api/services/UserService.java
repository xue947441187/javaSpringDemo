package api.services;

import api.poto.Users;
import api.vo.ResultVo;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public ResultVo queryAll();
    public ResultVo queryOne(long id);
}
