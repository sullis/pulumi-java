// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class ExtendedKeyUsageOptionsResponse {
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.2. Officially described as "TLS WWW client authentication", though regularly used for non-WWW TLS.
     * 
     */
    private final Boolean clientAuth;
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.3. Officially described as "Signing of downloadable executable code client authentication".
     * 
     */
    private final Boolean codeSigning;
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.4. Officially described as "Email protection".
     * 
     */
    private final Boolean emailProtection;
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.9. Officially described as "Signing OCSP responses".
     * 
     */
    private final Boolean ocspSigning;
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.1. Officially described as "TLS WWW server authentication", though regularly used for non-WWW TLS.
     * 
     */
    private final Boolean serverAuth;
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.8. Officially described as "Binding the hash of an object to a time".
     * 
     */
    private final Boolean timeStamping;

    @OutputCustomType.Constructor({"clientAuth","codeSigning","emailProtection","ocspSigning","serverAuth","timeStamping"})
    private ExtendedKeyUsageOptionsResponse(
        Boolean clientAuth,
        Boolean codeSigning,
        Boolean emailProtection,
        Boolean ocspSigning,
        Boolean serverAuth,
        Boolean timeStamping) {
        this.clientAuth = Objects.requireNonNull(clientAuth);
        this.codeSigning = Objects.requireNonNull(codeSigning);
        this.emailProtection = Objects.requireNonNull(emailProtection);
        this.ocspSigning = Objects.requireNonNull(ocspSigning);
        this.serverAuth = Objects.requireNonNull(serverAuth);
        this.timeStamping = Objects.requireNonNull(timeStamping);
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.2. Officially described as "TLS WWW client authentication", though regularly used for non-WWW TLS.
     * 
    */
    public Boolean getClientAuth() {
        return this.clientAuth;
    }
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.3. Officially described as "Signing of downloadable executable code client authentication".
     * 
    */
    public Boolean getCodeSigning() {
        return this.codeSigning;
    }
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.4. Officially described as "Email protection".
     * 
    */
    public Boolean getEmailProtection() {
        return this.emailProtection;
    }
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.9. Officially described as "Signing OCSP responses".
     * 
    */
    public Boolean getOcspSigning() {
        return this.ocspSigning;
    }
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.1. Officially described as "TLS WWW server authentication", though regularly used for non-WWW TLS.
     * 
    */
    public Boolean getServerAuth() {
        return this.serverAuth;
    }
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.8. Officially described as "Binding the hash of an object to a time".
     * 
    */
    public Boolean getTimeStamping() {
        return this.timeStamping;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtendedKeyUsageOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean clientAuth;
        private Boolean codeSigning;
        private Boolean emailProtection;
        private Boolean ocspSigning;
        private Boolean serverAuth;
        private Boolean timeStamping;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtendedKeyUsageOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientAuth = defaults.clientAuth;
    	      this.codeSigning = defaults.codeSigning;
    	      this.emailProtection = defaults.emailProtection;
    	      this.ocspSigning = defaults.ocspSigning;
    	      this.serverAuth = defaults.serverAuth;
    	      this.timeStamping = defaults.timeStamping;
        }

        public Builder setClientAuth(Boolean clientAuth) {
            this.clientAuth = Objects.requireNonNull(clientAuth);
            return this;
        }

        public Builder setCodeSigning(Boolean codeSigning) {
            this.codeSigning = Objects.requireNonNull(codeSigning);
            return this;
        }

        public Builder setEmailProtection(Boolean emailProtection) {
            this.emailProtection = Objects.requireNonNull(emailProtection);
            return this;
        }

        public Builder setOcspSigning(Boolean ocspSigning) {
            this.ocspSigning = Objects.requireNonNull(ocspSigning);
            return this;
        }

        public Builder setServerAuth(Boolean serverAuth) {
            this.serverAuth = Objects.requireNonNull(serverAuth);
            return this;
        }

        public Builder setTimeStamping(Boolean timeStamping) {
            this.timeStamping = Objects.requireNonNull(timeStamping);
            return this;
        }
        public ExtendedKeyUsageOptionsResponse build() {
            return new ExtendedKeyUsageOptionsResponse(clientAuth, codeSigning, emailProtection, ocspSigning, serverAuth, timeStamping);
        }
    }
}