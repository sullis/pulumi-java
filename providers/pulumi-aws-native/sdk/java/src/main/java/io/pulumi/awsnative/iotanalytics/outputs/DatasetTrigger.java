// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.awsnative.iotanalytics.outputs.DatasetSchedule;
import io.pulumi.awsnative.iotanalytics.outputs.DatasetTriggeringDataset;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatasetTrigger {
    private final @Nullable DatasetSchedule schedule;
    private final @Nullable DatasetTriggeringDataset triggeringDataset;

    @CustomType.Constructor
    private DatasetTrigger(
        @CustomType.Parameter("schedule") @Nullable DatasetSchedule schedule,
        @CustomType.Parameter("triggeringDataset") @Nullable DatasetTriggeringDataset triggeringDataset) {
        this.schedule = schedule;
        this.triggeringDataset = triggeringDataset;
    }

    public Optional<DatasetSchedule> getSchedule() {
        return Optional.ofNullable(this.schedule);
    }
    public Optional<DatasetTriggeringDataset> getTriggeringDataset() {
        return Optional.ofNullable(this.triggeringDataset);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetTrigger defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatasetSchedule schedule;
        private @Nullable DatasetTriggeringDataset triggeringDataset;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetTrigger defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedule = defaults.schedule;
    	      this.triggeringDataset = defaults.triggeringDataset;
        }

        public Builder schedule(@Nullable DatasetSchedule schedule) {
            this.schedule = schedule;
            return this;
        }
        public Builder triggeringDataset(@Nullable DatasetTriggeringDataset triggeringDataset) {
            this.triggeringDataset = triggeringDataset;
            return this;
        }        public DatasetTrigger build() {
            return new DatasetTrigger(schedule, triggeringDataset);
        }
    }
}
