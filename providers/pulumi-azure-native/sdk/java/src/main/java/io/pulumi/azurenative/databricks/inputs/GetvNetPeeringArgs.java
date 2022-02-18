// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetvNetPeeringArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetvNetPeeringArgs Empty = new GetvNetPeeringArgs();

    /**
     * The name of the workspace vNet peering.
     * 
     */
    @InputImport(name="peeringName", required=true)
    private final String peeringName;

    public String getPeeringName() {
        return this.peeringName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
    private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetvNetPeeringArgs(
        String peeringName,
        String resourceGroupName,
        String workspaceName) {
        this.peeringName = Objects.requireNonNull(peeringName, "expected parameter 'peeringName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetvNetPeeringArgs() {
        this.peeringName = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetvNetPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String peeringName;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetvNetPeeringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.peeringName = defaults.peeringName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setPeeringName(String peeringName) {
            this.peeringName = Objects.requireNonNull(peeringName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public GetvNetPeeringArgs build() {
            return new GetvNetPeeringArgs(peeringName, resourceGroupName, workspaceName);
        }
    }
}
