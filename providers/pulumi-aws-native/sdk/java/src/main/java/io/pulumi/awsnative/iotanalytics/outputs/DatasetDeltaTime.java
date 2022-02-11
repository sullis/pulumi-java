// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DatasetDeltaTime {
    private final Integer offsetSeconds;
    private final String timeExpression;

    @OutputCustomType.Constructor({"offsetSeconds","timeExpression"})
    private DatasetDeltaTime(
        Integer offsetSeconds,
        String timeExpression) {
        this.offsetSeconds = Objects.requireNonNull(offsetSeconds);
        this.timeExpression = Objects.requireNonNull(timeExpression);
    }

    public Integer getOffsetSeconds() {
        return this.offsetSeconds;
    }
    public String getTimeExpression() {
        return this.timeExpression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetDeltaTime defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer offsetSeconds;
        private String timeExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetDeltaTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offsetSeconds = defaults.offsetSeconds;
    	      this.timeExpression = defaults.timeExpression;
        }

        public Builder setOffsetSeconds(Integer offsetSeconds) {
            this.offsetSeconds = Objects.requireNonNull(offsetSeconds);
            return this;
        }

        public Builder setTimeExpression(String timeExpression) {
            this.timeExpression = Objects.requireNonNull(timeExpression);
            return this;
        }

        public DatasetDeltaTime build() {
            return new DatasetDeltaTime(offsetSeconds, timeExpression);
        }
    }
}
