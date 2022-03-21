// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClientCertAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClientCertAuthenticationArgs Empty = new ClientCertAuthenticationArgs();

    /**
     * Gets or sets the certificate expiration date.
     * 
     */
    @Import(name="certificateExpirationDate")
      private final @Nullable Output<String> certificateExpirationDate;

    public Output<String> getCertificateExpirationDate() {
        return this.certificateExpirationDate == null ? Output.empty() : this.certificateExpirationDate;
    }

    /**
     * Gets or sets the certificate subject name.
     * 
     */
    @Import(name="certificateSubjectName")
      private final @Nullable Output<String> certificateSubjectName;

    public Output<String> getCertificateSubjectName() {
        return this.certificateSubjectName == null ? Output.empty() : this.certificateSubjectName;
    }

    /**
     * Gets or sets the certificate thumbprint.
     * 
     */
    @Import(name="certificateThumbprint")
      private final @Nullable Output<String> certificateThumbprint;

    public Output<String> getCertificateThumbprint() {
        return this.certificateThumbprint == null ? Output.empty() : this.certificateThumbprint;
    }

    /**
     * Gets or sets the certificate password, return value will always be empty.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    /**
     * Gets or sets the pfx certificate. Accepts certification in base64 encoding, return value will always be empty.
     * 
     */
    @Import(name="pfx")
      private final @Nullable Output<String> pfx;

    public Output<String> getPfx() {
        return this.pfx == null ? Output.empty() : this.pfx;
    }

    /**
     * Gets or sets the HTTP authentication type.
     * Expected value is 'ClientCertificate'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ClientCertAuthenticationArgs(
        @Nullable Output<String> certificateExpirationDate,
        @Nullable Output<String> certificateSubjectName,
        @Nullable Output<String> certificateThumbprint,
        @Nullable Output<String> password,
        @Nullable Output<String> pfx,
        Output<String> type) {
        this.certificateExpirationDate = certificateExpirationDate;
        this.certificateSubjectName = certificateSubjectName;
        this.certificateThumbprint = certificateThumbprint;
        this.password = password;
        this.pfx = pfx;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ClientCertAuthenticationArgs() {
        this.certificateExpirationDate = Output.empty();
        this.certificateSubjectName = Output.empty();
        this.certificateThumbprint = Output.empty();
        this.password = Output.empty();
        this.pfx = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientCertAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificateExpirationDate;
        private @Nullable Output<String> certificateSubjectName;
        private @Nullable Output<String> certificateThumbprint;
        private @Nullable Output<String> password;
        private @Nullable Output<String> pfx;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientCertAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateExpirationDate = defaults.certificateExpirationDate;
    	      this.certificateSubjectName = defaults.certificateSubjectName;
    	      this.certificateThumbprint = defaults.certificateThumbprint;
    	      this.password = defaults.password;
    	      this.pfx = defaults.pfx;
    	      this.type = defaults.type;
        }

        public Builder certificateExpirationDate(@Nullable Output<String> certificateExpirationDate) {
            this.certificateExpirationDate = certificateExpirationDate;
            return this;
        }
        public Builder certificateExpirationDate(@Nullable String certificateExpirationDate) {
            this.certificateExpirationDate = Output.ofNullable(certificateExpirationDate);
            return this;
        }
        public Builder certificateSubjectName(@Nullable Output<String> certificateSubjectName) {
            this.certificateSubjectName = certificateSubjectName;
            return this;
        }
        public Builder certificateSubjectName(@Nullable String certificateSubjectName) {
            this.certificateSubjectName = Output.ofNullable(certificateSubjectName);
            return this;
        }
        public Builder certificateThumbprint(@Nullable Output<String> certificateThumbprint) {
            this.certificateThumbprint = certificateThumbprint;
            return this;
        }
        public Builder certificateThumbprint(@Nullable String certificateThumbprint) {
            this.certificateThumbprint = Output.ofNullable(certificateThumbprint);
            return this;
        }
        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Output.ofNullable(password);
            return this;
        }
        public Builder pfx(@Nullable Output<String> pfx) {
            this.pfx = pfx;
            return this;
        }
        public Builder pfx(@Nullable String pfx) {
            this.pfx = Output.ofNullable(pfx);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ClientCertAuthenticationArgs build() {
            return new ClientCertAuthenticationArgs(certificateExpirationDate, certificateSubjectName, certificateThumbprint, password, pfx, type);
        }
    }
}
