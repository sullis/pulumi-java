// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateEndpointConnectionByWorkspaceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPrivateEndpointConnectionByWorkspaceArgs Empty = new GetPrivateEndpointConnectionByWorkspaceArgs();

    /**
     * The name of the private endpoint connection associated with the Azure resource
     * 
     */
    @InputImport(name="privateEndpointConnectionName", required=true)
    private final String privateEndpointConnectionName;

    public String getPrivateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
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
     * The name of the workspace
     * 
     */
    @InputImport(name="workspaceName", required=true)
    private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetPrivateEndpointConnectionByWorkspaceArgs(
        String privateEndpointConnectionName,
        String resourceGroupName,
        String workspaceName) {
        this.privateEndpointConnectionName = Objects.requireNonNull(privateEndpointConnectionName, "expected parameter 'privateEndpointConnectionName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetPrivateEndpointConnectionByWorkspaceArgs() {
        this.privateEndpointConnectionName = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateEndpointConnectionByWorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String privateEndpointConnectionName;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateEndpointConnectionByWorkspaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setPrivateEndpointConnectionName(String privateEndpointConnectionName) {
            this.privateEndpointConnectionName = Objects.requireNonNull(privateEndpointConnectionName);
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

        public GetPrivateEndpointConnectionByWorkspaceArgs build() {
            return new GetPrivateEndpointConnectionByWorkspaceArgs(privateEndpointConnectionName, resourceGroupName, workspaceName);
        }
    }
}
