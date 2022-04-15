// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotResponseSpecificationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Provides information for updating the user on the progress of fulfilling an intent.
 * 
 */
public final class BotPostFulfillmentStatusSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotPostFulfillmentStatusSpecificationArgs Empty = new BotPostFulfillmentStatusSpecificationArgs();

    @Import(name="failureResponse")
      private final @Nullable Output<BotResponseSpecificationArgs> failureResponse;

    public Output<BotResponseSpecificationArgs> failureResponse() {
        return this.failureResponse == null ? Codegen.empty() : this.failureResponse;
    }

    @Import(name="successResponse")
      private final @Nullable Output<BotResponseSpecificationArgs> successResponse;

    public Output<BotResponseSpecificationArgs> successResponse() {
        return this.successResponse == null ? Codegen.empty() : this.successResponse;
    }

    @Import(name="timeoutResponse")
      private final @Nullable Output<BotResponseSpecificationArgs> timeoutResponse;

    public Output<BotResponseSpecificationArgs> timeoutResponse() {
        return this.timeoutResponse == null ? Codegen.empty() : this.timeoutResponse;
    }

    public BotPostFulfillmentStatusSpecificationArgs(
        @Nullable Output<BotResponseSpecificationArgs> failureResponse,
        @Nullable Output<BotResponseSpecificationArgs> successResponse,
        @Nullable Output<BotResponseSpecificationArgs> timeoutResponse) {
        this.failureResponse = failureResponse;
        this.successResponse = successResponse;
        this.timeoutResponse = timeoutResponse;
    }

    private BotPostFulfillmentStatusSpecificationArgs() {
        this.failureResponse = Codegen.empty();
        this.successResponse = Codegen.empty();
        this.timeoutResponse = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotPostFulfillmentStatusSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BotResponseSpecificationArgs> failureResponse;
        private @Nullable Output<BotResponseSpecificationArgs> successResponse;
        private @Nullable Output<BotResponseSpecificationArgs> timeoutResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(BotPostFulfillmentStatusSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureResponse = defaults.failureResponse;
    	      this.successResponse = defaults.successResponse;
    	      this.timeoutResponse = defaults.timeoutResponse;
        }

        public Builder failureResponse(@Nullable Output<BotResponseSpecificationArgs> failureResponse) {
            this.failureResponse = failureResponse;
            return this;
        }
        public Builder failureResponse(@Nullable BotResponseSpecificationArgs failureResponse) {
            this.failureResponse = Codegen.ofNullable(failureResponse);
            return this;
        }
        public Builder successResponse(@Nullable Output<BotResponseSpecificationArgs> successResponse) {
            this.successResponse = successResponse;
            return this;
        }
        public Builder successResponse(@Nullable BotResponseSpecificationArgs successResponse) {
            this.successResponse = Codegen.ofNullable(successResponse);
            return this;
        }
        public Builder timeoutResponse(@Nullable Output<BotResponseSpecificationArgs> timeoutResponse) {
            this.timeoutResponse = timeoutResponse;
            return this;
        }
        public Builder timeoutResponse(@Nullable BotResponseSpecificationArgs timeoutResponse) {
            this.timeoutResponse = Codegen.ofNullable(timeoutResponse);
            return this;
        }        public BotPostFulfillmentStatusSpecificationArgs build() {
            return new BotPostFulfillmentStatusSpecificationArgs(failureResponse, successResponse, timeoutResponse);
        }
    }
}
