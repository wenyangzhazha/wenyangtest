package com.wenyang.model.auto;

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
public class Course extends Model {

    private static final long serialVersionUID = 1L;

    @TableField("CId")
    private String CId;

    @TableField("Cname")
    private String Cname;

    @TableField("TId")
    private String TId;


}
