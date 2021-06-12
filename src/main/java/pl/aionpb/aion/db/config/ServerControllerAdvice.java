package pl.aionpb.aion.db.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Grzegorz Nowakowski
 */
@ControllerAdvice
public class ServerControllerAdvice {

    @ModelAttribute
    public void setServerCookie(@RequestParam(value = "server", required=false) String server, HttpServletResponse response) {

        if (server != null) {
            Cookie cookie = new Cookie("AionPB.server", server);
            cookie.setPath("/");
            response.addCookie(cookie);
        }
    }
}
