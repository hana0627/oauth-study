package com.hana.oauthstudy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class OauthController {

    @GetMapping("/")
    public String main(OAuth2AccessToken token) {
        log.info(String.valueOf(token));
        return "/main";
    }
}
