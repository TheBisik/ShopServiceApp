package prv.bisik.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Test {

    /*@GetMapping("/test/{t}")
    String hello(@PathVariable String t) {
        return "t = " + t;
    }*/

    @GetMapping("/test")
    String hello(@RequestParam String parametr) {
        return "test = " + parametr;
    }

}
