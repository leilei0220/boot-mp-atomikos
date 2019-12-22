package com.leilei.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.leilei.domain.Product;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author leilei
 * @since 2019-11-27
 */
public interface IProductService extends IService<Product> {

    IPage<Product> selectByPage(int i, int i1, String find);
}
