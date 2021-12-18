package TRENER3.Singleton;

import java.util.ArrayList;
import java.util.List;

public enum EnumServer {
    INSTANCE;

    private List<String> list = new ArrayList<>();

    public boolean addServer(String serverList) {
        if (!list.contains(serverList)) {
            list.add(serverList);
            return true;
        }
        return false;
    }

    public List<String> getWholeList() {
        return list;
    }


}
