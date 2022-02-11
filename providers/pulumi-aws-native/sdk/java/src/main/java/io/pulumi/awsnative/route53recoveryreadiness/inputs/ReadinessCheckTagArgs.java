// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ReadinessCheckTagArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReadinessCheckTagArgs Empty = new ReadinessCheckTagArgs();

    @InputImport(name="key", required=true)
    private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    @InputImport(name="value", required=true)
    private final Input<List<String>> value;

    public Input<List<String>> getValue() {
        return this.value;
    }

    public ReadinessCheckTagArgs(
        Input<String> key,
        Input<List<String>> value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ReadinessCheckTagArgs() {
        this.key = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReadinessCheckTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;
        private Input<List<String>> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ReadinessCheckTagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder setValue(Input<List<String>> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(List<String> value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public ReadinessCheckTagArgs build() {
            return new ReadinessCheckTagArgs(key, value);
        }
    }
}
