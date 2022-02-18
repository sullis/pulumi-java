// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration.inputs;

import io.pulumi.azurenative.guestconfiguration.inputs.AssignmentInfoResponse;
import io.pulumi.azurenative.guestconfiguration.inputs.AssignmentReportResourceResponse;
import io.pulumi.azurenative.guestconfiguration.inputs.VMInfoResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AssignmentReportResponse extends io.pulumi.resources.InvokeArgs {

    public static final AssignmentReportResponse Empty = new AssignmentReportResponse();

    /**
     * Configuration details of the guest configuration assignment.
     * 
     */
    @InputImport(name="assignment")
    private final @Nullable AssignmentInfoResponse assignment;

    public Optional<AssignmentInfoResponse> getAssignment() {
        return this.assignment == null ? Optional.empty() : Optional.ofNullable(this.assignment);
    }

    /**
     * A value indicating compliance status of the machine for the assigned guest configuration.
     * 
     */
    @InputImport(name="complianceStatus", required=true)
    private final String complianceStatus;

    public String getComplianceStatus() {
        return this.complianceStatus;
    }

    /**
     * End date and time of the guest configuration assignment compliance status check.
     * 
     */
    @InputImport(name="endTime", required=true)
    private final String endTime;

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * ARM resource id of the report for the guest configuration assignment.
     * 
     */
    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Type of report, Consistency or Initial
     * 
     */
    @InputImport(name="operationType", required=true)
    private final String operationType;

    public String getOperationType() {
        return this.operationType;
    }

    /**
     * GUID that identifies the guest configuration assignment report under a subscription, resource group.
     * 
     */
    @InputImport(name="reportId", required=true)
    private final String reportId;

    public String getReportId() {
        return this.reportId;
    }

    /**
     * The list of resources for which guest configuration assignment compliance is checked.
     * 
     */
    @InputImport(name="resources")
    private final @Nullable List<AssignmentReportResourceResponse> resources;

    public List<AssignmentReportResourceResponse> getResources() {
        return this.resources == null ? List.of() : this.resources;
    }

    /**
     * Start date and time of the guest configuration assignment compliance status check.
     * 
     */
    @InputImport(name="startTime", required=true)
    private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * Information about the VM.
     * 
     */
    @InputImport(name="vm")
    private final @Nullable VMInfoResponse vm;

    public Optional<VMInfoResponse> getVm() {
        return this.vm == null ? Optional.empty() : Optional.ofNullable(this.vm);
    }

    public AssignmentReportResponse(
        @Nullable AssignmentInfoResponse assignment,
        String complianceStatus,
        String endTime,
        String id,
        String operationType,
        String reportId,
        @Nullable List<AssignmentReportResourceResponse> resources,
        String startTime,
        @Nullable VMInfoResponse vm) {
        this.assignment = assignment;
        this.complianceStatus = Objects.requireNonNull(complianceStatus, "expected parameter 'complianceStatus' to be non-null");
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.operationType = Objects.requireNonNull(operationType, "expected parameter 'operationType' to be non-null");
        this.reportId = Objects.requireNonNull(reportId, "expected parameter 'reportId' to be non-null");
        this.resources = resources;
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.vm = vm;
    }

    private AssignmentReportResponse() {
        this.assignment = null;
        this.complianceStatus = null;
        this.endTime = null;
        this.id = null;
        this.operationType = null;
        this.reportId = null;
        this.resources = List.of();
        this.startTime = null;
        this.vm = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentReportResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AssignmentInfoResponse assignment;
        private String complianceStatus;
        private String endTime;
        private String id;
        private String operationType;
        private String reportId;
        private @Nullable List<AssignmentReportResourceResponse> resources;
        private String startTime;
        private @Nullable VMInfoResponse vm;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentReportResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignment = defaults.assignment;
    	      this.complianceStatus = defaults.complianceStatus;
    	      this.endTime = defaults.endTime;
    	      this.id = defaults.id;
    	      this.operationType = defaults.operationType;
    	      this.reportId = defaults.reportId;
    	      this.resources = defaults.resources;
    	      this.startTime = defaults.startTime;
    	      this.vm = defaults.vm;
        }

        public Builder setAssignment(@Nullable AssignmentInfoResponse assignment) {
            this.assignment = assignment;
            return this;
        }

        public Builder setComplianceStatus(String complianceStatus) {
            this.complianceStatus = Objects.requireNonNull(complianceStatus);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setOperationType(String operationType) {
            this.operationType = Objects.requireNonNull(operationType);
            return this;
        }

        public Builder setReportId(String reportId) {
            this.reportId = Objects.requireNonNull(reportId);
            return this;
        }

        public Builder setResources(@Nullable List<AssignmentReportResourceResponse> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setVm(@Nullable VMInfoResponse vm) {
            this.vm = vm;
            return this;
        }

        public AssignmentReportResponse build() {
            return new AssignmentReportResponse(assignment, complianceStatus, endTime, id, operationType, reportId, resources, startTime, vm);
        }
    }
}
