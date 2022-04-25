// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.aws.imagebuilder.outputs.GetDistributionConfigurationsFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetDistributionConfigurationsResult {
    /**
     * @return Set of ARNs of the matched Image Builder Distribution Configurations.
     * 
     */
    private final List<String> arns;
    private final @Nullable List<GetDistributionConfigurationsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Set of names of the matched Image Builder Distribution Configurations.
     * 
     */
    private final List<String> names;

    @CustomType.Constructor
    private GetDistributionConfigurationsResult(
        @CustomType.Parameter("arns") List<String> arns,
        @CustomType.Parameter("filters") @Nullable List<GetDistributionConfigurationsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("names") List<String> names) {
        this.arns = arns;
        this.filters = filters;
        this.id = id;
        this.names = names;
    }

    /**
     * @return Set of ARNs of the matched Image Builder Distribution Configurations.
     * 
     */
    public List<String> arns() {
        return this.arns;
    }
    public List<GetDistributionConfigurationsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Set of names of the matched Image Builder Distribution Configurations.
     * 
     */
    public List<String> names() {
        return this.names;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDistributionConfigurationsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> arns;
        private @Nullable List<GetDistributionConfigurationsFilter> filters;
        private String id;
        private List<String> names;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDistributionConfigurationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arns = defaults.arns;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.names = defaults.names;
        }

        public Builder arns(List<String> arns) {
            this.arns = Objects.requireNonNull(arns);
            return this;
        }
        public Builder arns(String... arns) {
            return arns(List.of(arns));
        }
        public Builder filters(@Nullable List<GetDistributionConfigurationsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetDistributionConfigurationsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }        public GetDistributionConfigurationsResult build() {
            return new GetDistributionConfigurationsResult(arns, filters, id, names);
        }
    }
}
