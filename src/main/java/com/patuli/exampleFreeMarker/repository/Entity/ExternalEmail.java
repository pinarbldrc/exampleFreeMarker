package com.patuli.exampleFreeMarker.repository.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExternalEmail {

    private String message;
    private boolean status;
}
