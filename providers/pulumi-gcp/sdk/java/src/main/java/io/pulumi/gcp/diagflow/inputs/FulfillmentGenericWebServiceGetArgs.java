// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FulfillmentGenericWebServiceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FulfillmentGenericWebServiceGetArgs Empty = new FulfillmentGenericWebServiceGetArgs();

    /**
     * The password for HTTP Basic authentication.
     * 
     */
    @InputImport(name="password")
    private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The HTTP request headers to send together with fulfillment requests.
     * 
     */
    @InputImport(name="requestHeaders")
    private final @Nullable Input<Map<String,String>> requestHeaders;

    public Input<Map<String,String>> getRequestHeaders() {
        return this.requestHeaders == null ? Input.empty() : this.requestHeaders;
    }

    /**
     * The fulfillment URI for receiving POST requests. It must use https protocol.
     * 
     */
    @InputImport(name="uri", required=true)
    private final Input<String> uri;

    public Input<String> getUri() {
        return this.uri;
    }

    /**
     * The user name for HTTP Basic authentication.
     * 
     */
    @InputImport(name="username")
    private final @Nullable Input<String> username;

    public Input<String> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public FulfillmentGenericWebServiceGetArgs(
        @Nullable Input<String> password,
        @Nullable Input<Map<String,String>> requestHeaders,
        Input<String> uri,
        @Nullable Input<String> username) {
        this.password = password;
        this.requestHeaders = requestHeaders;
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
        this.username = username;
    }

    private FulfillmentGenericWebServiceGetArgs() {
        this.password = Input.empty();
        this.requestHeaders = Input.empty();
        this.uri = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FulfillmentGenericWebServiceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> password;
        private @Nullable Input<Map<String,String>> requestHeaders;
        private Input<String> uri;
        private @Nullable Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(FulfillmentGenericWebServiceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.uri = defaults.uri;
    	      this.username = defaults.username;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setRequestHeaders(@Nullable Input<Map<String,String>> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }

        public Builder setRequestHeaders(@Nullable Map<String,String> requestHeaders) {
            this.requestHeaders = Input.ofNullable(requestHeaders);
            return this;
        }

        public Builder setUri(Input<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Input.of(Objects.requireNonNull(uri));
            return this;
        }

        public Builder setUsername(@Nullable Input<String> username) {
            this.username = username;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = Input.ofNullable(username);
            return this;
        }

        public FulfillmentGenericWebServiceGetArgs build() {
            return new FulfillmentGenericWebServiceGetArgs(password, requestHeaders, uri, username);
        }
    }
}
