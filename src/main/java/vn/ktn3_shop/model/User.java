package vn.ktn3_shop.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Email cannot be empty!")
    private String email;

    @NotBlank(message = "Password cannot be empty!")
    private String password;

    @NotBlank(message = "First name cannot be empty!")
    private String firstName;

    @NotBlank(message = "Last name cannot be empty!")
    private String lastName;

    @Column(length = 10)
    @Size(min = 10, max = 10, message = "Phone number must be exactly 10 characters!")
    @Pattern(
            regexp = "0\\d{9}",
            message = "Phone number must start with 0 and contain only digits!"
    )
    private String phoneNumber;

    private String province;  // Tỉnh
    private String district;  // Huyện
    private String ward;      // Xã
    @Lob
    private String addressDetail;

}
