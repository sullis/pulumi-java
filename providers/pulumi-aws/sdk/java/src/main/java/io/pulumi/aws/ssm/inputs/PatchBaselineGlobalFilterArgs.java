// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class PatchBaselineGlobalFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchBaselineGlobalFilterArgs Empty = new PatchBaselineGlobalFilterArgs();

    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    @Import(name="values", required=true)
      private final Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values;
    }

    public PatchBaselineGlobalFilterArgs(
        Output<String> key,
        Output<List<String>> values) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private PatchBaselineGlobalFilterArgs() {
        this.key = Codegen.empty();
        this.values = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchBaselineGlobalFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> key;
        private Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchBaselineGlobalFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }
        public Builder values(Output<List<String>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Output.of(Objects.requireNonNull(values));
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public PatchBaselineGlobalFilterArgs build() {
            return new PatchBaselineGlobalFilterArgs(key, values);
        }
    }
}
