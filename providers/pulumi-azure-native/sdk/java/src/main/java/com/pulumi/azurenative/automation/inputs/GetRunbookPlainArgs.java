// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRunbookPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRunbookPlainArgs Empty = new GetRunbookPlainArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private String automationAccountName;

    /**
     * @return The name of the automation account.
     * 
     */
    public String automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of an Azure Resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The runbook name.
     * 
     */
    @Import(name="runbookName", required=true)
    private String runbookName;

    /**
     * @return The runbook name.
     * 
     */
    public String runbookName() {
        return this.runbookName;
    }

    private GetRunbookPlainArgs() {}

    private GetRunbookPlainArgs(GetRunbookPlainArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.resourceGroupName = $.resourceGroupName;
        this.runbookName = $.runbookName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRunbookPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRunbookPlainArgs $;

        public Builder() {
            $ = new GetRunbookPlainArgs();
        }

        public Builder(GetRunbookPlainArgs defaults) {
            $ = new GetRunbookPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automationAccountName The name of the automation account.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(String automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param runbookName The runbook name.
         * 
         * @return builder
         * 
         */
        public Builder runbookName(String runbookName) {
            $.runbookName = runbookName;
            return this;
        }

        public GetRunbookPlainArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.runbookName = Objects.requireNonNull($.runbookName, "expected parameter 'runbookName' to be non-null");
            return $;
        }
    }

}
