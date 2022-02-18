// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.azurenative.automation.inputs.ContentHashResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of the content link.
 * 
 */
public final class ContentLinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContentLinkResponse Empty = new ContentLinkResponse();

    /**
     * Gets or sets the hash.
     * 
     */
    @InputImport(name="contentHash")
    private final @Nullable ContentHashResponse contentHash;

    public Optional<ContentHashResponse> getContentHash() {
        return this.contentHash == null ? Optional.empty() : Optional.ofNullable(this.contentHash);
    }

    /**
     * Gets or sets the uri of the runbook content.
     * 
     */
    @InputImport(name="uri")
    private final @Nullable String uri;

    public Optional<String> getUri() {
        return this.uri == null ? Optional.empty() : Optional.ofNullable(this.uri);
    }

    /**
     * Gets or sets the version of the content.
     * 
     */
    @InputImport(name="version")
    private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public ContentLinkResponse(
        @Nullable ContentHashResponse contentHash,
        @Nullable String uri,
        @Nullable String version) {
        this.contentHash = contentHash;
        this.uri = uri;
        this.version = version;
    }

    private ContentLinkResponse() {
        this.contentHash = null;
        this.uri = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ContentHashResponse contentHash;
        private @Nullable String uri;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentHash = defaults.contentHash;
    	      this.uri = defaults.uri;
    	      this.version = defaults.version;
        }

        public Builder setContentHash(@Nullable ContentHashResponse contentHash) {
            this.contentHash = contentHash;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public ContentLinkResponse build() {
            return new ContentLinkResponse(contentHash, uri, version);
        }
    }
}
