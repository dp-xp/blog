package fun.lanxing.blog.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author LiLanxing
 * @date 2020/4/21 16:35
 */

@ControllerAdvice
public class CustomizeExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler(HttpServletRequest request, Exception e, Model model) {
        // 记录异常
        logger.error("Request URL : {}. Exception: {}",request.getRequestURL(),e);
        //返回错误页面
        ModelAndView mv = new ModelAndView();
        mv.addObject("url",request.getRequestURL());
        mv.addObject("exception",e);
        model.addAttribute("message",e.getMessage());
        mv.setViewName("error/error");
        return mv;
    }
}
