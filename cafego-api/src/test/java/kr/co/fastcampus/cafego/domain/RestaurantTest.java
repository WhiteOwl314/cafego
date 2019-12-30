package kr.co.fastcampus.cafego.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class RestaurantTest {

    @Test
    public void creation(){
        Restaurant restaurant = new Restaurant(1004L, "1리터", "대전");
        assertThat(restaurant.getName(), is("1리터"));
        assertThat(restaurant.getAddress(), is("대전"));

    }

    @Test
    public void information(){
        Restaurant restaurant = new Restaurant(1004L, "1리터", "대전");

        assertThat(restaurant.getInformation(), is("1리터 in 대전"));
    }

}