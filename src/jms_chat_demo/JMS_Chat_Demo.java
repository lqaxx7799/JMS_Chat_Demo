/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jms_chat_demo;

import javax.jms.JMSException;
import javax.naming.NamingException;

/**
 *
 * @author Admin
 */
public class JMS_Chat_Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException, JMSException {
        // TODO code application logic here
        new ChatScreen();
    }
    
}
