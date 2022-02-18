// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The version of a bot used for a bot locale.
 * 
 */
public final class BotVersionLocaleDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotVersionLocaleDetailsArgs Empty = new BotVersionLocaleDetailsArgs();

    @InputImport(name="sourceBotVersion", required=true)
    private final Input<String> sourceBotVersion;

    public Input<String> getSourceBotVersion() {
        return this.sourceBotVersion;
    }

    public BotVersionLocaleDetailsArgs(Input<String> sourceBotVersion) {
        this.sourceBotVersion = Objects.requireNonNull(sourceBotVersion, "expected parameter 'sourceBotVersion' to be non-null");
    }

    private BotVersionLocaleDetailsArgs() {
        this.sourceBotVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotVersionLocaleDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> sourceBotVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(BotVersionLocaleDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceBotVersion = defaults.sourceBotVersion;
        }

        public Builder setSourceBotVersion(Input<String> sourceBotVersion) {
            this.sourceBotVersion = Objects.requireNonNull(sourceBotVersion);
            return this;
        }

        public Builder setSourceBotVersion(String sourceBotVersion) {
            this.sourceBotVersion = Input.of(Objects.requireNonNull(sourceBotVersion));
            return this;
        }

        public BotVersionLocaleDetailsArgs build() {
            return new BotVersionLocaleDetailsArgs(sourceBotVersion);
        }
    }
}
