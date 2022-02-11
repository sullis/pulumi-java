// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCertificateAuthorityActivationResult {
    private final @Nullable String completeCertificateChain;
    private final @Nullable String status;

    @OutputCustomType.Constructor({"completeCertificateChain","status"})
    private GetCertificateAuthorityActivationResult(
        @Nullable String completeCertificateChain,
        @Nullable String status) {
        this.completeCertificateChain = completeCertificateChain;
        this.status = status;
    }

    public Optional<String> getCompleteCertificateChain() {
        return Optional.ofNullable(this.completeCertificateChain);
    }
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateAuthorityActivationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String completeCertificateChain;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateAuthorityActivationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completeCertificateChain = defaults.completeCertificateChain;
    	      this.status = defaults.status;
        }

        public Builder setCompleteCertificateChain(@Nullable String completeCertificateChain) {
            this.completeCertificateChain = completeCertificateChain;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public GetCertificateAuthorityActivationResult build() {
            return new GetCertificateAuthorityActivationResult(completeCertificateChain, status);
        }
    }
}
