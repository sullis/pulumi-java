// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ReadinessCheckTag extends io.pulumi.resources.InvokeArgs {

    public static final ReadinessCheckTag Empty = new ReadinessCheckTag();

    @Import(name="key", required=true)
      private final String key;

    public String key() {
        return this.key;
    }

    @Import(name="value", required=true)
      private final List<String> value;

    public List<String> value() {
        return this.value;
    }

    public ReadinessCheckTag(
        String key,
        List<String> value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ReadinessCheckTag() {
        this.key = null;
        this.value = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReadinessCheckTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private List<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ReadinessCheckTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(List<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String... value) {
            return value(List.of(value));
        }        public ReadinessCheckTag build() {
            return new ReadinessCheckTag(key, value);
        }
    }
}
