/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alfath.nasabah.controller;

import com.alfath.nasabah.VO.nasabah;
import com.alfath.nasabah.service.NasabahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author FaYuzRizkiSari
 */
@RestController
@RequestMapping("/nasabah")
public class NasabahController {
    @Autowired
    private NasabahService nasabahService;
    
    @PostMapping("/")
    public nasabah saveNasabah(@RequestBody nasabah nasabah){
        return nasabahService.saveNasabah(nasabah);
    }
    @GetMapping("/id")
    public nasabah findNasabahById(@PathVariable("id")Long pelangganId){
        return nasabahService.findNasabahById(nasabahId);
    }
}
