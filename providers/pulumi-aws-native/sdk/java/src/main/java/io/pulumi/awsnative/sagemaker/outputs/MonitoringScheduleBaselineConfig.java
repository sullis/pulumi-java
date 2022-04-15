// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleConstraintsResource;
import io.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleStatisticsResource;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MonitoringScheduleBaselineConfig {
    private final @Nullable MonitoringScheduleConstraintsResource constraintsResource;
    private final @Nullable MonitoringScheduleStatisticsResource statisticsResource;

    @CustomType.Constructor
    private MonitoringScheduleBaselineConfig(
        @CustomType.Parameter("constraintsResource") @Nullable MonitoringScheduleConstraintsResource constraintsResource,
        @CustomType.Parameter("statisticsResource") @Nullable MonitoringScheduleStatisticsResource statisticsResource) {
        this.constraintsResource = constraintsResource;
        this.statisticsResource = statisticsResource;
    }

    public Optional<MonitoringScheduleConstraintsResource> constraintsResource() {
        return Optional.ofNullable(this.constraintsResource);
    }
    public Optional<MonitoringScheduleStatisticsResource> statisticsResource() {
        return Optional.ofNullable(this.statisticsResource);
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

        public Builder constraintsResource(@Nullable MonitoringScheduleConstraintsResource constraintsResource) {
            this.constraintsResource = constraintsResource;
            return this;
        }
        public Builder statisticsResource(@Nullable MonitoringScheduleStatisticsResource statisticsResource) {
            this.statisticsResource = statisticsResource;
            return this;
        }        public MonitoringScheduleBaselineConfig build() {
            return new MonitoringScheduleBaselineConfig(constraintsResource, statisticsResource);
        }
    }
}
