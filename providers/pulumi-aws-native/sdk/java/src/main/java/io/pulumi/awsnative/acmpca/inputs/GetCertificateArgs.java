// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetCertificateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCertificateArgs Empty = new GetCertificateArgs();

    @InputImport(name="arn", required=true)
    private final String arn;

    public String getArn() {
        return this.arn;
    }

    @InputImport(name="certificateAuthorityArn", required=true)
    private final String certificateAuthorityArn;

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    public GetCertificateArgs(
        String arn,
        String certificateAuthorityArn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.certificateAuthorityArn = Objects.requireNonNull(certificateAuthorityArn, "expected parameter 'certificateAuthorityArn' to be non-null");
    }

    private GetCertificateArgs() {
        this.arn = null;
        this.certificateAuthorityArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String certificateAuthorityArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.certificateAuthorityArn = defaults.certificateAuthorityArn;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setCertificateAuthorityArn(String certificateAuthorityArn) {
            this.certificateAuthorityArn = Objects.requireNonNull(certificateAuthorityArn);
            return this;
        }

        public GetCertificateArgs build() {
            return new GetCertificateArgs(arn, certificateAuthorityArn);
        }
    }
}
