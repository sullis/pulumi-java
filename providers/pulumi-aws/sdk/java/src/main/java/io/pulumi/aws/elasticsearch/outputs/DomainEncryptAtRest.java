// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DomainEncryptAtRest {
    /**
     * Whether to enable node-to-node encryption. If the `node_to_node_encryption` block is not provided then this defaults to `false`.
     * 
     */
    private final Boolean enabled;
    /**
     * KMS key id to encrypt the Elasticsearch domain with. If not specified then it defaults to using the `aws/es` service KMS key.
     * 
     */
    private final @Nullable String kmsKeyId;

    @OutputCustomType.Constructor({"enabled","kmsKeyId"})
    private DomainEncryptAtRest(
        Boolean enabled,
        @Nullable String kmsKeyId) {
        this.enabled = Objects.requireNonNull(enabled);
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * Whether to enable node-to-node encryption. If the `node_to_node_encryption` block is not provided then this defaults to `false`.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * KMS key id to encrypt the Elasticsearch domain with. If not specified then it defaults to using the `aws/es` service KMS key.
     * 
    */
    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainEncryptAtRest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private @Nullable String kmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainEncryptAtRest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public DomainEncryptAtRest build() {
            return new DomainEncryptAtRest(enabled, kmsKeyId);
        }
    }
}