// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.batch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SchedulingPolicyShareAttributesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchedulingPolicyShareAttributesArgs Empty = new SchedulingPolicyShareAttributesArgs();

    @Import(name="shareIdentifier")
      private final @Nullable Output<String> shareIdentifier;

    public Output<String> shareIdentifier() {
        return this.shareIdentifier == null ? Codegen.empty() : this.shareIdentifier;
    }

    @Import(name="weightFactor")
      private final @Nullable Output<Double> weightFactor;

    public Output<Double> weightFactor() {
        return this.weightFactor == null ? Codegen.empty() : this.weightFactor;
    }

    public SchedulingPolicyShareAttributesArgs(
        @Nullable Output<String> shareIdentifier,
        @Nullable Output<Double> weightFactor) {
        this.shareIdentifier = shareIdentifier;
        this.weightFactor = weightFactor;
    }

    private SchedulingPolicyShareAttributesArgs() {
        this.shareIdentifier = Codegen.empty();
        this.weightFactor = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingPolicyShareAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> shareIdentifier;
        private @Nullable Output<Double> weightFactor;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingPolicyShareAttributesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shareIdentifier = defaults.shareIdentifier;
    	      this.weightFactor = defaults.weightFactor;
        }

        public Builder shareIdentifier(@Nullable Output<String> shareIdentifier) {
            this.shareIdentifier = shareIdentifier;
            return this;
        }
        public Builder shareIdentifier(@Nullable String shareIdentifier) {
            this.shareIdentifier = Codegen.ofNullable(shareIdentifier);
            return this;
        }
        public Builder weightFactor(@Nullable Output<Double> weightFactor) {
            this.weightFactor = weightFactor;
            return this;
        }
        public Builder weightFactor(@Nullable Double weightFactor) {
            this.weightFactor = Codegen.ofNullable(weightFactor);
            return this;
        }        public SchedulingPolicyShareAttributesArgs build() {
            return new SchedulingPolicyShareAttributesArgs(shareIdentifier, weightFactor);
        }
    }
}
