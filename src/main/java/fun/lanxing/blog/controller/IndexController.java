package fun.lanxing.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {

    @GetMapping("/{id}/{name}")
    public String index(@PathVariable(name = "id")Integer id,
                        @PathVariable(name = "name") String name){
        System.out.println("----------index--------------");
        return "index";
    }
}
