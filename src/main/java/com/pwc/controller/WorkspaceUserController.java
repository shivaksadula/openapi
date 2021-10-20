package com.pwc.controller;

import com.pwc.model.UserGroup;
//import com.pwc.service.WorkspaceUserService;
//import io.swagger.annotations.Api;
import com.pwc.model.WorkspaceGroup;
import com.pwc.model.WorkspacePermission;
import org.springdoc.core.converters.models.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/users")
//@Api(produces = MediaType.APPLICATION_JSON_VALUE, tags = {"Users"})
public class WorkspaceUserController {

//    @Autowired
//    private WorkspaceUserService userService;

    /*@GetMapping("/{pwcGuid}/workspaces")
    public ResponseEntity<Page<UserGroup>> getUserWorkspaces(@PathVariable final String pwcGuid, Pageable pageable) {
//        List<UserGroup> groups = userService.getUserGroups(pwcGuid);
        List<UserGroup> groups = Collections.singletonList(new UserGroup());
        return ResponseEntity.ok(null);
    }*/

    @GetMapping("/{pwcGuid}/groups")
    public ResponseEntity<List<WorkspaceGroup>> getUserGroups(@PathVariable final String pwcGuid) {
//        List<UserGroup> groups = userService.getUserGroups(pwcGuid);
        Map<String, List<WorkspacePermission>> userGroups = new HashMap<>();
        List<WorkspacePermission> workspacePermissions = Arrays.asList(WorkspacePermission.values());
        userGroups.put("Workbench User", workspacePermissions);
        WorkspaceGroup workspaceGroup = new WorkspaceGroup("Workbench User", workspacePermissions);
        return ResponseEntity.ok(Collections.singletonList(workspaceGroup));
    }

}
