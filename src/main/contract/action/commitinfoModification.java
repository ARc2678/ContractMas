package main.contract.action;

/**
 * Created by AR c on 2017/6/23.
 */

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.tomcat.util.http.Parameters;

import main.contract.entity.User;

public class commitinfoModification extends ActionSupport implements Serializable{
    private static final long serialVersionUID = 4344825401987682543L;

    private User user;
    public String execute() throws Exception{

        ActionContext context = ActionContext.getContext();
        // get the object of ActionContext
        context.getParameters();

        //获取map属性表单
        Map<String, Parameters> map = context.getParameters();
        Set<String> keys=map.keySet();
        for(String s:keys) {
            System.out.println(map.get(s));
        }
    }
}
