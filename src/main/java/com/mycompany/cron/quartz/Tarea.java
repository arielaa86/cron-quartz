/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cron.quartz;

import java.util.Date;
import javax.swing.JTextArea;
import javax.xml.crypto.Data;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 *
 * @author ariel
 */
public class Tarea implements Job {
    
    private static int contador = 1;

    @Override
    public void execute(JobExecutionContext jec) throws JobExecutionException {

        System.out.println("Quartz "+ contador+"!");
        contador++;
        
    }

}
