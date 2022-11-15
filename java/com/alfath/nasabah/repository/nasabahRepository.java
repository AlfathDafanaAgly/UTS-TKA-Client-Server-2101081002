/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alfath.nasabah.repository;

import com.alfath.Nasabah.entity.nasabah;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author FaYuzRizkiSari
 */
@Repository
public interface nasabahRepository extends JpaRepository<nasabah, Long>{
    public nasabah findByPeminjamanId(Long nasabahId);
    
}