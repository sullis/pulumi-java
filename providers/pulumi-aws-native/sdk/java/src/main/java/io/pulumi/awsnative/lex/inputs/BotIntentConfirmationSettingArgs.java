// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotPromptSpecificationArgs;
import io.pulumi.awsnative.lex.inputs.BotResponseSpecificationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BotIntentConfirmationSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotIntentConfirmationSettingArgs Empty = new BotIntentConfirmationSettingArgs();

    @InputImport(name="declinationResponse", required=true)
    private final Input<BotResponseSpecificationArgs> declinationResponse;

    public Input<BotResponseSpecificationArgs> getDeclinationResponse() {
        return this.declinationResponse;
    }

    @InputImport(name="isActive")
    private final @Nullable Input<Boolean> isActive;

    public Input<Boolean> getIsActive() {
        return this.isActive == null ? Input.empty() : this.isActive;
    }

    @InputImport(name="promptSpecification", required=true)
    private final Input<BotPromptSpecificationArgs> promptSpecification;

    public Input<BotPromptSpecificationArgs> getPromptSpecification() {
        return this.promptSpecification;
    }

    public BotIntentConfirmationSettingArgs(
        Input<BotResponseSpecificationArgs> declinationResponse,
        @Nullable Input<Boolean> isActive,
        Input<BotPromptSpecificationArgs> promptSpecification) {
        this.declinationResponse = Objects.requireNonNull(declinationResponse, "expected parameter 'declinationResponse' to be non-null");
        this.isActive = isActive;
        this.promptSpecification = Objects.requireNonNull(promptSpecification, "expected parameter 'promptSpecification' to be non-null");
    }

    private BotIntentConfirmationSettingArgs() {
        this.declinationResponse = Input.empty();
        this.isActive = Input.empty();
        this.promptSpecification = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotIntentConfirmationSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<BotResponseSpecificationArgs> declinationResponse;
        private @Nullable Input<Boolean> isActive;
        private Input<BotPromptSpecificationArgs> promptSpecification;

        public Builder() {
    	      // Empty
        }

        public Builder(BotIntentConfirmationSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.declinationResponse = defaults.declinationResponse;
    	      this.isActive = defaults.isActive;
    	      this.promptSpecification = defaults.promptSpecification;
        }

        public Builder setDeclinationResponse(Input<BotResponseSpecificationArgs> declinationResponse) {
            this.declinationResponse = Objects.requireNonNull(declinationResponse);
            return this;
        }

        public Builder setDeclinationResponse(BotResponseSpecificationArgs declinationResponse) {
            this.declinationResponse = Input.of(Objects.requireNonNull(declinationResponse));
            return this;
        }

        public Builder setIsActive(@Nullable Input<Boolean> isActive) {
            this.isActive = isActive;
            return this;
        }

        public Builder setIsActive(@Nullable Boolean isActive) {
            this.isActive = Input.ofNullable(isActive);
            return this;
        }

        public Builder setPromptSpecification(Input<BotPromptSpecificationArgs> promptSpecification) {
            this.promptSpecification = Objects.requireNonNull(promptSpecification);
            return this;
        }

        public Builder setPromptSpecification(BotPromptSpecificationArgs promptSpecification) {
            this.promptSpecification = Input.of(Objects.requireNonNull(promptSpecification));
            return this;
        }

        public BotIntentConfirmationSettingArgs build() {
            return new BotIntentConfirmationSettingArgs(declinationResponse, isActive, promptSpecification);
        }
    }
}
