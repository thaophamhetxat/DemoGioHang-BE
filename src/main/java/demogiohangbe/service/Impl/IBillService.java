package demogiohangbe.service.Impl;

import demogiohangbe.model.Bill;

import java.util.ArrayList;
import java.util.Optional;

public interface IBillService {
    Bill save(Bill bill);
    Optional<Bill> findById(long id);

    ArrayList<Bill> findAll();

    ArrayList<Bill> findAllByName(String name);

    void delete(Bill bill);

    void edit(Bill bill);
}
