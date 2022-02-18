// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the Email channel.
 * 
 */
public final class EmailChannelPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final EmailChannelPropertiesResponse Empty = new EmailChannelPropertiesResponse();

    /**
     * The email address
     * 
     */
    @InputImport(name="emailAddress", required=true)
    private final String emailAddress;

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * Whether this channel is enabled for the bot
     * 
     */
    @InputImport(name="isEnabled", required=true)
    private final Boolean isEnabled;

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * The password for the email address. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @InputImport(name="password")
    private final @Nullable String password;

    public Optional<String> getPassword() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    public EmailChannelPropertiesResponse(
        String emailAddress,
        Boolean isEnabled,
        @Nullable String password) {
        this.emailAddress = Objects.requireNonNull(emailAddress, "expected parameter 'emailAddress' to be non-null");
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.password = password;
    }

    private EmailChannelPropertiesResponse() {
        this.emailAddress = null;
        this.isEnabled = null;
        this.password = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmailChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String emailAddress;
        private Boolean isEnabled;
        private @Nullable String password;

        public Builder() {
    	      // Empty
        }

        public Builder(EmailChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.isEnabled = defaults.isEnabled;
    	      this.password = defaults.password;
        }

        public Builder setEmailAddress(String emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public EmailChannelPropertiesResponse build() {
            return new EmailChannelPropertiesResponse(emailAddress, isEnabled, password);
        }
    }
}
