// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mypkg.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FuncWithAllOptionalInputsResult {
    private final String r;

    @CustomType.Constructor
    private FuncWithAllOptionalInputsResult(@CustomType.Parameter("r") String r) {
        this.r = r;
    }

    public String r() {
        return this.r;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FuncWithAllOptionalInputsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String r;

        public Builder() {
    	      // Empty
        }

        public Builder(FuncWithAllOptionalInputsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.r = defaults.r;
        }

        public Builder r(String r) {
            this.r = Objects.requireNonNull(r);
            return this;
        }        public FuncWithAllOptionalInputsResult build() {
            return new FuncWithAllOptionalInputsResult(r);
        }
    }
}
