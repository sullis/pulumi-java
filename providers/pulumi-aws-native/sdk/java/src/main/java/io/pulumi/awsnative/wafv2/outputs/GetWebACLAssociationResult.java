// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class GetWebACLAssociationResult {
    @OutputCustomType.Constructor({})
    private GetWebACLAssociationResult() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebACLAssociationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebACLAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GetWebACLAssociationResult build() {
            return new GetWebACLAssociationResult();
        }
    }
}
