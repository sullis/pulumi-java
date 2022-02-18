// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DomainEncryptionAtRestOptions {
    private final @Nullable Boolean enabled;
    private final @Nullable String kmsKeyId;

    @OutputCustomType.Constructor({"enabled","kmsKeyId"})
    private DomainEncryptionAtRestOptions(
        @Nullable Boolean enabled,
        @Nullable String kmsKeyId) {
        this.enabled = enabled;
        this.kmsKeyId = kmsKeyId;
    }

    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainEncryptionAtRestOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String kmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainEncryptionAtRestOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public DomainEncryptionAtRestOptions build() {
            return new DomainEncryptionAtRestOptions(enabled, kmsKeyId);
        }
    }
}
