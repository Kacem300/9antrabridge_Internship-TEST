package antraback.kacem.controller;


import antraback.kacem.model.course;
import antraback.kacem.service.bridgeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class bridgecontroller {
@Autowired
    private bridgeservice bridgeservice ;
    @RequestMapping (method = RequestMethod.GET, value = "/course")
   public List<course> getcourse(){
   return bridgeservice.getcourses();
   }
   @RequestMapping("/course/{id}")
    public course getid(@PathVariable long id){
        return bridgeservice.getid(id);
   }
    @RequestMapping(method = RequestMethod.DELETE, value = "/course/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletecourse(@PathVariable long id) {
        bridgeservice.deletecourse(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/course")
public void addcourse (@RequestBody course course){
        bridgeservice.addcourse(course);
}
@RequestMapping(method = RequestMethod.PUT,value = "/course/{id}")
public void updatecourse (@RequestBody course course,@PathVariable long id){
        bridgeservice.updatecourse(course,id);
}
}
