// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebAclDefaultAction {
    /**
     * Specifies how you want AWS WAF Regional to respond to requests that match the settings in a rule. Valid values for `action` are `ALLOW`, `BLOCK` or `COUNT`. Valid values for `override_action` are `COUNT` and `NONE`.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private WebAclDefaultAction(@CustomType.Parameter("type") String type) {
        this.type = type;
    }

    /**
     * Specifies how you want AWS WAF Regional to respond to requests that match the settings in a rule. Valid values for `action` are `ALLOW`, `BLOCK` or `COUNT`. Valid values for `override_action` are `COUNT` and `NONE`.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclDefaultAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclDefaultAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public WebAclDefaultAction build() {
            return new WebAclDefaultAction(type);
        }
    }
}
