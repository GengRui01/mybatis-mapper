package mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @InterfaceName UserMapper
 * @Description User模块Mapper层
 * @Author GengRui
 * @Date 2021/3/13 15:51
 */
public interface UserMapper {
    /**
     * 通过用户id查询用户名称
     *
     * @param id 用户id
     * @return 用户名称
     */
    @Select("SELECT username FROM user WHERE id = #{id}")
    String selectUsernameById(Integer id);

    /**
     * 通过用户id查询用户年龄
     *
     * @param id 用户id
     * @return 用户年龄
     */
    Integer selectUserAgeById(Integer id);
}
