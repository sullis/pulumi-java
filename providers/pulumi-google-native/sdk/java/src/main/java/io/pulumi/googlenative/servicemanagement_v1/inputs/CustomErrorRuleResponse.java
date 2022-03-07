// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * A custom error rule.
 * 
 */
public final class CustomErrorRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final CustomErrorRuleResponse Empty = new CustomErrorRuleResponse();

    /**
     * Mark this message as possible payload in error response. Otherwise, objects of this type will be filtered when they appear in error payload.
     * 
     */
    @InputImport(name="isErrorType", required=true)
      private final Boolean isErrorType;

    public Boolean getIsErrorType() {
        return this.isErrorType;
    }

    /**
     * Selects messages to which this rule applies. Refer to selector for syntax details.
     * 
     */
    @InputImport(name="selector", required=true)
      private final String selector;

    public String getSelector() {
        return this.selector;
    }

    public CustomErrorRuleResponse(
        Boolean isErrorType,
        String selector) {
        this.isErrorType = Objects.requireNonNull(isErrorType, "expected parameter 'isErrorType' to be non-null");
        this.selector = Objects.requireNonNull(selector, "expected parameter 'selector' to be non-null");
    }

    private CustomErrorRuleResponse() {
        this.isErrorType = null;
        this.selector = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomErrorRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isErrorType;
        private String selector;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomErrorRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isErrorType = defaults.isErrorType;
    	      this.selector = defaults.selector;
        }

        public Builder setIsErrorType(Boolean isErrorType) {
            this.isErrorType = Objects.requireNonNull(isErrorType);
            return this;
        }

        public Builder setSelector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }
        public CustomErrorRuleResponse build() {
            return new CustomErrorRuleResponse(isErrorType, selector);
        }
    }
}