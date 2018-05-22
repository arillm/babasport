package cn.lt.core.service.Impl;

import cn.lt.core.bean.TestTB;
import cn.lt.core.dao.TestDao;
import cn.lt.core.service.TestTBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestTBServiceImpl implements TestTBService {


    @Autowired
    private TestDao testDao;

    public void insertTestTB(TestTB testTB) {
        testDao.save(testTB);
//        throw  new RuntimeException();
    }

}
