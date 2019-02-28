package com.jk.service;

import com.jk.entity.TbOrder;
import com.jk.repository.PinyougouRepository;
import com.jk.service.PinyougouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PinyougouServiceImpl implements PinyougouService{
    @Autowired
    private PinyougouRepository pinyougouRepository;
    @Override
    public List<TbOrder> getTbOrderList() {
        return pinyougouRepository.findAll();
    }



    @Override
    public TbOrder findTbOrderById(Long id) {
        return pinyougouRepository.findOne(id);
    }

    @Override
    public void save(TbOrder tbOrder) {
          pinyougouRepository.save(tbOrder);
    }

    @Override
    public void edit(TbOrder tbOrder) {
         pinyougouRepository.save(tbOrder);
    }

    @Override
    public void delete(Long id) {
        pinyougouRepository.delete(id);
    }
}
