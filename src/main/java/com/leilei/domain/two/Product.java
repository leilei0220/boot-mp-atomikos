package com.leilei.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author leilei
 * @since 2019-11-27
 */
@Data
public class Product extends Model<Product> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String productName;

    private Long categoryId;

    private Double salePrice;

    private String supplier;

    private String brand;

    private Double cutoff;

    private Double costPrice;

    public Product(String productName, Long categoryId) {
        this.productName = productName;
        this.categoryId = categoryId;
    }

    public Product() {
    }
}
