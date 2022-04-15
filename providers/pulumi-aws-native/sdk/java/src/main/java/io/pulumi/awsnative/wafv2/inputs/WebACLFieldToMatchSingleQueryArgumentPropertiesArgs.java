// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * One query argument in a web request, identified by name, for example UserName or SalesRegion. The name can be up to 30 characters long and isn't case sensitive.
 * 
 */
public final class WebACLFieldToMatchSingleQueryArgumentPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLFieldToMatchSingleQueryArgumentPropertiesArgs Empty = new WebACLFieldToMatchSingleQueryArgumentPropertiesArgs();

    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    public WebACLFieldToMatchSingleQueryArgumentPropertiesArgs(Output<String> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private WebACLFieldToMatchSingleQueryArgumentPropertiesArgs() {
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLFieldToMatchSingleQueryArgumentPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLFieldToMatchSingleQueryArgumentPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public WebACLFieldToMatchSingleQueryArgumentPropertiesArgs build() {
            return new WebACLFieldToMatchSingleQueryArgumentPropertiesArgs(name);
        }
    }
}
