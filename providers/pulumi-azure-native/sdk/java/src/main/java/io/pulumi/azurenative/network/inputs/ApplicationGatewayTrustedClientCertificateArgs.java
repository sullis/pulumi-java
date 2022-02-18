// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Trusted client certificates of an application gateway.
 * 
 */
public final class ApplicationGatewayTrustedClientCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayTrustedClientCertificateArgs Empty = new ApplicationGatewayTrustedClientCertificateArgs();

    /**
     * Certificate public data.
     * 
     */
    @InputImport(name="data")
    private final @Nullable Input<String> data;

    public Input<String> getData() {
        return this.data == null ? Input.empty() : this.data;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Name of the trusted client certificate that is unique within an Application Gateway.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public ApplicationGatewayTrustedClientCertificateArgs(
        @Nullable Input<String> data,
        @Nullable Input<String> id,
        @Nullable Input<String> name) {
        this.data = data;
        this.id = id;
        this.name = name;
    }

    private ApplicationGatewayTrustedClientCertificateArgs() {
        this.data = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayTrustedClientCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> data;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayTrustedClientCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder setData(@Nullable Input<String> data) {
            this.data = data;
            return this;
        }

        public Builder setData(@Nullable String data) {
            this.data = Input.ofNullable(data);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public ApplicationGatewayTrustedClientCertificateArgs build() {
            return new ApplicationGatewayTrustedClientCertificateArgs(data, id, name);
        }
    }
}
