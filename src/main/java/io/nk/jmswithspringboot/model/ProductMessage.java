package io.nk.jmswithspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductMessage implements Serializable {

    static final long serialVersionUID = 42L;
    private UUID id;
    private String message;


}
