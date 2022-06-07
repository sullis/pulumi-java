// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.maintenance.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConfigurationAssignmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConfigurationAssignmentArgs Empty = new GetConfigurationAssignmentArgs();

    /**
     * Configuration assignment name
     * 
     */
    @Import(name="configurationAssignmentName", required=true)
    private Output<String> configurationAssignmentName;

    /**
     * @return Configuration assignment name
     * 
     */
    public Output<String> configurationAssignmentName() {
        return this.configurationAssignmentName;
    }

    /**
     * Resource provider name
     * 
     */
    @Import(name="providerName", required=true)
    private Output<String> providerName;

    /**
     * @return Resource provider name
     * 
     */
    public Output<String> providerName() {
        return this.providerName;
    }

    /**
     * Resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Resource group name
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource identifier
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    /**
     * @return Resource identifier
     * 
     */
    public Output<String> resourceName() {
        return this.resourceName;
    }

    /**
     * Resource type
     * 
     */
    @Import(name="resourceType", required=true)
    private Output<String> resourceType;

    /**
     * @return Resource type
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }

    private GetConfigurationAssignmentArgs() {}

    private GetConfigurationAssignmentArgs(GetConfigurationAssignmentArgs $) {
        this.configurationAssignmentName = $.configurationAssignmentName;
        this.providerName = $.providerName;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConfigurationAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConfigurationAssignmentArgs $;

        public Builder() {
            $ = new GetConfigurationAssignmentArgs();
        }

        public Builder(GetConfigurationAssignmentArgs defaults) {
            $ = new GetConfigurationAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationAssignmentName Configuration assignment name
         * 
         * @return builder
         * 
         */
        public Builder configurationAssignmentName(Output<String> configurationAssignmentName) {
            $.configurationAssignmentName = configurationAssignmentName;
            return this;
        }

        /**
         * @param configurationAssignmentName Configuration assignment name
         * 
         * @return builder
         * 
         */
        public Builder configurationAssignmentName(String configurationAssignmentName) {
            return configurationAssignmentName(Output.of(configurationAssignmentName));
        }

        /**
         * @param providerName Resource provider name
         * 
         * @return builder
         * 
         */
        public Builder providerName(Output<String> providerName) {
            $.providerName = providerName;
            return this;
        }

        /**
         * @param providerName Resource provider name
         * 
         * @return builder
         * 
         */
        public Builder providerName(String providerName) {
            return providerName(Output.of(providerName));
        }

        /**
         * @param resourceGroupName Resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceName Resource identifier
         * 
         * @return builder
         * 
         */
        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName Resource identifier
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param resourceType Resource type
         * 
         * @return builder
         * 
         */
        public Builder resourceType(Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType Resource type
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public GetConfigurationAssignmentArgs build() {
            $.configurationAssignmentName = Objects.requireNonNull($.configurationAssignmentName, "expected parameter 'configurationAssignmentName' to be non-null");
            $.providerName = Objects.requireNonNull($.providerName, "expected parameter 'providerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            return $;
        }
    }

}
