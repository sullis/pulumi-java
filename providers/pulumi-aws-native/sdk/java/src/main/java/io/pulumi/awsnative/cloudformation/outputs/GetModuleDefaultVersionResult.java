// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class GetModuleDefaultVersionResult {
    @OutputCustomType.Constructor
    private GetModuleDefaultVersionResult() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetModuleDefaultVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GetModuleDefaultVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public GetModuleDefaultVersionResult build() {
            return new GetModuleDefaultVersionResult();
        }
    }
}
