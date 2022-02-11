// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs;
import io.pulumi.awsnative.wafv2.inputs.LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoggingConfigurationFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationFieldToMatchArgs Empty = new LoggingConfigurationFieldToMatchArgs();

    @InputImport(name="jsonBody")
    private final @Nullable Input<LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs> jsonBody;

    public Input<LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs> getJsonBody() {
        return this.jsonBody == null ? Input.empty() : this.jsonBody;
    }

    @InputImport(name="method")
    private final @Nullable Input<Object> method;

    public Input<Object> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    @InputImport(name="queryString")
    private final @Nullable Input<Object> queryString;

    public Input<Object> getQueryString() {
        return this.queryString == null ? Input.empty() : this.queryString;
    }

    @InputImport(name="singleHeader")
    private final @Nullable Input<LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs> singleHeader;

    public Input<LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs> getSingleHeader() {
        return this.singleHeader == null ? Input.empty() : this.singleHeader;
    }

    @InputImport(name="uriPath")
    private final @Nullable Input<Object> uriPath;

    public Input<Object> getUriPath() {
        return this.uriPath == null ? Input.empty() : this.uriPath;
    }

    public LoggingConfigurationFieldToMatchArgs(
        @Nullable Input<LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs> jsonBody,
        @Nullable Input<Object> method,
        @Nullable Input<Object> queryString,
        @Nullable Input<LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs> singleHeader,
        @Nullable Input<Object> uriPath) {
        this.jsonBody = jsonBody;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.uriPath = uriPath;
    }

    private LoggingConfigurationFieldToMatchArgs() {
        this.jsonBody = Input.empty();
        this.method = Input.empty();
        this.queryString = Input.empty();
        this.singleHeader = Input.empty();
        this.uriPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs> jsonBody;
        private @Nullable Input<Object> method;
        private @Nullable Input<Object> queryString;
        private @Nullable Input<LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs> singleHeader;
        private @Nullable Input<Object> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jsonBody = defaults.jsonBody;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setJsonBody(@Nullable Input<LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs> jsonBody) {
            this.jsonBody = jsonBody;
            return this;
        }

        public Builder setJsonBody(@Nullable LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs jsonBody) {
            this.jsonBody = Input.ofNullable(jsonBody);
            return this;
        }

        public Builder setMethod(@Nullable Input<Object> method) {
            this.method = method;
            return this;
        }

        public Builder setMethod(@Nullable Object method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder setQueryString(@Nullable Input<Object> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setQueryString(@Nullable Object queryString) {
            this.queryString = Input.ofNullable(queryString);
            return this;
        }

        public Builder setSingleHeader(@Nullable Input<LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleHeader(@Nullable LoggingConfigurationFieldToMatchSingleHeaderPropertiesArgs singleHeader) {
            this.singleHeader = Input.ofNullable(singleHeader);
            return this;
        }

        public Builder setUriPath(@Nullable Input<Object> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder setUriPath(@Nullable Object uriPath) {
            this.uriPath = Input.ofNullable(uriPath);
            return this;
        }

        public LoggingConfigurationFieldToMatchArgs build() {
            return new LoggingConfigurationFieldToMatchArgs(jsonBody, method, queryString, singleHeader, uriPath);
        }
    }
}
