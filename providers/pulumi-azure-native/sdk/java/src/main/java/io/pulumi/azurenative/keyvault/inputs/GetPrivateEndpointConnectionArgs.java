// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateEndpointConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPrivateEndpointConnectionArgs Empty = new GetPrivateEndpointConnectionArgs();

    /**
     * Name of the private endpoint connection associated with the key vault.
     * 
     */
    @InputImport(name="privateEndpointConnectionName", required=true)
      private final String privateEndpointConnectionName;

    public String getPrivateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }

    /**
     * Name of the resource group that contains the key vault.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the key vault.
     * 
     */
    @InputImport(name="vaultName", required=true)
      private final String vaultName;

    public String getVaultName() {
        return this.vaultName;
    }

    public GetPrivateEndpointConnectionArgs(
        String privateEndpointConnectionName,
        String resourceGroupName,
        String vaultName) {
        this.privateEndpointConnectionName = Objects.requireNonNull(privateEndpointConnectionName, "expected parameter 'privateEndpointConnectionName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vaultName = Objects.requireNonNull(vaultName, "expected parameter 'vaultName' to be non-null");
    }

    private GetPrivateEndpointConnectionArgs() {
        this.privateEndpointConnectionName = null;
        this.resourceGroupName = null;
        this.vaultName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String privateEndpointConnectionName;
        private String resourceGroupName;
        private String vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder setPrivateEndpointConnectionName(String privateEndpointConnectionName) {
            this.privateEndpointConnectionName = Objects.requireNonNull(privateEndpointConnectionName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setVaultName(String vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }
        public GetPrivateEndpointConnectionArgs build() {
            return new GetPrivateEndpointConnectionArgs(privateEndpointConnectionName, resourceGroupName, vaultName);
        }
    }
}