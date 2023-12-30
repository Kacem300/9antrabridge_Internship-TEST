package antraback.kacem.service;

import antraback.kacem.model.course;
import antraback.kacem.repository.bridgerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class bridgeservice {
    @Autowired
    private bridgerepository bridgerepository ;


    public List<course> getcourses() {
List<course> courses = new ArrayList<>();
bridgerepository.findAll().forEach(course -> {
    courses.add(course);
});
        return courses;
    }
    public course getid(long id ){
        return bridgerepository.findById(id).orElse(null);
    }
    public void deletecourse(long id ){
        bridgerepository.deleteById(id);
    }
    public void addcourse(course course){
        bridgerepository.save(course);
    }
    public void updatecourse (course course , long id){
        bridgerepository.save(course);
    }
}
