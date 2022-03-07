// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automanage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConfigurationProfileAssignmentComplianceResponse {
    /**
     * The state of compliance, which only appears in the response.
     * 
     */
    private final String updateStatus;

    @OutputCustomType.Constructor({"updateStatus"})
    private ConfigurationProfileAssignmentComplianceResponse(String updateStatus) {
        this.updateStatus = Objects.requireNonNull(updateStatus);
    }

    /**
     * The state of compliance, which only appears in the response.
     * 
    */
    public String getUpdateStatus() {
        return this.updateStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationProfileAssignmentComplianceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String updateStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationProfileAssignmentComplianceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.updateStatus = defaults.updateStatus;
        }

        public Builder setUpdateStatus(String updateStatus) {
            this.updateStatus = Objects.requireNonNull(updateStatus);
            return this;
        }
        public ConfigurationProfileAssignmentComplianceResponse build() {
            return new ConfigurationProfileAssignmentComplianceResponse(updateStatus);
        }
    }
}