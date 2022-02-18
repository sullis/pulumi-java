// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NamespaceVirtualNetworkRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final NamespaceVirtualNetworkRuleArgs Empty = new NamespaceVirtualNetworkRuleArgs();

    /**
     * The namespace name
     * 
     */
    @InputImport(name="namespaceName", required=true)
    private final Input<String> namespaceName;

    public Input<String> getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Virtual Network Rule name.
     * 
     */
    @InputImport(name="virtualNetworkRuleName")
    private final @Nullable Input<String> virtualNetworkRuleName;

    public Input<String> getVirtualNetworkRuleName() {
        return this.virtualNetworkRuleName == null ? Input.empty() : this.virtualNetworkRuleName;
    }

    /**
     * Resource ID of Virtual Network Subnet
     * 
     */
    @InputImport(name="virtualNetworkSubnetId")
    private final @Nullable Input<String> virtualNetworkSubnetId;

    public Input<String> getVirtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId == null ? Input.empty() : this.virtualNetworkSubnetId;
    }

    public NamespaceVirtualNetworkRuleArgs(
        Input<String> namespaceName,
        Input<String> resourceGroupName,
        @Nullable Input<String> virtualNetworkRuleName,
        @Nullable Input<String> virtualNetworkSubnetId) {
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualNetworkRuleName = virtualNetworkRuleName;
        this.virtualNetworkSubnetId = virtualNetworkSubnetId;
    }

    private NamespaceVirtualNetworkRuleArgs() {
        this.namespaceName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.virtualNetworkRuleName = Input.empty();
        this.virtualNetworkSubnetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceVirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> namespaceName;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> virtualNetworkRuleName;
        private @Nullable Input<String> virtualNetworkSubnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespaceVirtualNetworkRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualNetworkRuleName = defaults.virtualNetworkRuleName;
    	      this.virtualNetworkSubnetId = defaults.virtualNetworkSubnetId;
        }

        public Builder setNamespaceName(Input<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder setNamespaceName(String namespaceName) {
            this.namespaceName = Input.of(Objects.requireNonNull(namespaceName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setVirtualNetworkRuleName(@Nullable Input<String> virtualNetworkRuleName) {
            this.virtualNetworkRuleName = virtualNetworkRuleName;
            return this;
        }

        public Builder setVirtualNetworkRuleName(@Nullable String virtualNetworkRuleName) {
            this.virtualNetworkRuleName = Input.ofNullable(virtualNetworkRuleName);
            return this;
        }

        public Builder setVirtualNetworkSubnetId(@Nullable Input<String> virtualNetworkSubnetId) {
            this.virtualNetworkSubnetId = virtualNetworkSubnetId;
            return this;
        }

        public Builder setVirtualNetworkSubnetId(@Nullable String virtualNetworkSubnetId) {
            this.virtualNetworkSubnetId = Input.ofNullable(virtualNetworkSubnetId);
            return this;
        }

        public NamespaceVirtualNetworkRuleArgs build() {
            return new NamespaceVirtualNetworkRuleArgs(namespaceName, resourceGroupName, virtualNetworkRuleName, virtualNetworkSubnetId);
        }
    }
}
