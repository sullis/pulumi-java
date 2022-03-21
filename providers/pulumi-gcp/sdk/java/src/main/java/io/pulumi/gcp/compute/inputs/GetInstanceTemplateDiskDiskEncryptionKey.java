// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceTemplateDiskDiskEncryptionKey extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceTemplateDiskDiskEncryptionKey Empty = new GetInstanceTemplateDiskDiskEncryptionKey();

    /**
     * The self link of the encryption key that is stored in Google Cloud KMS
     * 
     */
    @Import(name="kmsKeySelfLink", required=true)
      private final String kmsKeySelfLink;

    public String getKmsKeySelfLink() {
        return this.kmsKeySelfLink;
    }

    public GetInstanceTemplateDiskDiskEncryptionKey(String kmsKeySelfLink) {
        this.kmsKeySelfLink = Objects.requireNonNull(kmsKeySelfLink, "expected parameter 'kmsKeySelfLink' to be non-null");
    }

    private GetInstanceTemplateDiskDiskEncryptionKey() {
        this.kmsKeySelfLink = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTemplateDiskDiskEncryptionKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeySelfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTemplateDiskDiskEncryptionKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeySelfLink = defaults.kmsKeySelfLink;
        }

        public Builder kmsKeySelfLink(String kmsKeySelfLink) {
            this.kmsKeySelfLink = Objects.requireNonNull(kmsKeySelfLink);
            return this;
        }        public GetInstanceTemplateDiskDiskEncryptionKey build() {
            return new GetInstanceTemplateDiskDiskEncryptionKey(kmsKeySelfLink);
        }
    }
}
