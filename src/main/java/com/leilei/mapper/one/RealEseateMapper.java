package com.leilei.mapper.one;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leilei.domain.one.RealEseate;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author leilei
 * @since 2019-11-27
 */
@Component
public interface RealEseateMapper extends BaseMapper<RealEseate> {

    IPage<RealEseate> selectByPage(Page pager);
}
