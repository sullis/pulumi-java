// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDdosCustomPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDdosCustomPolicyArgs Empty = new GetDdosCustomPolicyArgs();

    /**
     * The name of the DDoS custom policy.
     * 
     */
    @Import(name="ddosCustomPolicyName", required=true)
    private String ddosCustomPolicyName;

    /**
     * @return The name of the DDoS custom policy.
     * 
     */
    public String ddosCustomPolicyName() {
        return this.ddosCustomPolicyName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetDdosCustomPolicyArgs() {}

    private GetDdosCustomPolicyArgs(GetDdosCustomPolicyArgs $) {
        this.ddosCustomPolicyName = $.ddosCustomPolicyName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDdosCustomPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDdosCustomPolicyArgs $;

        public Builder() {
            $ = new GetDdosCustomPolicyArgs();
        }

        public Builder(GetDdosCustomPolicyArgs defaults) {
            $ = new GetDdosCustomPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ddosCustomPolicyName The name of the DDoS custom policy.
         * 
         * @return builder
         * 
         */
        public Builder ddosCustomPolicyName(String ddosCustomPolicyName) {
            $.ddosCustomPolicyName = ddosCustomPolicyName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetDdosCustomPolicyArgs build() {
            $.ddosCustomPolicyName = Objects.requireNonNull($.ddosCustomPolicyName, "expected parameter 'ddosCustomPolicyName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
