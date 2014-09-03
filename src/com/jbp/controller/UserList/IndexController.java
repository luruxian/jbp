package com.jbp.controller.UserList;

import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import com.jbp.model.Users;
import com.jbp.service.UserListService;

public class IndexController extends Controller {
    
    private UserListService userListService =new UserListService();
    
    @Override
    public Navigation run() throws Exception {
        List<Users> userList = userListService.getUserList();
        requestScope("userList",userList);
        
        return forward("index.jsp");
    }
}
