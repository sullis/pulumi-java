// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.glue.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SchemaVersion {
    /**
     * Indicates if the latest version needs to be updated.
     * 
     */
    private final @Nullable Boolean isLatest;
    /**
     * Indicates the version number in the schema to update.
     * 
     */
    private final @Nullable Integer versionNumber;

    @CustomType.Constructor
    private SchemaVersion(
        @CustomType.Parameter("isLatest") @Nullable Boolean isLatest,
        @CustomType.Parameter("versionNumber") @Nullable Integer versionNumber) {
        this.isLatest = isLatest;
        this.versionNumber = versionNumber;
    }

    /**
     * Indicates if the latest version needs to be updated.
     * 
    */
    public Optional<Boolean> isLatest() {
        return Optional.ofNullable(this.isLatest);
    }
    /**
     * Indicates the version number in the schema to update.
     * 
    */
    public Optional<Integer> versionNumber() {
        return Optional.ofNullable(this.versionNumber);
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

        public Builder isLatest(@Nullable Boolean isLatest) {
            this.isLatest = isLatest;
            return this;
        }
        public Builder versionNumber(@Nullable Integer versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }        public SchemaVersion build() {
            return new SchemaVersion(isLatest, versionNumber);
        }
    }
}
