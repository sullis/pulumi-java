// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.azurenative.eventhub.enums.DefaultAction;
import io.pulumi.azurenative.eventhub.inputs.NWRuleSetIpRulesArgs;
import io.pulumi.azurenative.eventhub.inputs.NWRuleSetVirtualNetworkRulesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NamespaceNetworkRuleSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NamespaceNetworkRuleSetArgs Empty = new NamespaceNetworkRuleSetArgs();

    /**
     * Default Action for Network Rule Set
     * 
     */
    @InputImport(name="defaultAction")
    private final @Nullable Input<Either<String,DefaultAction>> defaultAction;

    public Input<Either<String,DefaultAction>> getDefaultAction() {
        return this.defaultAction == null ? Input.empty() : this.defaultAction;
    }

    /**
     * List of IpRules
     * 
     */
    @InputImport(name="ipRules")
    private final @Nullable Input<List<NWRuleSetIpRulesArgs>> ipRules;

    public Input<List<NWRuleSetIpRulesArgs>> getIpRules() {
        return this.ipRules == null ? Input.empty() : this.ipRules;
    }

    /**
     * The Namespace name
     * 
     */
    @InputImport(name="namespaceName", required=true)
    private final Input<String> namespaceName;

    public Input<String> getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the resource group within the azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * List VirtualNetwork Rules
     * 
     */
    @InputImport(name="virtualNetworkRules")
    private final @Nullable Input<List<NWRuleSetVirtualNetworkRulesArgs>> virtualNetworkRules;

    public Input<List<NWRuleSetVirtualNetworkRulesArgs>> getVirtualNetworkRules() {
        return this.virtualNetworkRules == null ? Input.empty() : this.virtualNetworkRules;
    }

    public NamespaceNetworkRuleSetArgs(
        @Nullable Input<Either<String,DefaultAction>> defaultAction,
        @Nullable Input<List<NWRuleSetIpRulesArgs>> ipRules,
        Input<String> namespaceName,
        Input<String> resourceGroupName,
        @Nullable Input<List<NWRuleSetVirtualNetworkRulesArgs>> virtualNetworkRules) {
        this.defaultAction = defaultAction;
        this.ipRules = ipRules;
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualNetworkRules = virtualNetworkRules;
    }

    private NamespaceNetworkRuleSetArgs() {
        this.defaultAction = Input.empty();
        this.ipRules = Input.empty();
        this.namespaceName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.virtualNetworkRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceNetworkRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,DefaultAction>> defaultAction;
        private @Nullable Input<List<NWRuleSetIpRulesArgs>> ipRules;
        private Input<String> namespaceName;
        private Input<String> resourceGroupName;
        private @Nullable Input<List<NWRuleSetVirtualNetworkRulesArgs>> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespaceNetworkRuleSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultAction = defaults.defaultAction;
    	      this.ipRules = defaults.ipRules;
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder setDefaultAction(@Nullable Input<Either<String,DefaultAction>> defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }

        public Builder setDefaultAction(@Nullable Either<String,DefaultAction> defaultAction) {
            this.defaultAction = Input.ofNullable(defaultAction);
            return this;
        }

        public Builder setIpRules(@Nullable Input<List<NWRuleSetIpRulesArgs>> ipRules) {
            this.ipRules = ipRules;
            return this;
        }

        public Builder setIpRules(@Nullable List<NWRuleSetIpRulesArgs> ipRules) {
            this.ipRules = Input.ofNullable(ipRules);
            return this;
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

        public Builder setVirtualNetworkRules(@Nullable Input<List<NWRuleSetVirtualNetworkRulesArgs>> virtualNetworkRules) {
            this.virtualNetworkRules = virtualNetworkRules;
            return this;
        }

        public Builder setVirtualNetworkRules(@Nullable List<NWRuleSetVirtualNetworkRulesArgs> virtualNetworkRules) {
            this.virtualNetworkRules = Input.ofNullable(virtualNetworkRules);
            return this;
        }

        public NamespaceNetworkRuleSetArgs build() {
            return new NamespaceNetworkRuleSetArgs(defaultAction, ipRules, namespaceName, resourceGroupName, virtualNetworkRules);
        }
    }
}
