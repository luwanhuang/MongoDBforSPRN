package cn.hogrider.mongo.entity;

import cn.hogrider.mongo.utils.GeneratedValue;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String username;

    private String password;


    private String email;

    private String address;

    private String phone;

    private String occupation;
}
