// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.outputs;

import io.pulumi.azurenative.portal.outputs.MarkdownPartMetadataResponseSettings;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MarkdownPartMetadataResponse {
    /**
     * Input to dashboard part.
     * 
     */
    private final @Nullable List<Object> inputs;
    /**
     * Markdown part settings.
     * 
     */
    private final @Nullable MarkdownPartMetadataResponseSettings settings;
    /**
     * The type of dashboard part.
     * Expected value is 'Extension/HubsExtension/PartType/MarkdownPart'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"inputs","settings","type"})
    private MarkdownPartMetadataResponse(
        @Nullable List<Object> inputs,
        @Nullable MarkdownPartMetadataResponseSettings settings,
        String type) {
        this.inputs = inputs;
        this.settings = settings;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Input to dashboard part.
     * 
    */
    public List<Object> getInputs() {
        return this.inputs == null ? List.of() : this.inputs;
    }
    /**
     * Markdown part settings.
     * 
    */
    public Optional<MarkdownPartMetadataResponseSettings> getSettings() {
        return Optional.ofNullable(this.settings);
    }
    /**
     * The type of dashboard part.
     * Expected value is 'Extension/HubsExtension/PartType/MarkdownPart'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MarkdownPartMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> inputs;
        private @Nullable MarkdownPartMetadataResponseSettings settings;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(MarkdownPartMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputs = defaults.inputs;
    	      this.settings = defaults.settings;
    	      this.type = defaults.type;
        }

        public Builder setInputs(@Nullable List<Object> inputs) {
            this.inputs = inputs;
            return this;
        }

        public Builder setSettings(@Nullable MarkdownPartMetadataResponseSettings settings) {
            this.settings = settings;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public MarkdownPartMetadataResponse build() {
            return new MarkdownPartMetadataResponse(inputs, settings, type);
        }
    }
}