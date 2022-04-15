// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena.inputs;

import io.pulumi.awsnative.athena.enums.WorkGroupEncryptionOption;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * If query results are encrypted in Amazon S3, indicates the encryption option used (for example, SSE-KMS or CSE-KMS) and key information.
 * 
 */
public final class WorkGroupEncryptionConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final WorkGroupEncryptionConfiguration Empty = new WorkGroupEncryptionConfiguration();

    @Import(name="encryptionOption", required=true)
      private final WorkGroupEncryptionOption encryptionOption;

    public WorkGroupEncryptionOption encryptionOption() {
        return this.encryptionOption;
    }

    @Import(name="kmsKey")
      private final @Nullable String kmsKey;

    public Optional<String> kmsKey() {
        return this.kmsKey == null ? Optional.empty() : Optional.ofNullable(this.kmsKey);
    }

    public WorkGroupEncryptionConfiguration(
        WorkGroupEncryptionOption encryptionOption,
        @Nullable String kmsKey) {
        this.encryptionOption = Objects.requireNonNull(encryptionOption, "expected parameter 'encryptionOption' to be non-null");
        this.kmsKey = kmsKey;
    }

    private WorkGroupEncryptionConfiguration() {
        this.encryptionOption = null;
        this.kmsKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkGroupEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkGroupEncryptionOption encryptionOption;
        private @Nullable String kmsKey;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkGroupEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionOption = defaults.encryptionOption;
    	      this.kmsKey = defaults.kmsKey;
        }

        public Builder encryptionOption(WorkGroupEncryptionOption encryptionOption) {
            this.encryptionOption = Objects.requireNonNull(encryptionOption);
            return this;
        }
        public Builder kmsKey(@Nullable String kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }        public WorkGroupEncryptionConfiguration build() {
            return new WorkGroupEncryptionConfiguration(encryptionOption, kmsKey);
        }
    }
}
