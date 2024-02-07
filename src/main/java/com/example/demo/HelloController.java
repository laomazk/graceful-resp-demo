package com.example.demo;

import com.feiniaojin.gracefulresponse.api.ExcludeFromGracefulResponse;
import com.feiniaojin.gracefulresponse.api.ValidationStatusCode;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@Slf4j
public class HelloController {

    @Autowired
    private QueryService queryService;

    @Autowired
    private MessageSource messageSource;

    @ExcludeFromGracefulResponse
    @GetMapping("/get")
    @ResponseBody
    public UserInfoView get(Long id) {
        log.info("id={}", id);
        return UserInfoView.builder().id(id).name("name" + id).build();
    }

    @GetMapping("exp")
    public void exp() {
        UserInfoView userInfoView = queryService.queryOne();

    }

    @PostMapping("valid")
    @ValidationStatusCode(code = "520")
    public void valid(@RequestBody @Valid UserInfoQuery userInfoQuery) {

    }

    @GetMapping("hello")
    public String hello() {
        return messageSource.getMessage("a_b", null, LocaleContextHolder.getLocale());


    }
}