// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.privateca_v1.inputs.CaOptionsArgs;
import io.pulumi.googlenative.privateca_v1.inputs.KeyUsageArgs;
import io.pulumi.googlenative.privateca_v1.inputs.ObjectIdArgs;
import io.pulumi.googlenative.privateca_v1.inputs.X509ExtensionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An X509Parameters is used to describe certain fields of an X.509 certificate, such as the key usage fields, fields specific to CA certificates, certificate policy extensions and custom extensions.
 * 
 */
public final class X509ParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final X509ParametersArgs Empty = new X509ParametersArgs();

    /**
     * Optional. Describes custom X.509 extensions.
     * 
     */
    @Import(name="additionalExtensions")
      private final @Nullable Output<List<X509ExtensionArgs>> additionalExtensions;

    public Output<List<X509ExtensionArgs>> getAdditionalExtensions() {
        return this.additionalExtensions == null ? Output.empty() : this.additionalExtensions;
    }

    /**
     * Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the "Authority Information Access" extension in the certificate.
     * 
     */
    @Import(name="aiaOcspServers")
      private final @Nullable Output<List<String>> aiaOcspServers;

    public Output<List<String>> getAiaOcspServers() {
        return this.aiaOcspServers == null ? Output.empty() : this.aiaOcspServers;
    }

    /**
     * Optional. Describes options in this X509Parameters that are relevant in a CA certificate.
     * 
     */
    @Import(name="caOptions")
      private final @Nullable Output<CaOptionsArgs> caOptions;

    public Output<CaOptionsArgs> getCaOptions() {
        return this.caOptions == null ? Output.empty() : this.caOptions;
    }

    /**
     * Optional. Indicates the intended use for keys that correspond to a certificate.
     * 
     */
    @Import(name="keyUsage")
      private final @Nullable Output<KeyUsageArgs> keyUsage;

    public Output<KeyUsageArgs> getKeyUsage() {
        return this.keyUsage == null ? Output.empty() : this.keyUsage;
    }

    /**
     * Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * 
     */
    @Import(name="policyIds")
      private final @Nullable Output<List<ObjectIdArgs>> policyIds;

    public Output<List<ObjectIdArgs>> getPolicyIds() {
        return this.policyIds == null ? Output.empty() : this.policyIds;
    }

    public X509ParametersArgs(
        @Nullable Output<List<X509ExtensionArgs>> additionalExtensions,
        @Nullable Output<List<String>> aiaOcspServers,
        @Nullable Output<CaOptionsArgs> caOptions,
        @Nullable Output<KeyUsageArgs> keyUsage,
        @Nullable Output<List<ObjectIdArgs>> policyIds) {
        this.additionalExtensions = additionalExtensions;
        this.aiaOcspServers = aiaOcspServers;
        this.caOptions = caOptions;
        this.keyUsage = keyUsage;
        this.policyIds = policyIds;
    }

    private X509ParametersArgs() {
        this.additionalExtensions = Output.empty();
        this.aiaOcspServers = Output.empty();
        this.caOptions = Output.empty();
        this.keyUsage = Output.empty();
        this.policyIds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X509ParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<X509ExtensionArgs>> additionalExtensions;
        private @Nullable Output<List<String>> aiaOcspServers;
        private @Nullable Output<CaOptionsArgs> caOptions;
        private @Nullable Output<KeyUsageArgs> keyUsage;
        private @Nullable Output<List<ObjectIdArgs>> policyIds;

        public Builder() {
    	      // Empty
        }

        public Builder(X509ParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.aiaOcspServers = defaults.aiaOcspServers;
    	      this.caOptions = defaults.caOptions;
    	      this.keyUsage = defaults.keyUsage;
    	      this.policyIds = defaults.policyIds;
        }

        public Builder additionalExtensions(@Nullable Output<List<X509ExtensionArgs>> additionalExtensions) {
            this.additionalExtensions = additionalExtensions;
            return this;
        }
        public Builder additionalExtensions(@Nullable List<X509ExtensionArgs> additionalExtensions) {
            this.additionalExtensions = Output.ofNullable(additionalExtensions);
            return this;
        }
        public Builder additionalExtensions(X509ExtensionArgs... additionalExtensions) {
            return additionalExtensions(List.of(additionalExtensions));
        }
        public Builder aiaOcspServers(@Nullable Output<List<String>> aiaOcspServers) {
            this.aiaOcspServers = aiaOcspServers;
            return this;
        }
        public Builder aiaOcspServers(@Nullable List<String> aiaOcspServers) {
            this.aiaOcspServers = Output.ofNullable(aiaOcspServers);
            return this;
        }
        public Builder aiaOcspServers(String... aiaOcspServers) {
            return aiaOcspServers(List.of(aiaOcspServers));
        }
        public Builder caOptions(@Nullable Output<CaOptionsArgs> caOptions) {
            this.caOptions = caOptions;
            return this;
        }
        public Builder caOptions(@Nullable CaOptionsArgs caOptions) {
            this.caOptions = Output.ofNullable(caOptions);
            return this;
        }
        public Builder keyUsage(@Nullable Output<KeyUsageArgs> keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }
        public Builder keyUsage(@Nullable KeyUsageArgs keyUsage) {
            this.keyUsage = Output.ofNullable(keyUsage);
            return this;
        }
        public Builder policyIds(@Nullable Output<List<ObjectIdArgs>> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public Builder policyIds(@Nullable List<ObjectIdArgs> policyIds) {
            this.policyIds = Output.ofNullable(policyIds);
            return this;
        }
        public Builder policyIds(ObjectIdArgs... policyIds) {
            return policyIds(List.of(policyIds));
        }        public X509ParametersArgs build() {
            return new X509ParametersArgs(additionalExtensions, aiaOcspServers, caOptions, keyUsage, policyIds);
        }
    }
}
