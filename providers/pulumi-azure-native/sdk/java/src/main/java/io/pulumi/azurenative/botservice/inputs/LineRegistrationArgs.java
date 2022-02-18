// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties corresponding to a line channel registration
 * 
 */
public final class LineRegistrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LineRegistrationArgs Empty = new LineRegistrationArgs();

    /**
     * Access token for the line channel registration
     * 
     */
    @InputImport(name="channelAccessToken")
    private final @Nullable Input<String> channelAccessToken;

    public Input<String> getChannelAccessToken() {
        return this.channelAccessToken == null ? Input.empty() : this.channelAccessToken;
    }

    /**
     * Secret for the line channel registration
     * 
     */
    @InputImport(name="channelSecret")
    private final @Nullable Input<String> channelSecret;

    public Input<String> getChannelSecret() {
        return this.channelSecret == null ? Input.empty() : this.channelSecret;
    }

    public LineRegistrationArgs(
        @Nullable Input<String> channelAccessToken,
        @Nullable Input<String> channelSecret) {
        this.channelAccessToken = channelAccessToken;
        this.channelSecret = channelSecret;
    }

    private LineRegistrationArgs() {
        this.channelAccessToken = Input.empty();
        this.channelSecret = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LineRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> channelAccessToken;
        private @Nullable Input<String> channelSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(LineRegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelAccessToken = defaults.channelAccessToken;
    	      this.channelSecret = defaults.channelSecret;
        }

        public Builder setChannelAccessToken(@Nullable Input<String> channelAccessToken) {
            this.channelAccessToken = channelAccessToken;
            return this;
        }

        public Builder setChannelAccessToken(@Nullable String channelAccessToken) {
            this.channelAccessToken = Input.ofNullable(channelAccessToken);
            return this;
        }

        public Builder setChannelSecret(@Nullable Input<String> channelSecret) {
            this.channelSecret = channelSecret;
            return this;
        }

        public Builder setChannelSecret(@Nullable String channelSecret) {
            this.channelSecret = Input.ofNullable(channelSecret);
            return this;
        }

        public LineRegistrationArgs build() {
            return new LineRegistrationArgs(channelAccessToken, channelSecret);
        }
    }
}
