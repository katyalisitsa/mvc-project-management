package com.myApp.implementation;

import com.myApp.dto.RoleDTO;
import com.myApp.service.RoleService;

import java.util.List;

public class RoleServiceImpl extends AbstractMapService<RoleDTO,Long> implements RoleService {
    @Override
    public List<RoleDTO> findAll() {
        return super.findAll();
    }

    @Override
    public RoleDTO save(RoleDTO object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void update(RoleDTO object) {
        super.update(object.getId(),object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(RoleDTO object) {
        super.delete(object);
    }

    @Override
    public RoleDTO findById(Long id) {
        return super.findById(id);
    }
}