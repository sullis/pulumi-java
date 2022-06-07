// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Waas.inputs.GetEdgeSubnetsFilter;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEdgeSubnetsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEdgeSubnetsPlainArgs Empty = new GetEdgeSubnetsPlainArgs();

    @Import(name="filters")
    private @Nullable List<GetEdgeSubnetsFilter> filters;

    public Optional<List<GetEdgeSubnetsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetEdgeSubnetsPlainArgs() {}

    private GetEdgeSubnetsPlainArgs(GetEdgeSubnetsPlainArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEdgeSubnetsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEdgeSubnetsPlainArgs $;

        public Builder() {
            $ = new GetEdgeSubnetsPlainArgs();
        }

        public Builder(GetEdgeSubnetsPlainArgs defaults) {
            $ = new GetEdgeSubnetsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetEdgeSubnetsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetEdgeSubnetsFilter... filters) {
            return filters(List.of(filters));
        }

        public GetEdgeSubnetsPlainArgs build() {
            return $;
        }
    }

}
