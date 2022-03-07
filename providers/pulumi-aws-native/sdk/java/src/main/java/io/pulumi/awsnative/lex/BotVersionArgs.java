// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex;

import io.pulumi.awsnative.lex.inputs.BotVersionLocaleSpecificationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BotVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotVersionArgs Empty = new BotVersionArgs();

    @InputImport(name="botId", required=true)
      private final Input<String> botId;

    public Input<String> getBotId() {
        return this.botId;
    }

    @InputImport(name="botVersionLocaleSpecification", required=true)
      private final Input<List<BotVersionLocaleSpecificationArgs>> botVersionLocaleSpecification;

    public Input<List<BotVersionLocaleSpecificationArgs>> getBotVersionLocaleSpecification() {
        return this.botVersionLocaleSpecification;
    }

    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    public BotVersionArgs(
        Input<String> botId,
        Input<List<BotVersionLocaleSpecificationArgs>> botVersionLocaleSpecification,
        @Nullable Input<String> description) {
        this.botId = Objects.requireNonNull(botId, "expected parameter 'botId' to be non-null");
        this.botVersionLocaleSpecification = Objects.requireNonNull(botVersionLocaleSpecification, "expected parameter 'botVersionLocaleSpecification' to be non-null");
        this.description = description;
    }

    private BotVersionArgs() {
        this.botId = Input.empty();
        this.botVersionLocaleSpecification = Input.empty();
        this.description = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> botId;
        private Input<List<BotVersionLocaleSpecificationArgs>> botVersionLocaleSpecification;
        private @Nullable Input<String> description;

        public Builder() {
    	      // Empty
        }

        public Builder(BotVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.botId = defaults.botId;
    	      this.botVersionLocaleSpecification = defaults.botVersionLocaleSpecification;
    	      this.description = defaults.description;
        }

        public Builder setBotId(Input<String> botId) {
            this.botId = Objects.requireNonNull(botId);
            return this;
        }

        public Builder setBotId(String botId) {
            this.botId = Input.of(Objects.requireNonNull(botId));
            return this;
        }

        public Builder setBotVersionLocaleSpecification(Input<List<BotVersionLocaleSpecificationArgs>> botVersionLocaleSpecification) {
            this.botVersionLocaleSpecification = Objects.requireNonNull(botVersionLocaleSpecification);
            return this;
        }

        public Builder setBotVersionLocaleSpecification(List<BotVersionLocaleSpecificationArgs> botVersionLocaleSpecification) {
            this.botVersionLocaleSpecification = Input.of(Objects.requireNonNull(botVersionLocaleSpecification));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }
        public BotVersionArgs build() {
            return new BotVersionArgs(botId, botVersionLocaleSpecification, description);
        }
    }
}