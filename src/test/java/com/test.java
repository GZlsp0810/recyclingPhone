package com;

import com.qianfeng.price.controller.PriceController;
import com.qianfeng.price.po.Basinfo;
import com.qianfeng.price.vo.PriceList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class test {
    @Autowired
    private PriceController priceController;

    @Test
    public void test1() {
        Basinfo basinfo = new Basinfo();
        List<Basinfo> basinfos = priceController.savabasinfo("1-7-9-8");
        for (Basinfo s:basinfos
             ) {
            System.out.println(basinfo.getDescribes());
        }
    }
}
