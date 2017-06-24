package main.contract.action;

/**
 * Created by AR c on 2017/6/23.
 */

import java.io.Serializable;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import static com.opensymphony.xwork2.Action.SUCCESS;

public class LogoutAction extends ActionSupport implements Serializable{
    private static final long serialVersionUID = -1086634331328217279L;

    public String execute()throws Exception
    {
        HttpSession session = ServletActionContext.getRequest().getSession();
        session.invalidate();
        return SUCCESS;
    }
}
