// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleConstraintsResource;
import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleStatisticsResource;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Baseline configuration used to validate that the data conforms to the specified constraints and statistics.
 * 
 */
public final class MonitoringScheduleBaselineConfig extends io.pulumi.resources.InvokeArgs {

    public static final MonitoringScheduleBaselineConfig Empty = new MonitoringScheduleBaselineConfig();

    @InputImport(name="constraintsResource")
    private final @Nullable MonitoringScheduleConstraintsResource constraintsResource;

    public Optional<MonitoringScheduleConstraintsResource> getConstraintsResource() {
        return this.constraintsResource == null ? Optional.empty() : Optional.ofNullable(this.constraintsResource);
    }

    @InputImport(name="statisticsResource")
    private final @Nullable MonitoringScheduleStatisticsResource statisticsResource;

    public Optional<MonitoringScheduleStatisticsResource> getStatisticsResource() {
        return this.statisticsResource == null ? Optional.empty() : Optional.ofNullable(this.statisticsResource);
    }

    public MonitoringScheduleBaselineConfig(
        @Nullable MonitoringScheduleConstraintsResource constraintsResource,
        @Nullable MonitoringScheduleStatisticsResource statisticsResource) {
        this.constraintsResource = constraintsResource;
        this.statisticsResource = statisticsResource;
    }

    private MonitoringScheduleBaselineConfig() {
        this.constraintsResource = null;
        this.statisticsResource = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleBaselineConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MonitoringScheduleConstraintsResource constraintsResource;
        private @Nullable MonitoringScheduleStatisticsResource statisticsResource;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleBaselineConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constraintsResource = defaults.constraintsResource;
    	      this.statisticsResource = defaults.statisticsResource;
        }

        public Builder setConstraintsResource(@Nullable MonitoringScheduleConstraintsResource constraintsResource) {
            this.constraintsResource = constraintsResource;
            return this;
        }

        public Builder setStatisticsResource(@Nullable MonitoringScheduleStatisticsResource statisticsResource) {
            this.statisticsResource = statisticsResource;
            return this;
        }

        public MonitoringScheduleBaselineConfig build() {
            return new MonitoringScheduleBaselineConfig(constraintsResource, statisticsResource);
        }
    }
}
