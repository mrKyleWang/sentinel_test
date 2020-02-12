package top.kylewang.sentinel.controller;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author KyleWang
 * @date 2020/02/11
 */
@RestController
@RequestMapping("echo")
@Slf4j
public class EchoController {

    @RequestMapping("hello")
    private String hello() {

        log.info(DateUtil.format(new Date(),"yyyy-MM-dd HH:mm:ss.SSS"));

        return "Hello";
    }

}
