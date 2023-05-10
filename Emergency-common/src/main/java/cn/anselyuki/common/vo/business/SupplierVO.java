package cn.anselyuki.common.vo.business;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author AnselYuki
 * @date 2022/9/16 17:18
 **/
@Data
public class SupplierVO {
    private Long id;

    @NotBlank(message = "供应商名称不能为空")
    private String name;

    @NotBlank(message = "地址不能为空")
    private String address;

    @NotBlank(message = "邮箱不能为空")
    private String email;

    @NotBlank(message = "电话不能为空")
    private String phone;

    @NotNull(message = "排序号不能为空")
    private Integer sort;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date modifiedTime;

    private String contact;
}