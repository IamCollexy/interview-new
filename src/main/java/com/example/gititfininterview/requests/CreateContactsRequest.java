/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gititfininterview.requests;

import java.util.List;
import javax.validation.constraints.NotNull;

/**
 *
 * @author HP
 */
public record CreateContactsRequest(
        String email,
        String name,
        String phoneNumber
     ){}
