// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotAliasCloudWatchLogGroupLogDestinationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BotAliasTextLogDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotAliasTextLogDestinationArgs Empty = new BotAliasTextLogDestinationArgs();

    @InputImport(name="cloudWatch")
    private final @Nullable Input<BotAliasCloudWatchLogGroupLogDestinationArgs> cloudWatch;

    public Input<BotAliasCloudWatchLogGroupLogDestinationArgs> getCloudWatch() {
        return this.cloudWatch == null ? Input.empty() : this.cloudWatch;
    }

    public BotAliasTextLogDestinationArgs(@Nullable Input<BotAliasCloudWatchLogGroupLogDestinationArgs> cloudWatch) {
        this.cloudWatch = cloudWatch;
    }

    private BotAliasTextLogDestinationArgs() {
        this.cloudWatch = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasTextLogDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BotAliasCloudWatchLogGroupLogDestinationArgs> cloudWatch;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasTextLogDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatch = defaults.cloudWatch;
        }

        public Builder setCloudWatch(@Nullable Input<BotAliasCloudWatchLogGroupLogDestinationArgs> cloudWatch) {
            this.cloudWatch = cloudWatch;
            return this;
        }

        public Builder setCloudWatch(@Nullable BotAliasCloudWatchLogGroupLogDestinationArgs cloudWatch) {
            this.cloudWatch = Input.ofNullable(cloudWatch);
            return this;
        }

        public BotAliasTextLogDestinationArgs build() {
            return new BotAliasTextLogDestinationArgs(cloudWatch);
        }
    }
}
