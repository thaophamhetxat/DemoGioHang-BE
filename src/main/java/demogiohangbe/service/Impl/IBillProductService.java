package demogiohangbe.service.Impl;

import demogiohangbe.model.BillProduct;

import java.util.ArrayList;

public interface IBillProductService {
    BillProduct save(BillProduct billProduct);

    BillProduct findById(long id);

    ArrayList<BillProduct> findAll();

    ArrayList<BillProduct> findAllByName(String name);

    void delete(BillProduct billProduct);

    void edit(BillProduct billProduct);
}
