// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetJobCollectionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetJobCollectionPlainArgs Empty = new GetJobCollectionPlainArgs();

    /**
     * The job collection name.
     * 
     */
    @Import(name="jobCollectionName", required=true)
    private String jobCollectionName;

    /**
     * @return The job collection name.
     * 
     */
    public String jobCollectionName() {
        return this.jobCollectionName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetJobCollectionPlainArgs() {}

    private GetJobCollectionPlainArgs(GetJobCollectionPlainArgs $) {
        this.jobCollectionName = $.jobCollectionName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobCollectionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobCollectionPlainArgs $;

        public Builder() {
            $ = new GetJobCollectionPlainArgs();
        }

        public Builder(GetJobCollectionPlainArgs defaults) {
            $ = new GetJobCollectionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jobCollectionName The job collection name.
         * 
         * @return builder
         * 
         */
        public Builder jobCollectionName(String jobCollectionName) {
            $.jobCollectionName = jobCollectionName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetJobCollectionPlainArgs build() {
            $.jobCollectionName = Objects.requireNonNull($.jobCollectionName, "expected parameter 'jobCollectionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
