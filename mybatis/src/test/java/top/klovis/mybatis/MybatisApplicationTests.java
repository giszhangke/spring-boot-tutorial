package top.klovis.mybatis;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.klovis.mybatis.bean.User;
import top.klovis.mybatis.dao.UserMapper;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTests {
	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {
		log.info("-------------------select all--------------------");
		List<User> users = userMapper.selectList(null);
		Assert.assertEquals(5, users.size());
		users.forEach(System.out::println);
		log.info("-------------------delete id=1--------------------");
		int deleteRows = userMapper.deleteById(1L);
		Assert.assertEquals(1, deleteRows);
		log.info("-------------------insert user--------------------");
		User user = User.builder().age(22).email("qqq@qq.com").name("Mark").build();
		int insertRows = userMapper.insert(user);
		Assert.assertEquals(1, insertRows);
	}

}
