package runstatic.cloudexamples.cloudoauth2client.contrller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenmoand
 */
@RestController
@RequestMapping(path = "user")
public class UserController {

    @GetMapping("getLoginUser")
    public Object getLoginUser() {
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

}
