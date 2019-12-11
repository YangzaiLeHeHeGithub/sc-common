package com.yz.git.sc.common.moco;

import com.github.dreamhead.moco.HttpServer;
import com.github.dreamhead.moco.Request;
import com.github.dreamhead.moco.Runner;
import com.github.dreamhead.moco.resource.Content;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static com.github.dreamhead.moco.Moco.httpServer;
import static com.github.dreamhead.moco.Runner.runner;

/**
 * @description: MocoTest
 * @title: MocoTest
 * @projectName： sc-common
 * @author： xuyang
 * @date： 2019/12/11/14:07
 * @version： 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MocoTest {
    private Runner runner;

//    @Before()
//    public void setup() {
//        HttpServer server = httpServer(12306);
//        server.response("foo");
//        runner = runner(server);
//        runner.start();
//
//        helper = new MocoTestHelper();
//    }
//
//    @After
//    public void tearDown() {
//        runner.stop();
//    }
//    @Test
//    public void should_response_as_expected() throws IOException {
//        Content content = Request.GetU("http://localhost:12306").execute().returnContent();
//        assertThat(content.asString(), is("foo"));
//    }
}
