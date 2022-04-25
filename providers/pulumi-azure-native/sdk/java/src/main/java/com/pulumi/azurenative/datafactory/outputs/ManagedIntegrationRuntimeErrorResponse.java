// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ManagedIntegrationRuntimeErrorResponse {
    /**
     * @return Error code.
     * 
     */
    private final String code;
    /**
     * @return Error message.
     * 
     */
    private final String message;
    /**
     * @return Managed integration runtime error parameters.
     * 
     */
    private final List<String> parameters;
    /**
     * @return The time when the error occurred.
     * 
     */
    private final String time;

    @CustomType.Constructor
    private ManagedIntegrationRuntimeErrorResponse(
        @CustomType.Parameter("code") String code,
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("parameters") List<String> parameters,
        @CustomType.Parameter("time") String time) {
        this.code = code;
        this.message = message;
        this.parameters = parameters;
        this.time = time;
    }

    /**
     * @return Error code.
     * 
     */
    public String code() {
        return this.code;
    }
    /**
     * @return Error message.
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return Managed integration runtime error parameters.
     * 
     */
    public List<String> parameters() {
        return this.parameters;
    }
    /**
     * @return The time when the error occurred.
     * 
     */
    public String time() {
        return this.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIntegrationRuntimeErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String message;
        private List<String> parameters;
        private String time;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIntegrationRuntimeErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
    	      this.parameters = defaults.parameters;
    	      this.time = defaults.time;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder parameters(List<String> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(String... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder time(String time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }        public ManagedIntegrationRuntimeErrorResponse build() {
            return new ManagedIntegrationRuntimeErrorResponse(code, message, parameters, time);
        }
    }
}
