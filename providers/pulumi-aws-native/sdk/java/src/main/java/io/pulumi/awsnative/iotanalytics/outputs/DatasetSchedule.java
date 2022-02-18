// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DatasetSchedule {
    private final String scheduleExpression;

    @OutputCustomType.Constructor({"scheduleExpression"})
    private DatasetSchedule(String scheduleExpression) {
        this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
    }

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scheduleExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduleExpression = defaults.scheduleExpression;
        }

        public Builder setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
            return this;
        }

        public DatasetSchedule build() {
            return new DatasetSchedule(scheduleExpression);
        }
    }
}
