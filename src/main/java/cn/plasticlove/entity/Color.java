package cn.plasticlove.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @author luka-seu
 * @description
 * @create 2019-09 07-22:54
 **/
@Data
@ToString
public class Color {
    private String name;
    public void print(String name){
        System.out.println(name);
    }
}
