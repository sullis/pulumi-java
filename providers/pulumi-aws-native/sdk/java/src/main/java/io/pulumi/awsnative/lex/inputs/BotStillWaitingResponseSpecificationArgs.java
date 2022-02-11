// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotMessageGroupArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BotStillWaitingResponseSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotStillWaitingResponseSpecificationArgs Empty = new BotStillWaitingResponseSpecificationArgs();

    @InputImport(name="allowInterrupt")
    private final @Nullable Input<Boolean> allowInterrupt;

    public Input<Boolean> getAllowInterrupt() {
        return this.allowInterrupt == null ? Input.empty() : this.allowInterrupt;
    }

    @InputImport(name="frequencyInSeconds", required=true)
    private final Input<Integer> frequencyInSeconds;

    public Input<Integer> getFrequencyInSeconds() {
        return this.frequencyInSeconds;
    }

    @InputImport(name="messageGroupsList", required=true)
    private final Input<List<BotMessageGroupArgs>> messageGroupsList;

    public Input<List<BotMessageGroupArgs>> getMessageGroupsList() {
        return this.messageGroupsList;
    }

    @InputImport(name="timeoutInSeconds", required=true)
    private final Input<Integer> timeoutInSeconds;

    public Input<Integer> getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    public BotStillWaitingResponseSpecificationArgs(
        @Nullable Input<Boolean> allowInterrupt,
        Input<Integer> frequencyInSeconds,
        Input<List<BotMessageGroupArgs>> messageGroupsList,
        Input<Integer> timeoutInSeconds) {
        this.allowInterrupt = allowInterrupt;
        this.frequencyInSeconds = Objects.requireNonNull(frequencyInSeconds, "expected parameter 'frequencyInSeconds' to be non-null");
        this.messageGroupsList = Objects.requireNonNull(messageGroupsList, "expected parameter 'messageGroupsList' to be non-null");
        this.timeoutInSeconds = Objects.requireNonNull(timeoutInSeconds, "expected parameter 'timeoutInSeconds' to be non-null");
    }

    private BotStillWaitingResponseSpecificationArgs() {
        this.allowInterrupt = Input.empty();
        this.frequencyInSeconds = Input.empty();
        this.messageGroupsList = Input.empty();
        this.timeoutInSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotStillWaitingResponseSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowInterrupt;
        private Input<Integer> frequencyInSeconds;
        private Input<List<BotMessageGroupArgs>> messageGroupsList;
        private Input<Integer> timeoutInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(BotStillWaitingResponseSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInterrupt = defaults.allowInterrupt;
    	      this.frequencyInSeconds = defaults.frequencyInSeconds;
    	      this.messageGroupsList = defaults.messageGroupsList;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
        }

        public Builder setAllowInterrupt(@Nullable Input<Boolean> allowInterrupt) {
            this.allowInterrupt = allowInterrupt;
            return this;
        }

        public Builder setAllowInterrupt(@Nullable Boolean allowInterrupt) {
            this.allowInterrupt = Input.ofNullable(allowInterrupt);
            return this;
        }

        public Builder setFrequencyInSeconds(Input<Integer> frequencyInSeconds) {
            this.frequencyInSeconds = Objects.requireNonNull(frequencyInSeconds);
            return this;
        }

        public Builder setFrequencyInSeconds(Integer frequencyInSeconds) {
            this.frequencyInSeconds = Input.of(Objects.requireNonNull(frequencyInSeconds));
            return this;
        }

        public Builder setMessageGroupsList(Input<List<BotMessageGroupArgs>> messageGroupsList) {
            this.messageGroupsList = Objects.requireNonNull(messageGroupsList);
            return this;
        }

        public Builder setMessageGroupsList(List<BotMessageGroupArgs> messageGroupsList) {
            this.messageGroupsList = Input.of(Objects.requireNonNull(messageGroupsList));
            return this;
        }

        public Builder setTimeoutInSeconds(Input<Integer> timeoutInSeconds) {
            this.timeoutInSeconds = Objects.requireNonNull(timeoutInSeconds);
            return this;
        }

        public Builder setTimeoutInSeconds(Integer timeoutInSeconds) {
            this.timeoutInSeconds = Input.of(Objects.requireNonNull(timeoutInSeconds));
            return this;
        }

        public BotStillWaitingResponseSpecificationArgs build() {
            return new BotStillWaitingResponseSpecificationArgs(allowInterrupt, frequencyInSeconds, messageGroupsList, timeoutInSeconds);
        }
    }
}
