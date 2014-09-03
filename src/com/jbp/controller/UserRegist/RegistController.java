package com.jbp.controller.UserRegist;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestMap;

import com.jbp.service.UserRegistService;

public class RegistController extends Controller {

    private UserRegistService userRegistService =new UserRegistService();
    @Override
    public Navigation run() throws Exception {

        userRegistService.addUser(new RequestMap(request));
        return redirect(basePath);
    }
}
