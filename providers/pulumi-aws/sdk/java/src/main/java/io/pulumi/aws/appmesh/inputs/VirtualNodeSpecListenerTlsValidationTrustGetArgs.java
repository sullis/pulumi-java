// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationTrustFileGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationTrustSdsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerTlsValidationTrustGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTlsValidationTrustGetArgs Empty = new VirtualNodeSpecListenerTlsValidationTrustGetArgs();

    /**
     * The TLS validation context trust for a local file certificate.
     * 
     */
    @Import(name="file")
      private final @Nullable Output<VirtualNodeSpecListenerTlsValidationTrustFileGetArgs> file;

    public Output<VirtualNodeSpecListenerTlsValidationTrustFileGetArgs> file() {
        return this.file == null ? Codegen.empty() : this.file;
    }

    /**
     * The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @Import(name="sds")
      private final @Nullable Output<VirtualNodeSpecListenerTlsValidationTrustSdsGetArgs> sds;

    public Output<VirtualNodeSpecListenerTlsValidationTrustSdsGetArgs> sds() {
        return this.sds == null ? Codegen.empty() : this.sds;
    }

    public VirtualNodeSpecListenerTlsValidationTrustGetArgs(
        @Nullable Output<VirtualNodeSpecListenerTlsValidationTrustFileGetArgs> file,
        @Nullable Output<VirtualNodeSpecListenerTlsValidationTrustSdsGetArgs> sds) {
        this.file = file;
        this.sds = sds;
    }

    private VirtualNodeSpecListenerTlsValidationTrustGetArgs() {
        this.file = Codegen.empty();
        this.sds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTlsValidationTrustGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecListenerTlsValidationTrustFileGetArgs> file;
        private @Nullable Output<VirtualNodeSpecListenerTlsValidationTrustSdsGetArgs> sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTlsValidationTrustGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder file(@Nullable Output<VirtualNodeSpecListenerTlsValidationTrustFileGetArgs> file) {
            this.file = file;
            return this;
        }
        public Builder file(@Nullable VirtualNodeSpecListenerTlsValidationTrustFileGetArgs file) {
            this.file = Codegen.ofNullable(file);
            return this;
        }
        public Builder sds(@Nullable Output<VirtualNodeSpecListenerTlsValidationTrustSdsGetArgs> sds) {
            this.sds = sds;
            return this;
        }
        public Builder sds(@Nullable VirtualNodeSpecListenerTlsValidationTrustSdsGetArgs sds) {
            this.sds = Codegen.ofNullable(sds);
            return this;
        }        public VirtualNodeSpecListenerTlsValidationTrustGetArgs build() {
            return new VirtualNodeSpecListenerTlsValidationTrustGetArgs(file, sds);
        }
    }
}
