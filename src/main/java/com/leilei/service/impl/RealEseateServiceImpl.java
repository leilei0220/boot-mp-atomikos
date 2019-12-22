package com.leilei.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leilei.domain.Product;
import com.leilei.domain.one.RealEseate;
import com.leilei.mapper.one.RealEseateMapper;
import com.leilei.mapper.two.ProductMapper;
import com.leilei.service.IRealEseateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author leilei
 * @since 2019-11-27
 */
@Service
public class RealEseateServiceImpl extends ServiceImpl<RealEseateMapper, RealEseate> implements IRealEseateService {
    @Autowired
    private RealEseateMapper realEseateMapper;
    @Autowired
    private ProductMapper productMapper;
    @Override
    public IPage<RealEseate> selectByPage(int page, int size) {
        Page pager = new Page<RealEseate>(page,size);
       IPage<RealEseate> ip= realEseateMapper.selectByPage(pager);
        return ip;
    }

    @Override
    @Transactional
    public int TestAtomikos() {
        realEseateMapper.insert(new RealEseate("test","lei"));
        int i = 1 / 0;
        productMapper.insert(new Product("aaa", 1L));
        return 0;
    }
}
