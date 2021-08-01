/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author SHAKIBA
 */
public class Book {
    private String name;
    private String author;
    private int page;
    
    public Book(String author,String name,int page){
        this.name=name;
        this.author=author;
        this.page=page;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPages(){
        return this.page;
    }
    
    public String toString(){
        return this.author+", "+this.name+", "+this.page+" pages";
    }
}
 
