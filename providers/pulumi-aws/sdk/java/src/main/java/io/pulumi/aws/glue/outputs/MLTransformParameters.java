// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.aws.glue.outputs.MLTransformParametersFindMatchesParameters;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MLTransformParameters {
    /**
     * The parameters for the find matches algorithm. see Find Matches Parameters.
     * 
     */
    private final MLTransformParametersFindMatchesParameters findMatchesParameters;
    /**
     * The type of machine learning transform. For information about the types of machine learning transforms, see [Creating Machine Learning Transforms](http://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html).
     * 
     */
    private final String transformType;

    @CustomType.Constructor
    private MLTransformParameters(
        @CustomType.Parameter("findMatchesParameters") MLTransformParametersFindMatchesParameters findMatchesParameters,
        @CustomType.Parameter("transformType") String transformType) {
        this.findMatchesParameters = findMatchesParameters;
        this.transformType = transformType;
    }

    /**
     * The parameters for the find matches algorithm. see Find Matches Parameters.
     * 
    */
    public MLTransformParametersFindMatchesParameters getFindMatchesParameters() {
        return this.findMatchesParameters;
    }
    /**
     * The type of machine learning transform. For information about the types of machine learning transforms, see [Creating Machine Learning Transforms](http://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html).
     * 
    */
    public String getTransformType() {
        return this.transformType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MLTransformParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MLTransformParametersFindMatchesParameters findMatchesParameters;
        private String transformType;

        public Builder() {
    	      // Empty
        }

        public Builder(MLTransformParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.findMatchesParameters = defaults.findMatchesParameters;
    	      this.transformType = defaults.transformType;
        }

        public Builder findMatchesParameters(MLTransformParametersFindMatchesParameters findMatchesParameters) {
            this.findMatchesParameters = Objects.requireNonNull(findMatchesParameters);
            return this;
        }
        public Builder transformType(String transformType) {
            this.transformType = Objects.requireNonNull(transformType);
            return this;
        }        public MLTransformParameters build() {
            return new MLTransformParameters(findMatchesParameters, transformType);
        }
    }
}
