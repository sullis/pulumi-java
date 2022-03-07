// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings for terminal appearance.
 * 
 */
public final class TerminalSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final TerminalSettingsResponse Empty = new TerminalSettingsResponse();

    /**
     * Size of terminal font.
     * 
     */
    @InputImport(name="fontSize")
      private final @Nullable String fontSize;

    public Optional<String> getFontSize() {
        return this.fontSize == null ? Optional.empty() : Optional.ofNullable(this.fontSize);
    }

    /**
     * Style of terminal font.
     * 
     */
    @InputImport(name="fontStyle")
      private final @Nullable String fontStyle;

    public Optional<String> getFontStyle() {
        return this.fontStyle == null ? Optional.empty() : Optional.ofNullable(this.fontStyle);
    }

    public TerminalSettingsResponse(
        @Nullable String fontSize,
        @Nullable String fontStyle) {
        this.fontSize = fontSize;
        this.fontStyle = fontStyle;
    }

    private TerminalSettingsResponse() {
        this.fontSize = null;
        this.fontStyle = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TerminalSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fontSize;
        private @Nullable String fontStyle;

        public Builder() {
    	      // Empty
        }

        public Builder(TerminalSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fontSize = defaults.fontSize;
    	      this.fontStyle = defaults.fontStyle;
        }

        public Builder setFontSize(@Nullable String fontSize) {
            this.fontSize = fontSize;
            return this;
        }

        public Builder setFontStyle(@Nullable String fontStyle) {
            this.fontStyle = fontStyle;
            return this;
        }
        public TerminalSettingsResponse build() {
            return new TerminalSettingsResponse(fontSize, fontStyle);
        }
    }
}