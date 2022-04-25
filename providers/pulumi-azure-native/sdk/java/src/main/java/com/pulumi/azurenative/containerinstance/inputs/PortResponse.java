// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerinstance.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The port exposed on the container group.
 * 
 */
public final class PortResponse extends com.pulumi.resources.InvokeArgs {

    public static final PortResponse Empty = new PortResponse();

    /**
     * The port number.
     * 
     */
    @Import(name="port", required=true)
    private Integer port;

    /**
     * @return The port number.
     * 
     */
    public Integer port() {
        return this.port;
    }

    /**
     * The protocol associated with the port.
     * 
     */
    @Import(name="protocol")
    private @Nullable String protocol;

    /**
     * @return The protocol associated with the port.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    private PortResponse() {}

    private PortResponse(PortResponse $) {
        this.port = $.port;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PortResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PortResponse $;

        public Builder() {
            $ = new PortResponse();
        }

        public Builder(PortResponse defaults) {
            $ = new PortResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param port The port number.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            $.port = port;
            return this;
        }

        /**
         * @param protocol The protocol associated with the port.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable String protocol) {
            $.protocol = protocol;
            return this;
        }

        public PortResponse build() {
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
