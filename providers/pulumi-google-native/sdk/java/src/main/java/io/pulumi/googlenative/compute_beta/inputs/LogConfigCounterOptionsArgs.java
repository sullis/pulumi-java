// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.LogConfigCounterOptionsCustomFieldArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class LogConfigCounterOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogConfigCounterOptionsArgs Empty = new LogConfigCounterOptionsArgs();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="customFields")
      private final @Nullable Input<List<LogConfigCounterOptionsCustomFieldArgs>> customFields;

    public Input<List<LogConfigCounterOptionsCustomFieldArgs>> getCustomFields() {
        return this.customFields == null ? Input.empty() : this.customFields;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="field")
      private final @Nullable Input<String> field;

    public Input<String> getField() {
        return this.field == null ? Input.empty() : this.field;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="metric")
      private final @Nullable Input<String> metric;

    public Input<String> getMetric() {
        return this.metric == null ? Input.empty() : this.metric;
    }

    public LogConfigCounterOptionsArgs(
        @Nullable Input<List<LogConfigCounterOptionsCustomFieldArgs>> customFields,
        @Nullable Input<String> field,
        @Nullable Input<String> metric) {
        this.customFields = customFields;
        this.field = field;
        this.metric = metric;
    }

    private LogConfigCounterOptionsArgs() {
        this.customFields = Input.empty();
        this.field = Input.empty();
        this.metric = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigCounterOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<LogConfigCounterOptionsCustomFieldArgs>> customFields;
        private @Nullable Input<String> field;
        private @Nullable Input<String> metric;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigCounterOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customFields = defaults.customFields;
    	      this.field = defaults.field;
    	      this.metric = defaults.metric;
        }

        public Builder setCustomFields(@Nullable Input<List<LogConfigCounterOptionsCustomFieldArgs>> customFields) {
            this.customFields = customFields;
            return this;
        }

        public Builder setCustomFields(@Nullable List<LogConfigCounterOptionsCustomFieldArgs> customFields) {
            this.customFields = Input.ofNullable(customFields);
            return this;
        }

        public Builder setField(@Nullable Input<String> field) {
            this.field = field;
            return this;
        }

        public Builder setField(@Nullable String field) {
            this.field = Input.ofNullable(field);
            return this;
        }

        public Builder setMetric(@Nullable Input<String> metric) {
            this.metric = metric;
            return this;
        }

        public Builder setMetric(@Nullable String metric) {
            this.metric = Input.ofNullable(metric);
            return this;
        }
        public LogConfigCounterOptionsArgs build() {
            return new LogConfigCounterOptionsArgs(customFields, field, metric);
        }
    }
}