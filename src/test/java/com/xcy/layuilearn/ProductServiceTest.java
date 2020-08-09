package com.xcy.layuilearn;

import com.xcy.layuilearn.service.ProductService;
import com.xcy.layuilearn.vo.BarVO;
import com.xcy.layuilearn.vo.DataVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductService service;

    @Test
    void findData() {
        DataVO dataVO = service.findData(1,10);
        System.out.println(dataVO);
        int i = 0;
    }

    @Test
    void test(){
        BarVO barVO = service.getBarVO();
        int i = 0;
    }
}