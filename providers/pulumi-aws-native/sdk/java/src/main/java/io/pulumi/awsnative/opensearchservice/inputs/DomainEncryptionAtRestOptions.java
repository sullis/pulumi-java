// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainEncryptionAtRestOptions extends io.pulumi.resources.InvokeArgs {

    public static final DomainEncryptionAtRestOptions Empty = new DomainEncryptionAtRestOptions();

    @InputImport(name="enabled")
    private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    @InputImport(name="kmsKeyId")
    private final @Nullable String kmsKeyId;

    public Optional<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Optional.empty() : Optional.ofNullable(this.kmsKeyId);
    }

    public DomainEncryptionAtRestOptions(
        @Nullable Boolean enabled,
        @Nullable String kmsKeyId) {
        this.enabled = enabled;
        this.kmsKeyId = kmsKeyId;
    }

    private DomainEncryptionAtRestOptions() {
        this.enabled = null;
        this.kmsKeyId = null;
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
