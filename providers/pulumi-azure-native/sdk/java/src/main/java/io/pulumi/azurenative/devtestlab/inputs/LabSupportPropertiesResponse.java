// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a lab's support banner
 * 
 */
public final class LabSupportPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final LabSupportPropertiesResponse Empty = new LabSupportPropertiesResponse();

    /**
     * Is the lab support banner active/enabled at this time?
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable String enabled;

    public Optional<String> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    /**
     * The markdown text (if any) that this lab displays in the UI. If left empty/null, nothing will be shown.
     * 
     */
    @InputImport(name="markdown")
      private final @Nullable String markdown;

    public Optional<String> getMarkdown() {
        return this.markdown == null ? Optional.empty() : Optional.ofNullable(this.markdown);
    }

    public LabSupportPropertiesResponse(
        @Nullable String enabled,
        @Nullable String markdown) {
        this.enabled = enabled;
        this.markdown = markdown;
    }

    private LabSupportPropertiesResponse() {
        this.enabled = null;
        this.markdown = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabSupportPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String enabled;
        private @Nullable String markdown;

        public Builder() {
    	      // Empty
        }

        public Builder(LabSupportPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.markdown = defaults.markdown;
        }

        public Builder setEnabled(@Nullable String enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setMarkdown(@Nullable String markdown) {
            this.markdown = markdown;
            return this;
        }
        public LabSupportPropertiesResponse build() {
            return new LabSupportPropertiesResponse(enabled, markdown);
        }
    }
}