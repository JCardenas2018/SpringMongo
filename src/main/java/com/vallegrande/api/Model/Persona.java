package com.vallegrande.api.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection = "Persona")
public class Persona {
    @Id
    private int idper;
    private String nomper;
    private String apeper;
}
