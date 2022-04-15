// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotMessageArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * One or more messages that Amazon Lex can send to the user.
 * 
 */
public final class BotMessageGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotMessageGroupArgs Empty = new BotMessageGroupArgs();

    @Import(name="message", required=true)
      private final Output<BotMessageArgs> message;

    public Output<BotMessageArgs> message() {
        return this.message;
    }

    /**
     * Message variations to send to the user.
     * 
     */
    @Import(name="variations")
      private final @Nullable Output<List<BotMessageArgs>> variations;

    public Output<List<BotMessageArgs>> variations() {
        return this.variations == null ? Codegen.empty() : this.variations;
    }

    public BotMessageGroupArgs(
        Output<BotMessageArgs> message,
        @Nullable Output<List<BotMessageArgs>> variations) {
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.variations = variations;
    }

    private BotMessageGroupArgs() {
        this.message = Codegen.empty();
        this.variations = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotMessageGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<BotMessageArgs> message;
        private @Nullable Output<List<BotMessageArgs>> variations;

        public Builder() {
    	      // Empty
        }

        public Builder(BotMessageGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.variations = defaults.variations;
        }

        public Builder message(Output<BotMessageArgs> message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder message(BotMessageArgs message) {
            this.message = Output.of(Objects.requireNonNull(message));
            return this;
        }
        public Builder variations(@Nullable Output<List<BotMessageArgs>> variations) {
            this.variations = variations;
            return this;
        }
        public Builder variations(@Nullable List<BotMessageArgs> variations) {
            this.variations = Codegen.ofNullable(variations);
            return this;
        }
        public Builder variations(BotMessageArgs... variations) {
            return variations(List.of(variations));
        }        public BotMessageGroupArgs build() {
            return new BotMessageGroupArgs(message, variations);
        }
    }
}
