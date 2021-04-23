package com.librarymanagement.librarymanagementsystem_server;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book {
  @Id
  private String title;
  // @GeneratedValue(strategy=GenerationType.AUTO)
    private String name;
    private int publishYear;
    private int publish;
    

  public void setTitle(String title){
    this.title=title;
  }
  public String getTitle(){
    return this.title;
  }
  public void setName(String name){
    this.name=name;
  }
  public String getName(){
    return this.name;
  }
  public void setpublishYear(int publishYear){
    this.publishYear=publishYear;
  }
  public int getpublishYear(){
    return this.publishYear;
  }
  public void setpublish(int publish){
    this.publish=publish;
  }
  public int getpublish(){
    return this.publish;
  }
  

}
