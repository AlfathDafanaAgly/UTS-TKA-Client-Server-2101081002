/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alfath.nasabah.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author FaYuzRizkiSari
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class peminjaman implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long kodeNasabah;
    private Long namaNasabah;
    private double jumlahPinjaman;
    private int lamaPinjamanBulan;
    private double bungaPerTahunPersen;
    private int angsuranPokok;
}
