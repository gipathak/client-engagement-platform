package com.ps.clientengagement.service;

import com.ps.clientengagement.model.ClientEngagementRecord;
import com.ps.clientengagement.repository.ClientEngagementRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientEngagementRecordService {
    @Autowired
    private ClientEngagementRecordRepository repository;

    public List<ClientEngagementRecord> getAllRecords() {
        return repository.findAll();
    }
}
