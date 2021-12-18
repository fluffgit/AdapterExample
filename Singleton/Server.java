package TRENER3.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Server {

    private static Server instanace; // lazy loading
//     private  static Server instanace = Server.getInstanace(); // Eager loading

      // prosty singleton
//    public static Server getInstanace() {
//        if (instanace == null) {
//            instanace = new Server();
//        }
//        return instanace;
//    }

    // opcja singletone double checked
    public static Server getInstanace() {
        if (instanace == null) {
            synchronized (Server.class) {
                if (instanace == null) {
                    instanace = new Server();
                }
            }
        }
        return instanace;
    }


    private Server() {
    }

    private List<String> lista = new ArrayList<>();

    public boolean addServer(String serverList) {
        if (!lista.contains(serverList)) {
            lista.add(serverList);
            return true;
        }
        return false;
    }

    public List<String> getWholeList() {
        return lista;
    }


}
