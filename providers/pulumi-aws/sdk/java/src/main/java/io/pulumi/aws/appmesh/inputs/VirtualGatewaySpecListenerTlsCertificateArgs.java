// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsCertificateAcmArgs;
import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsCertificateFileArgs;
import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsCertificateSdsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecListenerTlsCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerTlsCertificateArgs Empty = new VirtualGatewaySpecListenerTlsCertificateArgs();

    /**
     * An AWS Certificate Manager (ACM) certificate.
     * 
     */
    @InputImport(name="acm")
      private final @Nullable Input<VirtualGatewaySpecListenerTlsCertificateAcmArgs> acm;

    public Input<VirtualGatewaySpecListenerTlsCertificateAcmArgs> getAcm() {
        return this.acm == null ? Input.empty() : this.acm;
    }

    /**
     * A local file certificate.
     * 
     */
    @InputImport(name="file")
      private final @Nullable Input<VirtualGatewaySpecListenerTlsCertificateFileArgs> file;

    public Input<VirtualGatewaySpecListenerTlsCertificateFileArgs> getFile() {
        return this.file == null ? Input.empty() : this.file;
    }

    /**
     * A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @InputImport(name="sds")
      private final @Nullable Input<VirtualGatewaySpecListenerTlsCertificateSdsArgs> sds;

    public Input<VirtualGatewaySpecListenerTlsCertificateSdsArgs> getSds() {
        return this.sds == null ? Input.empty() : this.sds;
    }

    public VirtualGatewaySpecListenerTlsCertificateArgs(
        @Nullable Input<VirtualGatewaySpecListenerTlsCertificateAcmArgs> acm,
        @Nullable Input<VirtualGatewaySpecListenerTlsCertificateFileArgs> file,
        @Nullable Input<VirtualGatewaySpecListenerTlsCertificateSdsArgs> sds) {
        this.acm = acm;
        this.file = file;
        this.sds = sds;
    }

    private VirtualGatewaySpecListenerTlsCertificateArgs() {
        this.acm = Input.empty();
        this.file = Input.empty();
        this.sds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerTlsCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualGatewaySpecListenerTlsCertificateAcmArgs> acm;
        private @Nullable Input<VirtualGatewaySpecListenerTlsCertificateFileArgs> file;
        private @Nullable Input<VirtualGatewaySpecListenerTlsCertificateSdsArgs> sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerTlsCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acm = defaults.acm;
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder setAcm(@Nullable Input<VirtualGatewaySpecListenerTlsCertificateAcmArgs> acm) {
            this.acm = acm;
            return this;
        }

        public Builder setAcm(@Nullable VirtualGatewaySpecListenerTlsCertificateAcmArgs acm) {
            this.acm = Input.ofNullable(acm);
            return this;
        }

        public Builder setFile(@Nullable Input<VirtualGatewaySpecListenerTlsCertificateFileArgs> file) {
            this.file = file;
            return this;
        }

        public Builder setFile(@Nullable VirtualGatewaySpecListenerTlsCertificateFileArgs file) {
            this.file = Input.ofNullable(file);
            return this;
        }

        public Builder setSds(@Nullable Input<VirtualGatewaySpecListenerTlsCertificateSdsArgs> sds) {
            this.sds = sds;
            return this;
        }

        public Builder setSds(@Nullable VirtualGatewaySpecListenerTlsCertificateSdsArgs sds) {
            this.sds = Input.ofNullable(sds);
            return this;
        }
        public VirtualGatewaySpecListenerTlsCertificateArgs build() {
            return new VirtualGatewaySpecListenerTlsCertificateArgs(acm, file, sds);
        }
    }
}