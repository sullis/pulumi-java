// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DiskEncryptionConfigurationResponse {
    /**
     * This is always `sql#diskEncryptionConfiguration`.
     * 
     */
    private final String kind;
    /**
     * Resource name of KMS key for disk encryption
     * 
     */
    private final String kmsKeyName;

    @OutputCustomType.Constructor({"kind","kmsKeyName"})
    private DiskEncryptionConfigurationResponse(
        String kind,
        String kmsKeyName) {
        this.kind = Objects.requireNonNull(kind);
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
    }

    /**
     * This is always `sql#diskEncryptionConfiguration`.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Resource name of KMS key for disk encryption
     * 
    */
    public String getKmsKeyName() {
        return this.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskEncryptionConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskEncryptionConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        public DiskEncryptionConfigurationResponse build() {
            return new DiskEncryptionConfigurationResponse(kind, kmsKeyName);
        }
    }
}