// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.outputs;

import io.pulumi.awsnative.cloudformation.enums.PublisherIdentityProvider;
import io.pulumi.awsnative.cloudformation.enums.PublisherStatus;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPublisherResult {
    /**
     * The type of account used as the identity provider when registering this publisher with CloudFormation.
     * 
     */
    private final @Nullable PublisherIdentityProvider identityProvider;
    /**
     * The publisher id assigned by CloudFormation for publishing in this region.
     * 
     */
    private final @Nullable String publisherId;
    /**
     * The URL to the publisher's profile with the identity provider.
     * 
     */
    private final @Nullable String publisherProfile;
    /**
     * Whether the publisher is verified.
     * 
     */
    private final @Nullable PublisherStatus publisherStatus;

    @OutputCustomType.Constructor({"identityProvider","publisherId","publisherProfile","publisherStatus"})
    private GetPublisherResult(
        @Nullable PublisherIdentityProvider identityProvider,
        @Nullable String publisherId,
        @Nullable String publisherProfile,
        @Nullable PublisherStatus publisherStatus) {
        this.identityProvider = identityProvider;
        this.publisherId = publisherId;
        this.publisherProfile = publisherProfile;
        this.publisherStatus = publisherStatus;
    }

    /**
     * The type of account used as the identity provider when registering this publisher with CloudFormation.
     * 
     */
    public Optional<PublisherIdentityProvider> getIdentityProvider() {
        return Optional.ofNullable(this.identityProvider);
    }
    /**
     * The publisher id assigned by CloudFormation for publishing in this region.
     * 
     */
    public Optional<String> getPublisherId() {
        return Optional.ofNullable(this.publisherId);
    }
    /**
     * The URL to the publisher's profile with the identity provider.
     * 
     */
    public Optional<String> getPublisherProfile() {
        return Optional.ofNullable(this.publisherProfile);
    }
    /**
     * Whether the publisher is verified.
     * 
     */
    public Optional<PublisherStatus> getPublisherStatus() {
        return Optional.ofNullable(this.publisherStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublisherResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PublisherIdentityProvider identityProvider;
        private @Nullable String publisherId;
        private @Nullable String publisherProfile;
        private @Nullable PublisherStatus publisherStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublisherResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityProvider = defaults.identityProvider;
    	      this.publisherId = defaults.publisherId;
    	      this.publisherProfile = defaults.publisherProfile;
    	      this.publisherStatus = defaults.publisherStatus;
        }

        public Builder setIdentityProvider(@Nullable PublisherIdentityProvider identityProvider) {
            this.identityProvider = identityProvider;
            return this;
        }

        public Builder setPublisherId(@Nullable String publisherId) {
            this.publisherId = publisherId;
            return this;
        }

        public Builder setPublisherProfile(@Nullable String publisherProfile) {
            this.publisherProfile = publisherProfile;
            return this;
        }

        public Builder setPublisherStatus(@Nullable PublisherStatus publisherStatus) {
            this.publisherStatus = publisherStatus;
            return this;
        }

        public GetPublisherResult build() {
            return new GetPublisherResult(identityProvider, publisherId, publisherProfile, publisherStatus);
        }
    }
}
