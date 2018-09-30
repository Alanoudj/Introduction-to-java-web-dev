package com.summer.summercontroller;

import com.summer.HttpMethod;
import com.summer.annotations.Controller;
import com.summer.annotations.UrlMapping;

@Controller
public class HelloController {

  @UrlMapping(value = "/greeting", method = HttpMethod.GET)
  public String greeting(){
    return "Hala Wallah";
  }
}
