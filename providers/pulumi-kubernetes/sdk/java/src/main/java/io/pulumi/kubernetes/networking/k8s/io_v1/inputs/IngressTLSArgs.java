// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IngressTLS describes the transport layer security associated with an Ingress.
 * 
 */
public final class IngressTLSArgs extends io.pulumi.resources.ResourceArgs {

    public static final IngressTLSArgs Empty = new IngressTLSArgs();

    /**
     * Hosts are a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
     * 
     */
    @InputImport(name="hosts")
    private final @Nullable Input<List<String>> hosts;

    public Input<List<String>> getHosts() {
        return this.hosts == null ? Input.empty() : this.hosts;
    }

    /**
     * SecretName is the name of the secret used to terminate TLS traffic on port 443. Field is left optional to allow TLS routing based on SNI hostname alone. If the SNI host in a listener conflicts with the "Host" header field used by an IngressRule, the SNI host is used for termination and value of the Host header is used for routing.
     * 
     */
    @InputImport(name="secretName")
    private final @Nullable Input<String> secretName;

    public Input<String> getSecretName() {
        return this.secretName == null ? Input.empty() : this.secretName;
    }

    public IngressTLSArgs(
        @Nullable Input<List<String>> hosts,
        @Nullable Input<String> secretName) {
        this.hosts = hosts;
        this.secretName = secretName;
    }

    private IngressTLSArgs() {
        this.hosts = Input.empty();
        this.secretName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressTLSArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> hosts;
        private @Nullable Input<String> secretName;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressTLSArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hosts = defaults.hosts;
    	      this.secretName = defaults.secretName;
        }

        public Builder setHosts(@Nullable Input<List<String>> hosts) {
            this.hosts = hosts;
            return this;
        }

        public Builder setHosts(@Nullable List<String> hosts) {
            this.hosts = Input.ofNullable(hosts);
            return this;
        }

        public Builder setSecretName(@Nullable Input<String> secretName) {
            this.secretName = secretName;
            return this;
        }

        public Builder setSecretName(@Nullable String secretName) {
            this.secretName = Input.ofNullable(secretName);
            return this;
        }

        public IngressTLSArgs build() {
            return new IngressTLSArgs(hosts, secretName);
        }
    }
}
