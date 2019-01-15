package com.ibokoko;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class ResultParam {

   private final String name;

   @GeneratedValue
   @Id
   Long id;

   public ResultParam(){
       this.name = null;
   }

    @JsonCreator
    public ResultParam(@JsonProperty("name") String name){
       // this();
       this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultParam that = (ResultParam) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
