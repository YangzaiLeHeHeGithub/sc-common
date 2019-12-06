package com.yz.git.sc.common.redis;

import com.google.inject.internal.cglib.core.$CollectionUtils;
import com.yz.git.sc.common.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.*;

/**
 * @description: RedisTest
 * @title: RedisUtilTest
 * @projectName： sc-common
 * @author： xuyang
 * @date： 2019/12/6/10:39
 * @version： 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class RedisUtilTest {
    @Resource
    RedisUtil redisUtil;

    @Test
    public void expireTest() {
//        String name = "userKey";
//        redisUtil.expire(name,1000);
        String num = "num01";
        redisUtil.set(num,1000,1000);
    }
    @Test
    public void setTest() {
        String name = "userKey";
        User user = new User();
        user.setUsername("redisTest");
        user.setAge(0);
        user.setGender(0);
        user.setIdNo("100");
        user.setPhone("120");
        User user1 = new User();
        user1.setUsername("redisTest1");
        user1.setAge(1);
        user1.setGender(1);
        user1.setIdNo("1001");
        user1.setPhone("1201");
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        redisUtil.set(name,users);
        if(redisUtil.hasKey(name)){
            log.info("命中redisKey： key = {}" ,name);
            List<User> userRedis = (List<User>)redisUtil.get(name);
            System.out.println(userRedis);
            System.out.println(userRedis.get(0).getUsername());
        }
    }
    @Test
    public void getExpireTest() {
        String name = "userKey";
        redisUtil.getExpire(name);
        System.out.println(redisUtil.getExpire(name));
    }
    @Test
    public void delTest() {
        String name = "userKey";
        redisUtil.del(name);
    }
    @Test
    public void incrTest() {
        String name = "num01";
        redisUtil.incr(name,100);
        redisUtil.decr(name,2);
    }
    //---------------------map ------------------//
    @Test
    public void mapTest() {
        String mapKey = "mapKey";
        Map<String, Object> userMap = new LinkedHashMap<>();
        User user1 = new User();
        user1.setUsername("user1");
        user1.setAge(0);
        user1.setGender(0);
        user1.setIdNo("user111");
        user1.setPhone("user111");
        User user2 = new User();
        user2.setUsername("user2");
        user2.setAge(0);
        user2.setGender(0);
        user2.setIdNo("user222");
        user2.setPhone("user222");
        User user3 = new User();
        user3.setUsername("user3");
        user3.setAge(0);
        user3.setGender(0);
        user3.setIdNo("user333");
        user3.setPhone("user333");
        userMap.put("1",user1);
        userMap.put("2",user2);
        userMap.put("3",user3);

        redisUtil.hmset(mapKey,userMap,20000);
        redisUtil.hset(mapKey+"hSet","U0",user1);
        redisUtil.hset(mapKey+"hSet","U1",user2);
        redisUtil.hset(mapKey+"hSet","U2",user3);
        User userR1 = (User)redisUtil.hget(mapKey+"hSet","U2");
        System.out.println(userR1);
        Map<Object, Object> usermapRedis = redisUtil.hmget(mapKey);
        Map<Object, Object> usermapRedisHset = redisUtil.hmget(mapKey+"hSet");
        System.out.println(usermapRedis);
        System.out.println(usermapRedisHset);

    }
}
