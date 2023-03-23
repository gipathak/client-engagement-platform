package com.ps.clientengagement.repository;

import com.ps.clientengagement.model.ClientEngagementRecord;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientEngagementRecordRepository extends MongoRepository<ClientEngagementRecord, String> {
    List<ClientEngagementRecord> findByAccount(String account);
}
