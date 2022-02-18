// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InboundSamlConfigSpConfigSpCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final InboundSamlConfigSpConfigSpCertificateArgs Empty = new InboundSamlConfigSpConfigSpCertificateArgs();

    /**
     * - 
     * The x509 certificate
     * 
     */
    @InputImport(name="x509Certificate")
    private final @Nullable Input<String> x509Certificate;

    public Input<String> getX509Certificate() {
        return this.x509Certificate == null ? Input.empty() : this.x509Certificate;
    }

    public InboundSamlConfigSpConfigSpCertificateArgs(@Nullable Input<String> x509Certificate) {
        this.x509Certificate = x509Certificate;
    }

    private InboundSamlConfigSpConfigSpCertificateArgs() {
        this.x509Certificate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundSamlConfigSpConfigSpCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> x509Certificate;

        public Builder() {
    	      // Empty
        }

        public Builder(InboundSamlConfigSpConfigSpCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.x509Certificate = defaults.x509Certificate;
        }

        public Builder setX509Certificate(@Nullable Input<String> x509Certificate) {
            this.x509Certificate = x509Certificate;
            return this;
        }

        public Builder setX509Certificate(@Nullable String x509Certificate) {
            this.x509Certificate = Input.ofNullable(x509Certificate);
            return this;
        }

        public InboundSamlConfigSpConfigSpCertificateArgs build() {
            return new InboundSamlConfigSpConfigSpCertificateArgs(x509Certificate);
        }
    }
}
