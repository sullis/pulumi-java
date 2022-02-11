// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena.outputs;

import io.pulumi.awsnative.athena.enums.WorkGroupEncryptionOption;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkGroupEncryptionConfiguration {
    private final WorkGroupEncryptionOption encryptionOption;
    private final @Nullable String kmsKey;

    @OutputCustomType.Constructor({"encryptionOption","kmsKey"})
    private WorkGroupEncryptionConfiguration(
        WorkGroupEncryptionOption encryptionOption,
        @Nullable String kmsKey) {
        this.encryptionOption = Objects.requireNonNull(encryptionOption);
        this.kmsKey = kmsKey;
    }

    public WorkGroupEncryptionOption getEncryptionOption() {
        return this.encryptionOption;
    }
    public Optional<String> getKmsKey() {
        return Optional.ofNullable(this.kmsKey);
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

        public Builder setEncryptionOption(WorkGroupEncryptionOption encryptionOption) {
            this.encryptionOption = Objects.requireNonNull(encryptionOption);
            return this;
        }

        public Builder setKmsKey(@Nullable String kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }

        public WorkGroupEncryptionConfiguration build() {
            return new WorkGroupEncryptionConfiguration(encryptionOption, kmsKey);
        }
    }
}
