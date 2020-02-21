package gal.san.clemente.tarefa_4_orm.model.dao.utils.configuration;

public class ConnectionConf {
    
    private String address;
    
    private String port;
    
    private String name;
    
    private String user;
    
    private String password;

    public ConnectionConf(String address, String port, String name, String user, String password) {
        this.address = address;
        this.port = port;
        this.name = name;
        this.user = user;
        this.password = password;
    }

    public ConnectionConf() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
