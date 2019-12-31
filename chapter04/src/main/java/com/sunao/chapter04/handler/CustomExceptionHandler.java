package com.sunao.chapter04.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * CustomExceptionHandler
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2019/12/30 17:00
 */
@ControllerAdvice
public class CustomExceptionHandler {
    /**
     * 全局异常处理
     *
     * @param e    异常信息
     * @param resp 响应信息
     * @throws IOException 抛出异常
     */
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public void uploadException(MaxUploadSizeExceededException e, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.write("上传文件大小超出限制！");
        out.flush();
        out.close();
    }
}
