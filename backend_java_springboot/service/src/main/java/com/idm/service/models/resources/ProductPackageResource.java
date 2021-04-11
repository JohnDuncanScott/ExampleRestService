package com.idm.service.models.resources;

import lombok.*;
import org.springframework.hateoas.RepresentationModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductPackageResource extends RepresentationModel<ProductPackageResource> {
    // A null id indicates an id needs to be generated
    private String id;
    @NonNull private String name;
    @NonNull private String description;
}