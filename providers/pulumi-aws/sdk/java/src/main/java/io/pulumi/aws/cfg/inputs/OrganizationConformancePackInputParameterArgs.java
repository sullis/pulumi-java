// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class OrganizationConformancePackInputParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationConformancePackInputParameterArgs Empty = new OrganizationConformancePackInputParameterArgs();

    /**
     * The input key.
     * 
     */
    @Import(name="parameterName", required=true)
      private final Output<String> parameterName;

    public Output<String> parameterName() {
        return this.parameterName;
    }

    /**
     * The input value.
     * 
     */
    @Import(name="parameterValue", required=true)
      private final Output<String> parameterValue;

    public Output<String> parameterValue() {
        return this.parameterValue;
    }

    public OrganizationConformancePackInputParameterArgs(
        Output<String> parameterName,
        Output<String> parameterValue) {
        this.parameterName = Objects.requireNonNull(parameterName, "expected parameter 'parameterName' to be non-null");
        this.parameterValue = Objects.requireNonNull(parameterValue, "expected parameter 'parameterValue' to be non-null");
    }

    private OrganizationConformancePackInputParameterArgs() {
        this.parameterName = Codegen.empty();
        this.parameterValue = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationConformancePackInputParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> parameterName;
        private Output<String> parameterValue;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationConformancePackInputParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterName = defaults.parameterName;
    	      this.parameterValue = defaults.parameterValue;
        }

        public Builder parameterName(Output<String> parameterName) {
            this.parameterName = Objects.requireNonNull(parameterName);
            return this;
        }
        public Builder parameterName(String parameterName) {
            this.parameterName = Output.of(Objects.requireNonNull(parameterName));
            return this;
        }
        public Builder parameterValue(Output<String> parameterValue) {
            this.parameterValue = Objects.requireNonNull(parameterValue);
            return this;
        }
        public Builder parameterValue(String parameterValue) {
            this.parameterValue = Output.of(Objects.requireNonNull(parameterValue));
            return this;
        }        public OrganizationConformancePackInputParameterArgs build() {
            return new OrganizationConformancePackInputParameterArgs(parameterName, parameterValue);
        }
    }
}
