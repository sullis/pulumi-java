// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.outputs;

import com.pulumi.azurenative.resources.outputs.AliasPathMetadataResponse;
import com.pulumi.azurenative.resources.outputs.AliasPatternResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AliasPathResponse {
    /**
     * @return The API versions.
     * 
     */
    private final @Nullable List<String> apiVersions;
    /**
     * @return The metadata of the alias path. If missing, fall back to the default metadata of the alias.
     * 
     */
    private final AliasPathMetadataResponse metadata;
    /**
     * @return The path of an alias.
     * 
     */
    private final @Nullable String path;
    /**
     * @return The pattern for an alias path.
     * 
     */
    private final @Nullable AliasPatternResponse pattern;

    @CustomType.Constructor
    private AliasPathResponse(
        @CustomType.Parameter("apiVersions") @Nullable List<String> apiVersions,
        @CustomType.Parameter("metadata") AliasPathMetadataResponse metadata,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("pattern") @Nullable AliasPatternResponse pattern) {
        this.apiVersions = apiVersions;
        this.metadata = metadata;
        this.path = path;
        this.pattern = pattern;
    }

    /**
     * @return The API versions.
     * 
     */
    public List<String> apiVersions() {
        return this.apiVersions == null ? List.of() : this.apiVersions;
    }
    /**
     * @return The metadata of the alias path. If missing, fall back to the default metadata of the alias.
     * 
     */
    public AliasPathMetadataResponse metadata() {
        return this.metadata;
    }
    /**
     * @return The path of an alias.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return The pattern for an alias path.
     * 
     */
    public Optional<AliasPatternResponse> pattern() {
        return Optional.ofNullable(this.pattern);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasPathResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> apiVersions;
        private AliasPathMetadataResponse metadata;
        private @Nullable String path;
        private @Nullable AliasPatternResponse pattern;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasPathResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersions = defaults.apiVersions;
    	      this.metadata = defaults.metadata;
    	      this.path = defaults.path;
    	      this.pattern = defaults.pattern;
        }

        public Builder apiVersions(@Nullable List<String> apiVersions) {
            this.apiVersions = apiVersions;
            return this;
        }
        public Builder apiVersions(String... apiVersions) {
            return apiVersions(List.of(apiVersions));
        }
        public Builder metadata(AliasPathMetadataResponse metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder pattern(@Nullable AliasPatternResponse pattern) {
            this.pattern = pattern;
            return this;
        }        public AliasPathResponse build() {
            return new AliasPathResponse(apiVersions, metadata, path, pattern);
        }
    }
}
