// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect.inputs;

import io.pulumi.awsnative.connect.enums.UserPhoneType;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains information about the phone configuration settings for a user.
 * 
 */
public final class UserPhoneConfig extends io.pulumi.resources.InvokeArgs {

    public static final UserPhoneConfig Empty = new UserPhoneConfig();

    @Import(name="afterContactWorkTimeLimit")
      private final @Nullable Integer afterContactWorkTimeLimit;

    public Optional<Integer> afterContactWorkTimeLimit() {
        return this.afterContactWorkTimeLimit == null ? Optional.empty() : Optional.ofNullable(this.afterContactWorkTimeLimit);
    }

    @Import(name="autoAccept")
      private final @Nullable Boolean autoAccept;

    public Optional<Boolean> autoAccept() {
        return this.autoAccept == null ? Optional.empty() : Optional.ofNullable(this.autoAccept);
    }

    @Import(name="deskPhoneNumber")
      private final @Nullable String deskPhoneNumber;

    public Optional<String> deskPhoneNumber() {
        return this.deskPhoneNumber == null ? Optional.empty() : Optional.ofNullable(this.deskPhoneNumber);
    }

    @Import(name="phoneType", required=true)
      private final UserPhoneType phoneType;

    public UserPhoneType phoneType() {
        return this.phoneType;
    }

    public UserPhoneConfig(
        @Nullable Integer afterContactWorkTimeLimit,
        @Nullable Boolean autoAccept,
        @Nullable String deskPhoneNumber,
        UserPhoneType phoneType) {
        this.afterContactWorkTimeLimit = afterContactWorkTimeLimit;
        this.autoAccept = autoAccept;
        this.deskPhoneNumber = deskPhoneNumber;
        this.phoneType = Objects.requireNonNull(phoneType, "expected parameter 'phoneType' to be non-null");
    }

    private UserPhoneConfig() {
        this.afterContactWorkTimeLimit = null;
        this.autoAccept = null;
        this.deskPhoneNumber = null;
        this.phoneType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPhoneConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer afterContactWorkTimeLimit;
        private @Nullable Boolean autoAccept;
        private @Nullable String deskPhoneNumber;
        private UserPhoneType phoneType;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPhoneConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.afterContactWorkTimeLimit = defaults.afterContactWorkTimeLimit;
    	      this.autoAccept = defaults.autoAccept;
    	      this.deskPhoneNumber = defaults.deskPhoneNumber;
    	      this.phoneType = defaults.phoneType;
        }

        public Builder afterContactWorkTimeLimit(@Nullable Integer afterContactWorkTimeLimit) {
            this.afterContactWorkTimeLimit = afterContactWorkTimeLimit;
            return this;
        }
        public Builder autoAccept(@Nullable Boolean autoAccept) {
            this.autoAccept = autoAccept;
            return this;
        }
        public Builder deskPhoneNumber(@Nullable String deskPhoneNumber) {
            this.deskPhoneNumber = deskPhoneNumber;
            return this;
        }
        public Builder phoneType(UserPhoneType phoneType) {
            this.phoneType = Objects.requireNonNull(phoneType);
            return this;
        }        public UserPhoneConfig build() {
            return new UserPhoneConfig(afterContactWorkTimeLimit, autoAccept, deskPhoneNumber, phoneType);
        }
    }
}
