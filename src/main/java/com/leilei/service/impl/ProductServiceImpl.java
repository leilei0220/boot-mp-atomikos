package com.leilei.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leilei.domain.Product;
import com.leilei.mapper.two.ProductMapper;
import com.leilei.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author leilei
 * @since 2019-11-27
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public IPage<Product> selectByPage(int i, int i1, String find) {
        Page<Object> objectPage = new Page<>(i, i1);
        IPage<Product> productIPage= productMapper.selectByPage(objectPage,find);
        return productIPage;
    }
}
