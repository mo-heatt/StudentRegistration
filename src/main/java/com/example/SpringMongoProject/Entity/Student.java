package com.example.SpringMongoProject.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection ="students")
public class Student {

    @Id
    private String _id;
    private String studentname;
    private String studentaddress;
    private String mobile;

}