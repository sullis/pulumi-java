// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.UserProfileUserSettings;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetUserProfileResult {
    /**
     * The user profile Amazon Resource Name (ARN).
     * 
     */
    private final @Nullable String userProfileArn;
    /**
     * A collection of settings.
     * 
     */
    private final @Nullable UserProfileUserSettings userSettings;

    @CustomType.Constructor
    private GetUserProfileResult(
        @CustomType.Parameter("userProfileArn") @Nullable String userProfileArn,
        @CustomType.Parameter("userSettings") @Nullable UserProfileUserSettings userSettings) {
        this.userProfileArn = userProfileArn;
        this.userSettings = userSettings;
    }

    /**
     * The user profile Amazon Resource Name (ARN).
     * 
    */
    public Optional<String> getUserProfileArn() {
        return Optional.ofNullable(this.userProfileArn);
    }
    /**
     * A collection of settings.
     * 
    */
    public Optional<UserProfileUserSettings> getUserSettings() {
        return Optional.ofNullable(this.userSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String userProfileArn;
        private @Nullable UserProfileUserSettings userSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userProfileArn = defaults.userProfileArn;
    	      this.userSettings = defaults.userSettings;
        }

        public Builder userProfileArn(@Nullable String userProfileArn) {
            this.userProfileArn = userProfileArn;
            return this;
        }
        public Builder userSettings(@Nullable UserProfileUserSettings userSettings) {
            this.userSettings = userSettings;
            return this;
        }        public GetUserProfileResult build() {
            return new GetUserProfileResult(userProfileArn, userSettings);
        }
    }
}
