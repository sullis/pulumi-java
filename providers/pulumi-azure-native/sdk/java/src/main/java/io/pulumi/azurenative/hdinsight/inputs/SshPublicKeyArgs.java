// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The SSH public key for the cluster nodes.
 * 
 */
public final class SshPublicKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SshPublicKeyArgs Empty = new SshPublicKeyArgs();

    /**
     * The certificate for SSH.
     * 
     */
    @InputImport(name="certificateData")
    private final @Nullable Input<String> certificateData;

    public Input<String> getCertificateData() {
        return this.certificateData == null ? Input.empty() : this.certificateData;
    }

    public SshPublicKeyArgs(@Nullable Input<String> certificateData) {
        this.certificateData = certificateData;
    }

    private SshPublicKeyArgs() {
        this.certificateData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificateData;

        public Builder() {
    	      // Empty
        }

        public Builder(SshPublicKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateData = defaults.certificateData;
        }

        public Builder setCertificateData(@Nullable Input<String> certificateData) {
            this.certificateData = certificateData;
            return this;
        }

        public Builder setCertificateData(@Nullable String certificateData) {
            this.certificateData = Input.ofNullable(certificateData);
            return this;
        }

        public SshPublicKeyArgs build() {
            return new SshPublicKeyArgs(certificateData);
        }
    }
}
