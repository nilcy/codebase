package mvp.domain

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

  @GetMapping("/")
  fun content(model: Model): String {
    model["title"] = "MVP"
    return "content"
  }
}
