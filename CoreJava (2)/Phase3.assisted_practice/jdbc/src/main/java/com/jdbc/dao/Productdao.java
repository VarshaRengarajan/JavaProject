package com.jdbc.dao;
import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;    
import com.jdbc.entity.Product;

public class Productdao {

    JdbcTemplate template;    
    
    public void setTemplate(JdbcTemplate template) {    
        this.template = template;    

}
    public List<Product> getProduct(){    
        return template.query("select * from product",new RowMapper<Product>(){    
            public Product mapRow(ResultSet rs, int row) throws SQLException {    
                    Product e=new Product();    
                e.setId(rs.getInt(1));    
                e.setProduct_name(rs.getString(2));    
                e.setProduct_price(rs.getInt(3));    
                e.setProduct_category(rs.getString(4));    
                return e;    
            }
        });
        
    }
    
}
