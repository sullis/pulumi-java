// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr.inputs;

import io.pulumi.awsnative.ecr.enums.ReplicationConfigurationFilterType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * An array of objects representing the details of a repository filter.
 * 
 */
public final class ReplicationConfigurationRepositoryFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigurationRepositoryFilterArgs Empty = new ReplicationConfigurationRepositoryFilterArgs();

    @Import(name="filter", required=true)
      private final Output<String> filter;

    public Output<String> filter() {
        return this.filter;
    }

    @Import(name="filterType", required=true)
      private final Output<ReplicationConfigurationFilterType> filterType;

    public Output<ReplicationConfigurationFilterType> filterType() {
        return this.filterType;
    }

    public ReplicationConfigurationRepositoryFilterArgs(
        Output<String> filter,
        Output<ReplicationConfigurationFilterType> filterType) {
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.filterType = Objects.requireNonNull(filterType, "expected parameter 'filterType' to be non-null");
    }

    private ReplicationConfigurationRepositoryFilterArgs() {
        this.filter = Codegen.empty();
        this.filterType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationRepositoryFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> filter;
        private Output<ReplicationConfigurationFilterType> filterType;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationRepositoryFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.filterType = defaults.filterType;
        }

        public Builder filter(Output<String> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder filter(String filter) {
            this.filter = Output.of(Objects.requireNonNull(filter));
            return this;
        }
        public Builder filterType(Output<ReplicationConfigurationFilterType> filterType) {
            this.filterType = Objects.requireNonNull(filterType);
            return this;
        }
        public Builder filterType(ReplicationConfigurationFilterType filterType) {
            this.filterType = Output.of(Objects.requireNonNull(filterType));
            return this;
        }        public ReplicationConfigurationRepositoryFilterArgs build() {
            return new ReplicationConfigurationRepositoryFilterArgs(filter, filterType);
        }
    }
}
