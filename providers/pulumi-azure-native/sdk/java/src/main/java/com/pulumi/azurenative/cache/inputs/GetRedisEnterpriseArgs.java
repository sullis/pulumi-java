// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cache.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRedisEnterpriseArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRedisEnterpriseArgs Empty = new GetRedisEnterpriseArgs();

    /**
     * The name of the RedisEnterprise cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private String clusterName;

    /**
     * @return The name of the RedisEnterprise cluster.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }

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

    private GetRedisEnterpriseArgs() {}

    private GetRedisEnterpriseArgs(GetRedisEnterpriseArgs $) {
        this.clusterName = $.clusterName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRedisEnterpriseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRedisEnterpriseArgs $;

        public Builder() {
            $ = new GetRedisEnterpriseArgs();
        }

        public Builder(GetRedisEnterpriseArgs defaults) {
            $ = new GetRedisEnterpriseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the RedisEnterprise cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            $.clusterName = clusterName;
            return this;
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

        public GetRedisEnterpriseArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
