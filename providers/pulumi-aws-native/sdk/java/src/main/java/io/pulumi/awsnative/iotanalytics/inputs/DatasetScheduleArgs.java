// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DatasetScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetScheduleArgs Empty = new DatasetScheduleArgs();

    @InputImport(name="scheduleExpression", required=true)
    private final Input<String> scheduleExpression;

    public Input<String> getScheduleExpression() {
        return this.scheduleExpression;
    }

    public DatasetScheduleArgs(Input<String> scheduleExpression) {
        this.scheduleExpression = Objects.requireNonNull(scheduleExpression, "expected parameter 'scheduleExpression' to be non-null");
    }

    private DatasetScheduleArgs() {
        this.scheduleExpression = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> scheduleExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduleExpression = defaults.scheduleExpression;
        }

        public Builder setScheduleExpression(Input<String> scheduleExpression) {
            this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
            return this;
        }

        public Builder setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = Input.of(Objects.requireNonNull(scheduleExpression));
            return this;
        }

        public DatasetScheduleArgs build() {
            return new DatasetScheduleArgs(scheduleExpression);
        }
    }
}
