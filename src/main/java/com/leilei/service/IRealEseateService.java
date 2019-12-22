package com.leilei.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.leilei.domain.one.RealEseate;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author leilei
 * @since 2019-11-27
 */
public interface IRealEseateService extends IService<RealEseate> {

    IPage<RealEseate> selectByPage(int i, int i1);

    int TestAtomikos();
}
