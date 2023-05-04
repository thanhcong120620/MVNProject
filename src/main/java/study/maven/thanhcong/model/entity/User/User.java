package study.maven.thanhcong.model.entity.User;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Map;

@Entity
@Getter
@Setter
@ToString
@Table(name="userpj")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "useremail",nullable = false,length = 100)
    private String useremail;
    @Column(name="loyallevel",columnDefinition = "int default 0")
    private int loyalLevel;
    @Column(name = "password",nullable = false,length = 100)
    private String password;
    @Column(name="isactive")
    private boolean isActive;
    @Column(name="fullname",nullable = false,length = 100)
    private String fullName;
    @Column(name="locationnumber")
    private int locationNumber;
    @Column(name = "avatar",nullable = false,length = 300)
    private String avatar;
    @Column(name="createday")
    private Timestamp createDay;
    @Column(name="phone")
    private String phone;
    @Column(name="addressuser")
    private String addressUser;
/*    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "roleslist")
    @ElementCollection(fetch = FetchType.EAGER)
    Collection<String> roles;
    @ElementCollection
    @CollectionTable(name="token")
    Map<String, String> token;
    @Enumerated(EnumType.STRING)
    private Provider provider;
*/
}