package kr.co.fastcampus.cafego.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    @Test
    public void creation(){
        Restaurant restaurant = new Restaurant("1리터","대전");
        assertThat(restaurant.getName(), is("1리터"));
        assertThat(restaurant.getAddress(), is("대전"));

    }

}