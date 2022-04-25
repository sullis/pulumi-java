// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.outputs;

import com.pulumi.aws.emr.outputs.ClusterStepHadoopJarStep;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterStep {
    /**
     * @return Action to take if the step fails. Valid values: `TERMINATE_JOB_FLOW`, `TERMINATE_CLUSTER`, `CANCEL_AND_WAIT`, and `CONTINUE`
     * 
     */
    private final String actionOnFailure;
    /**
     * @return JAR file used for the step. See below.
     * 
     */
    private final ClusterStepHadoopJarStep hadoopJarStep;
    /**
     * @return Name of the step.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private ClusterStep(
        @CustomType.Parameter("actionOnFailure") String actionOnFailure,
        @CustomType.Parameter("hadoopJarStep") ClusterStepHadoopJarStep hadoopJarStep,
        @CustomType.Parameter("name") String name) {
        this.actionOnFailure = actionOnFailure;
        this.hadoopJarStep = hadoopJarStep;
        this.name = name;
    }

    /**
     * @return Action to take if the step fails. Valid values: `TERMINATE_JOB_FLOW`, `TERMINATE_CLUSTER`, `CANCEL_AND_WAIT`, and `CONTINUE`
     * 
     */
    public String actionOnFailure() {
        return this.actionOnFailure;
    }
    /**
     * @return JAR file used for the step. See below.
     * 
     */
    public ClusterStepHadoopJarStep hadoopJarStep() {
        return this.hadoopJarStep;
    }
    /**
     * @return Name of the step.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterStep defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionOnFailure;
        private ClusterStepHadoopJarStep hadoopJarStep;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionOnFailure = defaults.actionOnFailure;
    	      this.hadoopJarStep = defaults.hadoopJarStep;
    	      this.name = defaults.name;
        }

        public Builder actionOnFailure(String actionOnFailure) {
            this.actionOnFailure = Objects.requireNonNull(actionOnFailure);
            return this;
        }
        public Builder hadoopJarStep(ClusterStepHadoopJarStep hadoopJarStep) {
            this.hadoopJarStep = Objects.requireNonNull(hadoopJarStep);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public ClusterStep build() {
            return new ClusterStep(actionOnFailure, hadoopJarStep, name);
        }
    }
}
