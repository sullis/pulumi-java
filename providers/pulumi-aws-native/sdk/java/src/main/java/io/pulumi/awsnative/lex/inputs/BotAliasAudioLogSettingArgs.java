// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotAliasAudioLogDestinationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class BotAliasAudioLogSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotAliasAudioLogSettingArgs Empty = new BotAliasAudioLogSettingArgs();

    @InputImport(name="destination", required=true)
    private final Input<BotAliasAudioLogDestinationArgs> destination;

    public Input<BotAliasAudioLogDestinationArgs> getDestination() {
        return this.destination;
    }

    @InputImport(name="enabled", required=true)
    private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    public BotAliasAudioLogSettingArgs(
        Input<BotAliasAudioLogDestinationArgs> destination,
        Input<Boolean> enabled) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private BotAliasAudioLogSettingArgs() {
        this.destination = Input.empty();
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasAudioLogSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<BotAliasAudioLogDestinationArgs> destination;
        private Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasAudioLogSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.enabled = defaults.enabled;
        }

        public Builder setDestination(Input<BotAliasAudioLogDestinationArgs> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setDestination(BotAliasAudioLogDestinationArgs destination) {
            this.destination = Input.of(Objects.requireNonNull(destination));
            return this;
        }

        public Builder setEnabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }

        public BotAliasAudioLogSettingArgs build() {
            return new BotAliasAudioLogSettingArgs(destination, enabled);
        }
    }
}
