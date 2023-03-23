package com.ps.clientengagement.controller;

import com.ps.clientengagement.model.ClientEngagementRecord;
import com.ps.clientengagement.service.ClientEngagementRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientEngagementRecordController {
    @Autowired
    private ClientEngagementRecordService service;

    @GetMapping("/records")
    public ResponseEntity<List<ClientEngagementRecord>> getAllRecords() {
        List<ClientEngagementRecord> records = service.getAllRecords();
        if (records.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(records);
        }
    }

}
