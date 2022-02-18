// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.vertex.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AiMetadataStoreEncryptionSpec {
    /**
     * Required. The Cloud KMS resource identifier of the customer managed encryption key used to protect a resource.
     * Has the form: projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key. The key needs to be in the same region as where the resource is created.
     * 
     */
    private final @Nullable String kmsKeyName;

    @OutputCustomType.Constructor({"kmsKeyName"})
    private AiMetadataStoreEncryptionSpec(@Nullable String kmsKeyName) {
        this.kmsKeyName = kmsKeyName;
    }

    /**
     * Required. The Cloud KMS resource identifier of the customer managed encryption key used to protect a resource.
     * Has the form: projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key. The key needs to be in the same region as where the resource is created.
     * 
     */
    public Optional<String> getKmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AiMetadataStoreEncryptionSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(AiMetadataStoreEncryptionSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder setKmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }

        public AiMetadataStoreEncryptionSpec build() {
            return new AiMetadataStoreEncryptionSpec(kmsKeyName);
        }
    }
}
