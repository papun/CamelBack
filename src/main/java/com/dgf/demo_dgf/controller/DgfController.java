package com.dgf.demo_dgf.controller;

import com.dgf.demo_dgf.dto.ConnectionDto;
import com.dgf.demo_dgf.dto.DeviceDto;
import com.dgf.demo_dgf.dto.DgfConnectionInput;
import com.dgf.demo_dgf.dto.DgfMigrationData;
import com.dgf.demo_dgf.service.DgfService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/dgf")
@CrossOrigin
public class DgfController {

    @Autowired
    private DgfService dgfService;

    /*
     * @Autowired private JobLauncher jobLauncher;
     *
     * @Autowired private Job job;
     */

    @Operation(summary = "Get DGF Configuration", description = "Retrieve a list of DGF configurations")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Found the configurations", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = ConnectionDto.class))}), @ApiResponse(responseCode = "404", description = "Configurations not found", content = @Content)})

    @GetMapping("/configuration")
    public List<ConnectionDto> getDgfConfiguration() {

        return dgfService.getDgfConfigInfo();
    }

    @Operation(summary = "Add DGF Configuration", description = "Add a new DGF configuration")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Configuration added successfully", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = ConnectionDto.class))}), @ApiResponse(responseCode = "400", description = "Invalid input", content = @Content)})
    @PostMapping("/add")
    public ConnectionDto AddDgfConfigInfo(@RequestBody DgfConnectionInput dgf) {
        return dgfService.AddDgfConfigInfo(dgf);
    }

    @GetMapping("/devices")
    public List<DeviceDto> getAllDevices() {
        return dgfService.getAllDeviceInfo();
    }


    @Operation(summary = "Get complete updated migrated Configuration", description = "Retrieve a list of DGF configurations")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Found the configurations", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = ConnectionDto.class))}), @ApiResponse(responseCode = "404", description = "Configurations not found", content = @Content)})
    @GetMapping("/migrate")
    public DgfMigrationData getDgfMigratedConfiguration() {
        return dgfService.getMigratedConfigInfo("109");
    }


    @Operation(summary = "Process DGF Connection IDs", description = "Retrieve connection objects based on connection IDs")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Connections processed successfully", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = ConnectionDto.class))}), @ApiResponse(responseCode = "400", description = "Invalid input", content = @Content), @ApiResponse(responseCode = "404", description = "Connections not found", content = @Content)})
    @PostMapping("/configuration/migrate")
    public List<Object> processConnections(@RequestBody List<String> connectionIds) {
        /* try { */
        List list = new ArrayList<>();
        list.add(dgfService.getMigratedConfigInfo("109"));

        return list;

        /*
         * dgfService.getMigratedConfigInfo("109"); // List<ConnectionDto> connections =
         * dgfService.processConnectionIds(connectionIds); return
         * ResponseEntity.ok(connections);
         */
        /*} catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                 .body(null);
        }*/
    }

    /*
     * @PostMapping("/run") public ResponseEntity<String> runBatchJob() { try {
     * JobParameters jobParameters = new JobParametersBuilder() .addString("jobId",
     * String.valueOf(System.currentTimeMillis())).toJobParameters();
     * jobLauncher.run(job, jobParameters); return
     * ResponseEntity.ok("Batch job started successfully."); } catch (Exception e) {
     * e.printStackTrace(); return
     * ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
     * .body("Failed to start batch job: " + e.getMessage()); } }
     */
}
