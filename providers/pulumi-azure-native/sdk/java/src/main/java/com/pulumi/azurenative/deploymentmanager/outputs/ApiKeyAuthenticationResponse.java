// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApiKeyAuthenticationResponse {
    /**
     * @return The location of the authentication key/value pair in the request.
     * 
     */
    private final String in;
    /**
     * @return The key name of the authentication key/value pair.
     * 
     */
    private final String name;
    /**
     * @return The authentication type.
     * Expected value is &#39;ApiKey&#39;.
     * 
     */
    private final String type;
    /**
     * @return The value of the authentication key/value pair.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private ApiKeyAuthenticationResponse(
        @CustomType.Parameter("in") String in,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") String value) {
        this.in = in;
        this.name = name;
        this.type = type;
        this.value = value;
    }

    /**
     * @return The location of the authentication key/value pair in the request.
     * 
     */
    public String in() {
        return this.in;
    }
    /**
     * @return The key name of the authentication key/value pair.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The authentication type.
     * Expected value is &#39;ApiKey&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The value of the authentication key/value pair.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiKeyAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String in;
        private String name;
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiKeyAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.in = defaults.in;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder in(String in) {
            this.in = Objects.requireNonNull(in);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public ApiKeyAuthenticationResponse build() {
            return new ApiKeyAuthenticationResponse(in, name, type, value);
        }
    }
}
