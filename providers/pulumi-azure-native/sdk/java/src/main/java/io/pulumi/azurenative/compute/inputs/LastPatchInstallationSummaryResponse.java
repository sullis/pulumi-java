// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.ApiErrorResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the properties of the last installed patch summary.
 * 
 */
public final class LastPatchInstallationSummaryResponse extends io.pulumi.resources.InvokeArgs {

    public static final LastPatchInstallationSummaryResponse Empty = new LastPatchInstallationSummaryResponse();

    /**
     * The errors that were encountered during execution of the operation. The details array contains the list of them.
     * 
     */
    @InputImport(name="error", required=true)
      private final ApiErrorResponse error;

    public ApiErrorResponse getError() {
        return this.error;
    }

    /**
     * The number of all available patches but excluded explicitly by a customer-specified exclusion list match.
     * 
     */
    @InputImport(name="excludedPatchCount", required=true)
      private final Integer excludedPatchCount;

    public Integer getExcludedPatchCount() {
        return this.excludedPatchCount;
    }

    /**
     * The count of patches that failed installation.
     * 
     */
    @InputImport(name="failedPatchCount", required=true)
      private final Integer failedPatchCount;

    public Integer getFailedPatchCount() {
        return this.failedPatchCount;
    }

    /**
     * The activity ID of the operation that produced this result. It is used to correlate across CRP and extension logs.
     * 
     */
    @InputImport(name="installationActivityId", required=true)
      private final String installationActivityId;

    public String getInstallationActivityId() {
        return this.installationActivityId;
    }

    /**
     * The count of patches that successfully installed.
     * 
     */
    @InputImport(name="installedPatchCount", required=true)
      private final Integer installedPatchCount;

    public Integer getInstalledPatchCount() {
        return this.installedPatchCount;
    }

    /**
     * The UTC timestamp when the operation began.
     * 
     */
    @InputImport(name="lastModifiedTime", required=true)
      private final String lastModifiedTime;

    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Describes whether the operation ran out of time before it completed all its intended actions
     * 
     */
    @InputImport(name="maintenanceWindowExceeded", required=true)
      private final Boolean maintenanceWindowExceeded;

    public Boolean getMaintenanceWindowExceeded() {
        return this.maintenanceWindowExceeded;
    }

    /**
     * The number of all available patches but not going to be installed because it didn't match a classification or inclusion list entry.
     * 
     */
    @InputImport(name="notSelectedPatchCount", required=true)
      private final Integer notSelectedPatchCount;

    public Integer getNotSelectedPatchCount() {
        return this.notSelectedPatchCount;
    }

    /**
     * The number of all available patches expected to be installed over the course of the patch installation operation.
     * 
     */
    @InputImport(name="pendingPatchCount", required=true)
      private final Integer pendingPatchCount;

    public Integer getPendingPatchCount() {
        return this.pendingPatchCount;
    }

    /**
     * The UTC timestamp when the operation began.
     * 
     */
    @InputImport(name="startTime", required=true)
      private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * The overall success or failure status of the operation. It remains "InProgress" until the operation completes. At that point it will become "Unknown", "Failed", "Succeeded", or "CompletedWithWarnings."
     * 
     */
    @InputImport(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    public LastPatchInstallationSummaryResponse(
        ApiErrorResponse error,
        Integer excludedPatchCount,
        Integer failedPatchCount,
        String installationActivityId,
        Integer installedPatchCount,
        String lastModifiedTime,
        Boolean maintenanceWindowExceeded,
        Integer notSelectedPatchCount,
        Integer pendingPatchCount,
        String startTime,
        String status) {
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.excludedPatchCount = Objects.requireNonNull(excludedPatchCount, "expected parameter 'excludedPatchCount' to be non-null");
        this.failedPatchCount = Objects.requireNonNull(failedPatchCount, "expected parameter 'failedPatchCount' to be non-null");
        this.installationActivityId = Objects.requireNonNull(installationActivityId, "expected parameter 'installationActivityId' to be non-null");
        this.installedPatchCount = Objects.requireNonNull(installedPatchCount, "expected parameter 'installedPatchCount' to be non-null");
        this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime, "expected parameter 'lastModifiedTime' to be non-null");
        this.maintenanceWindowExceeded = Objects.requireNonNull(maintenanceWindowExceeded, "expected parameter 'maintenanceWindowExceeded' to be non-null");
        this.notSelectedPatchCount = Objects.requireNonNull(notSelectedPatchCount, "expected parameter 'notSelectedPatchCount' to be non-null");
        this.pendingPatchCount = Objects.requireNonNull(pendingPatchCount, "expected parameter 'pendingPatchCount' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private LastPatchInstallationSummaryResponse() {
        this.error = null;
        this.excludedPatchCount = null;
        this.failedPatchCount = null;
        this.installationActivityId = null;
        this.installedPatchCount = null;
        this.lastModifiedTime = null;
        this.maintenanceWindowExceeded = null;
        this.notSelectedPatchCount = null;
        this.pendingPatchCount = null;
        this.startTime = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LastPatchInstallationSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiErrorResponse error;
        private Integer excludedPatchCount;
        private Integer failedPatchCount;
        private String installationActivityId;
        private Integer installedPatchCount;
        private String lastModifiedTime;
        private Boolean maintenanceWindowExceeded;
        private Integer notSelectedPatchCount;
        private Integer pendingPatchCount;
        private String startTime;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(LastPatchInstallationSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.excludedPatchCount = defaults.excludedPatchCount;
    	      this.failedPatchCount = defaults.failedPatchCount;
    	      this.installationActivityId = defaults.installationActivityId;
    	      this.installedPatchCount = defaults.installedPatchCount;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.maintenanceWindowExceeded = defaults.maintenanceWindowExceeded;
    	      this.notSelectedPatchCount = defaults.notSelectedPatchCount;
    	      this.pendingPatchCount = defaults.pendingPatchCount;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
        }

        public Builder setError(ApiErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setExcludedPatchCount(Integer excludedPatchCount) {
            this.excludedPatchCount = Objects.requireNonNull(excludedPatchCount);
            return this;
        }

        public Builder setFailedPatchCount(Integer failedPatchCount) {
            this.failedPatchCount = Objects.requireNonNull(failedPatchCount);
            return this;
        }

        public Builder setInstallationActivityId(String installationActivityId) {
            this.installationActivityId = Objects.requireNonNull(installationActivityId);
            return this;
        }

        public Builder setInstalledPatchCount(Integer installedPatchCount) {
            this.installedPatchCount = Objects.requireNonNull(installedPatchCount);
            return this;
        }

        public Builder setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }

        public Builder setMaintenanceWindowExceeded(Boolean maintenanceWindowExceeded) {
            this.maintenanceWindowExceeded = Objects.requireNonNull(maintenanceWindowExceeded);
            return this;
        }

        public Builder setNotSelectedPatchCount(Integer notSelectedPatchCount) {
            this.notSelectedPatchCount = Objects.requireNonNull(notSelectedPatchCount);
            return this;
        }

        public Builder setPendingPatchCount(Integer pendingPatchCount) {
            this.pendingPatchCount = Objects.requireNonNull(pendingPatchCount);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public LastPatchInstallationSummaryResponse build() {
            return new LastPatchInstallationSummaryResponse(error, excludedPatchCount, failedPatchCount, installationActivityId, installedPatchCount, lastModifiedTime, maintenanceWindowExceeded, notSelectedPatchCount, pendingPatchCount, startTime, status);
        }
    }
}