// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ErrorDefinitionResponse {
    /**
     * Service specific error code which serves as the substatus for the HTTP error code.
     * 
     */
    private final String code;
    /**
     * Description of the error.
     * 
     */
    private final String message;

    @OutputCustomType.Constructor({"code","message"})
    private ErrorDefinitionResponse(
        String code,
        String message) {
        this.code = Objects.requireNonNull(code);
        this.message = Objects.requireNonNull(message);
    }

    /**
     * Service specific error code which serves as the substatus for the HTTP error code.
     * 
     */
    public String getCode() {
        return this.code;
    }
    /**
     * Description of the error.
     * 
     */
    public String getMessage() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public ErrorDefinitionResponse build() {
            return new ErrorDefinitionResponse(code, message);
        }
    }
}
