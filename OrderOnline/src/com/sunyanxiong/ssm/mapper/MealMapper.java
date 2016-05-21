package com.sunyanxiong.ssm.mapper;

import com.sunyanxiong.ssm.po.MealCustom;

import java.util.List;

/**
 * Description: 查询菜品 dao 接口
 * <p>
 * Created by daxiongit on 2016/5/18 0018.
 */
public interface MealMapper {

    // 查询全部菜品列表
    List<MealCustom> findAllMeal () throws Exception;

    // 新增菜品
    void saveMeal(MealCustom mealCustom) throws Exception;
}