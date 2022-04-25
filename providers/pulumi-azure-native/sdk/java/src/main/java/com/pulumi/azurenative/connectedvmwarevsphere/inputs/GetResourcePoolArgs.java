// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResourcePoolArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourcePoolArgs Empty = new GetResourcePoolArgs();

    /**
     * The Resource Group Name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The Resource Group Name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the resourcePool.
     * 
     */
    @Import(name="resourcePoolName", required=true)
    private String resourcePoolName;

    /**
     * @return Name of the resourcePool.
     * 
     */
    public String resourcePoolName() {
        return this.resourcePoolName;
    }

    private GetResourcePoolArgs() {}

    private GetResourcePoolArgs(GetResourcePoolArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.resourcePoolName = $.resourcePoolName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourcePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourcePoolArgs $;

        public Builder() {
            $ = new GetResourcePoolArgs();
        }

        public Builder(GetResourcePoolArgs defaults) {
            $ = new GetResourcePoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The Resource Group Name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourcePoolName Name of the resourcePool.
         * 
         * @return builder
         * 
         */
        public Builder resourcePoolName(String resourcePoolName) {
            $.resourcePoolName = resourcePoolName;
            return this;
        }

        public GetResourcePoolArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourcePoolName = Objects.requireNonNull($.resourcePoolName, "expected parameter 'resourcePoolName' to be non-null");
            return $;
        }
    }

}
