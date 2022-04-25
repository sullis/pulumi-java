// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.outputs;

import com.pulumi.awsnative.lex.outputs.BotResponseSpecification;
import com.pulumi.awsnative.lex.outputs.BotStillWaitingResponseSpecification;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BotWaitAndContinueSpecification {
    /**
     * @return The response that Amazon Lex sends to indicate that the bot is ready to continue the conversation.
     * 
     */
    private final BotResponseSpecification continueResponse;
    /**
     * @return Specifies whether the bot will wait for a user to respond.
     * 
     */
    private final @Nullable Boolean isActive;
    /**
     * @return The response that Amazon Lex sends periodically to the user to indicate that the bot is still waiting for input from the user.
     * 
     */
    private final @Nullable BotStillWaitingResponseSpecification stillWaitingResponse;
    /**
     * @return The response that Amazon Lex sends to indicate that the bot is waiting for the conversation to continue.
     * 
     */
    private final BotResponseSpecification waitingResponse;

    @CustomType.Constructor
    private BotWaitAndContinueSpecification(
        @CustomType.Parameter("continueResponse") BotResponseSpecification continueResponse,
        @CustomType.Parameter("isActive") @Nullable Boolean isActive,
        @CustomType.Parameter("stillWaitingResponse") @Nullable BotStillWaitingResponseSpecification stillWaitingResponse,
        @CustomType.Parameter("waitingResponse") BotResponseSpecification waitingResponse) {
        this.continueResponse = continueResponse;
        this.isActive = isActive;
        this.stillWaitingResponse = stillWaitingResponse;
        this.waitingResponse = waitingResponse;
    }

    /**
     * @return The response that Amazon Lex sends to indicate that the bot is ready to continue the conversation.
     * 
     */
    public BotResponseSpecification continueResponse() {
        return this.continueResponse;
    }
    /**
     * @return Specifies whether the bot will wait for a user to respond.
     * 
     */
    public Optional<Boolean> isActive() {
        return Optional.ofNullable(this.isActive);
    }
    /**
     * @return The response that Amazon Lex sends periodically to the user to indicate that the bot is still waiting for input from the user.
     * 
     */
    public Optional<BotStillWaitingResponseSpecification> stillWaitingResponse() {
        return Optional.ofNullable(this.stillWaitingResponse);
    }
    /**
     * @return The response that Amazon Lex sends to indicate that the bot is waiting for the conversation to continue.
     * 
     */
    public BotResponseSpecification waitingResponse() {
        return this.waitingResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotWaitAndContinueSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotResponseSpecification continueResponse;
        private @Nullable Boolean isActive;
        private @Nullable BotStillWaitingResponseSpecification stillWaitingResponse;
        private BotResponseSpecification waitingResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(BotWaitAndContinueSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continueResponse = defaults.continueResponse;
    	      this.isActive = defaults.isActive;
    	      this.stillWaitingResponse = defaults.stillWaitingResponse;
    	      this.waitingResponse = defaults.waitingResponse;
        }

        public Builder continueResponse(BotResponseSpecification continueResponse) {
            this.continueResponse = Objects.requireNonNull(continueResponse);
            return this;
        }
        public Builder isActive(@Nullable Boolean isActive) {
            this.isActive = isActive;
            return this;
        }
        public Builder stillWaitingResponse(@Nullable BotStillWaitingResponseSpecification stillWaitingResponse) {
            this.stillWaitingResponse = stillWaitingResponse;
            return this;
        }
        public Builder waitingResponse(BotResponseSpecification waitingResponse) {
            this.waitingResponse = Objects.requireNonNull(waitingResponse);
            return this;
        }        public BotWaitAndContinueSpecification build() {
            return new BotWaitAndContinueSpecification(continueResponse, isActive, stillWaitingResponse, waitingResponse);
        }
    }
}
