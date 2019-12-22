package com.leilei.mapper.two;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leilei.domain.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
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
public interface ProductMapper extends BaseMapper<Product> {

    IPage<Product> selectByPage(Page<Object> objectPage, @Param("name") String find);
}
