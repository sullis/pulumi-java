// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetScheduleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetScheduleArgs Empty = new GetScheduleArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private Output<String> automationAccountName;

    /**
     * @return The name of the automation account.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of an Azure Resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The schedule name.
     * 
     */
    @Import(name="scheduleName", required=true)
    private Output<String> scheduleName;

    /**
     * @return The schedule name.
     * 
     */
    public Output<String> scheduleName() {
        return this.scheduleName;
    }

    private GetScheduleArgs() {}

    private GetScheduleArgs(GetScheduleArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.resourceGroupName = $.resourceGroupName;
        this.scheduleName = $.scheduleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScheduleArgs $;

        public Builder() {
            $ = new GetScheduleArgs();
        }

        public Builder(GetScheduleArgs defaults) {
            $ = new GetScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automationAccountName The name of the automation account.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(Output<String> automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        /**
         * @param automationAccountName The name of the automation account.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(String automationAccountName) {
            return automationAccountName(Output.of(automationAccountName));
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param scheduleName The schedule name.
         * 
         * @return builder
         * 
         */
        public Builder scheduleName(Output<String> scheduleName) {
            $.scheduleName = scheduleName;
            return this;
        }

        /**
         * @param scheduleName The schedule name.
         * 
         * @return builder
         * 
         */
        public Builder scheduleName(String scheduleName) {
            return scheduleName(Output.of(scheduleName));
        }

        public GetScheduleArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.scheduleName = Objects.requireNonNull($.scheduleName, "expected parameter 'scheduleName' to be non-null");
            return $;
        }
    }

}
