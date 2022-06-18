package com.ventas.bill.controller;

import com.ventas.bill.domain.Bill;
import com.ventas.bill.dto.request.BillRequest;
import com.ventas.bill.dto.request.update.BillUpdateRequest;
import com.ventas.bill.service.BillService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/bill")
@RequiredArgsConstructor
@CrossOrigin
public class BillController {

    public final BillService billService;

    @GetMapping("/list")
    public ResponseEntity<List<Bill>> list()throws Exception{
        return null; //ResponseEntity.ok(edibleService.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<Bill> save(@RequestBody BillRequest billRequest)throws Exception{
        return ResponseEntity.ok(billService.save(billRequest)); // ResponseEntity.ok(edibleService.save(edibleRequest));
    }

    @PutMapping("/update")
    public ResponseEntity<Bill> update(@RequestBody BillUpdateRequest billUpdateRequest)throws Exception{
        return null;// ResponseEntity.ok(edibleService.update(edibleUpdateRequest));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bill> findById(@PathVariable("id")Long id)throws Exception{
        return null;// ResponseEntity.ok(edibleService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Bill> delete(@PathVariable("id")Long id)throws Exception{
        return null;// ResponseEntity.ok(edibleService.delete(id));
    }



}
