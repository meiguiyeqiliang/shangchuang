package com.jk.service;

import com.jk.entity.TbOrder;

import java.util.List;

public interface PinyougouService {
    public List<TbOrder>  getTbOrderList();
    public TbOrder findTbOrderById(Long id);
    public void  save(TbOrder tbOrder);
    public  void edit(TbOrder tbOrder);
    public void delete(Long id);
}
