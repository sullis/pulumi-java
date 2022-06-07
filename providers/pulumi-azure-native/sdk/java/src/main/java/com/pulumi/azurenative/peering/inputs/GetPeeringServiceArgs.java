// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.peering.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPeeringServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPeeringServiceArgs Empty = new GetPeeringServiceArgs();

    /**
     * The name of the peering.
     * 
     */
    @Import(name="peeringServiceName", required=true)
    private Output<String> peeringServiceName;

    /**
     * @return The name of the peering.
     * 
     */
    public Output<String> peeringServiceName() {
        return this.peeringServiceName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPeeringServiceArgs() {}

    private GetPeeringServiceArgs(GetPeeringServiceArgs $) {
        this.peeringServiceName = $.peeringServiceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPeeringServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPeeringServiceArgs $;

        public Builder() {
            $ = new GetPeeringServiceArgs();
        }

        public Builder(GetPeeringServiceArgs defaults) {
            $ = new GetPeeringServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param peeringServiceName The name of the peering.
         * 
         * @return builder
         * 
         */
        public Builder peeringServiceName(Output<String> peeringServiceName) {
            $.peeringServiceName = peeringServiceName;
            return this;
        }

        /**
         * @param peeringServiceName The name of the peering.
         * 
         * @return builder
         * 
         */
        public Builder peeringServiceName(String peeringServiceName) {
            return peeringServiceName(Output.of(peeringServiceName));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetPeeringServiceArgs build() {
            $.peeringServiceName = Objects.requireNonNull($.peeringServiceName, "expected parameter 'peeringServiceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
