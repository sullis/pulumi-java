// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TopicRuleTimestreamTimestampArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleTimestreamTimestampArgs Empty = new TopicRuleTimestreamTimestampArgs();

    @InputImport(name="unit", required=true)
    private final Input<String> unit;

    public Input<String> getUnit() {
        return this.unit;
    }

    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public TopicRuleTimestreamTimestampArgs(
        Input<String> unit,
        Input<String> value) {
        this.unit = Objects.requireNonNull(unit, "expected parameter 'unit' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private TopicRuleTimestreamTimestampArgs() {
        this.unit = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleTimestreamTimestampArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> unit;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleTimestreamTimestampArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder setUnit(Input<String> unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }

        public Builder setUnit(String unit) {
            this.unit = Input.of(Objects.requireNonNull(unit));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public TopicRuleTimestreamTimestampArgs build() {
            return new TopicRuleTimestreamTimestampArgs(unit, value);
        }
    }
}
