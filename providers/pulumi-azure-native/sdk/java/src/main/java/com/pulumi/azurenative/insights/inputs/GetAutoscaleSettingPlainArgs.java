// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAutoscaleSettingPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAutoscaleSettingPlainArgs Empty = new GetAutoscaleSettingPlainArgs();

    /**
     * The autoscale setting name.
     * 
     */
    @Import(name="autoscaleSettingName", required=true)
    private String autoscaleSettingName;

    /**
     * @return The autoscale setting name.
     * 
     */
    public String autoscaleSettingName() {
        return this.autoscaleSettingName;
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

    private GetAutoscaleSettingPlainArgs() {}

    private GetAutoscaleSettingPlainArgs(GetAutoscaleSettingPlainArgs $) {
        this.autoscaleSettingName = $.autoscaleSettingName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAutoscaleSettingPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAutoscaleSettingPlainArgs $;

        public Builder() {
            $ = new GetAutoscaleSettingPlainArgs();
        }

        public Builder(GetAutoscaleSettingPlainArgs defaults) {
            $ = new GetAutoscaleSettingPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscaleSettingName The autoscale setting name.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleSettingName(String autoscaleSettingName) {
            $.autoscaleSettingName = autoscaleSettingName;
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

        public GetAutoscaleSettingPlainArgs build() {
            $.autoscaleSettingName = Objects.requireNonNull($.autoscaleSettingName, "expected parameter 'autoscaleSettingName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
