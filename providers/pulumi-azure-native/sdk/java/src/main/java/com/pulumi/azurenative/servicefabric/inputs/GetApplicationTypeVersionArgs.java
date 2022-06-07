// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApplicationTypeVersionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationTypeVersionArgs Empty = new GetApplicationTypeVersionArgs();

    /**
     * The name of the application type name resource.
     * 
     */
    @Import(name="applicationTypeName", required=true)
    private Output<String> applicationTypeName;

    /**
     * @return The name of the application type name resource.
     * 
     */
    public Output<String> applicationTypeName() {
        return this.applicationTypeName;
    }

    /**
     * The name of the cluster resource.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the cluster resource.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
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

    /**
     * The application type version.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return The application type version.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private GetApplicationTypeVersionArgs() {}

    private GetApplicationTypeVersionArgs(GetApplicationTypeVersionArgs $) {
        this.applicationTypeName = $.applicationTypeName;
        this.clusterName = $.clusterName;
        this.resourceGroupName = $.resourceGroupName;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationTypeVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationTypeVersionArgs $;

        public Builder() {
            $ = new GetApplicationTypeVersionArgs();
        }

        public Builder(GetApplicationTypeVersionArgs defaults) {
            $ = new GetApplicationTypeVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationTypeName The name of the application type name resource.
         * 
         * @return builder
         * 
         */
        public Builder applicationTypeName(Output<String> applicationTypeName) {
            $.applicationTypeName = applicationTypeName;
            return this;
        }

        /**
         * @param applicationTypeName The name of the application type name resource.
         * 
         * @return builder
         * 
         */
        public Builder applicationTypeName(String applicationTypeName) {
            return applicationTypeName(Output.of(applicationTypeName));
        }

        /**
         * @param clusterName The name of the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
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

        /**
         * @param version The application type version.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The application type version.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public GetApplicationTypeVersionArgs build() {
            $.applicationTypeName = Objects.requireNonNull($.applicationTypeName, "expected parameter 'applicationTypeName' to be non-null");
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
