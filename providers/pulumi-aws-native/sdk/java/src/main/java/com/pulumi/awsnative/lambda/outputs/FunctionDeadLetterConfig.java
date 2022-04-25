// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lambda.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FunctionDeadLetterConfig {
    /**
     * @return The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
     * 
     */
    private final @Nullable String targetArn;

    @CustomType.Constructor
    private FunctionDeadLetterConfig(@CustomType.Parameter("targetArn") @Nullable String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * @return The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
     * 
     */
    public Optional<String> targetArn() {
        return Optional.ofNullable(this.targetArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionDeadLetterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionDeadLetterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetArn = defaults.targetArn;
        }

        public Builder targetArn(@Nullable String targetArn) {
            this.targetArn = targetArn;
            return this;
        }        public FunctionDeadLetterConfig build() {
            return new FunctionDeadLetterConfig(targetArn);
        }
    }
}
