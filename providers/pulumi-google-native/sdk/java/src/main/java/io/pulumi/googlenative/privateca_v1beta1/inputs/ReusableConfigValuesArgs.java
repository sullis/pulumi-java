// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1beta1.inputs.CaOptionsArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.KeyUsageArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.ObjectIdArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.X509ExtensionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A ReusableConfigValues is used to describe certain fields of an X.509 certificate, such as the key usage fields, fields specific to CA certificates, certificate policy extensions and custom extensions.
 * 
 */
public final class ReusableConfigValuesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReusableConfigValuesArgs Empty = new ReusableConfigValuesArgs();

    /**
     * Optional. Describes custom X.509 extensions.
     * 
     */
    @InputImport(name="additionalExtensions")
      private final @Nullable Input<List<X509ExtensionArgs>> additionalExtensions;

    public Input<List<X509ExtensionArgs>> getAdditionalExtensions() {
        return this.additionalExtensions == null ? Input.empty() : this.additionalExtensions;
    }

    /**
     * Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the "Authority Information Access" extension in the certificate.
     * 
     */
    @InputImport(name="aiaOcspServers")
      private final @Nullable Input<List<String>> aiaOcspServers;

    public Input<List<String>> getAiaOcspServers() {
        return this.aiaOcspServers == null ? Input.empty() : this.aiaOcspServers;
    }

    /**
     * Optional. Describes options in this ReusableConfigValues that are relevant in a CA certificate.
     * 
     */
    @InputImport(name="caOptions")
      private final @Nullable Input<CaOptionsArgs> caOptions;

    public Input<CaOptionsArgs> getCaOptions() {
        return this.caOptions == null ? Input.empty() : this.caOptions;
    }

    /**
     * Optional. Indicates the intended use for keys that correspond to a certificate.
     * 
     */
    @InputImport(name="keyUsage")
      private final @Nullable Input<KeyUsageArgs> keyUsage;

    public Input<KeyUsageArgs> getKeyUsage() {
        return this.keyUsage == null ? Input.empty() : this.keyUsage;
    }

    /**
     * Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * 
     */
    @InputImport(name="policyIds")
      private final @Nullable Input<List<ObjectIdArgs>> policyIds;

    public Input<List<ObjectIdArgs>> getPolicyIds() {
        return this.policyIds == null ? Input.empty() : this.policyIds;
    }

    public ReusableConfigValuesArgs(
        @Nullable Input<List<X509ExtensionArgs>> additionalExtensions,
        @Nullable Input<List<String>> aiaOcspServers,
        @Nullable Input<CaOptionsArgs> caOptions,
        @Nullable Input<KeyUsageArgs> keyUsage,
        @Nullable Input<List<ObjectIdArgs>> policyIds) {
        this.additionalExtensions = additionalExtensions;
        this.aiaOcspServers = aiaOcspServers;
        this.caOptions = caOptions;
        this.keyUsage = keyUsage;
        this.policyIds = policyIds;
    }

    private ReusableConfigValuesArgs() {
        this.additionalExtensions = Input.empty();
        this.aiaOcspServers = Input.empty();
        this.caOptions = Input.empty();
        this.keyUsage = Input.empty();
        this.policyIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReusableConfigValuesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<X509ExtensionArgs>> additionalExtensions;
        private @Nullable Input<List<String>> aiaOcspServers;
        private @Nullable Input<CaOptionsArgs> caOptions;
        private @Nullable Input<KeyUsageArgs> keyUsage;
        private @Nullable Input<List<ObjectIdArgs>> policyIds;

        public Builder() {
    	      // Empty
        }

        public Builder(ReusableConfigValuesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.aiaOcspServers = defaults.aiaOcspServers;
    	      this.caOptions = defaults.caOptions;
    	      this.keyUsage = defaults.keyUsage;
    	      this.policyIds = defaults.policyIds;
        }

        public Builder setAdditionalExtensions(@Nullable Input<List<X509ExtensionArgs>> additionalExtensions) {
            this.additionalExtensions = additionalExtensions;
            return this;
        }

        public Builder setAdditionalExtensions(@Nullable List<X509ExtensionArgs> additionalExtensions) {
            this.additionalExtensions = Input.ofNullable(additionalExtensions);
            return this;
        }

        public Builder setAiaOcspServers(@Nullable Input<List<String>> aiaOcspServers) {
            this.aiaOcspServers = aiaOcspServers;
            return this;
        }

        public Builder setAiaOcspServers(@Nullable List<String> aiaOcspServers) {
            this.aiaOcspServers = Input.ofNullable(aiaOcspServers);
            return this;
        }

        public Builder setCaOptions(@Nullable Input<CaOptionsArgs> caOptions) {
            this.caOptions = caOptions;
            return this;
        }

        public Builder setCaOptions(@Nullable CaOptionsArgs caOptions) {
            this.caOptions = Input.ofNullable(caOptions);
            return this;
        }

        public Builder setKeyUsage(@Nullable Input<KeyUsageArgs> keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }

        public Builder setKeyUsage(@Nullable KeyUsageArgs keyUsage) {
            this.keyUsage = Input.ofNullable(keyUsage);
            return this;
        }

        public Builder setPolicyIds(@Nullable Input<List<ObjectIdArgs>> policyIds) {
            this.policyIds = policyIds;
            return this;
        }

        public Builder setPolicyIds(@Nullable List<ObjectIdArgs> policyIds) {
            this.policyIds = Input.ofNullable(policyIds);
            return this;
        }
        public ReusableConfigValuesArgs build() {
            return new ReusableConfigValuesArgs(additionalExtensions, aiaOcspServers, caOptions, keyUsage, policyIds);
        }
    }
}