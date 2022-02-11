// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.glue.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SchemaVersion extends io.pulumi.resources.InvokeArgs {

    public static final SchemaVersion Empty = new SchemaVersion();

    @InputImport(name="isLatest")
    private final @Nullable Boolean isLatest;

    public Optional<Boolean> getIsLatest() {
        return this.isLatest == null ? Optional.empty() : Optional.ofNullable(this.isLatest);
    }

    @InputImport(name="versionNumber")
    private final @Nullable Integer versionNumber;

    public Optional<Integer> getVersionNumber() {
        return this.versionNumber == null ? Optional.empty() : Optional.ofNullable(this.versionNumber);
    }

    public SchemaVersion(
        @Nullable Boolean isLatest,
        @Nullable Integer versionNumber) {
        this.isLatest = isLatest;
        this.versionNumber = versionNumber;
    }

    private SchemaVersion() {
        this.isLatest = null;
        this.versionNumber = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaVersion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isLatest;
        private @Nullable Integer versionNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isLatest = defaults.isLatest;
    	      this.versionNumber = defaults.versionNumber;
        }

        public Builder setIsLatest(@Nullable Boolean isLatest) {
            this.isLatest = isLatest;
            return this;
        }

        public Builder setVersionNumber(@Nullable Integer versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }

        public SchemaVersion build() {
            return new SchemaVersion(isLatest, versionNumber);
        }
    }
}
