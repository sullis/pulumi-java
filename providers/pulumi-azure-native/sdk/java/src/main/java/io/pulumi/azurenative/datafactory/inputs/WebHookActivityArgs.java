// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.WebHookActivityMethod;
import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.azurenative.datafactory.inputs.WebActivityAuthenticationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * WebHook activity.
 * 
 */
public final class WebHookActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebHookActivityArgs Empty = new WebHookActivityArgs();

    /**
     * Authentication method used for calling the endpoint.
     * 
     */
    @InputImport(name="authentication")
    private final @Nullable Input<WebActivityAuthenticationArgs> authentication;

    public Input<WebActivityAuthenticationArgs> getAuthentication() {
        return this.authentication == null ? Input.empty() : this.authentication;
    }

    /**
     * Represents the payload that will be sent to the endpoint. Required for POST/PUT method, not allowed for GET method Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="body")
    private final @Nullable Input<Object> body;

    public Input<Object> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @InputImport(name="dependsOn")
    private final @Nullable Input<List<ActivityDependencyArgs>> dependsOn;

    public Input<List<ActivityDependencyArgs>> getDependsOn() {
        return this.dependsOn == null ? Input.empty() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Represents the headers that will be sent to the request. For example, to set the language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="headers")
    private final @Nullable Input<Object> headers;

    public Input<Object> getHeaders() {
        return this.headers == null ? Input.empty() : this.headers;
    }

    /**
     * Rest API method for target endpoint.
     * 
     */
    @InputImport(name="method", required=true)
    private final Input<Either<String,WebHookActivityMethod>> method;

    public Input<Either<String,WebHookActivityMethod>> getMethod() {
        return this.method;
    }

    /**
     * Activity name.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * When set to true, statusCode, output and error in callback request body will be consumed by activity. The activity can be marked as failed by setting statusCode >= 400 in callback request. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="reportStatusOnCallBack")
    private final @Nullable Input<Object> reportStatusOnCallBack;

    public Input<Object> getReportStatusOnCallBack() {
        return this.reportStatusOnCallBack == null ? Input.empty() : this.reportStatusOnCallBack;
    }

    /**
     * The timeout within which the webhook should be called back. If there is no value specified, it defaults to 10 minutes. Type: string. Pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="timeout")
    private final @Nullable Input<String> timeout;

    public Input<String> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    /**
     * Type of activity.
     * Expected value is 'WebHook'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * WebHook activity target endpoint and path. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="url", required=true)
    private final Input<Object> url;

    public Input<Object> getUrl() {
        return this.url;
    }

    /**
     * Activity user properties.
     * 
     */
    @InputImport(name="userProperties")
    private final @Nullable Input<List<UserPropertyArgs>> userProperties;

    public Input<List<UserPropertyArgs>> getUserProperties() {
        return this.userProperties == null ? Input.empty() : this.userProperties;
    }

    public WebHookActivityArgs(
        @Nullable Input<WebActivityAuthenticationArgs> authentication,
        @Nullable Input<Object> body,
        @Nullable Input<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Input<String> description,
        @Nullable Input<Object> headers,
        Input<Either<String,WebHookActivityMethod>> method,
        Input<String> name,
        @Nullable Input<Object> reportStatusOnCallBack,
        @Nullable Input<String> timeout,
        Input<String> type,
        Input<Object> url,
        @Nullable Input<List<UserPropertyArgs>> userProperties) {
        this.authentication = authentication;
        this.body = body;
        this.dependsOn = dependsOn;
        this.description = description;
        this.headers = headers;
        this.method = Objects.requireNonNull(method, "expected parameter 'method' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.reportStatusOnCallBack = reportStatusOnCallBack;
        this.timeout = timeout;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.userProperties = userProperties;
    }

    private WebHookActivityArgs() {
        this.authentication = Input.empty();
        this.body = Input.empty();
        this.dependsOn = Input.empty();
        this.description = Input.empty();
        this.headers = Input.empty();
        this.method = Input.empty();
        this.name = Input.empty();
        this.reportStatusOnCallBack = Input.empty();
        this.timeout = Input.empty();
        this.type = Input.empty();
        this.url = Input.empty();
        this.userProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebHookActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebActivityAuthenticationArgs> authentication;
        private @Nullable Input<Object> body;
        private @Nullable Input<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> headers;
        private Input<Either<String,WebHookActivityMethod>> method;
        private Input<String> name;
        private @Nullable Input<Object> reportStatusOnCallBack;
        private @Nullable Input<String> timeout;
        private Input<String> type;
        private Input<Object> url;
        private @Nullable Input<List<UserPropertyArgs>> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(WebHookActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.body = defaults.body;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.headers = defaults.headers;
    	      this.method = defaults.method;
    	      this.name = defaults.name;
    	      this.reportStatusOnCallBack = defaults.reportStatusOnCallBack;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setAuthentication(@Nullable Input<WebActivityAuthenticationArgs> authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder setAuthentication(@Nullable WebActivityAuthenticationArgs authentication) {
            this.authentication = Input.ofNullable(authentication);
            return this;
        }

        public Builder setBody(@Nullable Input<Object> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable Object body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder setDependsOn(@Nullable Input<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Input.ofNullable(dependsOn);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setHeaders(@Nullable Input<Object> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setHeaders(@Nullable Object headers) {
            this.headers = Input.ofNullable(headers);
            return this;
        }

        public Builder setMethod(Input<Either<String,WebHookActivityMethod>> method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }

        public Builder setMethod(Either<String,WebHookActivityMethod> method) {
            this.method = Input.of(Objects.requireNonNull(method));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setReportStatusOnCallBack(@Nullable Input<Object> reportStatusOnCallBack) {
            this.reportStatusOnCallBack = reportStatusOnCallBack;
            return this;
        }

        public Builder setReportStatusOnCallBack(@Nullable Object reportStatusOnCallBack) {
            this.reportStatusOnCallBack = Input.ofNullable(reportStatusOnCallBack);
            return this;
        }

        public Builder setTimeout(@Nullable Input<String> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUrl(Input<Object> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUrl(Object url) {
            this.url = Input.of(Objects.requireNonNull(url));
            return this;
        }

        public Builder setUserProperties(@Nullable Input<List<UserPropertyArgs>> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyArgs> userProperties) {
            this.userProperties = Input.ofNullable(userProperties);
            return this;
        }

        public WebHookActivityArgs build() {
            return new WebHookActivityArgs(authentication, body, dependsOn, description, headers, method, name, reportStatusOnCallBack, timeout, type, url, userProperties);
        }
    }
}
