// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class TopicRuleTimestreamTimestampArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleTimestreamTimestampArgs Empty = new TopicRuleTimestreamTimestampArgs();

    @Import(name="unit", required=true)
      private final Output<String> unit;

    public Output<String> unit() {
        return this.unit;
    }

    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    public TopicRuleTimestreamTimestampArgs(
        Output<String> unit,
        Output<String> value) {
        this.unit = Objects.requireNonNull(unit, "expected parameter 'unit' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private TopicRuleTimestreamTimestampArgs() {
        this.unit = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleTimestreamTimestampArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> unit;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleTimestreamTimestampArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder unit(Output<String> unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }
        public Builder unit(String unit) {
            this.unit = Output.of(Objects.requireNonNull(unit));
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public TopicRuleTimestreamTimestampArgs build() {
            return new TopicRuleTimestreamTimestampArgs(unit, value);
        }
    }
}
