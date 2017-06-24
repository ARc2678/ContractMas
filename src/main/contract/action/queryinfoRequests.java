package main.contract.action;

import com.opensymphony.xwork2.ModelDriven;
import main.contract.entity.User;

/**
 * Created by AR c on 2017/6/24.
 */
public class queryinfoRequests implements ModelDriven<User> {

    private User user;

    @Override
    public User getModel() {
        if(user == null){
            user = new User();
        }
        return user;
    }
}
