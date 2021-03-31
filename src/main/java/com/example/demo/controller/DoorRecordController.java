package com.example.demo.controller;

import com.example.demo.entity.DoorRecord;
import com.example.demo.service.impl.DoorRecordService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoorRecordController {

    @Autowired
    private DoorRecordService doorRecordService;

    @ApiOperation(value = "通过userId获取进出数据")
    @GetMapping("/Door/query/{id}")
    public List<DoorRecord> getDoorRecord(@PathVariable int id){
        return doorRecordService.query(id);
    }

    @ApiOperation(value = "通过userId添加进出数据")
    @PostMapping("/Door/add/{id}")
    public boolean addDoorRecord(@PathVariable int id, @RequestBody DoorRecord doorRecord){
        return doorRecordService.insert(id, doorRecord);
    }
}
