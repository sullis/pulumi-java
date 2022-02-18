// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wisdom.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AssistantServerSideEncryptionConfiguration {
    private final @Nullable String kmsKeyId;

    @OutputCustomType.Constructor({"kmsKeyId"})
    private AssistantServerSideEncryptionConfiguration(@Nullable String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssistantServerSideEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(AssistantServerSideEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public AssistantServerSideEncryptionConfiguration build() {
            return new AssistantServerSideEncryptionConfiguration(kmsKeyId);
        }
    }
}
