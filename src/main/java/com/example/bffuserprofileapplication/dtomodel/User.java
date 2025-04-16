package com.example.bffuserprofileapplication.dtomodel;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class User {

    private Long id;
    private String name;
    private Profile profile;
    private List<Post> posts;

}

