package com.example.HomeController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {


    @GetMapping("/names")
    public List<String> getName() {
        return List.of("koyama", "tanaka");
    }


    @PostMapping("/names")
    public ResponseEntity<String> create(@RequestBody CreateForm createForm) {
        //登録処理は省略
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/names/id")
                .build()
                .toUri();
        return ResponseEntity.created(url).body("name successfully created");
    }

    @PatchMapping("/names/{id}")
    public ResponseEntity<Map<String, String>> update(@PathVariable("id") int id, @RequestBody UpdateForm updateForm) {
        //更新処理は省略
        return ResponseEntity.ok(Map.of("message", "name successfully updated"));
    }

    @DeleteMapping("/names/{id}")
    public ResponseEntity<Map<String, String>> delete(@PathVariable("id") int id) {
        //削除処理は省略
        return ResponseEntity.ok(Map.of("message", "id successfully deleted"));
    }
}
