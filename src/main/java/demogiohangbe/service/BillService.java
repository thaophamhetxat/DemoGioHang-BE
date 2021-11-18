package demogiohangbe.service;

import demogiohangbe.model.Bill;
import demogiohangbe.repository.IBillRepository;
import demogiohangbe.service.Impl.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class BillService implements IBillService {
    @Autowired
    IBillRepository iBillRepository;

    @Override
    public Bill save(Bill bill) {
        return iBillRepository.save(bill);
    }

    @Override
    public Optional<Bill> findById(long id) {
        return iBillRepository.findById(id);
    }

    @Override
    public ArrayList<Bill> findAll() {
        return (ArrayList<Bill>) iBillRepository.findAll();
    }

    @Override
    public ArrayList<Bill> findAllByName(String name) {
        return null;
    }

    @Override
    public void delete(Bill bill) {
        iBillRepository.delete(bill);
    }

    @Override
    public void edit(Bill bill) {
        iBillRepository.save(bill);
    }
}
