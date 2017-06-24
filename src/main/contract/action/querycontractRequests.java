package main.contract.action;

import com.opensymphony.xwork2.ModelDriven;
import main.contract.entity.Contract;

/**
 * Created by AR c on 2017/6/24.
 */
public class querycontractRequests implements ModelDriven<Contract> {

    private Contract contract;

    @Override
    public Contract getModel() {
        if(contract == null){
            contract = new Contract();
        }
        return contract;
    }
}