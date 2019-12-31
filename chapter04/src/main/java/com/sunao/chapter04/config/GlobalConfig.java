package com.sunao.chapter04.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

/**
 * GlobalConfig 添加全局数据
 * 使用@ControllerAdvice 和 @ModelAttribute
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2019/12/30 17:07
 */
@ControllerAdvice
public class GlobalConfig {
    @ModelAttribute(value = "info")
    public Map<String, String> userInfo() {
        Map<String, String> map = new HashMap<>(2);
        map.put("userName", "罗贯中");
        map.put("gender", "男");
        return map;
    }
}
