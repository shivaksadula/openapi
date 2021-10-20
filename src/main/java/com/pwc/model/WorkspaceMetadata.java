package com.pwc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkspaceMetadata {

    private String wbsCode;
    private String apptioId;
    private String dataConsentLevel;
    private String dataClassification;
    private List<String> externalDomains;
    private boolean limitDataRequest;
    private boolean limitReportSharing;
}
