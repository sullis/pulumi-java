// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ResponseHeadersPolicyAccessControlExposeHeadersArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyAccessControlExposeHeadersArgs Empty = new ResponseHeadersPolicyAccessControlExposeHeadersArgs();

    @Import(name="items", required=true)
      private final Output<List<String>> items;

    public Output<List<String>> items() {
        return this.items;
    }

    public ResponseHeadersPolicyAccessControlExposeHeadersArgs(Output<List<String>> items) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
    }

    private ResponseHeadersPolicyAccessControlExposeHeadersArgs() {
        this.items = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyAccessControlExposeHeadersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyAccessControlExposeHeadersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(Output<List<String>> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(List<String> items) {
            this.items = Output.of(Objects.requireNonNull(items));
            return this;
        }
        public Builder items(String... items) {
            return items(List.of(items));
        }        public ResponseHeadersPolicyAccessControlExposeHeadersArgs build() {
            return new ResponseHeadersPolicyAccessControlExposeHeadersArgs(items);
        }
    }
}
