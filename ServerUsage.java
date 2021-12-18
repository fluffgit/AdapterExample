package TRENER3;

import TRENER3.Singleton.EnumServer;
import TRENER3.Singleton.Server;

public class ServerUsage {
    public static void main(String[] args) {

        Server server =Server.getInstanace();

        EnumServer.INSTANCE.addServer("test");






    }


}
