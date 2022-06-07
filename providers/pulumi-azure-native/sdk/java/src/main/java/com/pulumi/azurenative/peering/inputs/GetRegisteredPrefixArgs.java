// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.peering.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRegisteredPrefixArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegisteredPrefixArgs Empty = new GetRegisteredPrefixArgs();

    /**
     * The name of the peering.
     * 
     */
    @Import(name="peeringName", required=true)
    private Output<String> peeringName;

    /**
     * @return The name of the peering.
     * 
     */
    public Output<String> peeringName() {
        return this.peeringName;
    }

    /**
     * The name of the registered prefix.
     * 
     */
    @Import(name="registeredPrefixName", required=true)
    private Output<String> registeredPrefixName;

    /**
     * @return The name of the registered prefix.
     * 
     */
    public Output<String> registeredPrefixName() {
        return this.registeredPrefixName;
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

    private GetRegisteredPrefixArgs() {}

    private GetRegisteredPrefixArgs(GetRegisteredPrefixArgs $) {
        this.peeringName = $.peeringName;
        this.registeredPrefixName = $.registeredPrefixName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegisteredPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegisteredPrefixArgs $;

        public Builder() {
            $ = new GetRegisteredPrefixArgs();
        }

        public Builder(GetRegisteredPrefixArgs defaults) {
            $ = new GetRegisteredPrefixArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param peeringName The name of the peering.
         * 
         * @return builder
         * 
         */
        public Builder peeringName(Output<String> peeringName) {
            $.peeringName = peeringName;
            return this;
        }

        /**
         * @param peeringName The name of the peering.
         * 
         * @return builder
         * 
         */
        public Builder peeringName(String peeringName) {
            return peeringName(Output.of(peeringName));
        }

        /**
         * @param registeredPrefixName The name of the registered prefix.
         * 
         * @return builder
         * 
         */
        public Builder registeredPrefixName(Output<String> registeredPrefixName) {
            $.registeredPrefixName = registeredPrefixName;
            return this;
        }

        /**
         * @param registeredPrefixName The name of the registered prefix.
         * 
         * @return builder
         * 
         */
        public Builder registeredPrefixName(String registeredPrefixName) {
            return registeredPrefixName(Output.of(registeredPrefixName));
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

        public GetRegisteredPrefixArgs build() {
            $.peeringName = Objects.requireNonNull($.peeringName, "expected parameter 'peeringName' to be non-null");
            $.registeredPrefixName = Objects.requireNonNull($.registeredPrefixName, "expected parameter 'registeredPrefixName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
