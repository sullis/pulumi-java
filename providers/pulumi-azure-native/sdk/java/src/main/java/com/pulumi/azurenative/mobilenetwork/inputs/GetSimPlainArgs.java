// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.mobilenetwork.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSimPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSimPlainArgs Empty = new GetSimPlainArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the SIM.
     * 
     */
    @Import(name="simName", required=true)
    private String simName;

    /**
     * @return The name of the SIM.
     * 
     */
    public String simName() {
        return this.simName;
    }

    private GetSimPlainArgs() {}

    private GetSimPlainArgs(GetSimPlainArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.simName = $.simName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSimPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSimPlainArgs $;

        public Builder() {
            $ = new GetSimPlainArgs();
        }

        public Builder(GetSimPlainArgs defaults) {
            $ = new GetSimPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param simName The name of the SIM.
         * 
         * @return builder
         * 
         */
        public Builder simName(String simName) {
            $.simName = simName;
            return this;
        }

        public GetSimPlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.simName = Objects.requireNonNull($.simName, "expected parameter 'simName' to be non-null");
            return $;
        }
    }

}
