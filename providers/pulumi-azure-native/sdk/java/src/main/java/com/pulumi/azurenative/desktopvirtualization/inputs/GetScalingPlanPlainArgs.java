// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.desktopvirtualization.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetScalingPlanPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetScalingPlanPlainArgs Empty = new GetScalingPlanPlainArgs();

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

    /**
     * The name of the scaling plan.
     * 
     */
    @Import(name="scalingPlanName", required=true)
    private String scalingPlanName;

    /**
     * @return The name of the scaling plan.
     * 
     */
    public String scalingPlanName() {
        return this.scalingPlanName;
    }

    private GetScalingPlanPlainArgs() {}

    private GetScalingPlanPlainArgs(GetScalingPlanPlainArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.scalingPlanName = $.scalingPlanName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScalingPlanPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScalingPlanPlainArgs $;

        public Builder() {
            $ = new GetScalingPlanPlainArgs();
        }

        public Builder(GetScalingPlanPlainArgs defaults) {
            $ = new GetScalingPlanPlainArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param scalingPlanName The name of the scaling plan.
         * 
         * @return builder
         * 
         */
        public Builder scalingPlanName(String scalingPlanName) {
            $.scalingPlanName = scalingPlanName;
            return this;
        }

        public GetScalingPlanPlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.scalingPlanName = Objects.requireNonNull($.scalingPlanName, "expected parameter 'scalingPlanName' to be non-null");
            return $;
        }
    }

}
