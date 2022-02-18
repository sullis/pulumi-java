// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetNatRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNatRuleArgs Empty = new GetNatRuleArgs();

    /**
     * The name of the gateway.
     * 
     */
    @InputImport(name="gatewayName", required=true)
    private final String gatewayName;

    public String getGatewayName() {
        return this.gatewayName;
    }

    /**
     * The name of the nat rule.
     * 
     */
    @InputImport(name="natRuleName", required=true)
    private final String natRuleName;

    public String getNatRuleName() {
        return this.natRuleName;
    }

    /**
     * The resource group name of the VpnGateway.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetNatRuleArgs(
        String gatewayName,
        String natRuleName,
        String resourceGroupName) {
        this.gatewayName = Objects.requireNonNull(gatewayName, "expected parameter 'gatewayName' to be non-null");
        this.natRuleName = Objects.requireNonNull(natRuleName, "expected parameter 'natRuleName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetNatRuleArgs() {
        this.gatewayName = null;
        this.natRuleName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gatewayName;
        private String natRuleName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNatRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayName = defaults.gatewayName;
    	      this.natRuleName = defaults.natRuleName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setGatewayName(String gatewayName) {
            this.gatewayName = Objects.requireNonNull(gatewayName);
            return this;
        }

        public Builder setNatRuleName(String natRuleName) {
            this.natRuleName = Objects.requireNonNull(natRuleName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetNatRuleArgs build() {
            return new GetNatRuleArgs(gatewayName, natRuleName, resourceGroupName);
        }
    }
}
