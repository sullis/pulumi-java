// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TargetResponse {
    /**
     * The digest of the content, as defined by the Registry V2 HTTP API Specification.
     * 
     */
    private final @Nullable String digest;
    /**
     * The number of bytes of the content. Same as Size field.
     * 
     */
    private final @Nullable Double length;
    /**
     * The MIME type of the referenced object.
     * 
     */
    private final @Nullable String mediaType;
    /**
     * The name of the artifact.
     * 
     */
    private final @Nullable String name;
    /**
     * The repository name.
     * 
     */
    private final @Nullable String repository;
    /**
     * The number of bytes of the content. Same as Length field.
     * 
     */
    private final @Nullable Double size;
    /**
     * The tag name.
     * 
     */
    private final @Nullable String tag;
    /**
     * The direct URL to the content.
     * 
     */
    private final @Nullable String url;
    /**
     * The version of the artifact.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"digest","length","mediaType","name","repository","size","tag","url","version"})
    private TargetResponse(
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

    /**
     * The digest of the content, as defined by the Registry V2 HTTP API Specification.
     * 
    */
    public Optional<String> getDigest() {
        return Optional.ofNullable(this.digest);
    }
    /**
     * The number of bytes of the content. Same as Size field.
     * 
    */
    public Optional<Double> getLength() {
        return Optional.ofNullable(this.length);
    }
    /**
     * The MIME type of the referenced object.
     * 
    */
    public Optional<String> getMediaType() {
        return Optional.ofNullable(this.mediaType);
    }
    /**
     * The name of the artifact.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The repository name.
     * 
    */
    public Optional<String> getRepository() {
        return Optional.ofNullable(this.repository);
    }
    /**
     * The number of bytes of the content. Same as Length field.
     * 
    */
    public Optional<Double> getSize() {
        return Optional.ofNullable(this.size);
    }
    /**
     * The tag name.
     * 
    */
    public Optional<String> getTag() {
        return Optional.ofNullable(this.tag);
    }
    /**
     * The direct URL to the content.
     * 
    */
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }
    /**
     * The version of the artifact.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
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