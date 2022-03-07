// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specification of HTTP header match atrributes.
 * 
 */
public final class HttpHeaderMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpHeaderMatchArgs Empty = new HttpHeaderMatchArgs();

    /**
     * The name of the HTTP header to match. For matching against the HTTP request's authority, use a headerMatch with the header name ":authority". For matching a request's method, use the headerName ":method".
     * 
     */
    @InputImport(name="headerName", required=true)
      private final Input<String> headerName;

    public Input<String> getHeaderName() {
        return this.headerName;
    }

    /**
     * The value of the header must match the regular expression specified in regexMatch. For regular expression grammar, please see: en.cppreference.com/w/cpp/regex/ecmascript For matching against a port specified in the HTTP request, use a headerMatch with headerName set to Host and a regular expression that satisfies the RFC2616 Host header's port specifier.
     * 
     */
    @InputImport(name="regexMatch", required=true)
      private final Input<String> regexMatch;

    public Input<String> getRegexMatch() {
        return this.regexMatch;
    }

    public HttpHeaderMatchArgs(
        Input<String> headerName,
        Input<String> regexMatch) {
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.regexMatch = Objects.requireNonNull(regexMatch, "expected parameter 'regexMatch' to be non-null");
    }

    private HttpHeaderMatchArgs() {
        this.headerName = Input.empty();
        this.regexMatch = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHeaderMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> headerName;
        private Input<String> regexMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpHeaderMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.regexMatch = defaults.regexMatch;
        }

        public Builder setHeaderName(Input<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Input.of(Objects.requireNonNull(headerName));
            return this;
        }

        public Builder setRegexMatch(Input<String> regexMatch) {
            this.regexMatch = Objects.requireNonNull(regexMatch);
            return this;
        }

        public Builder setRegexMatch(String regexMatch) {
            this.regexMatch = Input.of(Objects.requireNonNull(regexMatch));
            return this;
        }
        public HttpHeaderMatchArgs build() {
            return new HttpHeaderMatchArgs(headerName, regexMatch);
        }
    }
}