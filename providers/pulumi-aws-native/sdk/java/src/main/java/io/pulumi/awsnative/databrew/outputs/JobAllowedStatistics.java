// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class JobAllowedStatistics {
    private final List<String> statistics;

    @CustomType.Constructor
    private JobAllowedStatistics(@CustomType.Parameter("statistics") List<String> statistics) {
        this.statistics = statistics;
    }

    public List<String> statistics() {
        return this.statistics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobAllowedStatistics defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> statistics;

        public Builder() {
    	      // Empty
        }

        public Builder(JobAllowedStatistics defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statistics = defaults.statistics;
        }

        public Builder statistics(List<String> statistics) {
            this.statistics = Objects.requireNonNull(statistics);
            return this;
        }
        public Builder statistics(String... statistics) {
            return statistics(List.of(statistics));
        }        public JobAllowedStatistics build() {
            return new JobAllowedStatistics(statistics);
        }
    }
}
