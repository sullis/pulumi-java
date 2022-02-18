// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Workspaces resource specific properties.
 * 
 */
public final class WorkspaceResponseProperties extends io.pulumi.resources.InvokeArgs {

    public static final WorkspaceResponseProperties Empty = new WorkspaceResponseProperties();

    /**
     * The provisioning state.
     * 
     */
    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    public WorkspaceResponseProperties(String provisioningState) {
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private WorkspaceResponseProperties() {
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public WorkspaceResponseProperties build() {
            return new WorkspaceResponseProperties(provisioningState);
        }
    }
}
