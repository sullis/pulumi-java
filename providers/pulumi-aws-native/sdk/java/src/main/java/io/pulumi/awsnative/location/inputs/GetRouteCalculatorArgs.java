// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.location.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRouteCalculatorArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRouteCalculatorArgs Empty = new GetRouteCalculatorArgs();

    @Import(name="calculatorName", required=true)
      private final String calculatorName;

    public String calculatorName() {
        return this.calculatorName;
    }

    public GetRouteCalculatorArgs(String calculatorName) {
        this.calculatorName = Objects.requireNonNull(calculatorName, "expected parameter 'calculatorName' to be non-null");
    }

    private GetRouteCalculatorArgs() {
        this.calculatorName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteCalculatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String calculatorName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteCalculatorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.calculatorName = defaults.calculatorName;
        }

        public Builder calculatorName(String calculatorName) {
            this.calculatorName = Objects.requireNonNull(calculatorName);
            return this;
        }        public GetRouteCalculatorArgs build() {
            return new GetRouteCalculatorArgs(calculatorName);
        }
    }
}
