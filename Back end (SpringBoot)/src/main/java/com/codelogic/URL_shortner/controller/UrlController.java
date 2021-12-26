package com.codelogic.URL_shortner.controller;

import com.codelogic.URL_shortner.modal.Url;
import com.codelogic.URL_shortner.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("url/shortner")
@CrossOrigin(origins = "http://localhost:4200")
public class UrlController {

    @Autowired
    private  UrlService urlService;

    @GetMapping("/{id}")
    public ModelAndView getOriginlUrl(@PathVariable String id) {
        return new ModelAndView("redirect:"+urlService.getOriginlUrl(id));
    }

    @PostMapping
    public Url generateShortUrl(@RequestBody String url) {
        return urlService.generateShortUrl(url);
    }

}
