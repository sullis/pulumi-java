// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.outputs;

import io.pulumi.azurenative.portal.outputs.MarkdownPartMetadataResponseContent;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MarkdownPartMetadataResponseSettings {
    /**
     * The content of markdown part.
     * 
     */
    private final @Nullable MarkdownPartMetadataResponseContent content;

    @OutputCustomType.Constructor({"content"})
    private MarkdownPartMetadataResponseSettings(@Nullable MarkdownPartMetadataResponseContent content) {
        this.content = content;
    }

    /**
     * The content of markdown part.
     * 
     */
    public Optional<MarkdownPartMetadataResponseContent> getContent() {
        return Optional.ofNullable(this.content);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MarkdownPartMetadataResponseSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MarkdownPartMetadataResponseContent content;

        public Builder() {
    	      // Empty
        }

        public Builder(MarkdownPartMetadataResponseSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
        }

        public Builder setContent(@Nullable MarkdownPartMetadataResponseContent content) {
            this.content = content;
            return this;
        }

        public MarkdownPartMetadataResponseSettings build() {
            return new MarkdownPartMetadataResponseSettings(content);
        }
    }
}
