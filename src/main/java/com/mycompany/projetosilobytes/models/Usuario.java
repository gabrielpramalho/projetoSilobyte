
package com.mycompany.projetosilobytes.models;

import java.io.Serializable;

/**
 *
 * @author Gabriel
 */
public class Usuario implements Serializable{
    
   String login;
   String name;
   String password;
   
   public Usuario(){
       this.login = "";
       this.name = "";
       this.password = "";
   }

    public Usuario(String login, String name, String password) {
        this.login = login;
        this.name = name;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
   
    
}
