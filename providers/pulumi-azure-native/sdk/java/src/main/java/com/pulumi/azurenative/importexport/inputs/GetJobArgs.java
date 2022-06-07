// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.importexport.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetJobArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetJobArgs Empty = new GetJobArgs();

    /**
     * The name of the import/export job.
     * 
     */
    @Import(name="jobName", required=true)
    private Output<String> jobName;

    /**
     * @return The name of the import/export job.
     * 
     */
    public Output<String> jobName() {
        return this.jobName;
    }

    /**
     * The resource group name uniquely identifies the resource group within the user subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name uniquely identifies the resource group within the user subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetJobArgs() {}

    private GetJobArgs(GetJobArgs $) {
        this.jobName = $.jobName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobArgs $;

        public Builder() {
            $ = new GetJobArgs();
        }

        public Builder(GetJobArgs defaults) {
            $ = new GetJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jobName The name of the import/export job.
         * 
         * @return builder
         * 
         */
        public Builder jobName(Output<String> jobName) {
            $.jobName = jobName;
            return this;
        }

        /**
         * @param jobName The name of the import/export job.
         * 
         * @return builder
         * 
         */
        public Builder jobName(String jobName) {
            return jobName(Output.of(jobName));
        }

        /**
         * @param resourceGroupName The resource group name uniquely identifies the resource group within the user subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name uniquely identifies the resource group within the user subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetJobArgs build() {
            $.jobName = Objects.requireNonNull($.jobName, "expected parameter 'jobName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
