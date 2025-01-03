package org.example.selfcode.cwhCode.clearify;

import java.util.ArrayList;

class product{
    private Integer id;
    private String name;
    private Integer model;
    private String desc;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getModel() {
        return model;
    }
    public void setModel(Integer model) {
        this.model = model;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    @Override
    public String toString() {
        return "product [id=" + id + ", name=" + name + ", model=" + model + ", desc=" + desc + "]";
    }
    public product(Integer id, String name, Integer model, String desc) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.desc = desc;
    }
    
     
    

}

public class arrayproject {
    public static void main(String[] args) {
    product product1 = new product(1, "xuv", 903, "khaldie");
    product product2 = new product(2, "xuv34", 923303, "khaldifsese");
    product product3 = new product(3, "x3445uv", 94503, "khaldsreie");
    ArrayList<product> pro = new ArrayList<>();
    pro.add(product1);
    pro.add(product2);
    pro.add(product3);
    
    //if you want full arraylist
    for(product p : pro){
        // System.out.println(p);
    }
        
    //if you want  one product
    for(product p : pro){
        if (p.getId()==3)  {
            // System.out.println(p);
            
        }
    }

        //if you want delete your product
    
        for(product p : pro){
            if (p.getId()==3)  {
                pro.remove(p);
                
            }

            // System.out.println(pro);
        }

    //     for(product p : pro){
    //         if (p.getId()==3)  {
    //             pro.set
    //             // (3, "khaldi",22,"aklasdaio");
    //             break;
                
    //         }

    // }
    for (int i = 0; i < pro.size(); i++) {
        product p = pro.get(i);
        if (p.getId() == 3) {
            pro.set(i, new product(3, "khaldi", 22, "aklasdaio"));
            break; // No need to continue loop once replacement is done
        }}
        for(product p : pro){
            
                System.out.println(p);
                
            }
    
}}
