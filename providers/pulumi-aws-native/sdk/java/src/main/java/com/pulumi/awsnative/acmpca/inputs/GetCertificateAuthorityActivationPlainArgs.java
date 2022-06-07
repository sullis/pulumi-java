// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.acmpca.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCertificateAuthorityActivationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificateAuthorityActivationPlainArgs Empty = new GetCertificateAuthorityActivationPlainArgs();

    /**
     * Arn of the Certificate Authority.
     * 
     */
    @Import(name="certificateAuthorityArn", required=true)
    private String certificateAuthorityArn;

    /**
     * @return Arn of the Certificate Authority.
     * 
     */
    public String certificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    private GetCertificateAuthorityActivationPlainArgs() {}

    private GetCertificateAuthorityActivationPlainArgs(GetCertificateAuthorityActivationPlainArgs $) {
        this.certificateAuthorityArn = $.certificateAuthorityArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificateAuthorityActivationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificateAuthorityActivationPlainArgs $;

        public Builder() {
            $ = new GetCertificateAuthorityActivationPlainArgs();
        }

        public Builder(GetCertificateAuthorityActivationPlainArgs defaults) {
            $ = new GetCertificateAuthorityActivationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateAuthorityArn Arn of the Certificate Authority.
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityArn(String certificateAuthorityArn) {
            $.certificateAuthorityArn = certificateAuthorityArn;
            return this;
        }

        public GetCertificateAuthorityActivationPlainArgs build() {
            $.certificateAuthorityArn = Objects.requireNonNull($.certificateAuthorityArn, "expected parameter 'certificateAuthorityArn' to be non-null");
            return $;
        }
    }

}
