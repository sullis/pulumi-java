// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsApplicationInputsParallelismGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationInputsParallelismGetArgs Empty = new AnalyticsApplicationInputsParallelismGetArgs();

    /**
     * The Count of streams.
     * 
     */
    @Import(name="count")
      private final @Nullable Output<Integer> count;

    public Output<Integer> count() {
        return this.count == null ? Codegen.empty() : this.count;
    }

    public AnalyticsApplicationInputsParallelismGetArgs(@Nullable Output<Integer> count) {
        this.count = count;
    }

    private AnalyticsApplicationInputsParallelismGetArgs() {
        this.count = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationInputsParallelismGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> count;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationInputsParallelismGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
        }

        public Builder count(@Nullable Output<Integer> count) {
            this.count = count;
            return this;
        }
        public Builder count(@Nullable Integer count) {
            this.count = Codegen.ofNullable(count);
            return this;
        }        public AnalyticsApplicationInputsParallelismGetArgs build() {
            return new AnalyticsApplicationInputsParallelismGetArgs(count);
        }
    }
}
