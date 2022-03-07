// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SmsChannelPropertiesResponse {
    /**
     * The Sms account SID. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    private final String accountSID;
    /**
     * The Sms auth token. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    private final @Nullable String authToken;
    /**
     * Whether this channel is enabled for the bot
     * 
     */
    private final Boolean isEnabled;
    /**
     * Whether this channel is validated for the bot
     * 
     */
    private final @Nullable Boolean isValidated;
    /**
     * The Sms phone
     * 
     */
    private final String phone;

    @OutputCustomType.Constructor({"accountSID","authToken","isEnabled","isValidated","phone"})
    private SmsChannelPropertiesResponse(
        String accountSID,
        @Nullable String authToken,
        Boolean isEnabled,
        @Nullable Boolean isValidated,
        String phone) {
        this.accountSID = Objects.requireNonNull(accountSID);
        this.authToken = authToken;
        this.isEnabled = Objects.requireNonNull(isEnabled);
        this.isValidated = isValidated;
        this.phone = Objects.requireNonNull(phone);
    }

    /**
     * The Sms account SID. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
    */
    public String getAccountSID() {
        return this.accountSID;
    }
    /**
     * The Sms auth token. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
    */
    public Optional<String> getAuthToken() {
        return Optional.ofNullable(this.authToken);
    }
    /**
     * Whether this channel is enabled for the bot
     * 
    */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Whether this channel is validated for the bot
     * 
    */
    public Optional<Boolean> getIsValidated() {
        return Optional.ofNullable(this.isValidated);
    }
    /**
     * The Sms phone
     * 
    */
    public String getPhone() {
        return this.phone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmsChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountSID;
        private @Nullable String authToken;
        private Boolean isEnabled;
        private @Nullable Boolean isValidated;
        private String phone;

        public Builder() {
    	      // Empty
        }

        public Builder(SmsChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountSID = defaults.accountSID;
    	      this.authToken = defaults.authToken;
    	      this.isEnabled = defaults.isEnabled;
    	      this.isValidated = defaults.isValidated;
    	      this.phone = defaults.phone;
        }

        public Builder setAccountSID(String accountSID) {
            this.accountSID = Objects.requireNonNull(accountSID);
            return this;
        }

        public Builder setAuthToken(@Nullable String authToken) {
            this.authToken = authToken;
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setIsValidated(@Nullable Boolean isValidated) {
            this.isValidated = isValidated;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = Objects.requireNonNull(phone);
            return this;
        }
        public SmsChannelPropertiesResponse build() {
            return new SmsChannelPropertiesResponse(accountSID, authToken, isEnabled, isValidated, phone);
        }
    }
}