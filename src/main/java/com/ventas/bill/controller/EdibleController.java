package com.ventas.bill.controller;

import com.ventas.bill.domain.Edible;
import com.ventas.bill.dto.request.EdibleRequest;
import com.ventas.bill.dto.request.update.EdibleUpdateRequest;
import com.ventas.bill.service.EdibleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/edible")
@RequiredArgsConstructor
@CrossOrigin
public class EdibleController {

    public final EdibleService edibleService;

    @GetMapping("/list")
    public ResponseEntity<List<Edible>> list()throws Exception{
        return ResponseEntity.ok(edibleService.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<Edible> save(@RequestBody EdibleRequest edibleRequest)throws Exception{
        return ResponseEntity.ok(edibleService.save(edibleRequest));

    }

    @PutMapping("/update")
    public ResponseEntity<Edible> update(@RequestBody EdibleUpdateRequest edibleUpdateRequest)throws Exception{
        return ResponseEntity.ok(edibleService.update(edibleUpdateRequest));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Edible> findById(@PathVariable("id")Long id)throws Exception{
        return ResponseEntity.ok(edibleService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Edible> delete(@PathVariable("id")Long id)throws Exception{
        return ResponseEntity.ok(edibleService.delete(id));
    }



}
