// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.azurenative.connectedvmwarevsphere.inputs.ErrorDetailResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Defines the resource properties.
 * 
 */
public final class GuestAgentProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final GuestAgentProfileResponse Empty = new GuestAgentProfileResponse();

    /**
     * The hybrid machine agent full version.
     * 
     */
    @InputImport(name="agentVersion", required=true)
      private final String agentVersion;

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * Details about the error state.
     * 
     */
    @InputImport(name="errorDetails", required=true)
      private final List<ErrorDetailResponse> errorDetails;

    public List<ErrorDetailResponse> getErrorDetails() {
        return this.errorDetails;
    }

    /**
     * The time of the last status change.
     * 
     */
    @InputImport(name="lastStatusChange", required=true)
      private final String lastStatusChange;

    public String getLastStatusChange() {
        return this.lastStatusChange;
    }

    /**
     * The status of the hybrid machine agent.
     * 
     */
    @InputImport(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    /**
     * Specifies the VM's unique SMBIOS ID.
     * 
     */
    @InputImport(name="vmUuid", required=true)
      private final String vmUuid;

    public String getVmUuid() {
        return this.vmUuid;
    }

    public GuestAgentProfileResponse(
        String agentVersion,
        List<ErrorDetailResponse> errorDetails,
        String lastStatusChange,
        String status,
        String vmUuid) {
        this.agentVersion = Objects.requireNonNull(agentVersion, "expected parameter 'agentVersion' to be non-null");
        this.errorDetails = Objects.requireNonNull(errorDetails, "expected parameter 'errorDetails' to be non-null");
        this.lastStatusChange = Objects.requireNonNull(lastStatusChange, "expected parameter 'lastStatusChange' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.vmUuid = Objects.requireNonNull(vmUuid, "expected parameter 'vmUuid' to be non-null");
    }

    private GuestAgentProfileResponse() {
        this.agentVersion = null;
        this.errorDetails = List.of();
        this.lastStatusChange = null;
        this.status = null;
        this.vmUuid = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestAgentProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agentVersion;
        private List<ErrorDetailResponse> errorDetails;
        private String lastStatusChange;
        private String status;
        private String vmUuid;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestAgentProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentVersion = defaults.agentVersion;
    	      this.errorDetails = defaults.errorDetails;
    	      this.lastStatusChange = defaults.lastStatusChange;
    	      this.status = defaults.status;
    	      this.vmUuid = defaults.vmUuid;
        }

        public Builder setAgentVersion(String agentVersion) {
            this.agentVersion = Objects.requireNonNull(agentVersion);
            return this;
        }

        public Builder setErrorDetails(List<ErrorDetailResponse> errorDetails) {
            this.errorDetails = Objects.requireNonNull(errorDetails);
            return this;
        }

        public Builder setLastStatusChange(String lastStatusChange) {
            this.lastStatusChange = Objects.requireNonNull(lastStatusChange);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setVmUuid(String vmUuid) {
            this.vmUuid = Objects.requireNonNull(vmUuid);
            return this;
        }
        public GuestAgentProfileResponse build() {
            return new GuestAgentProfileResponse(agentVersion, errorDetails, lastStatusChange, status, vmUuid);
        }
    }
}