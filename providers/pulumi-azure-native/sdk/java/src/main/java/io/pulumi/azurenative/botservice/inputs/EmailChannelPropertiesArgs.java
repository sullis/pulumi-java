// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the Email channel.
 * 
 */
public final class EmailChannelPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EmailChannelPropertiesArgs Empty = new EmailChannelPropertiesArgs();

    /**
     * The email address
     * 
     */
    @InputImport(name="emailAddress", required=true)
    private final Input<String> emailAddress;

    public Input<String> getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * Whether this channel is enabled for the bot
     * 
     */
    @InputImport(name="isEnabled", required=true)
    private final Input<Boolean> isEnabled;

    public Input<Boolean> getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * The password for the email address. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @InputImport(name="password")
    private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    public EmailChannelPropertiesArgs(
        Input<String> emailAddress,
        Input<Boolean> isEnabled,
        @Nullable Input<String> password) {
        this.emailAddress = Objects.requireNonNull(emailAddress, "expected parameter 'emailAddress' to be non-null");
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.password = password;
    }

    private EmailChannelPropertiesArgs() {
        this.emailAddress = Input.empty();
        this.isEnabled = Input.empty();
        this.password = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmailChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> emailAddress;
        private Input<Boolean> isEnabled;
        private @Nullable Input<String> password;

        public Builder() {
    	      // Empty
        }

        public Builder(EmailChannelPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.isEnabled = defaults.isEnabled;
    	      this.password = defaults.password;
        }

        public Builder setEmailAddress(Input<String> emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
            return this;
        }

        public Builder setEmailAddress(String emailAddress) {
            this.emailAddress = Input.of(Objects.requireNonNull(emailAddress));
            return this;
        }

        public Builder setIsEnabled(Input<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Input.of(Objects.requireNonNull(isEnabled));
            return this;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public EmailChannelPropertiesArgs build() {
            return new EmailChannelPropertiesArgs(emailAddress, isEnabled, password);
        }
    }
}
