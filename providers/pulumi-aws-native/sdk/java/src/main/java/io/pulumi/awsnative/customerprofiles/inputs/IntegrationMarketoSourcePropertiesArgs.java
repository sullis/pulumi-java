// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class IntegrationMarketoSourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationMarketoSourcePropertiesArgs Empty = new IntegrationMarketoSourcePropertiesArgs();

    @Import(name="object", required=true)
      private final Output<String> object;

    public Output<String> object() {
        return this.object;
    }

    public IntegrationMarketoSourcePropertiesArgs(Output<String> object) {
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private IntegrationMarketoSourcePropertiesArgs() {
        this.object = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationMarketoSourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationMarketoSourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.object = defaults.object;
        }

        public Builder object(Output<String> object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public Builder object(String object) {
            this.object = Output.of(Objects.requireNonNull(object));
            return this;
        }        public IntegrationMarketoSourcePropertiesArgs build() {
            return new IntegrationMarketoSourcePropertiesArgs(object);
        }
    }
}
