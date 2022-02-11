// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMultiRegionAccessPointResult {
    private final @Nullable String alias;
    private final @Nullable String createdAt;

    @OutputCustomType.Constructor({"alias","createdAt"})
    private GetMultiRegionAccessPointResult(
        @Nullable String alias,
        @Nullable String createdAt) {
        this.alias = alias;
        this.createdAt = createdAt;
    }

    public Optional<String> getAlias() {
        return Optional.ofNullable(this.alias);
    }
    public Optional<String> getCreatedAt() {
        return Optional.ofNullable(this.createdAt);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMultiRegionAccessPointResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alias;
        private @Nullable String createdAt;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMultiRegionAccessPointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.createdAt = defaults.createdAt;
        }

        public Builder setAlias(@Nullable String alias) {
            this.alias = alias;
            return this;
        }

        public Builder setCreatedAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public GetMultiRegionAccessPointResult build() {
            return new GetMultiRegionAccessPointResult(alias, createdAt);
        }
    }
}
