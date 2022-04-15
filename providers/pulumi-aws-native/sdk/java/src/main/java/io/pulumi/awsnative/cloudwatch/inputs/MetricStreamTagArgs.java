// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudwatch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Metadata that you can assign to a Metric Stream, consisting of a key-value pair.
 * 
 */
public final class MetricStreamTagArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricStreamTagArgs Empty = new MetricStreamTagArgs();

    /**
     * A unique identifier for the tag.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    /**
     * An optional string, which you can use to describe or define the tag.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public MetricStreamTagArgs(
        Output<String> key,
        @Nullable Output<String> value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = value;
    }

    private MetricStreamTagArgs() {
        this.key = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricStreamTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> key;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricStreamTagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public MetricStreamTagArgs build() {
            return new MetricStreamTagArgs(key, value);
        }
    }
}
