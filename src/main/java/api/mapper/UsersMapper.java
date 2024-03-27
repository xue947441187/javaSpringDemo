package api.mapper;

import api.poto.Impl.UserOnlyId;
import api.poto.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface UsersMapper {
//    Student queryID();
    @Select("SELECT id,username FROM users;")
    List<UserOnlyId> queryAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    Users queryOne(@Param("id") Long id);

}
