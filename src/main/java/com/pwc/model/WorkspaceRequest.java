package com.pwc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkspaceRequest {

    private String id;
    @NotBlank
    private String name;
    private String clientId;
    private String clientName;
    private String engagementType;
    private String workspaceType;
    @NotBlank
    private String originatingSite;
    @NotBlank
    private String territory;
    private String wbsCode;
    private String apptioId;
    private LineOfService lineOfService;
    private String endDate;
    private boolean isTeamsEnabled;
    @NotBlank
    private String dataClassification;
    @NotBlank
    private String dataConsentLevel;
    private String catalogVersion;
    private Map<String, String> tags;
    @NotBlank
    private List<WorkspaceUser> teamMembers;
}
