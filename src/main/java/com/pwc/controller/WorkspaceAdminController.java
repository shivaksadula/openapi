package com.pwc.controller;

import com.pwc.model.*;
//import com.pwc.service.AdminService;
//import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/admin")
//@Api(produces = MediaType.APPLICATION_JSON_VALUE, tags = {"Admin"})
public class WorkspaceAdminController {

//    @Autowired
//    private AdminService adminService;

    @GetMapping("/los")
    public ResponseEntity<LineOfService[]> getLineOfServices() {
        LineOfService[] lineOfServices = LineOfService.values();
        return ResponseEntity.ok(lineOfServices);
    }

    @PostMapping("/integrated-systems")
    public ResponseEntity<IntegratedSystems[]> onBoardApplication() {
        IntegratedSystems[] integratedSystems = IntegratedSystems.values();
        return ResponseEntity.ok(integratedSystems);
    }

    @GetMapping("/integrated-systems")
    public ResponseEntity<IntegratedSystems[]> getIntegratedApplications() {
        IntegratedSystems[] integratedSystems = IntegratedSystems.values();
        return ResponseEntity.ok(integratedSystems);
    }

    @GetMapping("/permissions")
    public ResponseEntity<List<WorkspacePermission>> getPermissions() {
        WorkspacePermission[] permissions = WorkspacePermission.values();
        return ResponseEntity.ok(Arrays.asList(permissions));
    }

    @PutMapping("/permissions")
    public ResponseEntity<List<WorkspacePermission>> registerPermission(@RequestParam final String permissionName) {
        WorkspacePermission[] permissions = WorkspacePermission.values();
        return ResponseEntity.ok(Arrays.asList(permissions));
    }

    @GetMapping("/permissions/{permissionName}/groups")
    public ResponseEntity<List<WorkspacePermission>> getGroupsByPermission(@PathVariable final String permissionName) {
        WorkspacePermission[] permissions = WorkspacePermission.values();
        return ResponseEntity.ok(Arrays.asList(permissions));
    }

    @GetMapping("/groups")
    public ResponseEntity<List<WorkspaceGroup>> getGroups(@RequestParam(required = false) final String groupName) {
        List<WorkspacePermission> workspacePermissions = Arrays.asList(WorkspacePermission.values());
        WorkspaceGroup workspaceGroup = new WorkspaceGroup("Workbench User", workspacePermissions);
        return ResponseEntity.ok(Collections.singletonList(workspaceGroup));
    }


    @PostMapping("/groups")
    public ResponseEntity<WorkspaceGroup> registerGroup(@RequestBody WorkspaceGroup workspaceGroup) {
        return ResponseEntity.ok(workspaceGroup);
    }

    @PostMapping("/groups/{groupName}/users")
    public ResponseEntity<WorkspaceUserGroup> addUserToGroup(@PathVariable final String groupName, @RequestParam final String pwcGuid) {
        WorkspaceUserGroup workspaceUserGroup = WorkspaceUserGroup.builder()
                .user(new WorkspaceUser())
                .groups(Collections.singletonList(new WorkspaceGroup()))
                .build();
        return ResponseEntity.ok(workspaceUserGroup);
    }

    @GetMapping("/groups/{groupName}/users")
    public ResponseEntity<List<WorkspaceUser>> getGroupUsers(@PathVariable final String groupName) {
        return ResponseEntity.ok(Collections.singletonList(new WorkspaceUser()));
    }

    /*@Deprecated
    @GetMapping("/xxx/load/{count}")
    public ResponseEntity<Void> loadData(@PathVariable final int count) {
//        adminService.addRandomData(count);
        return ResponseEntity.noContent().build();
    }

    @Deprecated
    @GetMapping("/xxx/count")
    public ResponseEntity<Long> count() {
//        long count = adminService.countWorkspaces();
        return ResponseEntity.ok(1L);
    }*/
}
