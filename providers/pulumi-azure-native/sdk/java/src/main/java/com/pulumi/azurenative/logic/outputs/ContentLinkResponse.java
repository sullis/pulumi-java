// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.azurenative.logic.outputs.ContentHashResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContentLinkResponse {
    /**
     * @return The content hash.
     * 
     */
    private final ContentHashResponse contentHash;
    /**
     * @return The content size.
     * 
     */
    private final Double contentSize;
    /**
     * @return The content version.
     * 
     */
    private final String contentVersion;
    /**
     * @return The metadata.
     * 
     */
    private final Object metadata;
    /**
     * @return The content link URI.
     * 
     */
    private final @Nullable String uri;

    @CustomType.Constructor
    private ContentLinkResponse(
        @CustomType.Parameter("contentHash") ContentHashResponse contentHash,
        @CustomType.Parameter("contentSize") Double contentSize,
        @CustomType.Parameter("contentVersion") String contentVersion,
        @CustomType.Parameter("metadata") Object metadata,
        @CustomType.Parameter("uri") @Nullable String uri) {
        this.contentHash = contentHash;
        this.contentSize = contentSize;
        this.contentVersion = contentVersion;
        this.metadata = metadata;
        this.uri = uri;
    }

    /**
     * @return The content hash.
     * 
     */
    public ContentHashResponse contentHash() {
        return this.contentHash;
    }
    /**
     * @return The content size.
     * 
     */
    public Double contentSize() {
        return this.contentSize;
    }
    /**
     * @return The content version.
     * 
     */
    public String contentVersion() {
        return this.contentVersion;
    }
    /**
     * @return The metadata.
     * 
     */
    public Object metadata() {
        return this.metadata;
    }
    /**
     * @return The content link URI.
     * 
     */
    public Optional<String> uri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContentHashResponse contentHash;
        private Double contentSize;
        private String contentVersion;
        private Object metadata;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentHash = defaults.contentHash;
    	      this.contentSize = defaults.contentSize;
    	      this.contentVersion = defaults.contentVersion;
    	      this.metadata = defaults.metadata;
    	      this.uri = defaults.uri;
        }

        public Builder contentHash(ContentHashResponse contentHash) {
            this.contentHash = Objects.requireNonNull(contentHash);
            return this;
        }
        public Builder contentSize(Double contentSize) {
            this.contentSize = Objects.requireNonNull(contentSize);
            return this;
        }
        public Builder contentVersion(String contentVersion) {
            this.contentVersion = Objects.requireNonNull(contentVersion);
            return this;
        }
        public Builder metadata(Object metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder uri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }        public ContentLinkResponse build() {
            return new ContentLinkResponse(contentHash, contentSize, contentVersion, metadata, uri);
        }
    }
}
