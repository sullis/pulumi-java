// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Marketplace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Marketplace.inputs.GetCategoriesFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCategoriesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCategoriesArgs Empty = new GetCategoriesArgs();

    /**
     * The unique identifier for the compartment.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return The unique identifier for the compartment.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetCategoriesFilterArgs>> filters;

    public Optional<Output<List<GetCategoriesFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetCategoriesArgs() {}

    private GetCategoriesArgs(GetCategoriesArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCategoriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCategoriesArgs $;

        public Builder() {
            $ = new GetCategoriesArgs();
        }

        public Builder(GetCategoriesArgs defaults) {
            $ = new GetCategoriesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The unique identifier for the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The unique identifier for the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        public Builder filters(@Nullable Output<List<GetCategoriesFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetCategoriesFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetCategoriesFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public GetCategoriesArgs build() {
            return $;
        }
    }

}
