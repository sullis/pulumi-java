// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * More info about Metric: https://docs.apigee.com/api-platform/analytics/analytics-reference#metrics
 * 
 */
public final class GoogleCloudApigeeV1QueryMetricArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1QueryMetricArgs Empty = new GoogleCloudApigeeV1QueryMetricArgs();

    /**
     * Alias for the metric. Alias will be used to replace metric name in query results.
     * 
     */
    @Import(name="alias")
      private final @Nullable Output<String> alias;

    public Output<String> getAlias() {
        return this.alias == null ? Output.empty() : this.alias;
    }

    /**
     * Aggregation function: avg, min, max, or sum.
     * 
     */
    @Import(name="function")
      private final @Nullable Output<String> function;

    public Output<String> getFunction() {
        return this.function == null ? Output.empty() : this.function;
    }

    /**
     * Metric name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * One of `+`, `-`, `/`, `%`, `*`.
     * 
     */
    @Import(name="operator")
      private final @Nullable Output<String> operator;

    public Output<String> getOperator() {
        return this.operator == null ? Output.empty() : this.operator;
    }

    /**
     * Operand value should be provided when operator is set.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Output.empty() : this.value;
    }

    public GoogleCloudApigeeV1QueryMetricArgs(
        @Nullable Output<String> alias,
        @Nullable Output<String> function,
        Output<String> name,
        @Nullable Output<String> operator,
        @Nullable Output<String> value) {
        this.alias = alias;
        this.function = function;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.operator = operator;
        this.value = value;
    }

    private GoogleCloudApigeeV1QueryMetricArgs() {
        this.alias = Output.empty();
        this.function = Output.empty();
        this.name = Output.empty();
        this.operator = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1QueryMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> alias;
        private @Nullable Output<String> function;
        private Output<String> name;
        private @Nullable Output<String> operator;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1QueryMetricArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.function = defaults.function;
    	      this.name = defaults.name;
    	      this.operator = defaults.operator;
    	      this.value = defaults.value;
        }

        public Builder alias(@Nullable Output<String> alias) {
            this.alias = alias;
            return this;
        }
        public Builder alias(@Nullable String alias) {
            this.alias = Output.ofNullable(alias);
            return this;
        }
        public Builder function(@Nullable Output<String> function) {
            this.function = function;
            return this;
        }
        public Builder function(@Nullable String function) {
            this.function = Output.ofNullable(function);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder operator(@Nullable Output<String> operator) {
            this.operator = operator;
            return this;
        }
        public Builder operator(@Nullable String operator) {
            this.operator = Output.ofNullable(operator);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Output.ofNullable(value);
            return this;
        }        public GoogleCloudApigeeV1QueryMetricArgs build() {
            return new GoogleCloudApigeeV1QueryMetricArgs(alias, function, name, operator, value);
        }
    }
}
