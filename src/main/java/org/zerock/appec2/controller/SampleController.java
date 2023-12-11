package org.zerock.appec2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sample")
public class SampleController {
    @GetMapping("/getArr")
    public String[] getArr() {
        return new String[]{"AAA", "BBB", "CCC"};
    }
    @GetMapping("/who")
    public String[] getwho(){
        return new String[]{"202117005", "고민성"};
    }
}
