import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class customListTest {
    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null,new ArrayList<City>());
    }

    @Test
    public void getCountTest(){
        int listSize = list.getCount();
        assertEquals(listSize,0);
        City city = new City("Halifax","NS");
        list.addCity(city);
        assertEquals(listSize,1);
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        City city = new City("Halifax","NS");
        list.addCity(city);
        assertEquals(list.getCount(),listSize+1);
    }

    @Test
    public void hasCityTest(){
        City city = new City("Halifax","NS");
        assertEquals(list.hasCity(city),false);
        list.addCity(city);
        assertEquals(list.hasCity(city),true);
    }

    @Test
    public void deleteCityTest(){
        City city = new City("Halifax","NS");
        list.addCity(city);
        assertEquals(list.hasCity(city),true);
        list.deleteCity(city);
        assertEquals(list.hasCity(city),false);
    }

}
