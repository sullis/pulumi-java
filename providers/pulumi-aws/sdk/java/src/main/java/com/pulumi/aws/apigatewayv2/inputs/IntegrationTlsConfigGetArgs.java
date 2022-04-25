// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationTlsConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationTlsConfigGetArgs Empty = new IntegrationTlsConfigGetArgs();

    /**
     * If you specify a server name, API Gateway uses it to verify the hostname on the integration&#39;s certificate. The server name is also included in the TLS handshake to support Server Name Indication (SNI) or virtual hosting.
     * 
     */
    @Import(name="serverNameToVerify")
    private @Nullable Output<String> serverNameToVerify;

    /**
     * @return If you specify a server name, API Gateway uses it to verify the hostname on the integration&#39;s certificate. The server name is also included in the TLS handshake to support Server Name Indication (SNI) or virtual hosting.
     * 
     */
    public Optional<Output<String>> serverNameToVerify() {
        return Optional.ofNullable(this.serverNameToVerify);
    }

    private IntegrationTlsConfigGetArgs() {}

    private IntegrationTlsConfigGetArgs(IntegrationTlsConfigGetArgs $) {
        this.serverNameToVerify = $.serverNameToVerify;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationTlsConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationTlsConfigGetArgs $;

        public Builder() {
            $ = new IntegrationTlsConfigGetArgs();
        }

        public Builder(IntegrationTlsConfigGetArgs defaults) {
            $ = new IntegrationTlsConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serverNameToVerify If you specify a server name, API Gateway uses it to verify the hostname on the integration&#39;s certificate. The server name is also included in the TLS handshake to support Server Name Indication (SNI) or virtual hosting.
         * 
         * @return builder
         * 
         */
        public Builder serverNameToVerify(@Nullable Output<String> serverNameToVerify) {
            $.serverNameToVerify = serverNameToVerify;
            return this;
        }

        /**
         * @param serverNameToVerify If you specify a server name, API Gateway uses it to verify the hostname on the integration&#39;s certificate. The server name is also included in the TLS handshake to support Server Name Indication (SNI) or virtual hosting.
         * 
         * @return builder
         * 
         */
        public Builder serverNameToVerify(String serverNameToVerify) {
            return serverNameToVerify(Output.of(serverNameToVerify));
        }

        public IntegrationTlsConfigGetArgs build() {
            return $;
        }
    }

}
