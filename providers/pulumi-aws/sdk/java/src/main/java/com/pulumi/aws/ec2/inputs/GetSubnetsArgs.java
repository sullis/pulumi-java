// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetSubnetsFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubnetsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubnetsArgs Empty = new GetSubnetsArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetSubnetsFilterArgs>> filters;

    /**
     * @return Custom filter block as described below.
     * 
     */
    public Optional<Output<List<GetSubnetsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired subnets.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags, each pair of which must exactly match
     * a pair on the desired subnets.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetSubnetsArgs() {}

    private GetSubnetsArgs(GetSubnetsArgs $) {
        this.filters = $.filters;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubnetsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubnetsArgs $;

        public Builder() {
            $ = new GetSubnetsArgs();
        }

        public Builder(GetSubnetsArgs defaults) {
            $ = new GetSubnetsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetSubnetsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetSubnetsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetSubnetsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param tags A map of tags, each pair of which must exactly match
         * a pair on the desired subnets.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags, each pair of which must exactly match
         * a pair on the desired subnets.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetSubnetsArgs build() {
            return $;
        }
    }

}
