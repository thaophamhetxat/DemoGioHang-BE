package demogiohangbe.service;

import demogiohangbe.model.BillProduct;
import demogiohangbe.repository.IBillProductRepository;
import demogiohangbe.service.Impl.IBillProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BillProductService implements IBillProductService {
    @Autowired
    IBillProductRepository iBillProductRepository;

    @Override
    public BillProduct save(BillProduct billProduct) {
        return iBillProductRepository.save(billProduct);
    }

    @Override
    public BillProduct findById(long id) {
        return iBillProductRepository.findById(id);
    }

    @Override
    public ArrayList<BillProduct> findAll() {
        return (ArrayList<BillProduct>) iBillProductRepository.findAll();
    }

    @Override
    public ArrayList<BillProduct> findAllByName(String name) {
        return null;
    }

    @Override
    public void delete(BillProduct billProduct) {
        iBillProductRepository.delete(billProduct);
    }

    @Override
    public void edit(BillProduct billProduct) {
        iBillProductRepository.save(billProduct);
    }
}
