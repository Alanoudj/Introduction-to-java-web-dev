package com.summer.summercontroller;

import com.summer.HttpMethod;
import com.summer.annotations.Controller;
import com.summer.annotations.UrlMapping;

@Controller
public class Hello1Controller {

  @UrlMapping(value = "/greeting1", method = HttpMethod.GET)
  public String greeting(){
    return "Hala Wallah1";
  }
}
