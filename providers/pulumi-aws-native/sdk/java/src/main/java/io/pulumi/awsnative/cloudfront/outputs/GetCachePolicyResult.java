// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.awsnative.cloudfront.outputs.CachePolicyConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCachePolicyResult {
    private final @Nullable CachePolicyConfig cachePolicyConfig;
    private final @Nullable String id;
    private final @Nullable String lastModifiedTime;

    @OutputCustomType.Constructor
    private GetCachePolicyResult(
        @OutputCustomType.Parameter("cachePolicyConfig") @Nullable CachePolicyConfig cachePolicyConfig,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("lastModifiedTime") @Nullable String lastModifiedTime) {
        this.cachePolicyConfig = cachePolicyConfig;
        this.id = id;
        this.lastModifiedTime = lastModifiedTime;
    }

    public Optional<CachePolicyConfig> getCachePolicyConfig() {
        return Optional.ofNullable(this.cachePolicyConfig);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getLastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCachePolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CachePolicyConfig cachePolicyConfig;
        private @Nullable String id;
        private @Nullable String lastModifiedTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCachePolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cachePolicyConfig = defaults.cachePolicyConfig;
    	      this.id = defaults.id;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
        }

        public Builder setCachePolicyConfig(@Nullable CachePolicyConfig cachePolicyConfig) {
            this.cachePolicyConfig = cachePolicyConfig;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public GetCachePolicyResult build() {
            return new GetCachePolicyResult(cachePolicyConfig, id, lastModifiedTime);
        }
    }
}
