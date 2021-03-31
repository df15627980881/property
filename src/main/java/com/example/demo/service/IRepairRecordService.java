package com.example.demo.service;

import com.example.demo.entity.RepairRecord;

import java.util.List;

/**
 * @Description: 维修Service
 * @author: df36643264
 * @date: 2021年03月18日 17:34
 */
public interface IRepairRecordService {

    List<RepairRecord> getRepairRecordList(int id);

    RepairRecord getRepairRecordById(int id);

    Boolean addRepairRecord(int id, RepairRecord record);

    Boolean updateRepairRecord(RepairRecord record);

    Boolean deleteRepairRecord(int id);
}
