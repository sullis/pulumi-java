// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Identity.inputs.GetCostTrackingTagsFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCostTrackingTagsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCostTrackingTagsArgs Empty = new GetCostTrackingTagsArgs();

    /**
     * The OCID of the compartment (remember that the tenancy is simply the root compartment).
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return The OCID of the compartment (remember that the tenancy is simply the root compartment).
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    @Import(name="filters")
    private @Nullable Output<List<GetCostTrackingTagsFilterArgs>> filters;

    public Optional<Output<List<GetCostTrackingTagsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetCostTrackingTagsArgs() {}

    private GetCostTrackingTagsArgs(GetCostTrackingTagsArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCostTrackingTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCostTrackingTagsArgs $;

        public Builder() {
            $ = new GetCostTrackingTagsArgs();
        }

        public Builder(GetCostTrackingTagsArgs defaults) {
            $ = new GetCostTrackingTagsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The OCID of the compartment (remember that the tenancy is simply the root compartment).
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The OCID of the compartment (remember that the tenancy is simply the root compartment).
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        public Builder filters(@Nullable Output<List<GetCostTrackingTagsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetCostTrackingTagsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetCostTrackingTagsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public GetCostTrackingTagsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
