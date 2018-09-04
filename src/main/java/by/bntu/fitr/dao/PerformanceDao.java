package by.bntu.fitr.dao;

import by.bntu.fitr.model.entity.Performance;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PerformanceDao extends Dao {

    public List<Performance> findAll(){
        //language=SQL
        List<Performance> performances = new ArrayList<Performance>();
        ResultSet resultSet = executeWithResult("SELECT * FROM performance");
        try{
            while (resultSet.next()){
                performances.add(new Performance(
                        resultSet.getLong("id"),resultSet.getString("title")
                ));
            }
        }catch (Exception e){
            System.err.println(e);
        }
        return performances;
    }

}
