// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Configuration for client certificates on the cluster.
 * 
 */
public final class ClientCertificateConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final ClientCertificateConfigResponse Empty = new ClientCertificateConfigResponse();

    /**
     * Issue a client certificate.
     * 
     */
    @Import(name="issueClientCertificate", required=true)
    private Boolean issueClientCertificate;

    /**
     * @return Issue a client certificate.
     * 
     */
    public Boolean issueClientCertificate() {
        return this.issueClientCertificate;
    }

    private ClientCertificateConfigResponse() {}

    private ClientCertificateConfigResponse(ClientCertificateConfigResponse $) {
        this.issueClientCertificate = $.issueClientCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientCertificateConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientCertificateConfigResponse $;

        public Builder() {
            $ = new ClientCertificateConfigResponse();
        }

        public Builder(ClientCertificateConfigResponse defaults) {
            $ = new ClientCertificateConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param issueClientCertificate Issue a client certificate.
         * 
         * @return builder
         * 
         */
        public Builder issueClientCertificate(Boolean issueClientCertificate) {
            $.issueClientCertificate = issueClientCertificate;
            return this;
        }

        public ClientCertificateConfigResponse build() {
            $.issueClientCertificate = Objects.requireNonNull($.issueClientCertificate, "expected parameter 'issueClientCertificate' to be non-null");
            return $;
        }
    }

}
