// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.outputs.JobColumnSelector;
import io.pulumi.awsnative.databrew.outputs.JobStatisticsConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobColumnStatisticsConfiguration {
    private final @Nullable List<JobColumnSelector> selectors;
    private final JobStatisticsConfiguration statistics;

    @OutputCustomType.Constructor({"selectors","statistics"})
    private JobColumnStatisticsConfiguration(
        @Nullable List<JobColumnSelector> selectors,
        JobStatisticsConfiguration statistics) {
        this.selectors = selectors;
        this.statistics = Objects.requireNonNull(statistics);
    }

    public List<JobColumnSelector> getSelectors() {
        return this.selectors == null ? List.of() : this.selectors;
    }
    public JobStatisticsConfiguration getStatistics() {
        return this.statistics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobColumnStatisticsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<JobColumnSelector> selectors;
        private JobStatisticsConfiguration statistics;

        public Builder() {
    	      // Empty
        }

        public Builder(JobColumnStatisticsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectors = defaults.selectors;
    	      this.statistics = defaults.statistics;
        }

        public Builder setSelectors(@Nullable List<JobColumnSelector> selectors) {
            this.selectors = selectors;
            return this;
        }

        public Builder setStatistics(JobStatisticsConfiguration statistics) {
            this.statistics = Objects.requireNonNull(statistics);
            return this;
        }

        public JobColumnStatisticsConfiguration build() {
            return new JobColumnStatisticsConfiguration(selectors, statistics);
        }
    }
}
