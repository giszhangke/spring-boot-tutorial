package top.klovis.mybatis.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import top.klovis.mybatis.bean.User;

/**
 * @program: spring-boot-tutorial
 * @description:
 * @author: klovis
 * @create: 2019-05-20 18:17
 **/
@Repository
public interface UserMapper extends BaseMapper<User> {
}
