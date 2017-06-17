package me.cherish.web;


import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * JSON数据返回模板
 * Created by Cherish.
 */
@Data
@AllArgsConstructor
public class MResponse<T> implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String code;
    private Boolean success;
    private String message;
    private T data;
}
