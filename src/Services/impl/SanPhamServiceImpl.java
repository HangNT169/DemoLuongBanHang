/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.SanPham;
import Responsitories.SanPhamRespository;
import Responsitories.impl.SanPhamRespositoryImpl;
import Services.SanPhamService;
import ViewModels.SanPhamResponse;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class SanPhamServiceImpl implements SanPhamService {

    private final SanPhamRespository sanPhamRespository
            = new SanPhamRespositoryImpl();

    @Override
    public List<SanPhamResponse> getAll() {
        return sanPhamRespository.getAll();
    }

    @Override
    public SanPham getOne(String id) {
        return sanPhamRespository.getOne(id);
    }

}
