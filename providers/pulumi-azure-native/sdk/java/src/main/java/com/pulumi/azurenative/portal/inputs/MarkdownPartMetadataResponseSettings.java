// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.inputs;

import com.pulumi.azurenative.portal.inputs.MarkdownPartMetadataResponseContent;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Markdown part settings.
 * 
 */
public final class MarkdownPartMetadataResponseSettings extends com.pulumi.resources.InvokeArgs {

    public static final MarkdownPartMetadataResponseSettings Empty = new MarkdownPartMetadataResponseSettings();

    /**
     * The content of markdown part.
     * 
     */
    @Import(name="content")
    private @Nullable MarkdownPartMetadataResponseContent content;

    /**
     * @return The content of markdown part.
     * 
     */
    public Optional<MarkdownPartMetadataResponseContent> content() {
        return Optional.ofNullable(this.content);
    }

    private MarkdownPartMetadataResponseSettings() {}

    private MarkdownPartMetadataResponseSettings(MarkdownPartMetadataResponseSettings $) {
        this.content = $.content;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MarkdownPartMetadataResponseSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MarkdownPartMetadataResponseSettings $;

        public Builder() {
            $ = new MarkdownPartMetadataResponseSettings();
        }

        public Builder(MarkdownPartMetadataResponseSettings defaults) {
            $ = new MarkdownPartMetadataResponseSettings(Objects.requireNonNull(defaults));
        }

        /**
         * @param content The content of markdown part.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable MarkdownPartMetadataResponseContent content) {
            $.content = content;
            return this;
        }

        public MarkdownPartMetadataResponseSettings build() {
            return $;
        }
    }

}
