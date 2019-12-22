package com.leilei.domain.one;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;
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
public class RealEseate extends Model<RealEseate> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String projectName;

    private String address;

    private String houseType;

    private Integer area;

    private LocalDateTime buildTime;

    private Long userId;

    public RealEseate(String projectName, String address) {
        this.projectName = projectName;
        this.address = address;
    }

    public RealEseate() {
    }
}
