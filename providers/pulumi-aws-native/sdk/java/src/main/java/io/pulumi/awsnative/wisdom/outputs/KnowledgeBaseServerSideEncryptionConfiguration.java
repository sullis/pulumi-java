// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wisdom.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KnowledgeBaseServerSideEncryptionConfiguration {
    private final @Nullable String kmsKeyId;

    @OutputCustomType.Constructor({"kmsKeyId"})
    private KnowledgeBaseServerSideEncryptionConfiguration(@Nullable String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KnowledgeBaseServerSideEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(KnowledgeBaseServerSideEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public KnowledgeBaseServerSideEncryptionConfiguration build() {
            return new KnowledgeBaseServerSideEncryptionConfiguration(kmsKeyId);
        }
    }
}
