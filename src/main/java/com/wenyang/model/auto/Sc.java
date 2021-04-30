package com.wenyang.model.auto;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author astupidcoder
 * @since 2021-04-29
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Sc extends Model {

    private static final long serialVersionUID = 1L;

    @TableField("SId")
    private String SId;

    @TableField("CId")
    private String CId;

    private BigDecimal score;


}
