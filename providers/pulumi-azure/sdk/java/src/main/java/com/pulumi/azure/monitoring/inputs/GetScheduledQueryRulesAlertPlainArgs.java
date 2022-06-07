// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetScheduledQueryRulesAlertPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetScheduledQueryRulesAlertPlainArgs Empty = new GetScheduledQueryRulesAlertPlainArgs();

    /**
     * Specifies the name of the scheduled query rule.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Specifies the name of the scheduled query rule.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Specifies the name of the resource group where the scheduled query rule is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Specifies the name of the resource group where the scheduled query rule is located.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetScheduledQueryRulesAlertPlainArgs() {}

    private GetScheduledQueryRulesAlertPlainArgs(GetScheduledQueryRulesAlertPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScheduledQueryRulesAlertPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScheduledQueryRulesAlertPlainArgs $;

        public Builder() {
            $ = new GetScheduledQueryRulesAlertPlainArgs();
        }

        public Builder(GetScheduledQueryRulesAlertPlainArgs defaults) {
            $ = new GetScheduledQueryRulesAlertPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the scheduled query rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the resource group where the scheduled query rule is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetScheduledQueryRulesAlertPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
