// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPermissionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPermissionArgs Empty = new GetPermissionArgs();

    @InputImport(name="certificateAuthorityArn", required=true)
    private final String certificateAuthorityArn;

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    @InputImport(name="principal", required=true)
    private final String principal;

    public String getPrincipal() {
        return this.principal;
    }

    public GetPermissionArgs(
        String certificateAuthorityArn,
        String principal) {
        this.certificateAuthorityArn = Objects.requireNonNull(certificateAuthorityArn, "expected parameter 'certificateAuthorityArn' to be non-null");
        this.principal = Objects.requireNonNull(principal, "expected parameter 'principal' to be non-null");
    }

    private GetPermissionArgs() {
        this.certificateAuthorityArn = null;
        this.principal = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateAuthorityArn;
        private String principal;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPermissionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthorityArn = defaults.certificateAuthorityArn;
    	      this.principal = defaults.principal;
        }

        public Builder setCertificateAuthorityArn(String certificateAuthorityArn) {
            this.certificateAuthorityArn = Objects.requireNonNull(certificateAuthorityArn);
            return this;
        }

        public Builder setPrincipal(String principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }

        public GetPermissionArgs build() {
            return new GetPermissionArgs(certificateAuthorityArn, principal);
        }
    }
}
