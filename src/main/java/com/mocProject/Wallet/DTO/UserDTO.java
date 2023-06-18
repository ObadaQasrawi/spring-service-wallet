package com.mocProject.Wallet.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {
    private  int id;

    private String userName;

    private String email;

}
