// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.outputs;

import io.pulumi.awsnative.nimblestudio.outputs.StreamingImageEncryptionConfiguration;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetStreamingImageResult {
    /**
     * <p>A human-readable description of the streaming image.</p>
     * 
     */
    private final @Nullable String description;
    private final @Nullable StreamingImageEncryptionConfiguration encryptionConfiguration;
    /**
     * <p>The list of EULAs that must be accepted before a Streaming Session can be started using this streaming image.</p>
     * 
     */
    private final @Nullable List<String> eulaIds;
    /**
     * <p>A friendly name for a streaming image resource.</p>
     * 
     */
    private final @Nullable String name;
    /**
     * <p>The owner of the streaming image, either the studioId that contains the streaming image, or 'amazon' for images that are provided by Amazon Nimble Studio.</p>
     * 
     */
    private final @Nullable String owner;
    /**
     * <p>The platform of the streaming image, either WINDOWS or LINUX.</p>
     * 
     */
    private final @Nullable String platform;
    private final @Nullable String streamingImageId;

    @CustomType.Constructor
    private GetStreamingImageResult(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("encryptionConfiguration") @Nullable StreamingImageEncryptionConfiguration encryptionConfiguration,
        @CustomType.Parameter("eulaIds") @Nullable List<String> eulaIds,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("owner") @Nullable String owner,
        @CustomType.Parameter("platform") @Nullable String platform,
        @CustomType.Parameter("streamingImageId") @Nullable String streamingImageId) {
        this.description = description;
        this.encryptionConfiguration = encryptionConfiguration;
        this.eulaIds = eulaIds;
        this.name = name;
        this.owner = owner;
        this.platform = platform;
        this.streamingImageId = streamingImageId;
    }

    /**
     * <p>A human-readable description of the streaming image.</p>
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<StreamingImageEncryptionConfiguration> encryptionConfiguration() {
        return Optional.ofNullable(this.encryptionConfiguration);
    }
    /**
     * <p>The list of EULAs that must be accepted before a Streaming Session can be started using this streaming image.</p>
     * 
    */
    public List<String> eulaIds() {
        return this.eulaIds == null ? List.of() : this.eulaIds;
    }
    /**
     * <p>A friendly name for a streaming image resource.</p>
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * <p>The owner of the streaming image, either the studioId that contains the streaming image, or 'amazon' for images that are provided by Amazon Nimble Studio.</p>
     * 
    */
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }
    /**
     * <p>The platform of the streaming image, either WINDOWS or LINUX.</p>
     * 
    */
    public Optional<String> platform() {
        return Optional.ofNullable(this.platform);
    }
    public Optional<String> streamingImageId() {
        return Optional.ofNullable(this.streamingImageId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamingImageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable StreamingImageEncryptionConfiguration encryptionConfiguration;
        private @Nullable List<String> eulaIds;
        private @Nullable String name;
        private @Nullable String owner;
        private @Nullable String platform;
        private @Nullable String streamingImageId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStreamingImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.eulaIds = defaults.eulaIds;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.platform = defaults.platform;
    	      this.streamingImageId = defaults.streamingImageId;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder encryptionConfiguration(@Nullable StreamingImageEncryptionConfiguration encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }
        public Builder eulaIds(@Nullable List<String> eulaIds) {
            this.eulaIds = eulaIds;
            return this;
        }
        public Builder eulaIds(String... eulaIds) {
            return eulaIds(List.of(eulaIds));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder owner(@Nullable String owner) {
            this.owner = owner;
            return this;
        }
        public Builder platform(@Nullable String platform) {
            this.platform = platform;
            return this;
        }
        public Builder streamingImageId(@Nullable String streamingImageId) {
            this.streamingImageId = streamingImageId;
            return this;
        }        public GetStreamingImageResult build() {
            return new GetStreamingImageResult(description, encryptionConfiguration, eulaIds, name, owner, platform, streamingImageId);
        }
    }
}
