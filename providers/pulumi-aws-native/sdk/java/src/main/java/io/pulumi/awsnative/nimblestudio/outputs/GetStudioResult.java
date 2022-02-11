// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.outputs;

import io.pulumi.awsnative.nimblestudio.outputs.StudioEncryptionConfiguration;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStudioResult {
    private final @Nullable String adminRoleArn;
    private final @Nullable String displayName;
    private final @Nullable String homeRegion;
    private final @Nullable String ssoClientId;
    private final @Nullable StudioEncryptionConfiguration studioEncryptionConfiguration;
    private final @Nullable String studioId;
    private final @Nullable String studioUrl;
    private final @Nullable String userRoleArn;

    @OutputCustomType.Constructor({"adminRoleArn","displayName","homeRegion","ssoClientId","studioEncryptionConfiguration","studioId","studioUrl","userRoleArn"})
    private GetStudioResult(
        @Nullable String adminRoleArn,
        @Nullable String displayName,
        @Nullable String homeRegion,
        @Nullable String ssoClientId,
        @Nullable StudioEncryptionConfiguration studioEncryptionConfiguration,
        @Nullable String studioId,
        @Nullable String studioUrl,
        @Nullable String userRoleArn) {
        this.adminRoleArn = adminRoleArn;
        this.displayName = displayName;
        this.homeRegion = homeRegion;
        this.ssoClientId = ssoClientId;
        this.studioEncryptionConfiguration = studioEncryptionConfiguration;
        this.studioId = studioId;
        this.studioUrl = studioUrl;
        this.userRoleArn = userRoleArn;
    }

    public Optional<String> getAdminRoleArn() {
        return Optional.ofNullable(this.adminRoleArn);
    }
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    public Optional<String> getHomeRegion() {
        return Optional.ofNullable(this.homeRegion);
    }
    public Optional<String> getSsoClientId() {
        return Optional.ofNullable(this.ssoClientId);
    }
    public Optional<StudioEncryptionConfiguration> getStudioEncryptionConfiguration() {
        return Optional.ofNullable(this.studioEncryptionConfiguration);
    }
    public Optional<String> getStudioId() {
        return Optional.ofNullable(this.studioId);
    }
    public Optional<String> getStudioUrl() {
        return Optional.ofNullable(this.studioUrl);
    }
    public Optional<String> getUserRoleArn() {
        return Optional.ofNullable(this.userRoleArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStudioResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String adminRoleArn;
        private @Nullable String displayName;
        private @Nullable String homeRegion;
        private @Nullable String ssoClientId;
        private @Nullable StudioEncryptionConfiguration studioEncryptionConfiguration;
        private @Nullable String studioId;
        private @Nullable String studioUrl;
        private @Nullable String userRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStudioResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminRoleArn = defaults.adminRoleArn;
    	      this.displayName = defaults.displayName;
    	      this.homeRegion = defaults.homeRegion;
    	      this.ssoClientId = defaults.ssoClientId;
    	      this.studioEncryptionConfiguration = defaults.studioEncryptionConfiguration;
    	      this.studioId = defaults.studioId;
    	      this.studioUrl = defaults.studioUrl;
    	      this.userRoleArn = defaults.userRoleArn;
        }

        public Builder setAdminRoleArn(@Nullable String adminRoleArn) {
            this.adminRoleArn = adminRoleArn;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setHomeRegion(@Nullable String homeRegion) {
            this.homeRegion = homeRegion;
            return this;
        }

        public Builder setSsoClientId(@Nullable String ssoClientId) {
            this.ssoClientId = ssoClientId;
            return this;
        }

        public Builder setStudioEncryptionConfiguration(@Nullable StudioEncryptionConfiguration studioEncryptionConfiguration) {
            this.studioEncryptionConfiguration = studioEncryptionConfiguration;
            return this;
        }

        public Builder setStudioId(@Nullable String studioId) {
            this.studioId = studioId;
            return this;
        }

        public Builder setStudioUrl(@Nullable String studioUrl) {
            this.studioUrl = studioUrl;
            return this;
        }

        public Builder setUserRoleArn(@Nullable String userRoleArn) {
            this.userRoleArn = userRoleArn;
            return this;
        }

        public GetStudioResult build() {
            return new GetStudioResult(adminRoleArn, displayName, homeRegion, ssoClientId, studioEncryptionConfiguration, studioId, studioUrl, userRoleArn);
        }
    }
}
