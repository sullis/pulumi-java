// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class WebACLCustomResponseBodies {
    @OutputCustomType.Constructor({})
    private WebACLCustomResponseBodies() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLCustomResponseBodies defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLCustomResponseBodies defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public WebACLCustomResponseBodies build() {
            return new WebACLCustomResponseBodies();
        }
    }
}
