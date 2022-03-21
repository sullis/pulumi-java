// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationsFilter;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInfrastructureConfigurationsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInfrastructureConfigurationsArgs Empty = new GetInfrastructureConfigurationsArgs();

    /**
     * Configuration block(s) for filtering. Detailed below.
     * 
     */
    @Import(name="filters")
      private final @Nullable List<GetInfrastructureConfigurationsFilter> filters;

    public List<GetInfrastructureConfigurationsFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    public GetInfrastructureConfigurationsArgs(@Nullable List<GetInfrastructureConfigurationsFilter> filters) {
        this.filters = filters;
    }

    private GetInfrastructureConfigurationsArgs() {
        this.filters = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInfrastructureConfigurationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetInfrastructureConfigurationsFilter> filters;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInfrastructureConfigurationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
        }

        public Builder filters(@Nullable List<GetInfrastructureConfigurationsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetInfrastructureConfigurationsFilter... filters) {
            return filters(List.of(filters));
        }        public GetInfrastructureConfigurationsArgs build() {
            return new GetInfrastructureConfigurationsArgs(filters);
        }
    }
}
