package cn.lt.core.service;

import cn.lt.core.bean.TestTB;
import cn.lt.core.dao.TestDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TesttbTest {

    @Autowired
    private TestDao testDao;

    @Test
    public void TestADD(){
        TestTB testTB = new TestTB(1, "admin", new Date());
        testDao.save(testTB);
    }

}
