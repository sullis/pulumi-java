// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datadog.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UserInfoResponse {
    /**
     * Email of the user used by Datadog for contacting them if needed
     * 
     */
    private final @Nullable String emailAddress;
    /**
     * Name of the user
     * 
     */
    private final @Nullable String name;
    /**
     * Phone number of the user used by Datadog for contacting them if needed
     * 
     */
    private final @Nullable String phoneNumber;

    @OutputCustomType.Constructor({"emailAddress","name","phoneNumber"})
    private UserInfoResponse(
        @Nullable String emailAddress,
        @Nullable String name,
        @Nullable String phoneNumber) {
        this.emailAddress = emailAddress;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Email of the user used by Datadog for contacting them if needed
     * 
    */
    public Optional<String> getEmailAddress() {
        return Optional.ofNullable(this.emailAddress);
    }
    /**
     * Name of the user
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Phone number of the user used by Datadog for contacting them if needed
     * 
    */
    public Optional<String> getPhoneNumber() {
        return Optional.ofNullable(this.phoneNumber);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String emailAddress;
        private @Nullable String name;
        private @Nullable String phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(UserInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.name = defaults.name;
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder setEmailAddress(@Nullable String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPhoneNumber(@Nullable String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public UserInfoResponse build() {
            return new UserInfoResponse(emailAddress, name, phoneNumber);
        }
    }
}