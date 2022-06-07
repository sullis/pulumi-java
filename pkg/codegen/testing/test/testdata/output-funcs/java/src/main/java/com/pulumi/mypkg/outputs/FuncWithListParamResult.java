// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mypkg.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FuncWithListParamResult {
    private final String r;

    @CustomType.Constructor
    private FuncWithListParamResult(@CustomType.Parameter("r") String r) {
        this.r = r;
    }

    public String r() {
        return this.r;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FuncWithListParamResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String r;

        public Builder() {
    	      // Empty
        }

        public Builder(FuncWithListParamResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.r = defaults.r;
        }

        public Builder r(String r) {
            this.r = Objects.requireNonNull(r);
            return this;
        }        public FuncWithListParamResult build() {
            return new FuncWithListParamResult(r);
        }
    }
}
