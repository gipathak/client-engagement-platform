package com.ps.clientengagement.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "client_engagement_records")
public class ClientEngagementRecord {
    @Id
    private String id;
    private String BU;
    private String Vertical;
    private String Account;
    private String FocusedAccount;
    private String Abbreviation;
    private String Project;
    private String Remark;
    private String ActiveInactive;
    private String KeyContactEmail;
    private String IPAddress;
    private int RequestDate;
    private String ConfluenceURL;
}
