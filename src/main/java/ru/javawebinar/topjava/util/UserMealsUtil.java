package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.model.UserMealWithExceed;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class UserMealsUtil {
    public static void main(String[] args) {
        List<UserMeal> mealList = Arrays.asList(
            new UserMeal(LocalDateTime.of(2018, Month.MAY,30,10,1), "Завтрак", 500),
            new UserMeal(LocalDateTime.of(2018, Month.MAY,30,13,0), "Обед", 500),
            new UserMeal(LocalDateTime.of(2018, Month.MAY,30,20,0), "Ужин", 500),
            new UserMeal(LocalDateTime.of(2018, Month.MAY,30,10,0), "Завтрак", 500),
            new UserMeal(LocalDateTime.of(2018, Month.MAY,30,13,0), "Обед", 500),
            new UserMeal(LocalDateTime.of(2018, Month.MAY,30,20,0), "Ужин", 500)
        );
        getFilteredMealsWithExceeded(mealList, LocalTime.of(7,0), LocalTime.of(12, 0), 2000);
//        .toLocalTime();
//        .toLocalDate();
    }

    private static List<UserMealWithExceed> getFilteredMealsWithExceeded(List<UserMeal> mealList, LocalTime of, LocalTime of1, int i) {
        return null;
    }


}
