package api.mapper;

import api.poto.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface UsersMapper {
//    Student queryID();
    @Select("SELECT * FROM users;")
    List<Users> queryAll();

}
