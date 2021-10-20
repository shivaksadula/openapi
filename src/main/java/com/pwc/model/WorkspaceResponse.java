package com.pwc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkspaceResponse extends WorkspaceRequest {

    private String startDate;
    private Territory territoryDetails;
    private boolean active;
    private String archivedDate;
    private String deletedDate;
    private Map<String, String> lineage;
    private String status;
    private List<String> externalDomains;
    private boolean limitDataRequest;
    private boolean limitReportSharing;
}
