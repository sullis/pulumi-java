// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the app registration for the Twitter provider.
 * 
 */
public final class TwitterRegistrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TwitterRegistrationArgs Empty = new TwitterRegistrationArgs();

    /**
     * The OAuth 1.0a consumer key of the Twitter application used for sign-in.
     * This setting is required for enabling Twitter Sign-In.
     * Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in
     * 
     */
    @InputImport(name="consumerKey")
    private final @Nullable Input<String> consumerKey;

    public Input<String> getConsumerKey() {
        return this.consumerKey == null ? Input.empty() : this.consumerKey;
    }

    /**
     * The app setting name that contains the OAuth 1.0a consumer secret of the Twitter
     * application used for sign-in.
     * 
     */
    @InputImport(name="consumerSecretSettingName")
    private final @Nullable Input<String> consumerSecretSettingName;

    public Input<String> getConsumerSecretSettingName() {
        return this.consumerSecretSettingName == null ? Input.empty() : this.consumerSecretSettingName;
    }

    public TwitterRegistrationArgs(
        @Nullable Input<String> consumerKey,
        @Nullable Input<String> consumerSecretSettingName) {
        this.consumerKey = consumerKey;
        this.consumerSecretSettingName = consumerSecretSettingName;
    }

    private TwitterRegistrationArgs() {
        this.consumerKey = Input.empty();
        this.consumerSecretSettingName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TwitterRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> consumerKey;
        private @Nullable Input<String> consumerSecretSettingName;

        public Builder() {
    	      // Empty
        }

        public Builder(TwitterRegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerKey = defaults.consumerKey;
    	      this.consumerSecretSettingName = defaults.consumerSecretSettingName;
        }

        public Builder setConsumerKey(@Nullable Input<String> consumerKey) {
            this.consumerKey = consumerKey;
            return this;
        }

        public Builder setConsumerKey(@Nullable String consumerKey) {
            this.consumerKey = Input.ofNullable(consumerKey);
            return this;
        }

        public Builder setConsumerSecretSettingName(@Nullable Input<String> consumerSecretSettingName) {
            this.consumerSecretSettingName = consumerSecretSettingName;
            return this;
        }

        public Builder setConsumerSecretSettingName(@Nullable String consumerSecretSettingName) {
            this.consumerSecretSettingName = Input.ofNullable(consumerSecretSettingName);
            return this;
        }

        public TwitterRegistrationArgs build() {
            return new TwitterRegistrationArgs(consumerKey, consumerSecretSettingName);
        }
    }
}
