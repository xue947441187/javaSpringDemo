package api.poto;

import lombok.Data;


@Data
public class Users {
    private Integer id;
    private String username;

    private String email;

    private Integer age;

    @Override
    public String toString(){
        return "id:"+id;
    }
}
