// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * One interaction between a human and virtual agent. The human provides some input and the virtual agent provides a response.
 * 
 */
public final class GoogleCloudDialogflowCxV3ConversationTurnArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3ConversationTurnArgs Empty = new GoogleCloudDialogflowCxV3ConversationTurnArgs();

    /**
     * The user input.
     * 
     */
    @InputImport(name="userInput")
      private final @Nullable Input<GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs> userInput;

    public Input<GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs> getUserInput() {
        return this.userInput == null ? Input.empty() : this.userInput;
    }

    /**
     * The virtual agent output.
     * 
     */
    @InputImport(name="virtualAgentOutput")
      private final @Nullable Input<GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputArgs> virtualAgentOutput;

    public Input<GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputArgs> getVirtualAgentOutput() {
        return this.virtualAgentOutput == null ? Input.empty() : this.virtualAgentOutput;
    }

    public GoogleCloudDialogflowCxV3ConversationTurnArgs(
        @Nullable Input<GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs> userInput,
        @Nullable Input<GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputArgs> virtualAgentOutput) {
        this.userInput = userInput;
        this.virtualAgentOutput = virtualAgentOutput;
    }

    private GoogleCloudDialogflowCxV3ConversationTurnArgs() {
        this.userInput = Input.empty();
        this.virtualAgentOutput = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ConversationTurnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs> userInput;
        private @Nullable Input<GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputArgs> virtualAgentOutput;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ConversationTurnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userInput = defaults.userInput;
    	      this.virtualAgentOutput = defaults.virtualAgentOutput;
        }

        public Builder setUserInput(@Nullable Input<GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs> userInput) {
            this.userInput = userInput;
            return this;
        }

        public Builder setUserInput(@Nullable GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs userInput) {
            this.userInput = Input.ofNullable(userInput);
            return this;
        }

        public Builder setVirtualAgentOutput(@Nullable Input<GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputArgs> virtualAgentOutput) {
            this.virtualAgentOutput = virtualAgentOutput;
            return this;
        }

        public Builder setVirtualAgentOutput(@Nullable GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputArgs virtualAgentOutput) {
            this.virtualAgentOutput = Input.ofNullable(virtualAgentOutput);
            return this;
        }
        public GoogleCloudDialogflowCxV3ConversationTurnArgs build() {
            return new GoogleCloudDialogflowCxV3ConversationTurnArgs(userInput, virtualAgentOutput);
        }
    }
}