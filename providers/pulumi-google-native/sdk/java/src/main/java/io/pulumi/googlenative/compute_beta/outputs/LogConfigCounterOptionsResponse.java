// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.compute_beta.outputs.LogConfigCounterOptionsCustomFieldResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class LogConfigCounterOptionsResponse {
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final List<LogConfigCounterOptionsCustomFieldResponse> customFields;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final String field;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final String metric;

    @CustomType.Constructor
    private LogConfigCounterOptionsResponse(
        @CustomType.Parameter("customFields") List<LogConfigCounterOptionsCustomFieldResponse> customFields,
        @CustomType.Parameter("field") String field,
        @CustomType.Parameter("metric") String metric) {
        this.customFields = customFields;
        this.field = field;
        this.metric = metric;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public List<LogConfigCounterOptionsCustomFieldResponse> getCustomFields() {
        return this.customFields;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public String getField() {
        return this.field;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public String getMetric() {
        return this.metric;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigCounterOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<LogConfigCounterOptionsCustomFieldResponse> customFields;
        private String field;
        private String metric;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigCounterOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customFields = defaults.customFields;
    	      this.field = defaults.field;
    	      this.metric = defaults.metric;
        }

        public Builder customFields(List<LogConfigCounterOptionsCustomFieldResponse> customFields) {
            this.customFields = Objects.requireNonNull(customFields);
            return this;
        }
        public Builder customFields(LogConfigCounterOptionsCustomFieldResponse... customFields) {
            return customFields(List.of(customFields));
        }
        public Builder field(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        public Builder metric(String metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }        public LogConfigCounterOptionsResponse build() {
            return new LogConfigCounterOptionsResponse(customFields, field, metric);
        }
    }
}
