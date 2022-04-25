// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.azurenative.costmanagement.inputs.SourceCostAllocationResourceResponse;
import com.pulumi.azurenative.costmanagement.inputs.TargetCostAllocationResourceResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Resource details of the cost allocation rule
 * 
 */
public final class CostAllocationRuleDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final CostAllocationRuleDetailsResponse Empty = new CostAllocationRuleDetailsResponse();

    /**
     * Source resources for cost allocation. At this time, this list can contain no more than one element.
     * 
     */
    @Import(name="sourceResources")
    private @Nullable List<SourceCostAllocationResourceResponse> sourceResources;

    /**
     * @return Source resources for cost allocation. At this time, this list can contain no more than one element.
     * 
     */
    public Optional<List<SourceCostAllocationResourceResponse>> sourceResources() {
        return Optional.ofNullable(this.sourceResources);
    }

    /**
     * Target resources for cost allocation. At this time, this list can contain no more than one element.
     * 
     */
    @Import(name="targetResources")
    private @Nullable List<TargetCostAllocationResourceResponse> targetResources;

    /**
     * @return Target resources for cost allocation. At this time, this list can contain no more than one element.
     * 
     */
    public Optional<List<TargetCostAllocationResourceResponse>> targetResources() {
        return Optional.ofNullable(this.targetResources);
    }

    private CostAllocationRuleDetailsResponse() {}

    private CostAllocationRuleDetailsResponse(CostAllocationRuleDetailsResponse $) {
        this.sourceResources = $.sourceResources;
        this.targetResources = $.targetResources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CostAllocationRuleDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CostAllocationRuleDetailsResponse $;

        public Builder() {
            $ = new CostAllocationRuleDetailsResponse();
        }

        public Builder(CostAllocationRuleDetailsResponse defaults) {
            $ = new CostAllocationRuleDetailsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param sourceResources Source resources for cost allocation. At this time, this list can contain no more than one element.
         * 
         * @return builder
         * 
         */
        public Builder sourceResources(@Nullable List<SourceCostAllocationResourceResponse> sourceResources) {
            $.sourceResources = sourceResources;
            return this;
        }

        /**
         * @param sourceResources Source resources for cost allocation. At this time, this list can contain no more than one element.
         * 
         * @return builder
         * 
         */
        public Builder sourceResources(SourceCostAllocationResourceResponse... sourceResources) {
            return sourceResources(List.of(sourceResources));
        }

        /**
         * @param targetResources Target resources for cost allocation. At this time, this list can contain no more than one element.
         * 
         * @return builder
         * 
         */
        public Builder targetResources(@Nullable List<TargetCostAllocationResourceResponse> targetResources) {
            $.targetResources = targetResources;
            return this;
        }

        /**
         * @param targetResources Target resources for cost allocation. At this time, this list can contain no more than one element.
         * 
         * @return builder
         * 
         */
        public Builder targetResources(TargetCostAllocationResourceResponse... targetResources) {
            return targetResources(List.of(targetResources));
        }

        public CostAllocationRuleDetailsResponse build() {
            return $;
        }
    }

}
