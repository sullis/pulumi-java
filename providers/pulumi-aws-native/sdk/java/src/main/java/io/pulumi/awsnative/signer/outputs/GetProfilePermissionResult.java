// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.signer.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class GetProfilePermissionResult {
    @OutputCustomType.Constructor({})
    private GetProfilePermissionResult() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProfilePermissionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GetProfilePermissionResult defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GetProfilePermissionResult build() {
            return new GetProfilePermissionResult();
        }
    }
}
