// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents configuration for a generic web service. Dialogflow supports two mechanisms for authentications: - Basic authentication with username and password. - Authentication with additional authentication headers. More information could be found at: https://cloud.google.com/dialogflow/docs/fulfillment-configure.
 * 
 */
public final class GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs Empty = new GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs();

    /**
     * Optional. Indicates if generic web service is created through Cloud Functions integration. Defaults to false. is_cloud_function is deprecated. Cloud functions can be configured by its uri as a regular web service now.
     * 
     */
    @InputImport(name="isCloudFunction")
      private final @Nullable Input<Boolean> isCloudFunction;

    public Input<Boolean> getIsCloudFunction() {
        return this.isCloudFunction == null ? Input.empty() : this.isCloudFunction;
    }

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

    public GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs(
        @Nullable Input<Boolean> isCloudFunction,
        @Nullable Input<String> password,
        @Nullable Input<Map<String,String>> requestHeaders,
        Input<String> uri,
        @Nullable Input<String> username) {
        this.isCloudFunction = isCloudFunction;
        this.password = password;
        this.requestHeaders = requestHeaders;
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
        this.username = username;
    }

    private GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs() {
        this.isCloudFunction = Input.empty();
        this.password = Input.empty();
        this.requestHeaders = Input.empty();
        this.uri = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> isCloudFunction;
        private @Nullable Input<String> password;
        private @Nullable Input<Map<String,String>> requestHeaders;
        private Input<String> uri;
        private @Nullable Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCloudFunction = defaults.isCloudFunction;
    	      this.password = defaults.password;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.uri = defaults.uri;
    	      this.username = defaults.username;
        }

        public Builder setIsCloudFunction(@Nullable Input<Boolean> isCloudFunction) {
            this.isCloudFunction = isCloudFunction;
            return this;
        }

        public Builder setIsCloudFunction(@Nullable Boolean isCloudFunction) {
            this.isCloudFunction = Input.ofNullable(isCloudFunction);
            return this;
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
        public GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs build() {
            return new GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs(isCloudFunction, password, requestHeaders, uri, username);
        }
    }
}