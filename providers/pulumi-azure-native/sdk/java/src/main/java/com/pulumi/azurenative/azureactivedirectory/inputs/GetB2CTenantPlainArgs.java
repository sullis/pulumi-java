// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azureactivedirectory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetB2CTenantPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetB2CTenantPlainArgs Empty = new GetB2CTenantPlainArgs();

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

    /**
     * The initial domain name of the B2C tenant.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    /**
     * @return The initial domain name of the B2C tenant.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    private GetB2CTenantPlainArgs() {}

    private GetB2CTenantPlainArgs(GetB2CTenantPlainArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetB2CTenantPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetB2CTenantPlainArgs $;

        public Builder() {
            $ = new GetB2CTenantPlainArgs();
        }

        public Builder(GetB2CTenantPlainArgs defaults) {
            $ = new GetB2CTenantPlainArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param resourceName The initial domain name of the B2C tenant.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public GetB2CTenantPlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
