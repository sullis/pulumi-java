// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LanguageExtensionResponse {
    /**
     * The language extension name.
     * 
     */
    private final @Nullable String languageExtensionName;

    @CustomType.Constructor
    private LanguageExtensionResponse(@CustomType.Parameter("languageExtensionName") @Nullable String languageExtensionName) {
        this.languageExtensionName = languageExtensionName;
    }

    /**
     * The language extension name.
     * 
    */
    public Optional<String> getLanguageExtensionName() {
        return Optional.ofNullable(this.languageExtensionName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LanguageExtensionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String languageExtensionName;

        public Builder() {
    	      // Empty
        }

        public Builder(LanguageExtensionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.languageExtensionName = defaults.languageExtensionName;
        }

        public Builder languageExtensionName(@Nullable String languageExtensionName) {
            this.languageExtensionName = languageExtensionName;
            return this;
        }        public LanguageExtensionResponse build() {
            return new LanguageExtensionResponse(languageExtensionName);
        }
    }
}
