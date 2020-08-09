package com.xcy.layuilearn.vo;

import lombok.Data;

import java.util.List;
/**
 * @Description 返回前端对象
 * @Author xcy
 * @Date  2020/8/9 12:44
*/
@Data
public class DataVO<T> {
    private Integer code;
    private String msg;
    private Long count;
    private List<T> data;
}
