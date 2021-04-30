package com.wenyang.model.auto;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
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
public class Student extends Model {

    private static final long serialVersionUID = 1L;

    @TableField("SId")
    private String SId;

    @TableField("Sname")
    private String Sname;

    @TableField("Sage")
    private LocalDateTime Sage;

    @TableField("Ssex")
    private String Ssex;


}
