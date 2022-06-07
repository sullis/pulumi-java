// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managedidentity.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetUserAssignedIdentityPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserAssignedIdentityPlainArgs Empty = new GetUserAssignedIdentityPlainArgs();

    /**
     * The name of the Resource Group to which the identity belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Resource Group to which the identity belongs.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the identity resource.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    /**
     * @return The name of the identity resource.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    private GetUserAssignedIdentityPlainArgs() {}

    private GetUserAssignedIdentityPlainArgs(GetUserAssignedIdentityPlainArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserAssignedIdentityPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserAssignedIdentityPlainArgs $;

        public Builder() {
            $ = new GetUserAssignedIdentityPlainArgs();
        }

        public Builder(GetUserAssignedIdentityPlainArgs defaults) {
            $ = new GetUserAssignedIdentityPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the Resource Group to which the identity belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceName The name of the identity resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public GetUserAssignedIdentityPlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
