package Services;

import Data.ManagerData;

public abstract class AbsService {
    private ManagerData managerData;
    public AbsService(ManagerData managerData) {
        this.managerData = managerData;
    }
}
