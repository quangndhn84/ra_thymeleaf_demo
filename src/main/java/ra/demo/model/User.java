package ra.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    private int userId;
    private String userName;
    private String password;
    private String fullName;
    private String address;
    private Date birthDate;
    private String email;
    private String phone;
    private boolean permission;
    private boolean status;
}
