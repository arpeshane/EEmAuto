
package com.nice.eem.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author abhishek
 */
@Table(name = "ldapconfiguration")
@Entity
public class LdapConfiguration {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="serverurl")
    private String serverurl;
    @Column(name="basedn")
    private String basedn;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="userdnpattern")
    private String userdnpattern;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServerurl() {
        return serverurl;
    }

    public void setServerurl(String serverurl) {
        this.serverurl = serverurl;
    }

    public String getBasedn() {
        return basedn;
    }

    public void setBasedn(String basedn) {
        this.basedn = basedn;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserdnpattern() {
        return userdnpattern;
    }

    public void setUserdnpattern(String userdnpattern) {
        this.userdnpattern = userdnpattern;
    }
    
}
