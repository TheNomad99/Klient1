package com.example.demo.Kontroller;

import com.example.demo.Model.todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoKontroller {
    private final List<todo> alleTodos = new ArrayList<>();

    public TodoKontroller() {
        this.alleTodos.add(new todo("this a someting"));
        this.alleTodos.add(new todo("read a book"));
        this.alleTodos.add(new todo("write a book"));
        this.alleTodos.add(new todo("do a summary"));
        this.alleTodos.add(new todo("go for a run"));
    }

    @PostMapping("/lagre")
    public boolean lagre(todo todos){
        if(todos == null){
            return false;
        } else{
            alleTodos.add(todos);
            return true;
        }
    }

    @GetMapping("/hentAlle")
    public List<todo> hentAlle(){
        return alleTodos;
    }
}
