package com.example.bffuserprofileapplication.dtomodel;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.ToString;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@Data
@ToString

public class Post {

    private Long id;
    private String title;
    private String content;
}

