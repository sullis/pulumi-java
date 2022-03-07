// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RegistryScanningConfigurationRuleRepositoryFilter {
    private final String filter;
    private final String filterType;

    @OutputCustomType.Constructor({"filter","filterType"})
    private RegistryScanningConfigurationRuleRepositoryFilter(
        String filter,
        String filterType) {
        this.filter = Objects.requireNonNull(filter);
        this.filterType = Objects.requireNonNull(filterType);
    }

    public String getFilter() {
        return this.filter;
    }
    public String getFilterType() {
        return this.filterType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryScanningConfigurationRuleRepositoryFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filter;
        private String filterType;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryScanningConfigurationRuleRepositoryFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.filterType = defaults.filterType;
        }

        public Builder setFilter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setFilterType(String filterType) {
            this.filterType = Objects.requireNonNull(filterType);
            return this;
        }
        public RegistryScanningConfigurationRuleRepositoryFilter build() {
            return new RegistryScanningConfigurationRuleRepositoryFilter(filter, filterType);
        }
    }
}