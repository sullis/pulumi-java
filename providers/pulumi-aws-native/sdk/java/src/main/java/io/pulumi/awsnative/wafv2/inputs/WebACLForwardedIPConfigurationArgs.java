// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.WebACLForwardedIPConfigurationFallbackBehavior;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class WebACLForwardedIPConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLForwardedIPConfigurationArgs Empty = new WebACLForwardedIPConfigurationArgs();

    @Import(name="fallbackBehavior", required=true)
      private final Output<WebACLForwardedIPConfigurationFallbackBehavior> fallbackBehavior;

    public Output<WebACLForwardedIPConfigurationFallbackBehavior> fallbackBehavior() {
        return this.fallbackBehavior;
    }

    @Import(name="headerName", required=true)
      private final Output<String> headerName;

    public Output<String> headerName() {
        return this.headerName;
    }

    public WebACLForwardedIPConfigurationArgs(
        Output<WebACLForwardedIPConfigurationFallbackBehavior> fallbackBehavior,
        Output<String> headerName) {
        this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior, "expected parameter 'fallbackBehavior' to be non-null");
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
    }

    private WebACLForwardedIPConfigurationArgs() {
        this.fallbackBehavior = Codegen.empty();
        this.headerName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLForwardedIPConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<WebACLForwardedIPConfigurationFallbackBehavior> fallbackBehavior;
        private Output<String> headerName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLForwardedIPConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fallbackBehavior = defaults.fallbackBehavior;
    	      this.headerName = defaults.headerName;
        }

        public Builder fallbackBehavior(Output<WebACLForwardedIPConfigurationFallbackBehavior> fallbackBehavior) {
            this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior);
            return this;
        }
        public Builder fallbackBehavior(WebACLForwardedIPConfigurationFallbackBehavior fallbackBehavior) {
            this.fallbackBehavior = Output.of(Objects.requireNonNull(fallbackBehavior));
            return this;
        }
        public Builder headerName(Output<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        public Builder headerName(String headerName) {
            this.headerName = Output.of(Objects.requireNonNull(headerName));
            return this;
        }        public WebACLForwardedIPConfigurationArgs build() {
            return new WebACLForwardedIPConfigurationArgs(fallbackBehavior, headerName);
        }
    }
}
