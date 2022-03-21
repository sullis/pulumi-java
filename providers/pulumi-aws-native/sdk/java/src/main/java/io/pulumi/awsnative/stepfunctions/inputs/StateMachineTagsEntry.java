// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.stepfunctions.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class StateMachineTagsEntry extends io.pulumi.resources.InvokeArgs {

    public static final StateMachineTagsEntry Empty = new StateMachineTagsEntry();

    @Import(name="key", required=true)
      private final String key;

    public String getKey() {
        return this.key;
    }

    @Import(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public StateMachineTagsEntry(
        String key,
        String value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private StateMachineTagsEntry() {
        this.key = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateMachineTagsEntry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(StateMachineTagsEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public StateMachineTagsEntry build() {
            return new StateMachineTagsEntry(key, value);
        }
    }
}
