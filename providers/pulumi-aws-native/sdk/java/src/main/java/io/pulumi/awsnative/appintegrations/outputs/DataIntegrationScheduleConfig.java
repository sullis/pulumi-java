// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appintegrations.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataIntegrationScheduleConfig {
    /**
     * The start date for objects to import in the first flow run. Epoch or ISO timestamp format is supported.
     * 
     */
    private final String firstExecutionFrom;
    /**
     * The name of the object to pull from the data source.
     * 
     */
    private final String object;
    /**
     * How often the data should be pulled from data source.
     * 
     */
    private final String scheduleExpression;

    @OutputCustomType.Constructor({"firstExecutionFrom","object","scheduleExpression"})
    private DataIntegrationScheduleConfig(
        String firstExecutionFrom,
        String object,
        String scheduleExpression) {
        this.firstExecutionFrom = Objects.requireNonNull(firstExecutionFrom);
        this.object = Objects.requireNonNull(object);
        this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
    }

    /**
     * The start date for objects to import in the first flow run. Epoch or ISO timestamp format is supported.
     * 
     */
    public String getFirstExecutionFrom() {
        return this.firstExecutionFrom;
    }
    /**
     * The name of the object to pull from the data source.
     * 
     */
    public String getObject() {
        return this.object;
    }
    /**
     * How often the data should be pulled from data source.
     * 
     */
    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataIntegrationScheduleConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String firstExecutionFrom;
        private String object;
        private String scheduleExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(DataIntegrationScheduleConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firstExecutionFrom = defaults.firstExecutionFrom;
    	      this.object = defaults.object;
    	      this.scheduleExpression = defaults.scheduleExpression;
        }

        public Builder setFirstExecutionFrom(String firstExecutionFrom) {
            this.firstExecutionFrom = Objects.requireNonNull(firstExecutionFrom);
            return this;
        }

        public Builder setObject(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }

        public Builder setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
            return this;
        }

        public DataIntegrationScheduleConfig build() {
            return new DataIntegrationScheduleConfig(firstExecutionFrom, object, scheduleExpression);
        }
    }
}
