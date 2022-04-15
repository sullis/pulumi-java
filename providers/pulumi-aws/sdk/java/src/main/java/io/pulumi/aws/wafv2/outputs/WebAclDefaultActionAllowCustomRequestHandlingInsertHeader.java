// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebAclDefaultActionAllowCustomRequestHandlingInsertHeader {
    /**
     * The label string.
     * 
     */
    private final String name;
    /**
     * The value of the custom header.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private WebAclDefaultActionAllowCustomRequestHandlingInsertHeader(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * The label string.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The value of the custom header.
     * 
    */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclDefaultActionAllowCustomRequestHandlingInsertHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclDefaultActionAllowCustomRequestHandlingInsertHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public WebAclDefaultActionAllowCustomRequestHandlingInsertHeader build() {
            return new WebAclDefaultActionAllowCustomRequestHandlingInsertHeader(name, value);
        }
    }
}
