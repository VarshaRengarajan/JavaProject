package com.assistedhibernate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;  
import javax.persistence.Table;  
  
@Entity  
@Table(name= "product")   
public class Productann {    
  
        @Id @GeneratedValue   
        @Column(name = "id")
        private String id;
        
        @Column(name = "product_name")
        private String product_name;
        
        @Column(name = "product_price")
        private int product_price;
        
        @Column(name = "product_category")
        private String product_category;  
            
        public String getid() {return this.id; }
        public String getproduct_name() { return this.product_name;}
        public int getproduct_price() { return this.product_price;}
        public String getproduct_category() { return this.product_category;}
        
        public void setid(String id) { this.id = id;}
        public void setproduct_name(String product_name) { this.product_name = product_name;}
        public void setproduct_rice(int product_price) { this.product_price = product_price;}
        public void setproduct_category(String product_category) { this.product_category = product_category;}    
}   


