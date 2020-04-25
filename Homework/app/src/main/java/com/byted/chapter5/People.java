package com.byted.chapter5;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class People {
    //@SerializedName 属性重命名，将json文件中的属性名转为我们自己自定义的属性名
    @SerializedName("age")
    public int age;
    @SerializedName("name")
    public String firstName;
    @SerializedName("friends")
    public List<String> friends;

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", friends=" + friends +
                '}';
    }
}
