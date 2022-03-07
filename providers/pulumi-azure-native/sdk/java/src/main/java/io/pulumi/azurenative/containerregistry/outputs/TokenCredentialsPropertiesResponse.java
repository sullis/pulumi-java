// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.TokenCertificateResponse;
import io.pulumi.azurenative.containerregistry.outputs.TokenPasswordResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class TokenCredentialsPropertiesResponse {
    private final @Nullable List<TokenCertificateResponse> certificates;
    private final @Nullable List<TokenPasswordResponse> passwords;

    @OutputCustomType.Constructor({"certificates","passwords"})
    private TokenCredentialsPropertiesResponse(
        @Nullable List<TokenCertificateResponse> certificates,
        @Nullable List<TokenPasswordResponse> passwords) {
        this.certificates = certificates;
        this.passwords = passwords;
    }

    public List<TokenCertificateResponse> getCertificates() {
        return this.certificates == null ? List.of() : this.certificates;
    }
    public List<TokenPasswordResponse> getPasswords() {
        return this.passwords == null ? List.of() : this.passwords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenCredentialsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<TokenCertificateResponse> certificates;
        private @Nullable List<TokenPasswordResponse> passwords;

        public Builder() {
    	      // Empty
        }

        public Builder(TokenCredentialsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.passwords = defaults.passwords;
        }

        public Builder setCertificates(@Nullable List<TokenCertificateResponse> certificates) {
            this.certificates = certificates;
            return this;
        }

        public Builder setPasswords(@Nullable List<TokenPasswordResponse> passwords) {
            this.passwords = passwords;
            return this;
        }
        public TokenCredentialsPropertiesResponse build() {
            return new TokenCredentialsPropertiesResponse(certificates, passwords);
        }
    }
}