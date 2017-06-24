package main.contract.action;

/**
 * Created by AR c on 2017/6/22.
 */

import java.io.Serializable;
import javax.servlet.http.HttpSession;
import java.util.logging.Logger;
//import org.apache.log4j.Logger; 这个先用logging.logger包里面的替代
import org.apache.struts2.ServletActionContext;

import main.contract.entity.User;
import main.contract.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;

public class LoginAction extends ActionSupport implements Serializable{

    private static final long serialVersionUID = -5210934955750259107L;
    private static Logger logger = Logger.getLogger(LoginAction.class);
    @Autowired
    private UserService userSerivce;

    private  String userName;

    private String password;




    private User user;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String execute() throws Exception
    {

        if(userSerivce.exists(userName))
        {
            user = userSerivce.findUserByName(userName);
            if(this.password.equals(user.getPassword()))
            {
                ActionContext.getContext().getSession().put("userName", userName);
                return SUCCESS;
            }
            else
            {
            this.addFieldError("password", "密码错误");
            return INPUT;
            }
        }
        else
        {
            this.addFieldError("userName", "用户名不存在");
            return INPUT;
        }

    }

}
