package demogiohangbe.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@AllArgsConstructor //tạo Constructor có tất cả tham số
@NoArgsConstructor //tạo Constructor không tham số
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int age;
    private String username;
    private String password;
    private String role;// vaitro
    private String gender;// gioitinh
    private String image;// url anh
    private int loginCounter;

}
