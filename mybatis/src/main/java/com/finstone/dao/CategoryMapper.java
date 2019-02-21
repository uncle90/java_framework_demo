package com.finstone.dao;

import com.finstone.bean.Category;

import java.util.List;

public interface CategoryMapper {

    public int add(Category category);

    public void delete(int id);

    public Category get(int id);

    public int update(Category category);

    public List<Category> listCategory();

    /*public int count();*/
}
