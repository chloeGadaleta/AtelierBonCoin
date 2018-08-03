/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.bonCoin.test;

import atos.bonCoin.entity.Region;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class JPATest {
    
    
    @Test
    public void ajouterInfoTable(){
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("BON");
        EntityManager em = factory.createEntityManager();
        
        // demarrer transaction
        em.getTransaction().begin();
        
        
        //Création d'une nouvelle region
        Region reg = new Region();
        
        reg.setNom("Provence Alpe côte d'Azur");
        

       
        
        
        
        
        
        
        
        
        // On termine 
        em.getTransaction().commit();
    }
   
    
    @Test
    public void demarrerJPA(){
        Persistence.createEntityManagerFactory("BON");
    }
    
}
