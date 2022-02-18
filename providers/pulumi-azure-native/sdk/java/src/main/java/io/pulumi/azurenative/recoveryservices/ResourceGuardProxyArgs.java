// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceGuardProxyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceGuardProxyArgs Empty = new ResourceGuardProxyArgs();

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="resourceGuardProxyName")
    private final @Nullable Input<String> resourceGuardProxyName;

    public Input<String> getResourceGuardProxyName() {
        return this.resourceGuardProxyName == null ? Input.empty() : this.resourceGuardProxyName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @InputImport(name="vaultName", required=true)
    private final Input<String> vaultName;

    public Input<String> getVaultName() {
        return this.vaultName;
    }

    public ResourceGuardProxyArgs(
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceGuardProxyName,
        Input<String> vaultName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceGuardProxyName = resourceGuardProxyName;
        this.vaultName = Objects.requireNonNull(vaultName, "expected parameter 'vaultName' to be non-null");
    }

    private ResourceGuardProxyArgs() {
        this.resourceGroupName = Input.empty();
        this.resourceGuardProxyName = Input.empty();
        this.vaultName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceGuardProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceGuardProxyName;
        private Input<String> vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceGuardProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceGuardProxyName = defaults.resourceGuardProxyName;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setResourceGuardProxyName(@Nullable Input<String> resourceGuardProxyName) {
            this.resourceGuardProxyName = resourceGuardProxyName;
            return this;
        }

        public Builder setResourceGuardProxyName(@Nullable String resourceGuardProxyName) {
            this.resourceGuardProxyName = Input.ofNullable(resourceGuardProxyName);
            return this;
        }

        public Builder setVaultName(Input<String> vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }

        public Builder setVaultName(String vaultName) {
            this.vaultName = Input.of(Objects.requireNonNull(vaultName));
            return this;
        }

        public ResourceGuardProxyArgs build() {
            return new ResourceGuardProxyArgs(resourceGroupName, resourceGuardProxyName, vaultName);
        }
    }
}
