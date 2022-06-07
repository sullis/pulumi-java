// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azureactivedirectory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGuestUsagePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGuestUsagePlainArgs Empty = new GetGuestUsagePlainArgs();

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
     * The initial domain name of the AAD tenant.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    /**
     * @return The initial domain name of the AAD tenant.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    private GetGuestUsagePlainArgs() {}

    private GetGuestUsagePlainArgs(GetGuestUsagePlainArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGuestUsagePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGuestUsagePlainArgs $;

        public Builder() {
            $ = new GetGuestUsagePlainArgs();
        }

        public Builder(GetGuestUsagePlainArgs defaults) {
            $ = new GetGuestUsagePlainArgs(Objects.requireNonNull(defaults));
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
         * @param resourceName The initial domain name of the AAD tenant.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public GetGuestUsagePlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
