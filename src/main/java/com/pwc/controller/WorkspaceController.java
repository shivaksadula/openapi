package com.pwc.controller;

import com.pwc.model.*;
//import com.pwc.service.WorkspaceService;
//import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/workspaces", produces = MediaType.APPLICATION_JSON_VALUE)
//@Api(produces = MediaType.APPLICATION_JSON_VALUE, tags = {"Workspaces"})
public class WorkspaceController {

//    @Autowired
//    private WorkspaceService workspaceService;

    @PostMapping
    public ResponseEntity<WorkspaceResponse> createWorkspace(@RequestBody WorkspaceRequest workspaceRequest) {
//        WorkspaceResponse workspace = workspaceService.createWorkspace(workspaceRequest);
        WorkspaceResponse workspaceResponse = new WorkspaceResponse();
        return ResponseEntity.ok(workspaceResponse);
    }

    @PatchMapping("/{engagementId}/metadata")
    public ResponseEntity<WorkspaceResponse> updateWorkspaceMetadata(@PathVariable final String engagementId, @RequestBody WorkspaceMetadata workspaceMetadata) {
//        WorkspaceResponse workspace = workspaceService.updateWorkspaceMetadata(engagementId, workspaceMetadata);
        WorkspaceResponse workspaceResponse = new WorkspaceResponse();
        return ResponseEntity.ok(workspaceResponse);
    }

    @PutMapping("/{engagementId}/users")
    public ResponseEntity<WorkspaceResponse> updateUsers(@PathVariable final String engagementId, @RequestBody UpdateUsersRequest usersRequest) {
//        WorkspaceResponse workspace = workspaceService.updateUsers(engagementId, usersRequest);
        WorkspaceResponse workspaceResponse = new WorkspaceResponse();
        return ResponseEntity.ok(workspaceResponse);
    }

    @PatchMapping("/{engagementId}/lineage")
    public ResponseEntity<WorkspaceResponse> updateWorkspaceLineage(@PathVariable final String engagementId, @RequestParam final String status) {
//        WorkspaceResponse workspace = workspaceService.updateLineage(engagementId, status);
        WorkspaceResponse workspaceResponse = new WorkspaceResponse();
        return ResponseEntity.ok(workspaceResponse);
    }

    @GetMapping("/{engagementId}")
    public ResponseEntity<WorkspaceResponse> getWorkspace(@PathVariable final String engagementId) {
//        WorkspaceResponse workspace = workspaceService.getWorkspace(engagementId);
        WorkspaceResponse workspaceResponse = new WorkspaceResponse();
        return ResponseEntity.ok(workspaceResponse);
    }

    @GetMapping("/{engagementId}/users")
    public ResponseEntity<List<WorkspaceUser>> getUsers(@PathVariable final String engagementId) {
//        List<WorkspaceUser> workspaceUsers = workspaceService.getUsers(engagementId);
        List<WorkspaceUser> workspaceUsers = Collections.singletonList(new WorkspaceUser());
        return ResponseEntity.ok(workspaceUsers);
    }

    @PutMapping("/{engagementId}/archive")
    public ResponseEntity<WorkspaceResponse> archiveWorkspace(@PathVariable final String engagementId) {
//        WorkspaceResponse workspace = workspaceService.archiveWorkspace(engagementId);
        WorkspaceResponse workspaceResponse = new WorkspaceResponse();
        return ResponseEntity.ok(workspaceResponse);
    }

    @DeleteMapping("/{engagementId}")
    public ResponseEntity<WorkspaceResponse> deleteWorkspace(@PathVariable final String engagementId) {
//        WorkspaceResponse workspace = workspaceService.deleteWorkspace(engagementId);
        WorkspaceResponse workspaceResponse = new WorkspaceResponse();
        return ResponseEntity.ok(workspaceResponse);
    }

    /*@GetMapping("/users/{pwcGuid}")
    public ResponseEntity<List<Workspace>> getWorkspacesByUser(@PathVariable final String pwcGuid,
                                                               @RequestParam(required = false, defaultValue = "0") final int page,
                                                               @RequestParam(required = false, defaultValue = "15") final int size) {
//        List<WorkspaceResponse> workspaces = workspaceService.getWorkspacesByUser(pwcGuid, page, size);
        List<Workspace> workspaces = Collections.singletonList(new Workspace());
        return ResponseEntity.ok(workspaces);
    }*/
}
