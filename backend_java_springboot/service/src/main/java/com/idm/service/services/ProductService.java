package com.idm.service.services;

import com.idm.service.models.data.Product;
import lombok.NonNull;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

    Product getById(@NonNull String id);
}
