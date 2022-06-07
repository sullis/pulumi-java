// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNspAssociationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNspAssociationArgs Empty = new GetNspAssociationArgs();

    /**
     * The name of the NSP association.
     * 
     */
    @Import(name="associationName", required=true)
    private Output<String> associationName;

    /**
     * @return The name of the NSP association.
     * 
     */
    public Output<String> associationName() {
        return this.associationName;
    }

    /**
     * The name of the network security perimeter.
     * 
     */
    @Import(name="networkSecurityPerimeterName", required=true)
    private Output<String> networkSecurityPerimeterName;

    /**
     * @return The name of the network security perimeter.
     * 
     */
    public Output<String> networkSecurityPerimeterName() {
        return this.networkSecurityPerimeterName;
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

    private GetNspAssociationArgs() {}

    private GetNspAssociationArgs(GetNspAssociationArgs $) {
        this.associationName = $.associationName;
        this.networkSecurityPerimeterName = $.networkSecurityPerimeterName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNspAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNspAssociationArgs $;

        public Builder() {
            $ = new GetNspAssociationArgs();
        }

        public Builder(GetNspAssociationArgs defaults) {
            $ = new GetNspAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param associationName The name of the NSP association.
         * 
         * @return builder
         * 
         */
        public Builder associationName(Output<String> associationName) {
            $.associationName = associationName;
            return this;
        }

        /**
         * @param associationName The name of the NSP association.
         * 
         * @return builder
         * 
         */
        public Builder associationName(String associationName) {
            return associationName(Output.of(associationName));
        }

        /**
         * @param networkSecurityPerimeterName The name of the network security perimeter.
         * 
         * @return builder
         * 
         */
        public Builder networkSecurityPerimeterName(Output<String> networkSecurityPerimeterName) {
            $.networkSecurityPerimeterName = networkSecurityPerimeterName;
            return this;
        }

        /**
         * @param networkSecurityPerimeterName The name of the network security perimeter.
         * 
         * @return builder
         * 
         */
        public Builder networkSecurityPerimeterName(String networkSecurityPerimeterName) {
            return networkSecurityPerimeterName(Output.of(networkSecurityPerimeterName));
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

        public GetNspAssociationArgs build() {
            $.associationName = Objects.requireNonNull($.associationName, "expected parameter 'associationName' to be non-null");
            $.networkSecurityPerimeterName = Objects.requireNonNull($.networkSecurityPerimeterName, "expected parameter 'networkSecurityPerimeterName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
