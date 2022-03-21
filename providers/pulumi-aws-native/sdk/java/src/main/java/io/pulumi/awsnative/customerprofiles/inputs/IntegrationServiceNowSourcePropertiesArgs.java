// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class IntegrationServiceNowSourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationServiceNowSourcePropertiesArgs Empty = new IntegrationServiceNowSourcePropertiesArgs();

    @Import(name="object", required=true)
      private final Output<String> object;

    public Output<String> getObject() {
        return this.object;
    }

    public IntegrationServiceNowSourcePropertiesArgs(Output<String> object) {
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private IntegrationServiceNowSourcePropertiesArgs() {
        this.object = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationServiceNowSourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationServiceNowSourcePropertiesArgs defaults) {
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
        }        public IntegrationServiceNowSourcePropertiesArgs build() {
            return new IntegrationServiceNowSourcePropertiesArgs(object);
        }
    }
}
