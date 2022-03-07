// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The target of the event.
 * 
 */
public final class TargetResponse extends io.pulumi.resources.InvokeArgs {

    public static final TargetResponse Empty = new TargetResponse();

    /**
     * The digest of the content, as defined by the Registry V2 HTTP API Specification.
     * 
     */
    @InputImport(name="digest")
      private final @Nullable String digest;

    public Optional<String> getDigest() {
        return this.digest == null ? Optional.empty() : Optional.ofNullable(this.digest);
    }

    /**
     * The number of bytes of the content. Same as Size field.
     * 
     */
    @InputImport(name="length")
      private final @Nullable Double length;

    public Optional<Double> getLength() {
        return this.length == null ? Optional.empty() : Optional.ofNullable(this.length);
    }

    /**
     * The MIME type of the referenced object.
     * 
     */
    @InputImport(name="mediaType")
      private final @Nullable String mediaType;

    public Optional<String> getMediaType() {
        return this.mediaType == null ? Optional.empty() : Optional.ofNullable(this.mediaType);
    }

    /**
     * The name of the artifact.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The repository name.
     * 
     */
    @InputImport(name="repository")
      private final @Nullable String repository;

    public Optional<String> getRepository() {
        return this.repository == null ? Optional.empty() : Optional.ofNullable(this.repository);
    }

    /**
     * The number of bytes of the content. Same as Length field.
     * 
     */
    @InputImport(name="size")
      private final @Nullable Double size;

    public Optional<Double> getSize() {
        return this.size == null ? Optional.empty() : Optional.ofNullable(this.size);
    }

    /**
     * The tag name.
     * 
     */
    @InputImport(name="tag")
      private final @Nullable String tag;

    public Optional<String> getTag() {
        return this.tag == null ? Optional.empty() : Optional.ofNullable(this.tag);
    }

    /**
     * The direct URL to the content.
     * 
     */
    @InputImport(name="url")
      private final @Nullable String url;

    public Optional<String> getUrl() {
        return this.url == null ? Optional.empty() : Optional.ofNullable(this.url);
    }

    /**
     * The version of the artifact.
     * 
     */
    @InputImport(name="version")
      private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public TargetResponse(
        @Nullable String digest,
        @Nullable Double length,
        @Nullable String mediaType,
        @Nullable String name,
        @Nullable String repository,
        @Nullable Double size,
        @Nullable String tag,
        @Nullable String url,
        @Nullable String version) {
        this.digest = digest;
        this.length = length;
        this.mediaType = mediaType;
        this.name = name;
        this.repository = repository;
        this.size = size;
        this.tag = tag;
        this.url = url;
        this.version = version;
    }

    private TargetResponse() {
        this.digest = null;
        this.length = null;
        this.mediaType = null;
        this.name = null;
        this.repository = null;
        this.size = null;
        this.tag = null;
        this.url = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String digest;
        private @Nullable Double length;
        private @Nullable String mediaType;
        private @Nullable String name;
        private @Nullable String repository;
        private @Nullable Double size;
        private @Nullable String tag;
        private @Nullable String url;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digest = defaults.digest;
    	      this.length = defaults.length;
    	      this.mediaType = defaults.mediaType;
    	      this.name = defaults.name;
    	      this.repository = defaults.repository;
    	      this.size = defaults.size;
    	      this.tag = defaults.tag;
    	      this.url = defaults.url;
    	      this.version = defaults.version;
        }

        public Builder setDigest(@Nullable String digest) {
            this.digest = digest;
            return this;
        }

        public Builder setLength(@Nullable Double length) {
            this.length = length;
            return this;
        }

        public Builder setMediaType(@Nullable String mediaType) {
            this.mediaType = mediaType;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRepository(@Nullable String repository) {
            this.repository = repository;
            return this;
        }

        public Builder setSize(@Nullable Double size) {
            this.size = size;
            return this;
        }

        public Builder setTag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public TargetResponse build() {
            return new TargetResponse(digest, length, mediaType, name, repository, size, tag, url, version);
        }
    }
}