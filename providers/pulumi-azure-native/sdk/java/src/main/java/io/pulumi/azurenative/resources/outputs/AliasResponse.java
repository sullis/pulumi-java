// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.azurenative.resources.outputs.AliasPathMetadataResponse;
import io.pulumi.azurenative.resources.outputs.AliasPathResponse;
import io.pulumi.azurenative.resources.outputs.AliasPatternResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AliasResponse {
    /**
     * The default alias path metadata. Applies to the default path and to any alias path that doesn't have metadata
     * 
     */
    private final AliasPathMetadataResponse defaultMetadata;
    /**
     * The default path for an alias.
     * 
     */
    private final @Nullable String defaultPath;
    /**
     * The default pattern for an alias.
     * 
     */
    private final @Nullable AliasPatternResponse defaultPattern;
    /**
     * The alias name.
     * 
     */
    private final @Nullable String name;
    /**
     * The paths for an alias.
     * 
     */
    private final @Nullable List<AliasPathResponse> paths;
    /**
     * The type of the alias.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"defaultMetadata","defaultPath","defaultPattern","name","paths","type"})
    private AliasResponse(
        AliasPathMetadataResponse defaultMetadata,
        @Nullable String defaultPath,
        @Nullable AliasPatternResponse defaultPattern,
        @Nullable String name,
        @Nullable List<AliasPathResponse> paths,
        @Nullable String type) {
        this.defaultMetadata = Objects.requireNonNull(defaultMetadata);
        this.defaultPath = defaultPath;
        this.defaultPattern = defaultPattern;
        this.name = name;
        this.paths = paths;
        this.type = type;
    }

    /**
     * The default alias path metadata. Applies to the default path and to any alias path that doesn't have metadata
     * 
     */
    public AliasPathMetadataResponse getDefaultMetadata() {
        return this.defaultMetadata;
    }
    /**
     * The default path for an alias.
     * 
     */
    public Optional<String> getDefaultPath() {
        return Optional.ofNullable(this.defaultPath);
    }
    /**
     * The default pattern for an alias.
     * 
     */
    public Optional<AliasPatternResponse> getDefaultPattern() {
        return Optional.ofNullable(this.defaultPattern);
    }
    /**
     * The alias name.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The paths for an alias.
     * 
     */
    public List<AliasPathResponse> getPaths() {
        return this.paths == null ? List.of() : this.paths;
    }
    /**
     * The type of the alias.
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AliasPathMetadataResponse defaultMetadata;
        private @Nullable String defaultPath;
        private @Nullable AliasPatternResponse defaultPattern;
        private @Nullable String name;
        private @Nullable List<AliasPathResponse> paths;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMetadata = defaults.defaultMetadata;
    	      this.defaultPath = defaults.defaultPath;
    	      this.defaultPattern = defaults.defaultPattern;
    	      this.name = defaults.name;
    	      this.paths = defaults.paths;
    	      this.type = defaults.type;
        }

        public Builder setDefaultMetadata(AliasPathMetadataResponse defaultMetadata) {
            this.defaultMetadata = Objects.requireNonNull(defaultMetadata);
            return this;
        }

        public Builder setDefaultPath(@Nullable String defaultPath) {
            this.defaultPath = defaultPath;
            return this;
        }

        public Builder setDefaultPattern(@Nullable AliasPatternResponse defaultPattern) {
            this.defaultPattern = defaultPattern;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPaths(@Nullable List<AliasPathResponse> paths) {
            this.paths = paths;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public AliasResponse build() {
            return new AliasResponse(defaultMetadata, defaultPath, defaultPattern, name, paths, type);
        }
    }
}
