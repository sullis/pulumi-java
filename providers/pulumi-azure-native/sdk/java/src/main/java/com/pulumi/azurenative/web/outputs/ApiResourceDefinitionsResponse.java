// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiResourceDefinitionsResponse {
    /**
     * @return The modified swagger URL
     * 
     */
    private final @Nullable String modifiedSwaggerUrl;
    /**
     * @return The original swagger URL
     * 
     */
    private final @Nullable String originalSwaggerUrl;

    @CustomType.Constructor
    private ApiResourceDefinitionsResponse(
        @CustomType.Parameter("modifiedSwaggerUrl") @Nullable String modifiedSwaggerUrl,
        @CustomType.Parameter("originalSwaggerUrl") @Nullable String originalSwaggerUrl) {
        this.modifiedSwaggerUrl = modifiedSwaggerUrl;
        this.originalSwaggerUrl = originalSwaggerUrl;
    }

    /**
     * @return The modified swagger URL
     * 
     */
    public Optional<String> modifiedSwaggerUrl() {
        return Optional.ofNullable(this.modifiedSwaggerUrl);
    }
    /**
     * @return The original swagger URL
     * 
     */
    public Optional<String> originalSwaggerUrl() {
        return Optional.ofNullable(this.originalSwaggerUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiResourceDefinitionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String modifiedSwaggerUrl;
        private @Nullable String originalSwaggerUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiResourceDefinitionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modifiedSwaggerUrl = defaults.modifiedSwaggerUrl;
    	      this.originalSwaggerUrl = defaults.originalSwaggerUrl;
        }

        public Builder modifiedSwaggerUrl(@Nullable String modifiedSwaggerUrl) {
            this.modifiedSwaggerUrl = modifiedSwaggerUrl;
            return this;
        }
        public Builder originalSwaggerUrl(@Nullable String originalSwaggerUrl) {
            this.originalSwaggerUrl = originalSwaggerUrl;
            return this;
        }        public ApiResourceDefinitionsResponse build() {
            return new ApiResourceDefinitionsResponse(modifiedSwaggerUrl, originalSwaggerUrl);
        }
    }
}
