package com.leilei;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.leilei.domain.Product;
import com.leilei.domain.one.RealEseate;
import com.leilei.domain.three.Role;
import com.leilei.service.IProductService;
import com.leilei.service.IRealEseateService;
import com.leilei.service.IRoleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest(classes = SpringbootMysqlMybatisplusApplication.class)
class SpringbootMysqlMybatisplusApplicationTests {
    @Autowired
    private IRealEseateService realEseateService;
    @Autowired
    private IProductService productService;
    @Autowired
    private IRoleService roleService;
    @Test
    void contextLoads() {
       // realEseateService.list().forEach(e-> System.out.println(e));
//        IPage<RealEseate> realEseateIPage = realEseateService.selectByPage(1, 4);
//        for (RealEseate record : realEseateIPage.getRecords()) {
//            System.out.println(record);
//        }
//       productService.list().forEach(e-> System.out.println(e));
       IPage<Product> productIPage= productService.selectByPage(1, 5,null);
       productIPage.getRecords().stream().filter(e->e.getId()>5L&&e.getId()<20L).map(e->"aa"+e.getProductName()+"aa").collect(Collectors.toList()).forEach(e-> System.out.println(e));
//        roleService.list().forEach(e-> System.out.println(e));
//        Role zhujian = new Role("测试获取zhuj");   //获取新增后的主键
//        roleService.save(zhujian);
//        System.out.println(zhujian.getId());
       // roleService.updateById(new Role(4L, "修改"));
//        roleService.list().forEach(e-> System.out.println(e));
//        QueryWrapper<Role> roleQueryWrapper = new QueryWrapper<>();
//        roleQueryWrapper.eq("name", "修改");
//        System.out.println(roleService.count(new QueryWrapper<Role>().select("id")));
//        System.out.println(roleService.getOne(roleQueryWrapper));
//        UpdateWrapper<Role> roleUpdateWrapper = new UpdateWrapper<>();
//        roleUpdateWrapper.eq("name", "修改");
//        roleService.update(new Role(4L, "测试Updatewapper"), roleUpdateWrapper);
    }
    @Test
    public void test (){
        IPage<Product> productIPage= productService.selectByPage(1, 10,null);
        productIPage.getRecords().stream()
                .filter(e->e.getId()>5L&&e.getId()<20L)
                .map(e->new Role(e.getId(),"http:192.168.10.74"+e.getProductName()))
                .collect(Collectors.toList())
                .forEach(e-> System.out.println(e));
    }
    @Test
    public void test3 (){
        realEseateService.TestAtomikos();
    }

}
