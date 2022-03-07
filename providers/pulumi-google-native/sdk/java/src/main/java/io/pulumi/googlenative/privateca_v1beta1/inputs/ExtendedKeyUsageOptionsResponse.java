// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * KeyUsage.ExtendedKeyUsageOptions has fields that correspond to certain common OIDs that could be specified as an extended key usage value.
 * 
 */
public final class ExtendedKeyUsageOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExtendedKeyUsageOptionsResponse Empty = new ExtendedKeyUsageOptionsResponse();

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.2. Officially described as "TLS WWW client authentication", though regularly used for non-WWW TLS.
     * 
     */
    @InputImport(name="clientAuth", required=true)
      private final Boolean clientAuth;

    public Boolean getClientAuth() {
        return this.clientAuth;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.3. Officially described as "Signing of downloadable executable code client authentication".
     * 
     */
    @InputImport(name="codeSigning", required=true)
      private final Boolean codeSigning;

    public Boolean getCodeSigning() {
        return this.codeSigning;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.4. Officially described as "Email protection".
     * 
     */
    @InputImport(name="emailProtection", required=true)
      private final Boolean emailProtection;

    public Boolean getEmailProtection() {
        return this.emailProtection;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.9. Officially described as "Signing OCSP responses".
     * 
     */
    @InputImport(name="ocspSigning", required=true)
      private final Boolean ocspSigning;

    public Boolean getOcspSigning() {
        return this.ocspSigning;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.1. Officially described as "TLS WWW server authentication", though regularly used for non-WWW TLS.
     * 
     */
    @InputImport(name="serverAuth", required=true)
      private final Boolean serverAuth;

    public Boolean getServerAuth() {
        return this.serverAuth;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.8. Officially described as "Binding the hash of an object to a time".
     * 
     */
    @InputImport(name="timeStamping", required=true)
      private final Boolean timeStamping;

    public Boolean getTimeStamping() {
        return this.timeStamping;
    }

    public ExtendedKeyUsageOptionsResponse(
        Boolean clientAuth,
        Boolean codeSigning,
        Boolean emailProtection,
        Boolean ocspSigning,
        Boolean serverAuth,
        Boolean timeStamping) {
        this.clientAuth = Objects.requireNonNull(clientAuth, "expected parameter 'clientAuth' to be non-null");
        this.codeSigning = Objects.requireNonNull(codeSigning, "expected parameter 'codeSigning' to be non-null");
        this.emailProtection = Objects.requireNonNull(emailProtection, "expected parameter 'emailProtection' to be non-null");
        this.ocspSigning = Objects.requireNonNull(ocspSigning, "expected parameter 'ocspSigning' to be non-null");
        this.serverAuth = Objects.requireNonNull(serverAuth, "expected parameter 'serverAuth' to be non-null");
        this.timeStamping = Objects.requireNonNull(timeStamping, "expected parameter 'timeStamping' to be non-null");
    }

    private ExtendedKeyUsageOptionsResponse() {
        this.clientAuth = null;
        this.codeSigning = null;
        this.emailProtection = null;
        this.ocspSigning = null;
        this.serverAuth = null;
        this.timeStamping = null;
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